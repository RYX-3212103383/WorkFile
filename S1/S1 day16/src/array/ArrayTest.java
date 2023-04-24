package array;

import java.util.Arrays;

public class ArrayTest {
	public static void main(String[] args) {
		double[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		ArrayOperator obj = new ArrayOperator(a);
		System.out.println(Arrays.toString(obj.getA()));
		obj.change(9, 5.5);
		System.out.println("前两个元素的和"+obj.oneAddtwo());
		System.out.println("所有元素的和"+obj.addAll());
		System.out.println("最小值"+obj.min());
		obj.getRamdomvalue();
		double[] b = {3.5, 5.5, 4.52, 5.6};
		ArrayOperator obj2 = new ArrayOperator(b);
		System.out.println(Arrays.toString(obj2.getA()));
	}
}
