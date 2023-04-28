package test31;
import javax.swing.*;
import java.awt.*;

public class MyBorderLayout0 extends JFrame {
	public MyBorderLayout0(){
		setTitle("边界布局");
		setSize(600,400);
		//设置布局：边界布局
		setLayout(new BorderLayout());
		//造一个按钮
		JButton btn1=new JButton("北方");
		JButton btn2=new JButton("南方");
		JButton btn3=new JButton("左边");
		JButton btn4=new JButton("右边");
		JButton btn5=new JButton("中间");
		//放到界面的上面
		add(btn1,BorderLayout.NORTH);
		add(btn2,BorderLayout.SOUTH);
		add(btn3,BorderLayout.WEST);
		add(btn4,BorderLayout.EAST);
		add(btn5,BorderLayout.CENTER);




		setResizable(true);//禁止最小化和最大化
		setLocationRelativeTo(null);//居中
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//退出并关闭
		setVisible(true);
	}

	public static void main(String[] args) {
		new MyBorderLayout0();
	}
}

