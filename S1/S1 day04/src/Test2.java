import java.util.Scanner;

/**
 * @author RYX
 */
public class Test2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("输入四位数");
		int card = sc.nextInt();
		sc.close();
		System.out.println("四位数之和为" +(card / 1000)+"+"+(card % 1000 / 100)+"+"+(card % 100 / 10)+"+"+(card % 10)+"="+(card / 1000 + card % 1000 / 100 + card % 100 / 10 + card % 10));
	}
}
