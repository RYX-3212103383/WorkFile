import java.util.Scanner;

public class Test8 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("输入月份");
		int month=sc.nextInt();
		switch(month){
			case 1:
				System.out.println("一月的节气有小寒大寒");
				break;
			case 2:
				System.out.println("二月的节气有立春雨水");
				break;
			case 3:
				System.out.println("三月的节气有惊蛰春分");
				break;
			case 4:
				System.out.println("四月的节气有清明谷雨");
				break;
			case 5:
				System.out.println("五月的节气有立夏小满");
				break;
			case 6:
				System.out.println("六月的节气有芒种夏至");
				break;
			case 7:
				System.out.println("七月的节气有小暑大暑");
				break;
			case 8:
				System.out.println("八月的节气有立秋处暑");
				break;
			case 9:
				System.out.println("九月的节气有白露秋分");
				break;
			case 10:
				System.out.println("十月的节气有寒露霜降");
				break;
			case 11:
				System.out.println("十一月的节气有立冬小雪");
				break;
			case 12:
				System.out.println("十二月的节气有大雪冬至");
				break;
		}
	}
}
