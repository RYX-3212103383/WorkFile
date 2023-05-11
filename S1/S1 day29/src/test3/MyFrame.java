package test3;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;

public class MyFrame extends JFrame {
	JPanel pcet = new JPanel();
	JPanel pin = new JPanel();
	ButtonGroup group = new ButtonGroup();
	JRadioButton rbo1 = new JRadioButton("清除所有信息，只保留基本信息]");
	JRadioButton rbo2 = new JRadioButton("清除所有信息,只保留admin用户");
	JRadioButton rbo3 = new JRadioButton("清除所有营业数据,保留库存数据");
	JRadioButton rbo4 = new JRadioButton("清除指定时间段的营业数据");
	JPanel timepanel = new JPanel();
	JLabel timelbl1 = new JLabel("营业时间");
	JLabel timelbl2 = new JLabel("至");
	JLabel lbl1 = new JLabel("初始化数据库之前请先备份数据库");
	JPanel pbut = new JPanel();
	JButton btn1 = new JButton("确定");
	JButton btn2 = new JButton("退出");
	private final String[] list = {
			"1",
			"2",
			"3",
			"4",
			"5",
			"6",
			"7",
			"8",
			"9",
			"10",
			"11",
			"12"
	};
	JComboBox<String> box1 = new JComboBox<String>(list);
	JComboBox<String> box2 = new JComboBox<String>(list);

	MyFrame() {
		setTitle("系统初始化");
		setResizable(true);
		setSize(400, 350);
		setLayout(new BorderLayout());

		add(pcet, BorderLayout.CENTER);
		pcet.add(pin);
		pin.setBorder(new LineBorder(new Color(23, 120, 161), 1));
		pin.setLayout(new GridLayout(6, 1, 10, 10));
		pin.add(rbo1);
		pin.add(rbo2);
		pin.add(rbo3);
		pin.add(rbo4);
		group.add(rbo1);
		group.add(rbo2);
		group.add(rbo3);
		group.add(rbo4);
		pin.add(timepanel);
		timepanel.setLayout(new FlowLayout());
		timepanel.add(timelbl1);
		timepanel.add(box1);
		box1.setEditable(true);
		timepanel.add(timelbl2);
		timepanel.add(box2);
		box2.setEditable(true);
		pin.add(lbl1);
		lbl1.setForeground(new Color(255, 0, 0));
		add(pbut, BorderLayout.SOUTH);
		pbut.add(btn1);
		pbut.add(btn2);

		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	public static void main(String[] args) {
		new MyFrame();
	}
}
