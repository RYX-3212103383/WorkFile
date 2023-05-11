package test2;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.io.IOException;

public class MyFrame extends JFrame {
	JPanel pcent = new JPanel();
	JPanel p1 = new JPanel();
	JTextArea textArea = new JTextArea("即将用备份的数据文件职代您现在使用的数据文件;所有系统内的数据将被备份文件覆盖。恢复完成后请重启本软件。");
	JLabel lll = new JLabel("即将用备份的数据文件职代您现在使用的数据文件;所有系统内的数据将被备份文件覆盖。恢复完成后请重启本软件。");
	JPanel p2 = new JPanel();
	JLabel lbl2 = new JLabel();
	JTextField textField = new JTextField(20);
	JButton imgbtn = new JButton();
	JPanel p3 = new JPanel();
	JButton btn1 = new JButton("开始恢复");
	JButton btn2 = new JButton("退出(Esc)");

	MyFrame() {
		setTitle("数据恢复");
		setResizable(true);
		setSize(600, 300);
		setLayout(new BorderLayout());

		p1.setBorder(new LineBorder(new Color(0, 255, 195), 1, true));
		p1.setLayout(new GridLayout(2, 1));
		add(pcent);
		pcent.setLayout(null);
		pcent.add(p1);
		p1.setBounds(100, 30, 400, 150);
		p1.add(textArea);
		textArea.setEditable(false);
		textArea.setLineWrap(true);
		textArea.setBackground(new Color(238, 238, 238));
		p1.add(p2, BorderLayout.CENTER);
		lbl2.setText("请选择恢复的文件:");
		p2.add(lbl2);
		p2.add(textField);
		p2.add(imgbtn);
		try {
			imgbtn.setIcon(new ImageIcon(ImageIO.read((getClass().getResource("/test2/btn.png")))));
		} catch (IOException e) {
			e.printStackTrace();
		}
		imgbtn.setBorder(new LineBorder(new Color(0, 0, 0, 10), 1));
		add(p3, BorderLayout.SOUTH);
		p3.setLayout(new FlowLayout(FlowLayout.RIGHT));
		p3.add(btn1);
		p3.add(btn2);

		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	public static void main(String[] args) {
		new MyFrame();
	}
}
