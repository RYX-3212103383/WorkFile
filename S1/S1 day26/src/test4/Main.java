package test4;

import test3.Employee;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class Main {
	static String path = "D:\\学习\\s1\\作业\\API\\day26_03.dat";

	public static void main(String[] args) {
		Double avg1 = 0.0;
		int temp1 = 0;
		Double sum1 = 0.0;
		Double avg2 = 0.0;
		int temp2 = 0;
		Double sum2 = 0.0;
		Double avg3 = 0.0;
		int temp3 = 0;
		Double sum3 = 0.0;
		try {
			ArrayList<Employee> list = read();
			for (int i = 0; i < list.size(); i++) {
				if ("assistant".equals(list.get(i).getLevel())) {
					sum1 += list.get(i).getSalary();
					temp1++;
				} else if ("associate".equals(list.get(i).getLevel())) {
					sum2 += list.get(i).getSalary();
					temp2++;
				} else if ("full".equals(list.get(i).getLevel())) {
					sum3 += list.get(i).getSalary();
					temp3++;
				}
			}
			avg1 = sum1 / temp1;
			avg2 = sum2 / temp2;
			avg3 = sum3 / temp3;
			System.out.print("Assistant助理工资总和:"+sum1+"\n" +
					"Associate副工资总和:"+sum2+"\n" +
					"Fu11正工资总和:"+sum3+"\n" +
					"Assistant助理工资平均分:"+avg1+"\n" +
					"Associate助理工资平均分:"+avg2+"\n" +
					"Fu11助理:工资平均分:"+avg3+"\n");
		} catch (Exception e) {
		}
	}

	public static ArrayList<Employee> read() throws Exception {
		FileInputStream fis = new FileInputStream(path);
		ObjectInputStream ois = new ObjectInputStream(fis);
		try {
			return (ArrayList<Employee>) ois.readObject();
		} catch (Exception e) {
			return null;
		} finally {
			ois.close();
		}
	}

}
