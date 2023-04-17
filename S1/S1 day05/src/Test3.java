/**
 * @author RYX
 */
public class Test3 {
	public static void main(String[] args) {
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				if (i % 20 == 0) {
					System.out.print(i + "\n");
				} else {
					System.out.print(i + "\t");
				}
			}
		}
	}
}
