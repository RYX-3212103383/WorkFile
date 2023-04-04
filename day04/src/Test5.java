import java.util.Scanner;

/**
 * @author RYX
 */
public class Test5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("你愿意为提高生活水平而拼搏吗？");
		String fight = sc.next();
		if ("否".equals(fight)) {
			System.out.println("小样，不拼搏哪来的美女和MONEY啊？");
		} else if ("是".equals(fight)) {
			System.out.println("你愿意每天学习8个小时吗？");
			String study = sc.next();
			if ("否".equals(study)) {
				System.out.println("每天都不愿意学习8小时，那也叫爱拼啊？");
			} else if ("是".equals(study)) {
				System.out.println("小样，你这么爱学习一定会成功的");
			}
		}
	}
}
