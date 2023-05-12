import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.util.Objects;

public class MainFrame extends JFrame {
	public MainFrame() {

		setTitle("我的记事本");
		setResizable(true);
		setSize(800, 600);
		setMinimumSize(new Dimension(350, 190));
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
		String[] path = {"save.png", "copy.png", "prase.png", "cut.png"};
		JButton[] btn = new JButton[4];
		for (int i = 0; i < str.length; i++) {
			try {
				imgs[i] = new ImageIcon(ImageIO.read((Objects.requireNonNull(getClass().getResource(path[i])))));
			} catch (IOException e) {
				e.printStackTrace();
			}
			btn[i] = new JButton(imgs[i]);
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
		JTabbedPane tabbedPane = new JTabbedPane();
		p1.add(textArea, BorderLayout.CENTER);
		tabbedPane.setBackground(new Color(0, 117, 170));
		JPanel funtionPanel = new JPanel();
		tabbedPane.addTab("功能导航窗口", funtionPanel);
		JPanel adminPanel = new JPanel();
		tabbedPane.addTab("操作员设置", adminPanel);
//尾栏
		JPanel p2 = new JPanel();
		p2.setLayout(new FlowLayout(FlowLayout.CENTER, 100, 0));
		add(p2, BorderLayout.SOUTH);
		JLabel label3 = new JLabel("当前字数");
		JLabel label4 = new JLabel("日期");
		JLabel label5 = new JLabel("编码");
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
