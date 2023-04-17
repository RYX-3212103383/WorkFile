import java.util.Scanner;

/**
 * @author RYX
 */
public class Test1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("----开始做练习----");
		for (; ; ) {
			System.out.println("做完了吗？");
			String next = input.next();
			if ("做完了".equals(next)) {
				break;
			}
		}
		System.out.println("终于可以去玩了");
	}
}
