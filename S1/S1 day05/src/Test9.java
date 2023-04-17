import java.util.Scanner;

/**
 * @author RYX
 */
public class Test9 {
	public static void main(String[] args) {
		int ram = (int) (Math.random() * (100 - 1 + 1) + 1);
		System.out.println("请输入数字" + ram);
		Scanner input = new Scanner(System.in);
		for (; ; ) {
			if (input.hasNextInt()) {
				int number = input.nextInt();
				if(ram==number){
					System.out.println("猜对了");
					break;
				} else if (ram<number) {
					System.out.println("猜大了");
				}else {
					System.out.println("猜小了");
				}
			} else {
				System.out.println("输入的不是数字");
			}
		}
	}
}
