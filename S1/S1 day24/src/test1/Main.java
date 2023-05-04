package test1;

import javax.swing.*;
import java.io.File;

public class Main {
	public static void main(String[] args) {
		String path = JOptionPane.showInputDialog(null, "请输入路径");
		File file = new File(path);
		if(file.exists()){
			if(file.isFile()){
				System.out.println("是文件");
			} else if (file.isDirectory()) {
				System.out.println("是目录");
			}
		}else{
			System.out.println("不存在");
		}
	}
}
