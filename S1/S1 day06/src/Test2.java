import java.util.Scanner;

/**
 * @author RYX
 */
public class Test2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		for (; ; ) {
			System.out.println("请用户输入一个[1,100]的整数");
			if (input.hasNextInt()) {
				int i = input.nextInt();
				if (i >= 1 && i <= 100) {
					System.out.println("我终于输对了");
					break;
				}
			} else {
				String next=input.next();
				System.out.println("请输入输入数字");
			}
		}
	}
}
