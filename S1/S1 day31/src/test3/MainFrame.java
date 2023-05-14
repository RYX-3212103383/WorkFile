package test3;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Arrays;
import java.util.Vector;

public class MainFrame extends JFrame {
	public MainFrame() {
		setTitle("窗口名称");
		setResizable(false);
		setSize(550, 550);

		setLayout(null);
		JPanel panel1 = new JPanel();
		panel1.setBounds(0, 20, this.getWidth(), 80);
		panel1.setLayout(new FlowLayout(FlowLayout.LEFT));
		add(panel1);
		JButton btn11 = new JButton("增加");
		JButton btn12 = new JButton("修改");
		JButton btn13 = new JButton("删除");
		panel1.add(btn11);
		panel1.add(btn12);
		panel1.add(btn13);

		JPanel panel2 = new JPanel();
		panel2.setBounds(0, 100, this.getWidth(), 40);
		panel2.setLayout(new FlowLayout(FlowLayout.LEFT));
		add(panel2);
		JLabel lbl21 = new JLabel("选择");
		JComboBox box21 = new JComboBox();
		box21.addItem("        ");
		JLabel lbl23 = new JLabel("值");
		JTextField textField24=new JTextField(8);
		JComboBox box25 = new JComboBox();
		box25.addItem("男");
		box25.addItem("女");
		JButton btn26 = new JButton("查找");
		panel2.add(lbl21);
		panel2.add(box21);
		panel2.add(lbl23);
		panel2.add(textField24);
		panel2.add(box25);
		panel2.add(btn26);


		JPanel panel3 = new JPanel();
		panel3.setBounds(0, 140, this.getWidth(), 400);
		panel3.setLayout(new BorderLayout());
		add(panel3);
		Vector cols = new Vector();
		Vector rows = new Vector();
//准备数据
		{
			cols.add("学号");
			cols.add("姓名");
			cols.add("年龄");
			cols.add("性别");
			cols.add("地址");
			cols.add("交友宣言");
		}
		add(panel3, BorderLayout.CENTER);
		DefaultTableModel dtm = new DefaultTableModel();
		JTable table3 = new JTable();
		table3.setModel(dtm);
		dtm.setDataVector(rows, cols);
		JScrollPane scrollPanel3 = new JScrollPane();
		scrollPanel3.setViewportView(table3);
		panel3.add(scrollPanel3);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		table3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int index = table3.getSelectedRow();
				int length=table3.getRowCount();
				String[] a = new String[length];
				for (int i = 0; i < length; i++) {
					a[i]= (String) table3.getValueAt(index, i);
				}
				System.out.println(Arrays.toString(a));
			}
		});

		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	public static void main(String[] args) {
		new MainFrame();
	}
}
