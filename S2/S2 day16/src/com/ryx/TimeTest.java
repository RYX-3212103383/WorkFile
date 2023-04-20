package com.ryx;

public class TimeTest {
	public static void main(String[] args) {
		Time time1 = new Time();
		time1.printTime();
		Time time2 = new Time(10);
		time2.printTime();
		Time time3 = new Time(10, 12);
		time3.printTime();
		Time time4 = new Time(10, 12, 18);
		time4.printTime();
	}
}
