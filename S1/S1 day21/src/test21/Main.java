package test21;

public class Main {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		sb.append("2020-10-06 10:59:30");
		String a = sb.toString();
		String b[] = a.split(" ");
		String c[] = b[0].split("-");
		String d[] = b[1].split(":");
		System.out.print(c[0]+"年"+c[1]+"月"+c[2]+"日"+d[0]+"时"+d[1]+"分"+d[2]+"秒");
	}
}
