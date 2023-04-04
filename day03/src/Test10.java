import java.util.Scanner;

/**
 * @author RYX
 */
public class Test10 {
	public static void main(String[] args) {
		int a= (int)(Math.random()*(10-1+1)+1);
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入数字");
		int b = sc.nextInt();
		System.out.println("电脑输出为"+a);
		if(a==b){
			System.out.println("太棒了，猜对了");
		}
			else if(b>a){
			System.out.println("提示：很遗憾，猜大了，拜拜~");
		}
				else {
			System.out.println("很遗憾，猜小了，拜拜");
		}
	}
}
