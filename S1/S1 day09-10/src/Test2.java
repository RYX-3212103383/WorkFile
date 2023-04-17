import java.util.Arrays;
import java.util.Scanner;

/**
 * @author RYX
 */
public class Test2 {
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.print("课后作业1-6\n" +
				"1.从【控制台】输入6个整数\n" +
				"2.从【控制台】输入8个小数\n" +
				"3.从【键盘】录入5首歌曲的名字\n" +
				"4.从【键盘】录入3个学员的姓名，再从键盘录入3个学员的成绩\n" +
				"5.有一组数字为 9,3,8,11,33,4, 输出\n" +
				"6.有一组数为：18，114，120，108，213，324，172,从【控制台】输入一个数，看这组数中是否包含,如果包含就输出“有这个数，它的下标为X”，如果不包含就输出“没有这个数”\n");
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

	private static void work6() {
		int[] d = new int[]{8, 114, 120, 108, 213, 324, 172};
		System.out.println("数组为" + Arrays.toString(d) + "输入查找关键词");
		int keyword = input.nextInt();
		int add = find(d, keyword);
		if (add == -1) {
			System.out.println("没有找到这个数");
		} else {
			System.out.println("寻找的数在" + (add + 1) + "位,");
		}
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

	private static void work5() {
		int[] a = new int[]{9, 3, 8, 11, 33, 4};
		System.out.println("排序前:" + Arrays.toString(a));
		Arrays.sort(a);
		System.out.println("升序后:" + Arrays.toString(a));
		a = swArr(a);
		System.out.println("降序后:" + Arrays.toString(a));
		a = cutmax(a);
		System.out.println("去掉一个最高分:" + Arrays.toString(a));
		a = cutmin(a);
		System.out.println("去提一个最低分:" + Arrays.toString(a));
	}

	private static int[] cutmin(int[] a) {
		int[] b = new int[a.length - 1];
		System.arraycopy(a, 0, b, 0, a.length - 1);
		return b;
	}

	private static int[] cutmax(int[] a) {
		int[] b = new int[a.length - 1];
		System.arraycopy(a, 1, b, 0, a.length - 1);
		return b;
	}

	private static int[] swArr(int[] a) {
		int[] b = new int[a.length];
		for (int i = 0; i < a.length; i++) {
			b[i] = a[a.length - i - 1];
		}
		return b;
	}


	private static void work4() {
		String[][] a = new String[3][2];
		System.out.println("录入3个学员的姓名，再录入3个学员的成绩");
		for (int i = 0; i < a.length; i++) {
			System.out.print("姓名:");
			a[i][0] = input.next();
			System.out.print("成绩:");
			a[i][1] = input.next();
		}
		System.out.print("====学员成绩表====\n" +
				"姓名\t   成绩\n");
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i][0] + "\t\t" + a[i][1]);
		}
	}

	private static void work3() {

		System.out.println("输入5首歌曲的名字");
		String[] a = new String[5];
		for (int i = 0; i < a.length; i++) {
			a[i] = input.next();
		}
		System.out.println("数组为:"+ Arrays.toString(a));
	}

	private static void work2() {
		System.out.println("输入八个小数");
		double[] a = new double[8];
		for (int i = 0; i < a.length; i++) {
			a[i] = input.nextDouble();
		}
		System.out.println("数组为" + Arrays.toString(a));
	}

	private static void work1() {
		int[] a = new int[6];
		System.out.println("输入六个数");
		for (int i = 0; i < a.length; i++) {
			a[i] = input.nextInt();
		}
		System.out.println("数组为" + Arrays.toString(a));
	}
}
