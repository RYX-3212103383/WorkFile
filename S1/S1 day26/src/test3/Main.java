package test3;

import java.io.*;
import java.text.DecimalFormat;
import java.util.ArrayList;

public class Main {
	static String path = "D:\\学习\\s1\\作业\\API\\day26_03.dat";

	public static void main(String[] args) {
		ArrayList<Employee> list=new ArrayList<>();
		int rows=100;
		try {
			for (int i = 1; i <= rows; i++) {
				String firstname = "Firstname" + i;
				String lastname = "lastname" + i;
				String level = null;
				Double salary = null;
				int r = (int) (Math.random() * 3);
				switch (r) {
					case 0: {
						level = "assistant";
						salary = getRandom(50000,80000);
						break;
					}
					case 1: {
						level = "associate";
						salary = getRandom(60000,110000);
						break;
					}
					case 2: {
						level = "full";
						salary = getRandom(75000,130000);
						break;
					}
				}
				Employee emp = new Employee(firstname, lastname, level, salary);
				list.add(emp);
			}
			write(list);
			System.out.println(read());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static Double getRandom(int min, int max){
		Double ran=Math.random()*(max-min)+(min);
		DecimalFormat df=new DecimalFormat("#.##");
		ran= Double.valueOf(df.format(ran));
		return ran;
	}
	public static Object read() throws Exception {
		FileInputStream fis = new FileInputStream(path);
		ObjectInputStream ois = new ObjectInputStream(fis);
		try {
			return ois.readObject();
		} catch (Exception e) {
			//e.printStackTrace();
			return null;
		} finally {
			ois.close();
		}
	}


	public static void write(Object obj) throws Exception {
		File file=new File(path);
		FileOutputStream fos=new FileOutputStream(file);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(obj);
		oos.flush();
		oos.close();
		fos.close();
	}
}

