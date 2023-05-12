import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Properties;

public class TestReaderAndWriter {
	static String path = "D:\\学习\\s1\\作业\\Swing\\test2.properties";
	static String[] str = {"id", "sid", "name", "idCard", "hobbies", "que", "phone", "address", "comment", "headIcon", "isMarried"};

//	public static void main(String[] args) {
//		ArrayList<String> list = new ArrayList<>();
//		list.add("编号");
//		list.add("学号");
//		list.add("姓名");
//		list.add("身份证");
//		list.add("爱好");
//		list.add("学历");
//		list.add("电话");
//		list.add("电址");
//		list.add("备注");
//		list.add("头像");
//		list.add("婚否");
//		writeProperties(list);
//		reafdProperties();
//	}

	public static void writeProperties(ArrayList<String> list) {
		try {
			Properties props = new Properties();
			File file = new File(path);
			FileOutputStream fos = new FileOutputStream(file);
			for (int i = 0; i < str.length; i++) {
				props.setProperty(str[i], list.get(i));
				System.out.println(str[i] + ":" + list.get(i));
			}
			props.store(fos, "说明");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void reafdProperties() {
		try {
			Properties props = new Properties();
			File file = new File(path);
			FileOutputStream fos = new FileOutputStream(file);
			for (int i = 0; i < str.length; i++) {
				System.out.println(props.getProperty(str[i]));
			}
			props.store(fos, "说明");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
