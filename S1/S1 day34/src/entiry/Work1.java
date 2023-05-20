package entiry;

import db.TestSelect;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
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

	private final JButton btnAdd = new JButton("添加商品");
	private final JButton btnUp = new JButton("修改商品");
	private final JButton btnCate = new JButton("类别管理");
	private final JButton btnHuo = new JButton("货柜管理");
	private final JButton btnshopManegerDelete = new JButton("删除");
	private final JButton btnshopManegerFind = new JButton("查找");
	private final JButton btnShopManegerOutToExcel = new JButton("导出Excel");

	private final JLabel lblFind = new JLabel("查找:");
	private final JComboBox cbo2 = new JComboBox();


	private JTable table2 = new JTable();
	private JScrollPane scrollPane2 = new JScrollPane();

	private DefaultTableModel dtm2 = new DefaultTableModel();


	private JTable table = new JTable();

	private JScrollPane scrollPane = new JScrollPane();

	private Vector rows = new Vector();

	private Vector cols = new Vector();

	private DefaultTableModel dtm = new DefaultTableModel();
	private JButton btnShopLogOutToExcel = new JButton("导出到Excel");

	private JButton btnShopLogDrawTable = new JButton("绘制表格");
	private JButton btnShopLogFind = new JButton("查找");

	private JLabel lblF = new JLabel("查找方式:");

	private JComboBox cboTime = new JComboBox();
	private JComboBox cboYear = new JComboBox();
	private JLabel lblYear = new JLabel("年");
	private JComboBox cboJI = new JComboBox();
	private JLabel lblJi = new JLabel("季度");
	private JComboBox cboMon = new JComboBox();
	private JLabel lblMon = new JLabel("月");
	private JComboBox cboDay = new JComboBox();
	private JLabel lblDay = new JLabel("日");

	private JTable table3 = new JTable();
	private JScrollPane scrollPane3 = new JScrollPane();
	private Vector rows3 = new Vector();
	private Vector cols3 = new Vector();
	private DefaultTableModel dtm3 = new DefaultTableModel();
	int index=-1;

	int selectdeyeararrayindex;

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
		scrollPane.setBounds(0, 72, 735, 360);
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

		JPanel panel2 = new JPanel(null);
		btnAdd.setBounds(5, 5, 100, 25);
		btnAdd.setBackground(new Color(214, 218, 224));

		btnUp.setBounds(110,5,100,25);
		btnUp.setBackground(new Color(214, 218, 224));

		btnCate.setBounds(215, 5, 100, 25);
		btnCate.setBackground(new Color(214, 218, 224));

		btnHuo.setBounds(320, 5, 100, 25);
		btnHuo.setBackground(new Color(214, 218, 224));

		btnshopManegerDelete.setBounds(425, 5, 100, 25);
		btnshopManegerDelete.setBackground(new Color(214, 218, 224));

		lblFind.setBounds(420, 33, 30, 40);

		cbo2.setBounds(455, 40, 80, 25);
		cbo2.addItem("所有");
		cbo2.setOpaque(false);

		btnshopManegerFind.setBounds(540, 40, 80, 25);
		btnshopManegerFind.setBackground(new Color(214, 218, 224));

		btnShopManegerOutToExcel.setBounds(625, 40, 100, 25);
		btnShopManegerOutToExcel.setBackground(new Color(214, 218, 224));

		table2.setModel(dtm2);
		Goods goods = new Goods();
		dtm2.setDataVector(goods.getRows2(), goods.getCols2());
		scrollPane2.setBounds(0, 75, 735, 360);
		new Thread(new Runnable() {
			@Override
			public void run() {
				for (; ; ) {
					scrollPane2.setViewportView(table2);
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		}).start();
		panel2.add(scrollPane2);
		panel2.add(btnAdd);
		panel2.add(btnUp);
		panel2.add(btnCate);
		panel2.add(btnHuo);
		panel2.add(btnshopManegerDelete);
		panel2.add(btnshopManegerFind);
		panel2.add(btnShopManegerOutToExcel);
		panel2.add(lblFind);
		panel2.add(cbo2);
		tabbedPane.addTab("商品管理", panel2);
		JPanel panel3 = new JPanel();
		panel3.setLayout(null);
		//导出按钮
		btnShopLogOutToExcel.setBounds(440, 10, 120, 30);
		btnShopLogOutToExcel.setBackground(new Color(214, 218, 224));
		//绘制按钮
		btnShopLogDrawTable.setBounds(575, 10, 100, 30);
		btnShopLogDrawTable.setBackground(new Color(214, 218, 224));
		//查找按钮
		btnShopLogFind.setBounds(575, 60, 100, 30);
		btnShopLogFind.setBackground(new Color(214, 218, 224));
		//时间选择下拉列表
		cboTime.setBounds(220, 62, 100, 30);
		cboTime.setBackground(new Color(214, 218, 224));
		cboTime.addItem("最近一周");
		cboTime.addItem("一个月内");
		cboTime.addItem("今天");
		cboTime.addItem("时间段");
		//查找方式
		lblF.setBounds(50, 70, 80, 20);

		JPanel panel4 = new JPanel(null);
		panel4.setBounds(0, 90, 750, 80);
		//年下拉列表
		cboYear.setBounds(50, 20, 100, 30);
		cboYear.addItem("请选择");


		int[] allyears = new int[24];
		for (int i = 1; i < allyears.length; i++) {
			allyears[i] = i + 2000;
			cboYear.addItem(allyears[i]);
		}

		cboYear.setBackground(new Color(214, 218, 224));

		lblYear.setBounds(160, 24, 20, 20);
		//季度下拉列表
		cboJI.setBounds(240, 20, 80, 30);
		cboJI.addItem("请选择");
		cboJI.addItem("1");
		cboJI.addItem("2");
		cboJI.addItem("3");
		cboJI.addItem("4");

		cboJI.setBackground(new Color(214, 218, 224));

		lblJi.setBounds(330, 24, 30, 20);
		//月份下拉列表
		cboMon.setBounds(440, 20, 80, 30);
		cboMon.setBackground(new Color(214, 218, 224));
		cboMon.addItem("请选择");
		lblMon.setBounds(530, 24, 20, 20);
		//日期下拉列表
		cboDay.setBounds(575, 20, 80, 30);
		cboDay.addItem("请选择");
		cboDay.setBackground(new Color(214, 218, 224));
		lblDay.setBounds(665, 24, 20, 20);
		new Thread(new Runnable() {
			@Override
			public void run() {
				for (; ; ) {

					String TimeSe = (String) cboTime.getSelectedItem();
					if ("时间段".equals(TimeSe)) {
						panel4.setVisible(true);
					} else {
						panel4.setVisible(false);
					}
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		}).start();
		panel4.setVisible(false);
		panel4.add(cboYear);
		panel4.add(lblYear);
		panel4.add(cboJI);
		panel4.add(lblJi);
		panel4.add(cboMon);
		panel4.add(lblMon);
		panel4.add(cboDay);
		panel4.add(lblDay);
		//滚动面板和表格
		{
			cols3.add("编号");
			cols3.add("名称");
			cols3.add("数量");
			cols3.add("小计");
		}
		table3.setModel(dtm3);
		table3.setGridColor(Color.LIGHT_GRAY);
		dtm3.setDataVector(rows3, cols3);
		new Thread(new Runnable() {
			@Override
			public void run() {
				for (; ; ) {
					scrollPane3.setViewportView(table3);
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		}).start();
		scrollPane3.setBounds(0, 160, 723, 270);
		panel3.add(scrollPane3);
		panel3.add(btnShopLogOutToExcel);
		panel3.add(btnShopLogDrawTable);
		panel3.add(btnShopLogFind);
		panel3.add(cboTime);
		panel3.add(lblF);
		panel3.add(panel4);

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
		table2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				index = table2.getSelectedRow();
				int length = table2.getColumnCount();
				String[] a = new String[length];
				for (int i = 0; i < length; i++) {
					a[i] = (String) table2.getValueAt(index, i);
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
		btnAdd.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int id=1;
				for (int i = 0;i<table2.getRowCount(); i++) {
					int flag=1;
					for (int j = 0;j<table2.getRowCount(); j++) {
						String valueAt = (String) table2.getValueAt(j, 0);
						System.out.println(valueAt+id+table2.getRowCount());
						if(id==Integer.parseInt(valueAt)) {
							flag=0;
							break;
						}
					}if(flag==0) id++;
					else break;
				}
				newAdd newadd = new newAdd(goods.getRows2(),id);
				scrollPane.setViewportView(table2);
			}
		});
		cboYear.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				selectdeyeararrayindex = cboYear.getSelectedIndex();
				System.out.println("年份下标"+selectdeyeararrayindex+"年份"+allyears[selectdeyeararrayindex]);
			}
		});
		cboJI.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
					cboMon.removeAllItems();
				if (allyears[selectdeyeararrayindex] != 0) {
					String ji = (String) cboJI.getSelectedItem();
					if ("请选择".equals(ji)) {
					} else if ("1".equals(ji)) {
						int[] mon1 = {1, 2, 3};
						for (int i = 0; i < mon1.length; i++) {
							cboMon.addItem(mon1[i]);
						}
					} else if ("2".equals(ji)) {
						int[] mon2 = {4, 5, 6};
						for (int i = 0; i < mon2.length; i++) {
							cboMon.addItem(mon2[i]);
						}
					} else if ("3".equals(ji)) {
						int[] mon3 = {7, 8, 9};
						for (int i = 0; i < mon3.length; i++) {
							cboMon.addItem(mon3[i]);
						}
					} else if ("4".equals(ji)) {
						int[] mon4 = {10, 11, 12};
						for (int i = 0; i < mon4.length; i++) {
							cboMon.addItem(mon4[i]);
						}
					}
					System.out.println("已选择"+ji+"季度");
				}
			}
		});
		cboMon.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int selectedMonthArrayValue=0;
				try {
					selectedMonthArrayValue=(int)cboMon.getSelectedItem();
					System.out.println("选择了"+selectedMonthArrayValue+"月季度已更改");
				} catch (Exception ex) {
				}
				cboDay.removeAllItems();
				switch (selectedMonthArrayValue) {
					case 1:
					case 3:
					case 5:
					case 7:
					case 8:
					case 10:
					case 12:
						int[] date = new int[31];
						for (int i = 0; i < date.length; i++) {
							date[i] = i + 1;
							cboDay.addItem(date[i]);
						}
						break;
					case 2:
						int a=allyears[selectdeyeararrayindex];
						if ((a % 4 == 0 && a % 100 != 0) || a % 400 == 0) {
							int[] date2 = new int[29];
							for (int i = 0; i < date2.length; i++) {
								date2[i] = i + 1;
								cboDay.addItem(date2[i]);
							}
						} else {
							int[] date2 = new int[28];
							for (int i = 0; i < date2.length; i++) {
								date2[i] = i + 1;
								cboDay.addItem(date2[i]);
							}
						}
						break;
					default:
						int[] date3 = new int[30];
						for (int i = 0; i < date3.length; i++) {
							date3[i] = i + 1;
							cboDay.addItem(date3[i]);
						}
				}
			}
		});
		cboDay.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int selectedDay;
				try {
					selectedDay = (int) cboDay.getSelectedItem();
					System.out.println("选择了" + selectedDay + "日");
				} catch (Exception ex) {
				}
			}
		});
		btnShopLogFind.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				TestSelect select = new TestSelect();
				String basesql="SELECT\n" +
						"\tgoods.goodsId,\n" +
						"\tgoods.`name`,\n" +
						"\tshoplogs.goodsnum,\n" +
						"\tgoods.price * shoplogs.goodsnum \n" +
						"FROM\n" +
						"\tshoplogs\n" +
						"\tLEFT JOIN goods ON shoplogs.goodsId = goods.goodsId\n";
				String wheresql=null;
				if("时间段".equals(cboTime.getSelectedItem())){
					int year= (int) cboYear.getSelectedItem();
					int month= (int) cboMon.getSelectedItem();
					int day= (int) cboDay.getSelectedItem();
					String strTime=year+"-"+month+"-"+day;
					wheresql="where shopdate >= '"+strTime+" 0:0:0'";
					System.out.println(wheresql);
				} else if ("今天".equals(cboTime.getSelectedItem())) {
					wheresql="where shopdate >= DATE_FORMAT(DATE_SUB(CURRENT_DATE(),INTERVAL 1 DAY),'%Y-%m-%d 00:00:00')";
				} else if ("一个月内".equals(cboTime.getSelectedItem())) {
					wheresql="where shopdate >= DATE_FORMAT(DATE_SUB(CURRENT_DATE(),INTERVAL 1 MONTH),'%Y-%m-%d 00:00:00')";
				} else if ("最近一周".equals(cboTime.getSelectedItem())) {
					wheresql="where shopdate >= DATE_FORMAT(DATE_SUB(CURRENT_DATE(),INTERVAL 1 WEEK),'%Y-%m-%d 00:00:00')";
				}
				String sql=basesql+wheresql;
				System.out.println(sql);
				ResultSet select1 = select.select(sql);
				if (select1 != null) {
					rows3.removeAllElements();
					while (true) {
						try {if (!select1.next()) break;} catch (SQLException ex) {ex.printStackTrace();}
						Vector v=new Vector();
						for (int i = 1;; i++) {
							try {
								v.add(select1.getString(i));
								//System.out.print(select1.getString(i)+"\t");
							} catch (Exception ex) {
								break;
							}
						}
						System.out.println(v);
						rows3.add(v);
					}
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
