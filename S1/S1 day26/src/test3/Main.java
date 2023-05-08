package test3;

import java.io.*;

public class Main {
	static String path = "D:\\学习\\s1\\作业\\API\\day26_03.dat";

	public static void main(String[] args) {
		try {
			for (int i = 0; i <= 100; i++) {
				String firstname = "Firstname" + i;
				String lastname = "lastname" + i;
				String level = null;
				Integer salary = null;
				int r = (int) (Math.random() * 3);
				switch (r) {
					case 0: {
						level = "assistant";
						salary = (int) (Math.random() * 30000 + 50000);
						break;
					}
					case 1: {
						level = "associate";
						salary = (int) (Math.random() * 50000 + 60000);
						break;
					}
					case 2: {
						level = "full";
						salary = (int) (Math.random() * 55000 + 65000);
						break;
					}
				}
				Employee emp = new Employee(firstname, lastname, level, salary);
				write(emp);
				System.out.println(i);
			}
			read();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void read() throws Exception {
		FileInputStream fis = new FileInputStream(path);
		ObjectInputStream ois = new ObjectInputStream(fis);
//		Employee stu = (Employee) ois.readObject();
//		System.out.println(stu.toString());
//		ois.close();
		try {
			//Employee p = (Employee) ois.readObject();
			while(true) {
					System.out.println(ois.readObject());
				}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			ois.close();
		}
	}


	public static void write(Employee emp) throws Exception {
		File file=new File(path);
		AppendObjectOutputStream oos = new AppendObjectOutputStream(file);
		oos.writeObject(emp);
		oos.close();
	}
}

