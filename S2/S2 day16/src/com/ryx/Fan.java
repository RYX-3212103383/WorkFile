package com.ryx;

public class Fan {
	private final int SLOW = 1;
	private final int MEDIUM = 2;
	private final int FAST = 3;
	private int speed = SLOW;
	private boolean on = false;
	private double radius = 5;
	private String color = "blue";

	public Fan() {
	}

	public String toString() {
		String a = "";
		if (!on) {
			a += "风扇是关的";
		} else {
			if (speed == SLOW) {
				a += "风扇的速度为SLOW";
			} else if (speed == MEDIUM) {
				a += "风扇的速度为MEDIUM";
			} else if (speed == FAST) {
				a += "风扇的速度为FAST";
			}
		}
		a += ",颜色为";
		a += color;
		a += ",半径是";
		a += radius;
		return a;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public boolean isOn() {
		return on;
	}

	public void setOn(boolean on) {
		this.on = on;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
}
