package test21;

public class Triagle extends Shapes{
	double a,b,c;

	public Triagle(double a, double b, double c) throws Exception{
		this.a = a;
		this.b = b;
		this.c = c;
		if(a>b+c||b>a+c||c>a+b){
			throw new MyException();
		}
	}

	@Override
	public double area() {
		double p=0.5*c();
		double s=Math.sqrt(p*(p-a)*(p-b)*(p-c));//海伦公式
		return s;
	}

	@Override
	public double c() {
		return a+b+c;
	}
}
