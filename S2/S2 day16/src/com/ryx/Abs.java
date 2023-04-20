package com.ryx;

public class Abs {

	public byte abs(byte a) {
		return a > 0 ? a : (byte) -a;
	}

	public short abs(short a) {
		return a > 0 ? a : (short) -a;
	}

	public int abs(int a) {
		return a > 0 ? a : -a;
	}

	public long abs(long a) {
		return a > 0 ? a : -a;
	}

	public float abs(float a) {
		return a > 0 ? a : -a;
	}

	public double abs(double a) {
		return a > 0 ? a : -a;
	}
}
