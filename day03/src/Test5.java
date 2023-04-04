import java.util.Random;
import java.util.Scanner;

/**
 * @author RYX
 */
public class Test5 {
	public static void main(String[] args) {
		System.out.println("输入一个数字");
		Scanner sc=new Scanner(System.in);
		int input = sc.nextInt();
		Random random=new Random();
		int ram=random.nextInt(100);
		sc.close();
		System.out.println("随机数以产生为"+ram);
		String isbigger =(input>ram)?"你输入的数更大":"随机数更大";
		System.out.println(isbigger);
	}
}
