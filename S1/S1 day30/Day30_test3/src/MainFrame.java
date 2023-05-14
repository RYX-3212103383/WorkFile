import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;

public class MainFrame extends JFrame {
	static int[] box1_falg = {0};
	static int[] box2_falg = {0};
	public MainFrame() {

		setTitle("我的记事本");
		setResizable(true);
		setSize(800, 600);
		setMinimumSize(new Dimension(640, 220));
		setLayout(new BorderLayout());
//菜单栏
		JMenuBar menuBar = new JMenuBar();
		add(menuBar, BorderLayout.NORTH);
		String[] menustr = {"文件(F)", "编辑(E)", "格式(M)", "帮助(H)"};
		String[] menuItemstr = {"文件", "编辑", "格式", "帮助"};
		JMenu[] menus = new JMenu[4];
		JMenuItem[] menuItems = new JMenuItem[4];
		for (int i = 0; i < menuItems.length; i++) {
			menus[i] = new JMenu(menustr[i]);
			menuItems[i] = new JMenuItem(menuItemstr[i]);
			menuBar.add(menus[i]);
			menus[i].add(menuItems[i]);
		}
//中间面板
		JPanel p1 = new JPanel();
		p1.setLayout(new BorderLayout());
		add(p1, BorderLayout.CENTER);
//中间面板工具栏
		JPanel p11 = new JPanel();
		p11.setLayout(new GridLayout(1, 2));
		p1.add(p11, BorderLayout.NORTH);
		JPanel p111 = new JPanel();
		p111.setLayout(new FlowLayout(FlowLayout.LEFT));
		p11.add(p111);
		String[] str = {"保存", "复制", "粘贴", "剪切"};
		ImageIcon[] imgs = new ImageIcon[4];
		String[] path = {"save.png", "copy.png", "praise.png", "cut.png"};
		JButton[] btn = new JButton[4];
		for (int i = 0; i < str.length; i++) {
			try {
				imgs[i] = new ImageIcon(ImageIO.read((Objects.requireNonNull(getClass().getResource(path[i])))));
			} catch (IOException e) {
				e.printStackTrace();
			}
			btn[i] = new JButton(str[i],imgs[i]);
			btn[i].setHorizontalTextPosition(SwingConstants.CENTER);
			btn[i].setVerticalTextPosition(SwingConstants.BOTTOM);
			btn[i].setBorderPainted(false);
			btn[i].setMargin(new Insets(0, 0, 0, 0));
			btn[i].setBackground(new Color(237, 237, 237));
			p111.add(btn[i]);
		}
		JPanel p112 = new JPanel();
		p112.setLayout(new FlowLayout(FlowLayout.RIGHT, 0, 30));
		p11.add(p112);
		JCheckBox box1 = new JCheckBox("加粗");
		JCheckBox box2 = new JCheckBox("斜体");
		p112.add(box1);
		p112.add(box2);
//中中面板
		JTextArea textArea = new JTextArea();
		textArea.setLineWrap(true);
		p1.add(textArea, BorderLayout.CENTER);
		textArea.setFont(new Font("",0,20));
//尾栏
		JPanel p2 = new JPanel();
		p2.setLayout(new FlowLayout(FlowLayout.CENTER, 100, 0));
		add(p2, BorderLayout.SOUTH);
		JLabel label3 = new JLabel("当前字数:"+textArea.getText().length());
		DateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String value = format.format(new Date());
		JLabel label4 = new JLabel("日期:"+value);
		JLabel label5 = new JLabel("编码:"+Tools.getEncoding());
		new Thread(new Runnable() {
			@Override

			public void run() {
				for (; ; ) {
					if (box1.isSelected()) box1_falg[0] = 1;
					else box1_falg[0] = 0;
					if (box2.isSelected()) box2_falg[0] = 2;
					else box2_falg[0] = 0;
					int style = box1_falg[0] + box2_falg[0];
					textArea.setFont(new Font("", style, 20));
					label3.setText("当前字数:"+textArea.getText().length());
					DateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
					String value = format.format(new Date());
					label4.setText("日期:"+value);
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}

			}

		}).start();
		p2.add(label3);
		p2.add(label4);
		p2.add(label5);

		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	public static void main(String[] args) {
		new MainFrame();
	}
}
