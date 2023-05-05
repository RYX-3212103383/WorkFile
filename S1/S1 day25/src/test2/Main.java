package test2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

public class Main {
	public static void main(String[] args) {
		String path="D:\\学习\\s1\\作业\\API\\day25_02.properties";
		try {
			testProperties(path);
			reafdProperties(path);
		} catch (Exception e) {
			System.out.println("错误");
		}
	}

	public static void testProperties(String path) throws Exception {
		Properties props = new Properties();
		File file = new File(path);
		FileOutputStream fos = new FileOutputStream(file);
		props.setProperty("url", "jdbc:mysql://localhost:3306/test?useUnicode=true&userSSL=false&serverTimezone=UTC");
		props.setProperty("driver", "com.mysql.cj.Driver");
		props.setProperty("username", "root");
		props.setProperty("password", "123456");
		props.store(fos, "说明");
	}

	public static void reafdProperties(String path) throws Exception {
		Properties props = new Properties();
		File file = new File(path);
		FileInputStream fis = new FileInputStream(file);
		props.load(fis);
		String url = props.getProperty("url");
		String driver = props.getProperty("driver");
		String username = props.getProperty("username");
		String password = props.getProperty("password");
		System.out.print(url + "\n" + driver + "\n" + username + "\n" + password + "\n");
	}
}
