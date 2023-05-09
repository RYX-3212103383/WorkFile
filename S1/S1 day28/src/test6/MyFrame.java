package test6;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {
	JTabbedPane jtp = new JTabbedPane();
	JPanel pl1 = new JPanel();
	JButton btn1=new JButton("测试-用户管理");
	JPanel pl2 = new JPanel();
	JButton btn2=new JButton("测试-商品管理");

	MyFrame() {
		setTitle("选项面板");
		setResizable(true);
		setLocation(600, 400);
		setLayout(new BorderLayout());
		pl1.add(btn1, BorderLayout.NORTH);
		pl2.add(btn2, BorderLayout.NORTH);
		jtp.add("用户管理", pl1);
		jtp.add("商品管理", pl2);
		add(jtp);
		setSize(800, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
}
