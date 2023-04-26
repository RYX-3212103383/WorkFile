package test3;

public class Main {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		sb.append("？吗了饭吃你");
		sb.reverse();
		if(sb.indexOf("？")!=-1) {sb.deleteCharAt(sb.indexOf("？"));}
		System.out.println(sb);
	}
}
