package test21;

public abstract class Shapes {
	public Shapes(){

	};

	public abstract double area();
	public abstract double c();
	public void printDetail(){
		System.out.println("面积时"+area()+",周长是"+c());
	};
}
