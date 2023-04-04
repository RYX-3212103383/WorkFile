import java.util.Scanner;

/**
 * @author RYX
 */
public class Test8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("输入年份");
		int year = sc.nextInt();
		int month = sc.nextInt();
		boolean isLeapyear = year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
		if (month == 2 && isLeapyear) {
			System.out.println("29天");
		} else if (month == 2 && !isLeapyear) {
			System.out.println("28天");
		} else if (month == 2 || month == 4 || month == 6 || month == 9 || month == 11) {
			System.out.println("30天");
		} else {
			System.out.println("31天");
		}
		System.out.println(isLeapyear);
	}
}
