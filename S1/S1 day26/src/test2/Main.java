package test2;

import java.io.*;
import java.util.Date;

public class Main {
	static String path = "D:\\学习\\s1\\作业\\API\\day26_02.tmp";

	public static void main(String[] args) {
		try {
			write();
			read();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void read() throws Exception {
		FileInputStream fis = new FileInputStream(path);
		ObjectInputStream ois = new ObjectInputStream(fis);
		Computer com = (Computer) ois.readObject();
		System.out.println(com.toString());
		ois.close();

	}

	public static void write() throws Exception {
		FileOutputStream fos = new FileOutputStream(path);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		Computer com = new Computer(21321321,"Lenovo","i7-8750H",4599.9,"15.9GB","1408.33GB","6GB");
		oos.writeObject(com);
		oos.flush();
		fos.flush();
		oos.close();
		fos.close();
	}
}

