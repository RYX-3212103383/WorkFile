package ui;

import entity.Student;
import service.StudentService;
import service.impl.StudentServiceImpl;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StudentAddDialog extends JDialog {
	private StudentService service = new StudentServiceImpl();

	public StudentAddDialog() {
		setTitle("添加学员信息");
		setSize(400, 600);
		setLocationRelativeTo(null);
		//用网格布局
		getContentPane().setLayout(new GridLayout(7, 2, 1, 50));
		JLabel lblId = new JLabel("编号:");
		JTextField txtId = new JTextField();
		// 编号不让编辑
		txtId.setEditable(false);
		//txtId.setEnabled(false);
		//txtId.setVisible(false);
		JLabel lblName = new JLabel("姓名:");
		JTextField txtName = new JTextField();
		JLabel lblSex = new JLabel("性别:");
		//JTextField txtSex = new JTextField();
		JPanel panelSex = new JPanel();
		ButtonGroup bg = new ButtonGroup();
		JRadioButton btnBoy = new JRadioButton("男");
		JRadioButton btnGirl = new JRadioButton("女");
		//默认选中男
		btnBoy.setSelected(true);
		//加背景色
		btnBoy.setBackground(Color.red);
		//设置字体
		btnBoy.setFont(new Font("黑体", Font.BOLD, 24));
		//设置字色
		btnBoy.setForeground(Color.YELLOW);

		bg.add(btnBoy);
		bg.add(btnGirl);
		panelSex.add(btnBoy);
		panelSex.add(btnGirl);

		//
		JLabel lblBirth = new JLabel("出生年:");
		JTextField txtBirth = new JTextField();
		JLabel lblDepartment = new JLabel("院系:");
		//JTextField txtDepartment = new JTextField();
		String names[] = {"请选择", "计算机系", "中文系", "英语系"};
		JComboBox cobDepartment = new JComboBox(names);
		JLabel lblAddress = new JLabel("地址:");
		JTextField txtAddress = new JTextField();
		JButton btnAdd = new JButton("添加");
		JButton btnCancel = new JButton("取消");
		getContentPane().add(lblId);
		getContentPane().add(txtId);
		getContentPane().add(lblName);
		getContentPane().add(txtName);
		getContentPane().add(lblSex);
		getContentPane().add(panelSex);
		getContentPane().add(lblBirth);
		getContentPane().add(txtBirth);
		getContentPane().add(lblDepartment);
		getContentPane().add(cobDepartment);
		getContentPane().add(lblAddress);
		getContentPane().add(txtAddress);
		getContentPane().add(btnAdd);
		getContentPane().add(btnCancel);
		//添加
		btnAdd.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				//1.先判断用户填写了没
				//1.1姓名
				String name = txtName.getText();
				if (name == null || "".equals(name)) {
					JOptionPane.showMessageDialog(null, "请输入学员姓名！");
					return;
				}
				//1.2性别
				String sex = btnBoy.isSelected() ? "男" : "女";
				//1.3生日 1900~2020年
				String birth = txtBirth.getText();
				//1.3.1判断是不是4位
				if (birth.length() != 4) {
					JOptionPane.showMessageDialog(null, "生日 1900~2020年");
					return;
				}
				//1.3.2强转成int
				int year = 0;
				try {
					year = Integer.parseInt(birth);
				} catch (Exception e1) {
					JOptionPane.showMessageDialog(null, "生日 1900~2020年");
					return;
				}
				//1.3.3 判断范围
				if (!(year >= 1900 && year <= 2020)) {
					JOptionPane.showMessageDialog(null, "生日 1900~2020年");
					return;
				}
				//1.3判断下拉列表
				if (cobDepartment.getSelectedIndex() == 0) {
					JOptionPane.showMessageDialog(null, "请选择院系！");
					return;
				}
				//转为字符串
				String department = cobDepartment.getSelectedItem() + "";
				//1.4地址
				String address = txtAddress.getText();

				//2.收集信息
				Student student = new Student();
				student.setName(name);
				student.setSex(sex);
				student.setBirth(birth);
				student.setDepartment(department);
				student.setAddress(address);
				//3.调服务层
				boolean flag = service.add(student);
				if (flag) {
					JOptionPane.showMessageDialog(null, "添加成功");
					//自己关掉自己
					dispose();

				} else {
					JOptionPane.showMessageDialog(null, "添加失败");
				}

			}
		});
	}
//测试
//    public static void main(String[] args) {
//        new StudentAddDialog();
//    }
}
