package test22;

import javax.swing.*;
import java.awt.*;

public class Main {
	public static Color cp1       = new Color(255, 0, 0);
	public static Color cp2       = new Color(0, 255, 255);
	public static Color cp3       = new Color(128, 128, 128);
	public static Color cp4       = new Color(128, 128, 128);
	public static Color cp5       = new Color(0, 255, 0);
	public static void main(String[] args) {
		new MyBorderLayout0();
	}

	public static class MyBorderLayout0 extends JFrame {
		public MyBorderLayout0() {
			setTitle("我的第一个窗体");
			setSize(426, 324);
			//设置布局：边界布局
			setLayout(new BorderLayout());
			//造一个按钮
			JPanel p1 = new JPanel("北方".isEmpty());
			p1.setBackground(cp1);
			JPanel p2 = new JPanel("南方".isEmpty());
			p2.setBackground(cp2);
			JPanel p3 = new JPanel("左边".isEmpty());
			p3.setBackground(cp3);
			JPanel p4 = new JPanel("右边".isEmpty());
			p4.setBackground(cp4);
			JPanel p5 = new JPanel("中间".isEmpty());
			p5.setBackground(cp5);
			JButton btn1 = new JButton("上北");
			JButton btn2 = new JButton("下南");
			JButton btn3 = new JButton("左西");
			JButton btn4 = new JButton("右东");
			JButton btn5 = new JButton("中中");
			//放到界面的上面
			add(p1,BorderLayout.NORTH);
			p1.add(btn1, BorderLayout.NORTH);
			add(p2,BorderLayout.SOUTH);
			p2.add(btn2, BorderLayout.SOUTH);
			add(p3,BorderLayout.WEST);
			p3.add(btn3, BorderLayout.WEST);
			add(p4,BorderLayout.EAST);
			p4.add(btn4, BorderLayout.EAST);
			add(p5,BorderLayout.CENTER);
			p5.add(btn5, BorderLayout.CENTER);


			setResizable(true);//禁止最小化和最大化
			setLocationRelativeTo(null);//居中
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//退出并关闭
			setVisible(true);
		}
	}
}