package ui;

import entity.Student;
import service.StudentService;
import service.impl.StudentServiceImpl;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class StudentUpdateDialog extends JDialog {
	//1.把需要的控件全部声明
	private JLabel lblId;
	private JTextField txtId;
	private JLabel lblName;
	private JTextField txtName;
	private JLabel lblSex;
	private JPanel panelSex;
	private ButtonGroup bg;
	private JRadioButton radBoy;
	private JRadioButton radGirl;
	private JLabel lblBirth;
	private JTextField txtBirth;
	private JLabel lblDepartment;
	private JComboBox cobDepartment;
	private JLabel lblAddress;
	private JTextField txtAddress;
	private JButton btnEdit;
	private JButton btnCancel;
	//创建服务
	private StudentService service = new StudentServiceImpl();

	public StudentUpdateDialog(String id) {
		System.out.println(id);
		//根据传过来的id查单个
		Student stu = service.findOne(Integer.parseInt(id));
		System.out.println(stu);
		//2.全部初始化
		lblId = new JLabel("编号：");
		txtId = new JTextField();
		txtId.setText(id);//回显id
		lblName = new JLabel("姓名：");
		txtName = new JTextField();
		txtName.setText(stu.getName());
		lblSex = new JLabel("性别");
		panelSex = new JPanel();
		bg = new ButtonGroup();
		radBoy = new JRadioButton("男");
		radGirl = new JRadioButton("女");
		//

		if (stu.getSex().equals(radBoy.getText())) {
			radBoy.setSelected(true);
		} else {
			radGirl.setSelected(true);
		}
		//
		lblBirth = new JLabel("出生年：");
		txtBirth = new JTextField();
		txtBirth.setText(stu.getBirth() != null ? stu.getBirth().substring(0, 4) : stu.getBirth());
		lblDepartment = new JLabel("院系：");
		cobDepartment = new JComboBox();
		//给值: 类似表格的写法// 还有一个叫JList也类似这么写
		DefaultComboBoxModel cbm = new DefaultComboBoxModel();
		cobDepartment.setModel(cbm);
		cbm.addElement("请选择");
		cbm.addElement("计算机系");
		cbm.addElement("英语系");
		cbm.addElement("中文系");
		//先获得记录中的系
		String department = stu.getDepartment();
		//2.比较
		int size = cbm.getSize();
		for (int i = 0; i < size; i++) {
			if ((cbm.getElementAt(i) + "").equals(department)) {
				cbm.setSelectedItem(department);
				break;
			}
		}

		lblAddress = new JLabel("地址：");
		txtAddress = new JTextField();
		txtAddress.setText(stu.getAddress());
		btnEdit = new JButton("修改");
		btnCancel = new JButton("取消");

		//3.放
		setTitle("修改学员信息");
		setSize(400, 600);
		//3.1设置布局
		this.setLayout(new GridLayout(7, 2, 10, 50));

		//3.2放
		add(lblId);
		add(txtId);
		txtId.setEditable(false);//主键不能改
		add(lblName);
		add(txtName);
		add(lblSex);
		add(panelSex);

		bg.add(radBoy);
		bg.add(radGirl);
		panelSex.add(radBoy);
		panelSex.add(radGirl);

		add(lblBirth);
		add(txtBirth);
		add(lblDepartment);
		add(cobDepartment);
		add(lblAddress);
		add(txtAddress);
		add(btnEdit);
		add(btnCancel);
		//pack();//适合大小
		setLocationRelativeTo(null);

		//写事件监听
		btnEdit.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				//1.获取值
				int ids = Integer.parseInt(id);
				String name = txtName.getText();
				String sex = null;
				if (radBoy.isSelected()) {
					sex = radBoy.getText();
				} else {
					sex = radGirl.getText();
				}
				String birth = txtBirth.getText();
				String department = cobDepartment.getSelectedItem() + "";
				String address = txtAddress.getText();
				Student stu = new Student();
				stu.setId(ids);
				stu.setName(name);
				stu.setSex(sex);
				stu.setBirth(birth);
				stu.setDepartment(department);
				stu.setAddress(address);
				//2.封装成对象
				//3.调服务层的方法
				boolean flag = service.update(stu);
				if (flag) {
					JOptionPane.showMessageDialog(null, "修改成功");
					dispose();//关掉自己
				} else {
					JOptionPane.showMessageDialog(null, "修改失败");
				}
			}
		});

		setModal(true);
		setVisible(true);
	}
//测试
//    public static void main(String[] args) {
//        new StudentUpdateDialog();
//    }
}
