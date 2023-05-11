package test1;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {
	JPanel[] panels = new JPanel[15];
	JButton[] btn = new JButton[14];
	String[] str = {
			"数据备份",
			"数据恢复",
			"报表设计",
			"修改密码",
			"本单位信息",
			"查看日志",
			"参数设置",
			"系统初始化",
			"期初建账",
			"付款方式",
			"更换账套",
			"升级数据库",
			"条码打印",
			"账套管理"
	};

	MyFrame() {
		setTitle("其他设置");
		setResizable(true);
		setSize(600, 400);

		setLayout(new GridLayout(5, 3));
		for (int i = 0; i < panels.length; i++) {
			panels[i] = new JPanel();
			add(panels[i]);
			if (i == 13) {
			} else if (i == 14) {
				btn[i - 1] = new JButton(str[i - 1]);
				panels[i].add(btn[i - 1]);
			} else {
				btn[i] = new JButton(str[i]);
				panels[i].add(btn[i]);
			}
		}


		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	public static void main(String[] args) {
		new MyFrame();
	}
}

