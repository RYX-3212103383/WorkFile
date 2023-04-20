package square;

public class SquareTest {
	public static void main(String[] args) {
		Square square = new Square();
		int a = 5;
		long b = 8;
		float c = 9.8f;
		double d = 10.2;
		System.out.println("int测试类为" + square.square(a));
		System.out.println("long测试类为" + square.square(b));
		System.out.println("float测试类为" + square.square(c));
		System.out.println("double测试类为" + square.square(d));
	}
}
