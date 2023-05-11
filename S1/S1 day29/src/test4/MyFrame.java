package test4;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.io.IOException;

public class MyFrame extends JFrame {
	JPanel p1 = new JPanel();
	JLabel label1 = new JLabel("第一步:输入账套名称、数据库名称、账套说明");
	JPanel p2 = new JPanel();
	JPanel p21 = new JPanel();
	JPanel p22 = new JPanel();
	JPanel p23 = new JPanel();
	JPanel p24 = new JPanel();
	JPanel p25 = new JPanel();
	JLabel lbl1 = new JLabel("账    套名称:");
	JTextField textField1 = new JTextField(20);
	JLabel lbl2 = new JLabel("数据库名称:");
	JTextField textField2 = new JTextField(20);
	JLabel lbl3 = new JLabel("账    套说明:");
	JTextField textField3 = new JTextField(20);
	JCheckBox box1 = new JCheckBox();
	JLabel lbl4 = new JLabel("默    认账套:");
	JButton imgbtn = new JButton();
	JTextArea textArea = new JTextArea("数据库名称必须以字母开头，并且不能使用汉字或其它特殊字符。系统会自动把帐套数据库创建到本机的SQL SERVER中。");
	JPanel p3 = new JPanel();
	JButton btn1 = new JButton("开始恢复");
	JButton btn2 = new JButton("退出(Esc)");

	MyFrame() {
		setTitle("新增账套");
		setResizable(true);
		setSize(600, 400);
		setLayout(new BorderLayout());

		add(p1, BorderLayout.NORTH);
		p1.setLayout(new FlowLayout(FlowLayout.LEFT));
		p1.add(label1);
		label1.setFont(new Font("", 1, 15));
		label1.setForeground(new Color(0, 0, 255));

		add(p2, BorderLayout.CENTER);
		p2.setLayout(new GridLayout(5, 1));
		p2.add(p21);
		p21.add(lbl1);
		p21.add(textField1);
		p2.add(p22);
		p22.add(lbl2);
		p22.add(textField2);
		p2.add(p23);
		p23.add(lbl3);
		p23.add(textField3);
		p2.add(p24);
		p24.add(box1);
		p24.add(lbl4);
		p24.add(imgbtn);
		p2.add(p25);
		p25.add(textArea);
		textArea.setSize(400, 120);
		textArea.setForeground(new Color(255, 0, 0));
		textArea.setBackground(new Color(238, 238, 238));
		textArea.setLineWrap(true);
		textArea.setEditable(false);
		try {
			imgbtn.setIcon(new ImageIcon(ImageIO.read((getClass().getResource("/test4/help.png")))));
		} catch (IOException e) {
			e.printStackTrace();
		}
		imgbtn.setBorder(new LineBorder(new Color(0, 0, 0, 10), 1));

		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);

		add(p3, BorderLayout.SOUTH);
		p3.setLayout(new FlowLayout(FlowLayout.RIGHT));
		p3.add(btn1);
		p3.add(btn2);
	}

	public static void main(String[] args) {
		new MyFrame();
	}
}
