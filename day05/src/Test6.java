/**
 * @author RYX
 */
public class Test6 {
	public static void main(String[] args) {
		for (int i = 1; i <= 1000; i++) {
			if (i % 10 == 2 * (i % 100 / 10) && i % 100 / 10 == 3 * (i / 100)) {
				System.out.println(i);
			}
		}
	}
}
