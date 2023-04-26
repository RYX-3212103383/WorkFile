package test4;

public class Main {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		sb.append("李白是一位伟大的诗人");
		sb.replace(sb.indexOf("伟"), sb.indexOf("大") + 1, "唐朝");
		System.out.println(sb);
	}
}
