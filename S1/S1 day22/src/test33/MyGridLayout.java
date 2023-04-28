package test33;
import javax.swing.*;
import java.awt.*;

public class MyGridLayout extends JFrame {
	private MyGridLayout(){
		setTitle("网格布局");
		setSize(600,400);
		//设置布局
		//行，列，水平间距，垂直间距
		setLayout(new GridLayout(3,4,10,20));
		JButton btns[]=new JButton[12];
		for (int i = 0; i < btns.length; i++) {
			btns[i]=new JButton("第"+i+"个");
			add(btns[i]);//放到界面
		}


		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);


	}




	public static void main(String[] args) {
		new MyGridLayout();
	}
}
