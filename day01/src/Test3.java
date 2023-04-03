/**
 * @author RYX
 */
public class Test3 {
	public static void main(String[] args) {
		for (int i = 0; i <= 4; i++) {
			for (int j = 4 - i; j > 0; j--) {
				System.out.printf(" ");
			}
			for (int j = 0; j <= i; j++) {
				System.out.printf("*");
			}
			for (int j = 0; j < i; j++) {
				System.out.printf("*");
			}
			System.out.printf("\n");
		}
	}
}
