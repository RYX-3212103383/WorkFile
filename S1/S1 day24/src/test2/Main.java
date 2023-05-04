package test2;

import javax.swing.*;
import java.io.File;
import java.text.SimpleDateFormat;

public class Main {
	public static void main(String[] args) {
		String path = JOptionPane.showInputDialog(null, "请输入路径");
		File file = new File(path);
		if (file.exists()) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			String format = sdf.format(file.lastModified());
			System.out.println("最后修改时间：" + format);
		} else {
			System.out.println("不存在");
		}
	}
}
