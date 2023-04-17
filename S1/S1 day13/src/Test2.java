import java.util.Scanner;

/**
 * @author RYX
 */
public class Test2 {
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		Test2 obj2 = new Test2();
		for(;;) {
			System.out.println("作业1-5");
			int a = input.nextInt();
			switch (a) {
				case 0: {
					System.exit(0);
				}
				case 1: {
					obj2.work1();
					break;
				}
				case 2: {
					obj2.work2();
					break;
				}
				case 3: {
					obj2.work3();
					break;
				}
				case 4: {
					obj2.work4();
					break;
				}
				case 5: {
					obj2.work5();
					break;
				}
				default:
					System.out.println("1-5才有哦");
			}
		}
	}

	void work1() {
		int a = 10, b = 15;
		int sum = sum(a, b);
		System.out.println("sum=" + sum);
	}

	private int sum(int a, int b) {
		return a + b;
	}

	void work2() {
		int a = 15, b = 20;
		int max = max(a, b);
		System.out.println("max=" + max);
	}

	private int max(int a, int b) {
		return a > b ? a : b;
	}

	void work3() {
		int a = 10;
		int result = factorial(a);
		System.out.println(a + "阶乘为" + result);
	}

	private int factorial(int a) {
		int result = 1;
		for (int i = 1; i < a; i++) {
			result *= i;
		}
		return result;
	}

	void work4() {
		String s = "fsdfghjkl";
		System.out.println(s);
		String b = reversr(s);
		System.out.println(b);
	}

	private String reversr(String s) {
		StringBuilder a = new StringBuilder();
		for (int i = 0; i < s.length(); i++) {
			a.append(s.charAt(s.length() - i - 1));
		}
		return a.toString();
	}

	void work5() {
	int a=97;
	boolean prime=isPrime(a);
		System.out.println(a+"是质数"+prime);
	}

	private boolean isPrime(int a) {
		boolean flag=true;
		for (int i = 2; i < a; i++) {
			if(a%i==0) {
				flag=false;
				return flag;
			}
		}
		return flag;
	}
}
