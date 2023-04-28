package test32;

import javax.swing.*;
import java.awt.*;

public class MyFlowLayout extends JFrame {
	public MyFlowLayout(){
		setTitle("流式布局");
		setSize(600,400);
		//流水布局
		setLayout(new FlowLayout());
		JButton btns[]=new JButton[10];
		for (int i = 0; i < btns.length; i++) {
			btns[i]=new JButton("第"+i+"个");
			add(btns[i]);
		}


		//setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);


	}

	public static void main(String[] args) {
		new MyFlowLayout();
	}
}
