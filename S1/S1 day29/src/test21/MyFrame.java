package test21;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.util.Objects;

public class MyFrame extends JFrame {
	MyFrame() {
		setTitle("[领智]进销存管理系统");
		setResizable(true);
		setSize(800, 600);
		setLayout(new BorderLayout());
//菜单栏
		JMenuBar menuBar = new JMenuBar();
		add(menuBar, BorderLayout.NORTH);
		String[] menustr = {"商品进货(T)", "商品销售(U)", "库存管理(V)", "会员管理(W)", "钱流管理(X)", "基本设置(Y)", "其它操作(Z)"};
		String[] menuItemstr = {"进货", "销售", "库存", "会员", "钱流", "基本", "其它"};
		JMenu[] menus=new JMenu[7];
		JMenuItem[] menuItems = new JMenuItem[7];
		for (int i = 0; i <menuItems.length;i++) {
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
		p11.setLayout(new FlowLayout(FlowLayout.LEFT));
		p11.setBackground(new Color(0, 117, 170));
		p1.add(p11, BorderLayout.NORTH);
		String[] str = {"客户管理", "库存状况", "营业报表", "提醒查询", "换班操作", "软件购买", "短信群发", "前台零售", "退出系统"};
		ImageIcon[] imgs = new ImageIcon[9];
		JButton[] btn = new JButton[9];
		for (int i = 0; i < str.length; i++) {
			try {
				String path = "/test21/" + (i + 1) + ".png";
				imgs[i] = new ImageIcon(ImageIO.read((Objects.requireNonNull(getClass().getResource(path)))));
			} catch (IOException e) {
				e.printStackTrace();
			}
			btn[i] = new JButton(imgs[i]);
			btn[i].setBorderPainted(false);
			btn[i].setMargin(new Insets(0, 0, 0, 0));
			btn[i].setBackground(new Color(0, 117, 170));
			p11.add(btn[i]);
		}
//中中面板
		JTabbedPane tabbedPane = new JTabbedPane();
		p1.add(tabbedPane, BorderLayout.CENTER);
		tabbedPane.setBackground(new Color(0, 117, 170));
		JPanel funtionPanel = new JPanel();
		tabbedPane.addTab("功能导航窗口", funtionPanel);
		JPanel adminPanel = new JPanel();
		tabbedPane.addTab("操作员设置", adminPanel);
//中间面板尾栏
		JPanel p13 = new JPanel();
		p13.setBackground(new Color(0, 117, 170));
		p1.add(p13, BorderLayout.SOUTH);
		p13.setLayout(new FlowLayout(FlowLayout.LEFT));
		JLabel lbl13 = new JLabel("F2-添加 F3-修改 F4-删除 F5-更新");
		lbl13.setForeground(new Color(255, 255, 255));
		p13.add(lbl13);
//尾栏
		JPanel p2 = new JPanel();
		p2.setLayout(new FlowLayout(FlowLayout.TRAILING));
		add(p2, BorderLayout.SOUTH);
		JLabel label3 = new JLabel("当前用户");
		JLabel label4 = new JLabel("更换账套");
		JLabel label5 = new JLabel("F2-客户管理 F3-库存状况 F4-营业报表 F6-提醒查询 F7-换班操作");
		p2.add(label3);
		p2.add(label4);
		p2.add(label5);

		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	public static void main(String[] args) {
		new MyFrame();
	}
}

