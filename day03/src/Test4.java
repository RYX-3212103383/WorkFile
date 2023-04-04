import java.util.Scanner;

/**
 * @author RYX
 */
public class Test4 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("输入今日温度");
		int temperture = sc.nextInt();
		sc.close();
		boolean iscold=temperture<18?true:false;
		String msg=iscold?"真的冷":"不冷";
		System.out.println("今日天气"+msg);
	}
}
