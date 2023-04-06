/**
 * @author RYX
 */
public class Test7 {
	public static void main(String[] args) {
		int flag = 0;
		for (int i = 1900; i <= 2022; i++) {
			if (i % 100 != 0 && i % 4 == 0 || i % 400 == 0) {
				System.out.println(i + "年是闰年");
				flag++;
			}
		}
		System.out.println("1900-2022有" + flag + "个闰年");
	}
}
