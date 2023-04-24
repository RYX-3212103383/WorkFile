package work21;

public class Undergraduate extends Student {
	protected String specialty;

	public Undergraduate() {
	}

	public Undergraduate(String name, int age, String degree, String specialty) {
		super(name, age, degree);
		this.specialty = specialty;
	}

	public void undergraduateShow() {
		super.show();
		System.out.println("specialty(专业)是" + specialty);
	}
}
