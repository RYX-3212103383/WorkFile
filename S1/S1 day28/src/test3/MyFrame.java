package test3;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.text.html.ImageView;
import java.awt.*;
import java.io.IOException;
import java.util.Objects;

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
	String[] imgPath={
			"/1.png",
			"/2.png",
			"/3.png",
			"/4.png",
			"/5.png",
			"/6.png"
	};
	String[] text={"按钮1","按钮2","按钮3","按钮4","按钮5","按钮6"};
	MyFrame(){
		setTitle("流式布局");
		setResizable(true);
		setLocationRelativeTo(null);
		setLayout(new GridLayout(3,2));
		for (int i = 0; i < btn.length; i++) {
			btn[i]=new JButton(text[i]);
			btn[i].setHorizontalTextPosition(SwingConstants.CENTER);
			btn[i].setVerticalTextPosition(SwingConstants.CENTER);
			Image img= null;
			try {
				img = ImageIO.read(Objects.requireNonNull(this.getClass().getResource(imgPath[i])));
				//img.getScaledInstance(390,180,Image.SCALE_DEFAULT);
			} catch (IOException e) {
				e.printStackTrace();
			}
			btn[i].setIcon(new ImageIcon(img));
			add(btn[i]);
		};
		setSize(800,600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
}
