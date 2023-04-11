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
			case 7: {
				work7();
				break;
			}
			default:
				System.out.println("1-7才有哦");
		}
	}

	private static void work7() {
		String[] sub=new String[3];
		int[][] point=new int[3][5];
		for (int i = 0; i < sub.length; i++) {
			System.out.print("输入科目名称:");
			sub[i]=input.next();
			for (int j = 0; j < point[i].length; j++) {
				System.out.print("输入科目"+sub[i]+"分数:");
				point[i][j]=input.nextInt();
			}
		}
		double avg=0;
		int max=0;
		for (int i = 0; i < sub.length; i++) {
			System.out.print(sub[i]+"的平均分为"+printavg(i,point)+"\t");
			System.out.println(sub[i]+"的最高分为"+printmax(i,point));
	}
		System.out.println(Arrays.deepToString(point));
		System.out.println(Arrays.toString(sub));
	}

	private static int printmax(int i, int[][] point) {
		int max=point[i][0];
		for (int j = 0; j < point[i].length; j++) {
			if(point[i][i]>max){
				max=point[i][j];
			}
		}
		return max;
	}

	private static double printavg(int i, int[][] point) {
		double avg=0;
		for (int j = 0; j < point[i].length; j++) {
			avg=avg+ (double) point[i][j] /point[i].length;
		}
		return avg;
	}


	private static void work6() {
		int[][] a=new int[][]{{1,2,3,4},{6,7,8,9},{11,12,13,14},{16,17,18,19}};
		int sum=0;
		sum=sum+a[0][0]+a[0][a[0].length-1]+a[a.length-1][0]+a[a.length-1][a[a.length-1].length-1];
		System.out.println(sum);
	}

	private static void work5() {
		int[][] a = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
		int sum=0;
		for (int i = 0; i < a.length; i++) {
			if(i==a.length-i-1){
				sum+=a[i][i];
			}else {
				sum=sum+a[i][i]+a[a.length-i-1][a.length-i-1];
			}
		}
		System.out.println(sum);
	}

	private static void work4() {

		char[][] a = new char[][]{{'A', 'B', 'C', 'D'}, {'A', 'B', 'C', 'D'}, {'A', 'B', 'C', 'D'}};
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j]);
			}
			System.out.println("");
		}
	}

	private static void work3() {
		int[][] a = new int[][]{{1, 2}, {1, 2, 3}, {1, 2, 3, 4}};
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j]);
			}
			System.out.println("");
		}
	}

	private static void work2() {
		int[][] a = new int[][]{{1, 2}, {1, 2}, {1, 2}};
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j]);
			}
			System.out.println("");
		}
	}

	private static void work1() {
		int[] a = new int[]{17, 13, 10, 18, 15, 19};
		int[] b = new int[a.length];
		System.out.println(Arrays.toString(a));
		Arrays.sort(a);
		for (int i = 0; i < a.length; i++) {
			b[i] = a[a.length - i - 1];
		}
		System.out.println("降序后"+Arrays.toString(b));
	}
}
