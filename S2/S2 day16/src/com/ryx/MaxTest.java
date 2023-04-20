package com.ryx;

public class MaxTest {
	public static void main(String[] args) {
		Max obj = new Max();
		byte a = 10, b = 20;
		short c = 10, d = 32;
		int e = 10, f = 14;
		long g = 56, h = 20;
		System.out.println("byte测试类" + obj.max(a, b));
		System.out.println("short测试类" + obj.max(c, d));
		System.out.println("int测试类" + obj.max(e, f));
		System.out.println("long测试类" + obj.max(g, h));
	}

}
