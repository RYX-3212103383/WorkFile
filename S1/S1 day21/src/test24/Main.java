package test24;

import javax.swing.*;

public class Main {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		sb.append(JOptionPane.showInputDialog("输入字符串"));
		int max = 0, min = 0, number = 0, other = 0, chara = 0, chinese = 0;
		for (int i = 0; i < sb.length(); i++) {
			if (Character.isLetter(sb.charAt(i))) {
				chara++;
				if (Character.isUpperCase(sb.charAt(i))) {
					max++;
				} else if ((sb.charAt(i) >= 0x4e00) && (sb.charAt(i) <= 0x9fbb)) {
					chinese++;
				} else {
					min++;
				}
			} else if (Character.isDigit(sb.charAt(i))) {
				number++;
			} else {
				other++;
			}
		}
		System.out.println("字母" + chara + "个,大写" + max + "个,小写" + min + "个,数字" + number + "个,中文" + chinese + "个其他" + other + "个");
	}
}
