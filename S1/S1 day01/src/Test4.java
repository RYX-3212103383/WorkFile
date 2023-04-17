/**
 * @author RYX
 */
public class Test4 {
	public static void main(String[] args) {
		System.out.println("日\t一\t二\t三\t四\t五\t六");
		int i = 1;
		while (i < 31) {
			for (int j = 0; j < 7; j++) {
				System.out.printf("%d\t", i);
				i++;
				if (i > 31) {
					break;
				}
			}
			System.out.print("\n");
		}
	}
}
