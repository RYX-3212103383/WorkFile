import java.util.Arrays;
import java.util.Scanner;

/**
 * @author RYX
 */
public class Test1 {

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
			case 7: {
				work7();
				break;
			}
			default:
				System.out.println("1-7才有哦");
		}
	}

	private static void work1() {
		int[] a = new int[]{11, 3, 15, 7, 9};
		int[] b = new int[a.length + 1];
		System.out.println("原数组" + Arrays.toString(a));
		bubblesort(a);
		System.out.println("冒泡排序" + Arrays.toString(a));
		for (int i = 0; i < a.length; i++) {
			b[i] = a[i];
		}
		b[a.length] = input.nextInt();
		bubblesort(a);
		System.out.println("加一个冒泡" + Arrays.toString(b));
	}

	private static void work2() {
		int[] a = new int[]{19, 13, 7, 10, 9};
		int[] b = new int[a.length - 1];
		int x = 0;
		System.out.println("原数组" + Arrays.toString(a));
		bubblesortdesc(a);
		System.out.println("冒泡排序降序" + Arrays.toString(a));
		int index = input.nextInt();
		for (int i = 0; i < a.length; i++) {
			if (i == index) {
				x++;
				System.out.println(a[i] + "被删除了");
				continue;
			}
			b[i - x] = a[i];
		}
		System.out.println("删除后" + Arrays.toString(b));
	}


	private static void work3() {
		int[] a = new int[]{2, 4, 6, 8};
		int[] b = new int[]{1, 3, 5, 7};
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
		int[] c = new int[a.length + b.length];
		for (int i = 0; i < a.length; i++) {
			c[i] = a[i];
		}
		for (int i = 0; i < a.length; i++) {
			c[i + a.length] = b[i];
		}
		bubblesort(c);
		System.out.println("冒泡排序" + Arrays.toString(c));
	}

	private static void work4() {
		System.out.println("输入数组长度");
		int n = input.nextInt();
		int[] a = new int[n];
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			a[i] = (int) (Math.random() * 101);
			sum += a[i];
		}
		System.out.print("数组为" + Arrays.toString(a) + "\n总和为" + sum);
	}

	private static void work5() {
		System.out.println("输入数组长度");
		int n = input.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < a.length; i++) {
			a[i] = (int) (Math.random() * 101);
		}
		System.out.println("数组为" + Arrays.toString(a));
		bubblesort(a);
		System.out.print("冒泡后" + Arrays.toString(a) + "\n最大值为" + a[a.length - 1] + "最小值为" + a[0]);
	}

	private static void work6() {
		System.out.println("输入数组长度");
		int n = input.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < a.length; i++) {
			a[i] = (int) (Math.random() * 101);
		}
		System.out.println("数组为" + Arrays.toString(a));
		for (int i = 0; i < a.length; i++) {
			a[i] *= 2;
		}
		System.out.println("翻倍后" + Arrays.toString(a));
	}

	private static void work7() {
		System.out.println("输入数组长度");
		int n = input.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < a.length; i++) {
			a[i] = (int) (Math.random() * 101);
		}
		System.out.println("数组为" + Arrays.toString(a));
		bubblesortdesc(a);
		System.out.print("降序冒泡后" + Arrays.toString(a));
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

	private static int[] bubblesortdesc(int[] a) {
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = 0; j < a.length - i - 1; j++) {
				if (a[j] < a[j + 1]) {
					int temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
		}
		return a;
	}
}
