import java.util.Scanner;

/**
 * @author RYX
 */
public class Test5 {
	public static void main(String[] args) {
		int target = 3;
		int win = 0;
		int lost = 0;
		for (; ; ) {
			Scanner input = new Scanner(System.in);
			int computer = (int) (Math.random() * (3 - 1 + 1) + 1);
			String a = null;
			if (computer == 1) {
				a = "拳头";
			} else if (computer == 2) {
				a = "布";
			} else if (computer == 3) {
				a = "剪刀";
			}
			System.out.print(computer);
			System.out.println("出拳 1.拳头 2.布 3.剪刀");
			int human = input.nextInt();
			String b = null;
			if (human == 1) {
				b = "拳头";
			} else if (human == 2) {
				b = "布";
			} else if (human == 3) {
				b = "剪刀";
			}
			if (computer == human) {
				System.out.println("电脑打出" + a + ",你打出" + b + ",平局");
			} else if ((computer - human == 1) || computer - human == -2) {
				System.out.println("电脑打出" + a + ",你打出" + b + ",电脑胜利");
				lost++;
			} else {
				System.out.println("电脑打出" + a + ",你打出" + b + ",你胜利");
				win++;
			}
			if (win == target) {
				System.out.println("你已胜利" + win + "次，本次猜拳结束");
				win = 0;
				System.out.println("退出y/n");
				if ("y".equals(input.next())) {
					break;
				}
			} else if (lost == target) {
				System.out.println("你已输" + lost + "次，本次猜拳结束");
				lost = 0;
				System.out.println("退出y/n");
				if ("y".equals(input.next())) {
					break;
				}
			}
		}
	}
}
