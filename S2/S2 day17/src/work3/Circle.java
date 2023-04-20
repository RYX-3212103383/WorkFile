package work3;

public class Circle extends Point {
	double r;


	public Circle() {
	}

	public Circle(double x, double y, double r) {
		super(x, y);
		this.r = r;
	}

	public double s() {
		return r * r * Math.PI;
	}

	public double c() {
		return 2 * r * Math.PI;
	}
	public void print(){
		System.out.print("坐标在("+x+","+y+")半径为"+r+"的圆的面积为"+s()+"\n" +
				"坐标在("+x+","+y+")半径为"+r+"的圆的周长为"+c()+"\n");
	}
}
