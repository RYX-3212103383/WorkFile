/**
 * @author RYX
 */
public class Test5 {
	public static void main(String[] args) {
		String a = "可乐";
		String b = "橙汁";
		System.out.println("交换前:a=" + a + "\tb=" + b);
		String c = a;
		a = b;
		b = c;
		System.out.println("交换后:a=" + a + "\tb=" + b);
	}
}
