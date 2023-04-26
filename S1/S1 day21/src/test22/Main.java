package test22;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		StringBuffer sb1 = new StringBuffer();
		sb.append("500238200008010671");
		sb1.append(sb.substring(6, 14));
		sb1.insert(8,"日");
		sb1.insert(6,"月");
		sb1.insert(4,"年");
		int sexnum = (sb.charAt(sb.length() - 2) - '0');
		String sex;
		if (sexnum % 2 == 1) {
			sex = "男";
		} else {
			sex = "女";
		}
		System.out.println("生日:" + sb1 + "\t性别:" + sex);
	}
}
