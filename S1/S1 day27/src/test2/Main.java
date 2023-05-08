package test2;

import java.io.*;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) throws IOException {
		ArrayList<Student> list = new ArrayList<>();
		list.add(new Student("冉渝湘", 20, "男"));
		list.add(new Student("朱军", 20, "男"));
		list.add(new Student("唐宇轩", 20, "男"));
		list.add(new Student("李广阔", 20, "男"));
		list.add(new Student("熊康榕", 20, "男"));
		list.add(new Student("张雪岩", 20, "男"));
		list.add(new Student("戴信丰", 20, "男"));
		list.add(new Student("吕飞龙", 20, "男"));
		list.add(new Student("黄宇轩", 20, "女"));
		String path = "D:\\学习\\s1\\作业\\API\\源作业day27_02.txt";
		File file = new File(path);
		FileWriter fw = new FileWriter(path, true);
		BufferedWriter bw = new BufferedWriter(fw);
		if (!file.exists()) {
			file.createNewFile();
		}
		for (int i = 0; i < list.size(); i++) {
			String stu = list.get(i).toString();
			bw.write(stu);
			bw.flush();
		}
		bw.close();
		fw.close();
		FileReader fr = new FileReader(path);
		BufferedReader bf = new BufferedReader(fr);
		String str;
		while ((str = bf.readLine()) != null) {
			System.out.println(str);
		}
		bf.close();
		fr.close();
	}
}

