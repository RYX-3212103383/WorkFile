package com.ryx;

public class AbsTest {
	public static void main(String[] args) {
		Abs abs = new Abs();
		byte a = -1;
		short b = -5;
		int c = -10;
		long d = -16;
		float e = -1.2f;
		double f = -6.2;
		System.out.println("byte测试类为" + abs.abs(a));
		System.out.println("short测试类为" + abs.abs(b));
		System.out.println("int测试类为" + abs.abs(c));
		System.out.println("long测试类为" + abs.abs(d));
		System.out.println("float测试类为" + abs.abs(e));
		System.out.println("double测试类为" + abs.abs(f));
	}
}
