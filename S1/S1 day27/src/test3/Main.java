package test3;

import java.io.BufferedReader;
import java.io.FileReader;

public class Main {
	public static void main(String[] args) throws Exception {
		String path = "D:\\WorkSpace\\WorkFile\\S1\\S1 day27\\src\\test1\\Main.java";

		FileReader fr = new FileReader(path);
		BufferedReader bf = new BufferedReader(fr);
		String str = null;
		while ((str = bf.readLine()) != null) {
			System.out.println(str);
		}
		bf.close();
		fr.close();

	}
}
