package test1;

import java.io.*;

public class Main {
	public static void main(String[] args) {
		String path="D:\\学习\\s1\\作业\\API\\day25_01源.txt";
		String outputpath="D:\\学习\\s1\\作业\\API\\day25_01复制.txt";
		try {
			testWriter(path);
			testReader(path,outputpath);
			deleteFile(path);
		} catch (Exception e) {
			System.out.println("错误");
		}
	}

	private static void deleteFile(String path) {
		File file = new File(path);
		file.delete();
	}

	public static void testReader(String path,String outputpath) throws Exception {
		File file = new File(path);
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		File outputfile = new File(outputpath);
		FileWriter fw = new FileWriter(outputfile, false);//true代表追加而不是覆盖默认是false
		BufferedWriter bw = new BufferedWriter(fw);
		//一次读一行
		String line;
		while ((line = br.readLine()) != null) {
			bw.write(line);
			bw.write("\n");
		}
		bw.flush();
		bw.close();
		fw.close();
		br.close();
		fr.close();
	}

	public static void testWriter(String path) throws Exception {
		File file = new File(path);
		FileWriter fw = new FileWriter(file, false);//true代表追加而不是覆盖默认是false
		BufferedWriter bw = new BufferedWriter(fw);
		String str="The furthest distance in the world\n" +
				"Is not when I stand in front of you\n" +
				"Yet you can\"t see my love\n" +
				"But when undoubtedly knowing the love from both\n" +
				"Yet cannot be together\n" +
				"世界上最遥远的距离\n" +
				"不是  我就站在你面前  你却不知道我爱你\n" +
				"而是  明明知道彼此相爱  却不能在一起\n";
		bw.write(str);
		bw.flush();
		bw.close();
		fw.close();
	}
}
