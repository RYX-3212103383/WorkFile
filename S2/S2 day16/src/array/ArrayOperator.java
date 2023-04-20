package array;

public class ArrayOperator {
	private double[] a;

	public ArrayOperator(double[] a) {
		this.a = a;
	}

	public void change(int index,double b) {
		a[index] = b;
		System.out.println(a[index]);
	}

	public double oneAddtwo() {
		return a[0] + a[1];
	}

	public double addAll() {
		double sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		return sum;
	}

	public double min() {
		double min = a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[i] < min) {
				min = a[i];
			}
		}
		return min;
	}

	public void getRamdomvalue() {
		int index = (int) (Math.random() * 10);
		System.out.println("Array[" + index + "]的值为" + a[index]);
	}

	public double[] getA() {
		return a;
	}
}
