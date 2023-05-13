public class Tools {
	public static String getEncoding(String path) {
		String getEcording;
		getEcording = EncodingDetect.getJavaEncode(path);
		System.out.println(getEcording);
		return getEcording;
	}
	public static String getEncoding() {
		return "未打开文件";
	}
//	public static void main(String[] args) {
//		String getEcording;
//		String file = "D:\\学习\\s1\\作业\\Swing\\test2.properties";
//		getEcording = EncodingDetect.getJavaEncode(file);
//		System.out.println(getEcording);
//	}
}
