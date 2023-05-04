package test4;

import java.io.*;

public class Main {
	public static void main(String[] args) throws Exception {
		String path1 = "D:\\学习\\s1\\作业\\API\\源作业4.txt";
		String path2 = "D:\\学习\\s1\\作业\\API\\移动作业4.txt";
		String path3 = "D:\\学习\\s1\\作业\\API\\备份作业4.txt";
		File file1 = new File(path1);
		//构建输*流对象
		FileOutputStream fos1 = new FileOutputStream(file1);
		FileInputStream fis1 = new FileInputStream(file1);
		if (!file1.exists()) {
			file1.createNewFile();
		}
		String poem = "The furthest distance in the world\n" +
				"Is not between life and death\n" +
				"But when I stand in front of you\n" +
				"Yet you don\"t know that I love you";
		fos1.write(poem.getBytes());
		fos1.flush();
		byte[] bytes = new byte[1024];
		int len = 0;
		while ((len = fis1.read(bytes)) != -1) {
			//字节数组转字符串
			String msg = new String(bytes, 0, len);
			System.out.println(msg);
		}
		TestCopy(path1,path2);
		fos1.flush();
		TestCopy(path1,path3);
		fos1.close();
		fis1.close();
		file1.delete();
	}
	private static void TestCopy(String path1,String path2) throws Exception {
		File file1 = new File(path1);
		FileInputStream fis = new FileInputStream(file1);
		File file2 = new File(path2);
		FileOutputStream fos = new FileOutputStream(file2);
		if (!file2.exists()) {
			file2.createNewFile();
		}
		for (int i = 0; i < file1.length(); i++) {
			fos.write(fis.read());
		}
		fos.flush();
		fos.close();
		fis.close();
	}
}
