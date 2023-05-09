package test2;

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
		setTitle("流式布局");
		setResizable(true);
		setLocationRelativeTo(null);
		setLayout(new FlowLayout(FlowLayout.LEFT));
		for (int i = 0; i < btn.length; i++) {
			btn[i]=new JButton(text[i]);
			btn[i].setBackground(colors[i]);
			add(btn[i]);
		};
		setSize(800,600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
}
