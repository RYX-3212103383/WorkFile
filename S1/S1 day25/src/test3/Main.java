package test3;

import java.io.*;

public class Main {
	public static void main(String[] args) {
		String path = "D:\\学习\\s1\\作业\\API\\day25_03.dat";
		try {
			write(path);
			read(path);
			System.out.println("成功");
		} catch (Exception e) {
			System.out.println("错误");
		}
	}

	public static void write(String path) throws Exception {
		boolean flag = true;
		byte b = (byte) 3;
		char c = 'a';
		double d = 3.14d;
		float f = .06f;
		int e = 100;
		String msg = "我是中国人";
		File file = new File(path);
		FileOutputStream fos = new FileOutputStream(file);
		DataOutputStream dos = new DataOutputStream(fos);
		dos.writeBoolean(flag);
		dos.writeByte(b);
		dos.writeChar(c);
		dos.writeDouble(d);
		dos.writeFloat(f);
		dos.write(e);
		dos.writeUTF(msg);
		dos.flush();
		dos.close();
		fos.close();
	}

	public static void read(String path) throws Exception {
		File file = new File(path);
		FileInputStream fis = new FileInputStream(file);
		DataInputStream dis = new DataInputStream(fis);
		boolean flag = dis.readBoolean();
		byte b = dis.readByte();
		char c = dis.readChar();
		double d = dis.readDouble();
		float f = dis.readFloat();
		int e = dis.read();
		String msg = dis.readUTF();
		System.out.println("flag=" + flag +
				"\nb=" + b +
				"\nc=" + c +
				"\nd=" + d +
				"\nf=" + f +
				"\ne=" + e +
				"\nmsg=" + msg);
	dis.close();
	fis.close();
	}
}
