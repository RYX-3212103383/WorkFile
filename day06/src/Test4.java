import java.util.Scanner;

/**
 * @author RYX
 */
public class Test4 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		for (; ; ) {
			int ram = (int) (Math.random() * (100 - 1 + 1) + 1);
			System.out.println("请输入数字" + ram);
			if (input.hasNextInt()) {
				int number = input.nextInt();
				if (ram == number) {
					System.out.println("猜对了");
					System.out.println("再玩一次？");
					String next = input.next();
					if ("否".equals(next)) {
						System.out.println("拜拜");
						break;
					} else if ("是".equals(next)) {
						System.out.println("开启一轮游戏");
					}
				} else if (ram < number) {
					System.out.println("猜大了");
				} else {
					System.out.println("猜小了");
				}
			} else {
				String str = input.next();
				System.out.println("输入的不是数字");
			}
		}
	}
}

