package work21;

public class Student {
	protected String name;
	protected int age;
	protected String degree;

	public Student() {
	}

	public Student(String name, int age, String degree) {
		this.name = name;
		this.age = age;
		this.degree = degree;
	}

	public void show() {
		System.out.println("name是" + name);
		System.out.println("age是" + age);
		System.out.println("degree是" + degree);
	}
}
