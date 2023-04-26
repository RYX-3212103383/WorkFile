package test1;

public class Main {
	public static void main(String[] args) {
		String ids[] = {"where", "stuid", "202019990101"};
		StringBuffer sb1 = new StringBuffer();
		String a = "select * from student =";
		String[] aa = a.split(" ");
		StringBuffer sb = new StringBuffer();
		sb.append(aa[0] + " " + aa[1] + " " + aa[2] + " " + aa[3] + " " + ids[0] + " " + ids[1] + " " + aa[4] + "'" + ids[2] + "'");
		System.out.println(sb);
	}
}
