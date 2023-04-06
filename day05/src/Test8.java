import java.util.Scanner;

/**
 * @author RYX
 */
public class Test8 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("-------ATM------- \n\t1.登录 \n\t2.退出\n-----------------\n");
		int logact = input.nextInt();
		if (logact == 2) {
			System.out.println("系统已退出");
		} else if (logact == 1) {
			int flag = 1;
			while (true) {
				System.out.print("请输入用户名：");
				String user = input.next();
				System.out.print("请输入密码：");
				String pass = input.next();
				if ("admin".equals(user) && "123456".equals(pass)) {
					System.out.println("欢迎光临>>>admin");
					break;
				} else {
					System.out.println("用户名或密码错了，请重新输入" + flag + "/3");
					flag++;
				}
				if (flag > 3) {
					System.out.println("已失败3次，卡已被锁，60分钟后再试");
				}
			}
		} else {
			System.out.println("错误，已退出");
		}
	}
}
