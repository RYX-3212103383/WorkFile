package test5;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {
	JButton btn1=new JButton("添加");
	JButton btn2=new JButton("删除");
	JButton btn3=new JButton("修改");
	MyFrame(){
		setTitle("菜单栏和工具栏的制作");
		setResizable(true);
		setLocation(600,400);
		setLayout(new BorderLayout());
		//菜单栏
		JMenuBar menuBar=new JMenuBar();
		JMenu file=new JMenu("文件  ");
		JMenuItem file1=new JMenuItem("新建");
		JMenuItem file2=new JMenuItem("打开    ");
		file.add(file1);
		file.add(file2);
		JMenu help=new JMenu("帮助");
		JMenuItem help1=new JMenuItem("关于我们");
		JMenuItem help2=new JMenuItem("帮助");
		help.add(help1);
		help.add(help2);
		menuBar.add(file);
		menuBar.add(help);
		add(menuBar,BorderLayout.NORTH);
		JPanel panel=new JPanel();
		panel.setLayout(new BorderLayout());
		//工具栏
		JToolBar toolBar=new JToolBar("工具栏");
		toolBar.add(btn1);
		toolBar.add(btn2);
		toolBar.add(btn3);
		panel.add(toolBar,BorderLayout.NORTH);
		//文本域
		JTextArea txtashow=new JTextArea();
		add(panel);
		panel.add(txtashow,BorderLayout.CENTER);
		setSize(800,600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
}
