package test4;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {
	JButton[] btn=new JButton[6];
	Color[] colors={
			new Color(192, 11, 11),
			new Color(0, 167, 254),
			new Color(101, 29, 161),
			new Color(14, 73, 17),
			new Color(134, 215, 80),
			new Color(0, 60, 175)
	};
	String[] text={"按钮1","按钮2","按钮3","按钮4","按钮5","按钮6"};
	MyFrame(){
		setTitle("绝对布局");
		setResizable(true);
		setLocationRelativeTo(null);
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(new Color(102, 190, 143));
		add(panel);
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
		setSize(400,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
}
