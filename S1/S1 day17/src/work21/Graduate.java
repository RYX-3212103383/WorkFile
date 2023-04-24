package work21;

public class Graduate extends Student{
	protected String direction;

	public Graduate() {
	}

	public Graduate(String name, int age, String degree, String direction) {
		super(name, age, degree);
		this.direction = direction;
	}

	public void graduateShow(){
		super.show();
		System.out.println("direction(研究方向)是"+direction);
	}

}
