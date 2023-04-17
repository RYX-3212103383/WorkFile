import java.util.Scanner;

/**
 * @author RYX
 */
public class Test1 {
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		Test1 obj1 = new Test1();
		for (; ; ) {
			System.out.println("作业1-6");
			int a = input.nextInt();
			switch (a) {
				case 0: {
					System.exit(-1);
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
				default:
					System.out.println("1-6才有哦");
			}
		}
	}

	private void work1() {
		int a = 99;
		if (a % 2 == 0) {
			System.out.println(a + "是偶数");
		} else {
			System.out.println(a + "不是偶数");
		}
	}

	private void work2() {
		int sum = 0;
		for (int i = 0; i <= 100; i++) {
			if (i % 2 == 1) {
				continue;
			} else {
				sum += i;
			}
		}
		System.out.println("1-100奇数相加为" + sum);
	}

	private void work3() {
		int year = 2021;
		if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
			System.out.println(year + "是闰年");
		} else {
			System.out.println(year + "不是闰年");
		}
	}

	private void work4() {
		String a = "ijhsgfisdisgjwbifygawefhskutfgkef";
		char b = 'f';
		int count = 0;
		for (int i = 0; i < a.length(); i++) {
			if (a.charAt(i) == b) {
				count++;
			}
		}
		System.out.println(b + "在" + a + "中出现了" + count + "次");
	}

	private void work5() {
		int size = 10;
		int[][] a = new int[size][size];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				a[i][j] = (i + 1) * (j + 1);
			}
		}
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j] + "\t");
			}
			System.out.println();
		}
	}

	private void work6() {
		String a = input.next();
		StringBuilder b = new StringBuilder();
		for (int i = 0; i < a.length(); i++) {
			if ((int) (a.charAt(i)) >= 97) {
				b.append((char) (a.charAt(i) - 32));
			} else {
				b.append(a.charAt(i));
			}
		}
		a = b.toString();
		System.out.println(a);
	}
}
