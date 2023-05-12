import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GameFrame extends JFrame {
	static final int CHANCE = 6;
	static int used = 0;
	static int r = (int) (Math.random() * 100 + 1);

	public GameFrame() {
		setTitle("猜数字游戏");
		setResizable(true);
		setSize(600, 280);
		setLocationRelativeTo(null);
		setLayout(new BorderLayout());

		JPanel p1 = new JPanel();
		add(p1, BorderLayout.CENTER);
		p1.setSize(600, 400);
		p1.setLayout(new FlowLayout(FlowLayout.CENTER, 300, 20));
		JTextField textField = new JTextField(20);
		JLabel lbl1 = new JLabel("输入1-100的数字");
		JLabel lbl2 = new JLabel();
		JLabel lbl3 = new JLabel();
		JButton submit = new JButton("提交");
		p1.add(textField);
		p1.add(lbl1);
		lbl2.setText("使用了" + used + "次机会");
		p1.add(lbl2);
		lbl3.setText("剩余机会" + (CHANCE - used));
		p1.add(lbl3);
		p1.add(submit);
		submit.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int number = -1;
				try {
					number = Integer.parseInt(textField.getText());
					used++;
				} catch (NumberFormatException ex) {
					JOptionPane.showMessageDialog(null, "请输入数字");
				}
				lbl2.setText("使用了" + used + "次机会" + r);
				lbl3.setText("剩余机会" + (CHANCE - used));
				if (used >= CHANCE) {
					int i = JOptionPane.showConfirmDialog(null,
							CHANCE + "次机会已用完\n继续吗?",
							"失败", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
					if (i == 0) {
						r = (int) (Math.random() * 100 + 1);
						used = 0;
						lbl2.setText("使用了" + used + "次机会");
						lbl3.setText("剩余机会" + (CHANCE - used));
					} else if (i == 1) {
						back();
					} else {
						textField.setText("");
					}
				}
				if (number == -1) {} else if (number > r) {
					int i = JOptionPane.showConfirmDialog(null,
							"猜大了\n继续吗?",
							"提示", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
					if (i == 1) {
						back();
					}
					textField.setText("");
				} else if (number < r) {
					int i = JOptionPane.showConfirmDialog(null,
							"猜小了\n继续吗?",
							"提示", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
					if (i == 1) {
						back();
					}
					textField.setText("");
				} else {
					int i = JOptionPane.showConfirmDialog(null,
							"猜对了\n继续吗?",
							"胜利", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
					if (i == 0) {
						r = (int) (Math.random() * 100 + 1);
						used = 0;
						lbl2.setText("使用了" + used + "次机会");
						lbl3.setText("剩余机会" + (CHANCE - used));
					} else if (i == 1) {
						back();
					}
					textField.setText("");
				}
			}
		});


		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	public void back(){
		GameFrame.this.dispose();
		new MainFrame();
	}

//	public static void main(String[] args) {
//		new GameFrame();
//	}
}
