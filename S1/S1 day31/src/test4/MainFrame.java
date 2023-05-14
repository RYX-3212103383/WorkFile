package test4;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class MainFrame extends JFrame {
	public MainFrame() {
		setTitle("窗口名称");
		setResizable(true);
		setSize(400, 300);
		setLayout(null);

		JLabel[] lbl = new JLabel[4];
		String[] str={"用户名", "密码", "姓名", "权限"};
		JTextField[] textFields = new JTextField[3];
		JComboBox box = new JComboBox();
		JButton[] btn = new JButton[2];
		for (int i = 0, x1 = 80,x2=160, y = 40, w1 = 80, w2 = 160, h = 20; i < 3; i++) {
			lbl[i]=new JLabel(str[i]);
			textFields[i]=new JTextField(20);
			lbl[i].setBounds(x1,y,w1,h);
			textFields[i].setBounds(x2,y,w2,h);
			y+=40;
			add(lbl[i]);
			add(textFields[i]);
		}
		lbl[3]=new JLabel(str[3]);
		lbl[3].setBounds(80,160,80,20);
		add(lbl[3]);
		box.setBounds(160,160,160,20);
		box.addItem("收银员");
		box.addItem("仓库管理员");
		box.addItem("管理员");
		add(box);
		btn[0]=new JButton("确定");
		btn[0].setBounds(180,210,80,20);
		add(btn[0]);
		btn[1]=new JButton("取消");
		btn[1].setBounds(270,210,80,20);
		add(btn[1]);
		btn[0].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int length=textFields[0].getText().length()*textFields[1].getText().length()*textFields[2].getText().length();
				String msg="请填写";
				if(length==0){
					if(textFields[0].getText().length()==0){
						msg+="用户名 ";
					}
					if(textFields[1].getText().length()==0){
						msg+="密码 ";
					}
					if(textFields[2].getText().length()==0){
						msg+="姓名";
					}
					msg+="!";
					ImageIcon img = null;
					try {
						img = new ImageIcon(ImageIO.read(getClass().getResource("/warn.png")));
					} catch (IOException ex) {
						ex.printStackTrace();
					}
					JOptionPane.showMessageDialog(null,msg,null,JOptionPane.WARNING_MESSAGE, img);

				}
			}
		});
		btn[1].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(-1);
			}
		});

		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	public static void main(String[] args) {
		new MainFrame();
	}
}
