import java.util.Arrays;
import java.util.Scanner;

/**
 * @author RYX
 */
public class Test1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double[] a = new double[]{1.8, 1.9, 1.72, 1.81};
		print(a);
		int[] b = new int[]{20, 18, 19, 21, 23};
		double avg = avg(b);
		System.out.println("avg=" + avg);
		int[] c = new int[]{99, 100, 87, 79, 66};
		int max = max(c);
		System.out.println("max=" + max);
		int[] d = new int[]{8, 14, 20, 18, 23, 34, 12};
		System.out.println("数组为" + Arrays.toString(d) + "输入查找关键词");
		int keyword = input.nextInt();
		int add = find(d, keyword);
		if (add == -1) {
			System.out.println("没有找到这个数");
		} else {
			System.out.println("寻找的数在" + (add + 1) + "位,");
		}
		int[] e = new int[]{66, 22, 44, 11, 88};
		int[] bak = Arrays.copyOf(e, e.length);
		e = arrayplus(e, 10);
		formatPrint(e, bak);
	}


	private static void print(double[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.println((i + 1) + ":" + a[i]);
		}
	}

	private static double avg(int[] b) {
		double avg = 0;
		for (int i = 0; i < b.length; i++) {
			avg += (double) b[i] / b.length;
		}
		return avg;
	}

	private static int max(int[] c) {
		int max = c[0];
		for (int i = 0; i < c.length; i++) {
			if (c[i] > max) {
				max = c[i];
			}
		}
		return max;
	}

	private static int find(int[] d, int keyword) {
		int index = -1;
		for (int i = 0; i < d.length; i++) {
			if (d[i] == keyword) {
				index = i;
			}
		}
		return index;
	}

	private static int[] arrayplus(int[] e, int plus) {
		for (int i = 0; i < e.length; i++) {
			e[i] = e[i] + plus;
		}
		return e;
	}

	private static void formatPrint(int[] e, int[] bak) {
		System.out.println("序号\t加积分前\t加积分后");
		for (int i = 0; i < e.length; i++) {
			System.out.println((i + 1) + "\t\t" + bak[i] + "\t\t" + e[i]);
		}
	}
}
