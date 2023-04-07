import java.util.Scanner;

/**
 * @author RYX
 */
public class Test3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		for (; ; ) {
			System.out.println("请选择1或2");
			if (input.hasNextInt()) {
				int a = input.nextInt();
				if (a == 1 || a == 2) {
					System.out.println("我终于明白了");
					break;
				} else {
					System.out.println("选择有误，请重新输入1或2");
				}
			} else {
				String next = input.next();
				System.out.println("选择有误，请输入数字");
			}

		}
	}
}
