import java.util.Scanner;

/**
 * @author RYX
 */
public class Test8 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("输入年份");
		int year = sc.nextInt();
		String isLeapyear=(year%4==0&&year%100!=0||year%400==0)?"是闰年":"是平年";
		System.out.println(isLeapyear);
	}
}
