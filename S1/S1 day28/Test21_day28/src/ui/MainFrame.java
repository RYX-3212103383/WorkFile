package ui;


import entity.Student;
import service.StudentService;
import service.impl.StudentServiceImpl;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import java.util.Vector;
public class MainFrame extends JFrame {
	private DefaultTableModel dtm;
	// 引入服务层
	private StudentService service = new StudentServiceImpl();

	public static void main(String[] args) {
		new MainFrame();
	}

	public MainFrame() {
		setTitle("学员管理系统主界面");
		setSize(800, 600);
		setLocationRelativeTo(null);//居中
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//1.上下两部分
		JPanel panelTop = new JPanel();
		panelTop.setBackground(Color.GRAY);
		JPanel panelBottom = new JPanel();
		panelBottom.setBackground(Color.CYAN);
		//2.JFrame中的容器设置为边界布局
		getContentPane().setLayout(new BorderLayout());
		//3.上面的面板加入北边
		getContentPane().add(panelTop, BorderLayout.NORTH);
		//4.下面的面板加入中间
		getContentPane().add(panelBottom, BorderLayout.CENTER);

		//5.上面的面板分成两部分
		//5.1先要面板的宽高
		//panelTop.setPreferredSize(new Dimension(800, 150));
		//5.2先要设置为边界布局
		panelTop.setLayout(new BorderLayout());
		//5.3创建上下面板
		JPanel panelTop1 = new JPanel();
		//在设置布局的时候左对齐（流式布局默认为居中对齐）
		panelTop1.setLayout(new FlowLayout(FlowLayout.LEFT));
		//放按钮
		JButton btnAdd = new JButton("添加");
		JButton btnUpdate = new JButton("修改");
		JButton btnDelete = new JButton("删除");
		panelTop1.add(btnAdd);
		panelTop1.add(btnUpdate);
		panelTop1.add(btnDelete);
		JPanel panelTop2 = new JPanel();
		panelTop2.setLayout(new FlowLayout(FlowLayout.LEFT));
		JLabel lblName = new JLabel("按姓名查");
		panelTop2.add(lblName);
		JTextField txtName = new JTextField();
		txtName.setPreferredSize(new Dimension(120, 25));
		panelTop2.add(txtName);
		JButton btnSelect = new JButton("查找");

		panelTop2.add(btnSelect);
		//5.4 放
		panelTop.add(panelTop1, BorderLayout.NORTH);
		panelTop.add(panelTop2, BorderLayout.CENTER);
		//底部造表格，首先用边界布局
		panelBottom.setLayout(new BorderLayout());
		//选做一个滚动面板
		JScrollPane scrollPane = new JScrollPane();
		//放入底部
		panelBottom.add(scrollPane, BorderLayout.CENTER);
		//造表格
		dtm = new DefaultTableModel();
		JTable table = new JTable();
		table.setModel(dtm);//这里的意思，先给表格一个大铁门，后面再放数据
		refreshTable();//一句搞定
		//把表格放入滚动面板
		scrollPane.setViewportView(table);
		// 按钮的事件监听
		btnSelect.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				//1.检查文本框有没有值
				//1.1获取文本框的值
				String name = txtName.getText();
				//1.2判断

				//1.3.如果有，就调模糊查
				Student stu = new Student();
				stu.setName(name);
				refreshTable2(stu);
			}
		});
		btnAdd.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				//弹出一个模态对话框
				StudentAddDialog dialog = new StudentAddDialog();
				dialog.setModal(true);
				dialog.setVisible(true);
				refreshTable();//刷新表格
			}
		});
		//修改
		btnUpdate.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				//1. 提醒用户选择要修改的行
				int index = table.getSelectedRow();
				//1.1如果index为-1，说明没有选择行
				if (index == -1) {
					JOptionPane.showMessageDialog(null, "请选择要修改的行" + index);
					return;
				}
				//JOptionPane.showMessageDialog(null, "当前的行号为：" + index);

				//2.获取用户选择的行的第一列值

				String id = dtm.getValueAt(index, 0) + "";
				//JOptionPane.showMessageDialog(null, "当前行的第一列的值为：" + id);
				//3.送到修改对话框
				StudentUpdateDialog sud = new StudentUpdateDialog(id);

				//刷新表格
				refreshTable();

			}
		});
		btnDelete.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				//1.提醒用得选呀
				int index = table.getSelectedRow();
				if (table.getSelectedRow() == -1) {
					JOptionPane.showMessageDialog(null, "请选择要删除的行!");
					return;
				}
				//2.获得选中行的id
				int id = Integer.parseInt(dtm.getValueAt(index, 0) + "");
				//先问用户是不是真的要删除？为了防止用户的误操作
				int i = JOptionPane.showConfirmDialog(null, "你确定要删除吗", "警告", JOptionPane.YES_NO_OPTION);
				if (JOptionPane.OK_OPTION == i) {//0
					boolean flag = service.delete(id);
					if (flag) {
						JOptionPane.showMessageDialog(null, "删除成功");
						refreshTable();//刷表格
					} else {
						JOptionPane.showMessageDialog(null, "删除失败");
					}
				}
			}
		});
		//所有控件造出来了，再显示给用户看
		setVisible(true);
	}

	//抽成列方法
	public Vector getCols() {
		Vector cols = new Vector();
		cols.add("编号");
		cols.add("姓名");
		cols.add("性别");
		cols.add("生日");
		cols.add("院系");
		cols.add("地址");
		return cols;
	}

	//抽成行方法
	public Vector<Vector> getRows() {
		Vector<Vector> rows = new Vector<>();
		//查询所有学生
		List<Student> students = service.findAll();
		//把List转为Vector
		if (students != null && students.size() > 0) {
			for (Student student : students) {
				//每一行数据都放入Vector
				Vector v = new Vector();
				v.add(student.getId());
				v.add(student.getName());
				v.add(student.getSex());
				String msg = student.getBirth() != null ? student.getBirth().substring(0, 4) : student.getBirth();
				v.add(msg);
				v.add(student.getDepartment());
				v.add(student.getAddress());
				//小v放rows
				rows.add(v);
			}
		}
		return rows;
	}

	//抽成大表格方法
	public void refreshTable() {
		Vector cols = getCols();
		Vector<Vector> rows = getRows();
		dtm.setDataVector(rows, cols);
	}

	//===================================================================================
	//抽成行方法
	public Vector<Vector> getRows2(Student stu) {
		Vector<Vector> rows = new Vector<>();
		//模糊查询所有学生
		List<Student> students = service.findByLike(stu);
		//把List转为Vector
		if (students != null && students.size() > 0) {
			for (Student student : students) {
				//每一行数据都放入Vector
				Vector v = new Vector();
				v.add(student.getId());
				v.add(student.getName());
				v.add(student.getSex());
				String msg = student.getBirth() != null ? student.getBirth().substring(0, 4) : student.getBirth();
				v.add(msg);
				v.add(student.getDepartment());
				v.add(student.getAddress());
				//小v放rows
				rows.add(v);
			}
		}
		return rows;
	}

	//抽成大表格方法
	public void refreshTable2(Student student) {
		Vector cols = getCols();
		Vector<Vector> rows = getRows2(student);
		dtm.setDataVector(rows, cols);
	}
}
