package test21;

public class Circle extends Shapes{

	public Circle(double r) {
		this.r = r;
	}

	double r;
	@Override
	public double area() {
		return r*r*Math.PI;
	}

	@Override
	public double c() {
		return 2*r*Math.PI;
	}
}
