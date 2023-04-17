import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * @author RYX
 */
public class Test1 {
	static Scanner input = new Scanner(System.in);
	static Random r = new Random();

	public static void main(String[] args) {
		Test1 obj1 = new Test1();
		for(;;) {
			System.out.println("作业1-10");
			int a = input.nextInt();
			switch (a) {
				case 0:{
					System.exit(0);
				}
				case 1: {
					obj1.work1();
					break;
				}
				case 2: {
					obj1.work2();
					break;
				}
				case 3: {
					obj1.work3();
					break;
				}
				case 4: {
					obj1.work4();
					break;
				}
				case 5: {
					obj1.work5();
					break;
				}
				case 6: {
					obj1.work6();
					break;
				}
				case 7: {
					obj1.work7();
					break;
				}
				case 8: {
					obj1.work8();
					break;
				}
				case 9: {
					obj1.work9();
					break;
				}
				case 10: {
					obj1.work10();
					break;
				}
				default:
					System.out.println("1-10才有哦");
			}
		}
	}

	void work1() {
		show();
	}

	public void show() {
		System.out.println("战神居然是魔煞星^)^");
	}

	void work2() {
		int a = 10, b = 15;
		int max = max(a, b);
		System.out.println("max=" + max);
	}

	public int max(int a, int b) {
		return a > b ? a : b;
	}

	void work3() {
		double a = 3.14, b = 1.14;
		double min = min(a, b);
		System.out.println("min=" + min);
	}

	public double min(double a, double b) {
		return a < b ? a : b;
	}

	void work4() {
		int year = 1965;
		boolean leaper = isLeaper(year);
		System.out.println(year + "是闰年？" + leaper);
	}

	public boolean isLeaper(int year) {
		return (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0));
	}

	void work5() {
		int cup = r.nextInt(3);
		System.out.println(cup+"出拳 石头0，剪刀1，布2");
		int you = input.nextInt();
		int result = guessGame(you, cup);
		if (result == 0) {
			System.out.println("你赢了");
		} else if (result == 1) {
			System.out.println("你输了");
		} else {
			System.out.println("平局了");
		}
	}

	public int guessGame(int you, int cup) {
		if(you==cup){
			return 2;
		} else if (cup-you==1||(you==2&&cup==0)) {
			return 0;
		}else {
			return 1;
		}
	}

	void work6() {
		float r= 3.2F;
		float a=area(r);
		System.out.println("面积为"+a);
	}

	private float area(float r) {
		return (float) (3.14*r*r);
	}

	void work7() {
		int[] a=new int[]{1,2,3,5,8,6,6,4,5,6,4,5,5,5};
		showArray(a);
	}

	protected void showArray(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+"\t");
		}
	}

	void work8() {
		int[] a=new int[]{1,2,3,5,8,6,6,4,5,6,4,5,5,5};
		int sum=sumArray(a);
		System.out.println("sum="+sum);
	}

	public int sumArray(int[] a) {
		int sum=0;
		for (int i = 0; i < a.length; i++) {
			sum+=a[i];
		}
		return sum;
	}

	void work9() {
		int[][] a=new int[][]{{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		int[] b=sumDoubleArray(a);
		System.out.println("各行之和分别为"+ Arrays.toString(b));
	}

	public int[] sumDoubleArray(int[][] a) {
		int[] b=new int[a.length];
		for (int i = 0; i < a.length; i++) {
			int rowsum=0;
			for (int j = 0; j < a[i].length; j++) {
				rowsum+=a[i][j];
			}
			b[i]=rowsum;
		}
		return b;
	}

	void work10() {
		char[] a=getCode();
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]);
		}
	}

	public char[] getCode() {
		String a="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
		char[] b= new char[8];
		for(int i=0;i<b.length;i++){
			b[i]=a.charAt((int)(Math.random()*(a.length())));
			for (int j = 0; j < i; j++) {
				if(b[i]==b[j]){
					b[i]='*';
					i--;
				}
			}
		}
		return b;
	}


}
