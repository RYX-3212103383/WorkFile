package test21;

import java.io.*;
import java.net.URL;

public class Main {

	public static void main(String[] args) {
		String url = "https://oss-p56.xpccdn.com/prod/music/preview/Q5xrlRvb9K.m4a";
		String path = "D:\\学习\\s1\\作业\\API\\";
		String fileName = url.substring(url.lastIndexOf("/"), url.length());
		try {
			write(url,path+fileName);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void write(String url, String path) throws Exception {
		File file = getFile(url);
		FileInputStream fis = new FileInputStream(file);
		DataInputStream dis = new DataInputStream(fis);
		File outputfile = new File(path);
		FileOutputStream fos = new FileOutputStream(outputfile);
		DataOutputStream dos = new DataOutputStream(fos);
		int bytesRead;
		byte[] buffer = new byte[8192];
		while ((bytesRead = dis.read(buffer, 0, 8192)) != -1) {
			dos.write(buffer, 0, bytesRead);
		}
		dos.flush();
		dos.close();
		fos.close();
		dis.close();
		fis.close();
	}

	private static File getFile(String url) {
		//对本地文件命名
		String fileName = url.substring(url.lastIndexOf("."), url.length());
		File file = null;

		URL urlfile;
		try {
			// 创建一个临时路径
			file = File.createTempFile("file", fileName);
			//下载
			urlfile = new URL(url);

			try (InputStream inStream = urlfile.openStream();
			     OutputStream os = new FileOutputStream(file);) {
				int bytesRead;
				byte[] buffer = new byte[8192];
				while ((bytesRead = inStream.read(buffer, 0, 8192)) != -1) {
					os.write(buffer, 0, bytesRead);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return file;
	}
}
