package test21;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Main {
	public static void main(String[] args) throws Exception {
		String filename="【G2R2014】モリモリあつし - PUPA【BMS】.mp3";
		String path1="E:\\缓存\\";
		String path2="D:\\学习\\s1\\作业\\API\\";
		TestCopy(path1+filename,path2+filename);
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
