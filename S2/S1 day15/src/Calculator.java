/**
 * @author RYX
 */
public class Calculator {
	private int a;
	private int b;

	public int add(int a,int b){
		int c=0;
		c=a+b;
		return c;
	}
	public int sub(int a,int b){
		int c=0;
		c=a-b;
		return c;
	}
	public int mul(int a,int b){
		int c=0;
		c=a*b;
		return c;
	}
	public double div(int a,int b){
		double c=0;
		c=(double)a/b;
		return c;
	}
	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}
}
