package test22;

import java.io.*;
import java.net.URL;

public class Main {
	public static void main(String[] args) throws Exception {
		String url = "https://www.miyoushe.com/mainPage/bbs_qrcode_mainpage.png";
		String path2 = "C:/Users/RYX/Desktop/";
		String name=url.substring(url.lastIndexOf('/')+1);
		testCopy(url, path2+name);
	}

	private static void testCopy(String url,String path2) throws Exception {
		File file1 = getFile(url);
		FileInputStream fis = new FileInputStream(file1);
		File file2 = new File(path2);
		FileOutputStream fos = new FileOutputStream(file2);
		if (!file2.exists()) {
			file2.createNewFile();
		}
		byte[] bytes = new byte[1024];
		int len = 0;
		while ((len = fis.read(bytes)) != -1) {
			fos.write(bytes,0,len);
		}
		fos.flush();
		fos.close();
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
				int bytesRead = 0;
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
