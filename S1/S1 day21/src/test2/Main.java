package test2;

public class Main {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		sb.append("我来自湖南，今年21岁，毕业于湖南大学");
		sb.insert((sb.indexOf("湖南")+2), "长沙");
		sb.setCharAt(sb.indexOf("1"),'2');
		System.out.println(sb+"\t长度"+sb.length());
	}
}
