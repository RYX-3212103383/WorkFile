package test1;

import java.io.*;
import java.util.Date;

public class Main {
	static String path = "D:\\学习\\s1\\作业\\API\\day26_01.dat";

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
		Student stu = (Student) ois.readObject();
		System.out.println(stu.toString());
		ois.close();

	}

	public static void write() throws Exception {
		FileOutputStream fos = new FileOutputStream(path);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		Student stu = new Student(15124, "小明",1.99,  new Date());
		oos.writeObject(stu);
		oos.flush();
		fos.flush();
		oos.close();
		fos.close();
	}
}

