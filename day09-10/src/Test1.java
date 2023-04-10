/**
 * @author RYX
 */
public class Test1 {
	public static void main(String[] args) {
		double[] a = new double[]{1.8, 1.9, 1.72, 1.81};
		print(a);
		int[] b = new int[]{20, 18, 19, 21, 23};
		int[] c= new int[]{99,100,87,79,66};
		int[] d=new int[]{8,14,20,18,23,34,12};
		int[] e=new int[]{66,22,44,11,88};
	}

	private static void print(double[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.println(i+":"+a[i]);
		}
	}
}
