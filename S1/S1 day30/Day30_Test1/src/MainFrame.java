import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame {
	public MainFrame(){
		setTitle("猜数字游戏");
		setResizable(true);
		setSize(600, 400);
		setLocationRelativeTo(null);
		setLayout(new BorderLayout());

		JButton[] btn=new JButton[4];
		String[] str={"关于","说明","设置难度","开始游戏"};
		for (int i = 0; i < btn.length; i++) {
			btn[i]=new JButton(str[i]);
			btn[i].setBorderPainted(false);
			btn[i].setBackground(new Color(192,192,192));
			btn[i].setFont(new Font("仿宋",1,14));
		}

		JPanel p1=new JPanel();
		p1.setBackground(new Color(237, 237, 237));
		p1.setLayout(new FlowLayout(FlowLayout.LEFT,1,0));
		add(p1,BorderLayout.NORTH);
		p1.add(btn[0]);
		p1.add(btn[1]);
		p1.add(btn[2]);

		JPanel p2=new JPanel();
		p2.setLayout(null);
		add(p2,BorderLayout.CENTER);
		JLabel lbl21=new JLabel("Welcome!");
		lbl21.setFont(new Font("STHupo",0,50));
		p2.add(lbl21);
		lbl21.setBounds(100,100,400,100);

		add(btn[3],BorderLayout.SOUTH);
		btn[3].setBackground(new Color(255,175,175));
		btn[3].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new GameFrame();
				MainFrame.this.dispose();
			}
		});

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	public static void main(String[] args) {
		new MainFrame();
	}
}
