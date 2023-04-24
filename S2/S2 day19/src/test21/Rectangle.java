package test21;

public class Rectangle extends Shapes{
	double width,length;

	public Rectangle(double width, double length) {
		this.width = width;
		this.length = length;
	}

	@Override
	public double area() {
		return width*length;
	}

	@Override
	public double c() {
		return 2*(width*length);
	}
}
