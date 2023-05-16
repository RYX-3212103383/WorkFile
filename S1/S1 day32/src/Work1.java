import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Arrays;
import java.util.Vector;

public class Work1 extends JFrame {


	private JPanel panel1 = new JPanel(null);
	private JButton btn1 = new JButton("添加");
	private JButton btn2 = new JButton("修改");
	private JButton btn3 = new JButton("删除");

	private JLabel lblMsg = new JLabel("选择:");

	private JComboBox cbo = new JComboBox();

	private JButton btn4 = new JButton("查找");

	private JTable table = new JTable();

	private JScrollPane scrollPane = new JScrollPane();

	private Vector rows = new Vector();

	private Vector cols = new Vector();

	private DefaultTableModel dtm = new DefaultTableModel();
	int index=-1;

	public Work1() {
		setTitle("表格");
		setSize(750, 500);
		setLayout(new BorderLayout());
		JTabbedPane tabbedPane = new JTabbedPane();

		btn1.setBackground(new Color(209, 214, 219));
		btn2.setBackground(new Color(209, 214, 219));
		btn3.setBackground(new Color(209, 214, 219));

		btn1.setBounds(10, 10, 80, 25);
		btn2.setBounds(95, 10, 80, 25);
		btn3.setBounds(180, 10, 80, 25);

		lblMsg.setBounds(240, 45, 30, 20);

		cbo.setBounds(275, 40, 60, 30);
		cbo.addItem("所有");


		btn4.setBackground(new Color(209, 214, 219));
		btn4.setBounds(340, 41, 100, 28);

		table.setModel(dtm);

		{
			cols.add("编号");
			cols.add("用户名");
			cols.add("姓名");
			cols.add("权限");
			cols.add("在岗");
		}

		{
			Vector v1 = new Vector();
			v1.add("1");
			v1.add("user1");
			v1.add("吴道子");
			v1.add("收银员");
			v1.add("在岗");

			Vector v2 = new Vector();
			v2.add("2");
			v2.add("user2");
			v2.add("老子");
			v2.add("仓管员");
			v2.add("在岗");


			Vector v3 = new Vector();
			v3.add("3");
			v3.add("user3");
			v3.add("孟子");
			v3.add("管理员");
			v3.add("在岗");

			Vector v4 = new Vector();
			v4.add("4");
			v4.add("user4");
			v4.add("庄子");
			v4.add("仓管员");
			v4.add("在岗");

			Vector v5 = new Vector();
			v5.add("7");
			v5.add("user7");
			v5.add("孔子");
			v5.add("收银员");
			v5.add("不在岗");

			//添加到行
			rows.add(v1);
			rows.add(v2);
			rows.add(v3);
			rows.add(v4);
			rows.add(v5);

		}
		dtm.setDataVector(rows, cols);
		scrollPane.setBounds(0, 72, 750, 458);
		new Thread(new Runnable() {
			@Override
			public void run() {
				for (; ; ) {
					scrollPane.setViewportView(table);
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                       e.printStackTrace();
                    }
                }
			}
		}).start();
		panel1.add(scrollPane);

		panel1.add(btn4);
		panel1.add(cbo);
		panel1.add(lblMsg);
		panel1.add(btn1);
		panel1.add(btn2);
		panel1.add(btn3);
		tabbedPane.addTab("用户管理", panel1);
		JPanel panel2 = new JPanel();
		tabbedPane.addTab("商品管理", panel2);
		JPanel panel3 = new JPanel();
		tabbedPane.addTab("销售记录", panel3);
		add(tabbedPane, BorderLayout.CENTER);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		//事件监听
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				index = table.getSelectedRow();
				int length = table.getColumnCount();
				String[] a = new String[length];
				for (int i = 0; i < length; i++) {
					a[i] = (String) table.getValueAt(index, i);
				}
				System.out.println(Arrays.toString(a));
			}
		});
		btn1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
                int id=1;
                for (int i = 0;i<table.getRowCount(); i++) {
                    int flag=1;
                    for (int j = 0;j<table.getRowCount(); j++) {
                        String valueAt = (String) table.getValueAt(j, 0);
                        System.out.println(valueAt+id+table.getRowCount());
                        if(id==Integer.parseInt(valueAt)) {
                            flag=0;
                            break;
                        }
                    }if(flag==0) id++;
                    else break;
                }
				Add add = new Add(rows,id);
                scrollPane.setViewportView(table);
			}
		});
		btn2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Update update = new Update(rows,index);
			}
		});
		btn3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int i1 = JOptionPane.showConfirmDialog(null, "你确定要删除吗？", "选择一个选项", JOptionPane.YES_NO_CANCEL_OPTION);
				int i = table.getSelectedRow();
				if (i != -1 && i1 == 0){
					JOptionPane.showMessageDialog(null, "删除成功！", "消息",JOptionPane.YES_OPTION);
					dtm.removeRow(i);
				}
			}
		});
	}

	public static void main(String[] args) {
		new Work1();
	}

	public JTable getTable() {
		return table;
	}

	public void setTable(JTable table) {
		this.table = table;
	}

	public JScrollPane getScrollPane() {
		return scrollPane;
	}

	public void setScrollPane(JScrollPane scrollPane) {
		this.scrollPane = scrollPane;
	}

	public Vector getRows() {
		return rows;
	}

	public void setRows(Vector rows) {
		this.rows = rows;
	}

	public Vector getCols() {
		return cols;
	}

	public void setCols(Vector cols) {
		this.cols = cols;
	}

	public DefaultTableModel getDtm() {
		return dtm;
	}

	public void setDtm(DefaultTableModel dtm) {
		this.dtm = dtm;
	}
}
