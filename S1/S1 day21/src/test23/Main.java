package test23;

public class Main {
	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer();
		String key[] = {"id","username","password","age","sex","email"};
		String values[] = {"1","张无忌","10086","33","男","zwj@wds.com"};
		sb.append("[\n\t{\n");
		sb.append("\t\t\""+key[0]+"\":"+values[0]+"\n");
		for (int i = 1; i < key.length; i++) {
			sb.append("\t\t\""+key[i]+"\":\""+values[i]+"\"\n");
		}
		sb.append("\t}\n]");
		System.out.println(sb);
	}
}
