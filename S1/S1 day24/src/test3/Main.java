package test3;

import javax.swing.*;
import java.io.File;
import java.io.IOException;

public class Main {
	public static void main(String[] args) {
		String path = JOptionPane.showInputDialog(null, "请输入路径");
		File file = new File(path);
		if (!file.exists()) {
			file.mkdir();
			System.out.println("成功");
		}
		File newfile = new File(path += "\\test.txt");
		try {
			newfile.createNewFile();
			System.out.println("成功");
		} catch (IOException e) {
			System.out.println("文件创建出错");
		}
	}
}
