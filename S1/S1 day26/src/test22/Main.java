package test22;

import javax.swing.*;
import java.awt.*;

public class Main {
	public static void main(String[] args) {
		JFrame jframe = new JFrame("冉渝湘");
		jframe.setVisible(true);
		jframe.setResizable(true);//最小化和最大化
		jframe.setLocationRelativeTo(null);//居中
		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//退出并关闭
		jframe.setVisible(true);
		jframe.setSize(400, 300);
		jframe.setLocation(300, 400);
		jframe.setLayout(new GridLayout(1, 1));
		/*JPanel p1=new JPanel();
		p1.setBackground(new Color(115, 231, 190));
		JPanel p2=new JPanel();
		p2.setBackground(new Color(37, 225, 231, 201));
		p2.setLayout(new FlowLayout(FlowLayout.CENTER));
		JText jt=new JTextArea();

		p2.add(jt);
		JPanel p3=new JPanel();
		p3.setBackground(new Color(37, 121, 231, 255));
		p3.setLayout(new FlowLayout(FlowLayout.CENTER));
		JButton login=new JButton("登录");
		login.setSize(100,30);
		JButton exit=new JButton("退出");
		exit.setSize(80,30);
		p3.add(login);
		p3.add(exit);
		jframe.add(p1);
		jframe.add(p2);
		jframe.add(p3);*/
		/* 布局部分我们这边不多做介绍
		 * 这边设置布局为 null
		 */
		JPanel panel = new JPanel();
		panel.setLayout(null);
		jframe.add(panel);
		// 创建 JLabel
		JLabel userLabel = new JLabel("用户名:");
		/* 这个方法定义了组件的位置。
		 * setBounds(x, y, width, height)
		 * x 和 y 指定左上角的新位置，由 width 和 height 指定新的大小。
		 */
		userLabel.setBounds(45, 60, 60, 30);
		panel.add(userLabel);
		/*
		 * 创建文本域用于用户输入
		 */
		JTextField userText = new JTextField(20);
		userText.setBounds(115, 60, 240, 30);
		panel.add(userText);

		// 输入密码的文本域
		JLabel passwordLabel = new JLabel("密    码:");
		passwordLabel.setBounds(45, 100, 60, 30);
		panel.add(passwordLabel);
		/*
		 *这个类似用于输入的文本域
		 * 但是输入的信息会以点号代替，用于包含密码的安全性
		 */
		JPasswordField passwordText = new JPasswordField(20);
		passwordText.setBounds(115, 100, 240, 30);
		panel.add(passwordText);

		// 创建登录按钮
		JButton loginButton = new JButton("登录");
		loginButton.setBounds(70, 180, 120, 30);
		panel.add(loginButton);
		JButton exitButton = new JButton("退出");
		exitButton.setBounds(210, 180, 120, 30);
		panel.add(exitButton);
	}
}
