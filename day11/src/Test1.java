import java.util.Arrays;
import java.util.Scanner;

/**
 * @author RYX
 */
public class Test1 {
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("作业1-6");
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
		int[] a=new int[]{87,23,100,78,53,99};
		Arrays.sort(a);
		System.out.println("升序后"+Arrays.toString(a));
	}

	private static void work5() {
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
		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i]);
		}
	}

	private static void work4() {
		int[] a=new int[5];
		for(int i=0;i<a.length;i++){
			a[i]=(int)(Math.random()*(22)+1);
			for (int j = 0; j < i; j++) {
				if(a[i]==a[j]){
					a[i]=-1;
					i--;
				}
			}
		}
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
	}

	private static void work3() {
		int[] a=new int[]{2,4,6,8};
		int[] b=new int[]{1,3,5,7};
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
		int[] c=new int[a.length+b.length];
		for (int i = 0; i < a.length; i++) {
			c[i]=a[i];
		}for (int i = 0; i < a.length; i++) {
			c[i+a.length]=b[i];
		}
		System.out.println(Arrays.toString(c));
	}

	private static void work2() {
		int[] a=new int[]{10,13,15,17,19};
		int[] b=new int[a.length-1];
		int x=0;
		System.out.println(Arrays.toString(a));
		int index =input.nextInt();
		for (int i = 0; i < a.length; i++) {
			if(i==index){
				x++;
				System.out.println(a[i]+"被删除了");
				continue;
			}
			b[i-x]=a[i];
		}
		System.out.println(Arrays.toString(b));
	}

	public static void work1() {
		int[] a = new int[]{1, 3, 5, 7, 9};
		int[] b = new int[a.length+1];
		System.out.println(Arrays.toString(a));
		for (int i = 0; i < a.length; i++) {
			b[i]=a[i];
		}
		b[a.length] = input.nextInt();
		Arrays.sort(b);
		System.out.println(Arrays.toString(b));
	}
}
