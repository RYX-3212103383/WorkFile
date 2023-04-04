import java.util.Scanner;

/**
 * @author RYX
 */
public class Test3 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("输入四位卡号");
		int card = sc.nextInt();
		sc.close();
		System.out.println("会员卡号之和为"+(card/1000+card%1000/100+card%100/10+card%10));
	}
}
