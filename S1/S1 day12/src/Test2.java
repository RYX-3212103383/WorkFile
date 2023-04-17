import java.util.Arrays;
import java.util.Scanner;

/**
 * @author RYX
 */
public class Test2 {

	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("作业1-7");
		int a = input.nextInt();
		switch (a) {
			case 1: {
				work1();
				break;
			}
			case 2: {
				work2();
				break;
			}
			case 3: {
				work3();
				break;
			}
			case 4: {
				work4();
				break;
			}
			case 5: {
				work5();
				break;
			}
			case 6: {
				work6();
				break;
			}
			default:
				System.out.println("1-6才有哦");
		}
	}

	private static void work1() {
		System.out.println("输入数组大小");
		int n = input.nextInt();
		int[] a = ramdomArray(n);
		System.out.println("数组" + Arrays.toString(a));
		bubblesort(a);
		System.out.println("冒泡后" + Arrays.toString(a));
	}

	private static void work2() {
		System.out.println("输入数组大小");
		int n = input.nextInt();
		int[] a = ramdomArray(n);
		int sum = 0;
		System.out.println("数组" + Arrays.toString(a));
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 != 0) {
				sum += a[i];
			}
		}
		System.out.println("奇数和为" + sum);
	}

	private static void work3() {
		System.out.println("输入数组大小");
		int n = input.nextInt();
		int[][] a = ramdom2dArray(n);
		int sum = 0;
		System.out.println("二维数组" + n + "X" + n);
		for (int i = 0; i < a.length; i++) {
			System.out.println(Arrays.toString(a[i]));
		}
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				sum += a[i][j];
			}
		}
		System.out.println("总和为" + sum);
	}

	private static void work4() {
		System.out.println("输入数组大小");
		int n = input.nextInt();
		int[][] a = ramdom2dArray(n);
		System.out.println("二维数组" + n + "X" + n);
		for (int i = 0; i < a.length; i++) {
			System.out.println(Arrays.toString(a[i]));
		}
		bubble2dSort(a);
		System.out.println("二维数组排序后" + n + "X" + n);
		for (int i = 0; i < a.length; i++) {
			System.out.println(Arrays.toString(a[i]));
		}
		System.out.println("最小值为" + a[0][0] + "\t最大值为" + a[a.length - 1][a[a.length - 1].length - 1]);
	}


	private static void work5() {
		System.out.println("输入数组大小");
		int n = input.nextInt();
		int[][] a = ramdom2dArray(n);
		System.out.println("二维数组" + n + "X" + n);
		for (int i = 0; i < a.length; i++) {
			System.out.println(Arrays.toString(a[i]));
		}
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				a[i][j] *= 2;
			}
		}
		System.out.println("二维数组翻倍" + n + "X" + n);
		for (int i = 0; i < a.length; i++) {
			System.out.println(Arrays.toString(a[i]));
		}
	}

	private static void work6() {
		System.out.println("输入数组大小");
		int n = input.nextInt();
		int[][] a = ramdom2dArray(n);
		System.out.println("二维数组" + n + "X" + n);
		for (int i = 0; i < a.length; i++) {
			System.out.println(Arrays.toString(a[i]));
		}
		bubble2dSort(a);
		System.out.println("二维数组排序后" + n + "X" + n);
		for (int i = 0; i < a.length; i++) {
			System.out.println(Arrays.toString(a[i]));
		}
	}

	private static int[] ramdomArray(int n) {
		int[] a = new int[n];
		for (int i = 0; i < a.length; i++) {
			a[i] = (int) (Math.random() * 101);
		}
		return a;
	}

	private static int[][] ramdom2dArray(int n) {
		int[][] a = new int[n][n];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				a[i][j] = (int) (Math.random() * 101);
			}
		}
		return a;
	}


	private static int[] bubblesort(int[] a) {
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = 0; j < a.length - i - 1; j++) {
				if (a[j] > a[j + 1]) {
					int temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
		}
		return a;
	}


	private static int[][] bubble2dSort(int[][] a) {
		int total = 0;
		for (int i = 0; i < a.length; i++) {
			total += a[i].length;
		}
		for (int i = 0; i < total - 1; i++) {
			for (int j = 0; j < total - i - 1; j++) {
				int x1 = j / a.length, x2 = (j + 1) / a.length;
				int y1 = j % a[x1].length, y2 = (j + 1) % a[x2].length;
				if (a[x1][y1] > a[x2][y2]) {
					int temp = a[x1][y1];
					a[x1][y1] = a[x2][y2];
					a[x2][y2] = temp;
				}
			}
		}
		return a;
	}
}
