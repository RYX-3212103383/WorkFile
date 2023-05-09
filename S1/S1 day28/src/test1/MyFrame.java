package test1;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {
	JButton[] btn=new JButton[5];
	Color[] colors={
			new Color(192, 11, 11),
			new Color(0, 167, 254),
			new Color(101, 29, 161),
			new Color(14, 73, 17),
			new Color(134, 215, 80)
	};
	String[] text={"上北North","下南South","左西West","右东East","中间Center"};
	MyFrame(){
		setTitle("边界布局");
		setResizable(true);//设置窗体是否可调
		setLocationRelativeTo(null);//设置位置
		setLayout(new BorderLayout());
		for (int i = 0; i < btn.length; i++) {
			btn[i]=new JButton(text[i]);
			btn[i].setBackground(colors[i]);
		}
		add(btn[0],BorderLayout.NORTH);
		add(btn[1],BorderLayout.SOUTH);
		add(btn[2],BorderLayout.WEST);
		add(btn[3],BorderLayout.EAST);
		add(btn[4],BorderLayout.CENTER);
		setSize(800, 600);//设置大小
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//设置关闭按钮功能退出并关闭
		setVisible(true);//设置可见
	}
}
