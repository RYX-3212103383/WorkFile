package test1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.HashMap;

public class Main {
	public static void main(String[] args) throws Exception {
		HashMap<Integer, Book> hm = new HashMap<>();
		hm.put(1, new Book(1,"西游记", 99.0, "罗成恩"));
		hm.put(2, new Book(2,"红楼梦", 56.0, "曹雪芹"));
		hm.put(3, new Book(3,"三国演义", 52.0, "罗贯中"));
		hm.put(4, new Book(4,"水浒传", 99.0, "施耐庵"));
		String path = "D:\\学习\\s1\\作业\\API\\源作业day27_01.txt";
		File file = new File(path);
		FileOutputStream fos1 = new FileOutputStream(file);
		FileInputStream fis1 = new FileInputStream(file);
		if (!file.exists()) {
			file.createNewFile();
		}
		for (int i = 0; i < hm.size(); i++) {
			String book = hm.get(i + 1).toString();
			fos1.write(book.getBytes());
			fos1.flush();
		}
		byte[] bytes = new byte[1024];
		int len;
		while ((len = fis1.read(bytes)) != -1) {
			String msg = new String(bytes, 0, len);
			System.out.println(msg);
		}
		fos1.flush();
		fos1.close();
		fis1.close();
	}
}
