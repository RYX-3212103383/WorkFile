package work2;

public class Student extends Person{
	protected double money;
	public void show(Student student){
		super.show(student);
		System.out.println("money是"+money);
	}
	public Student() {
	}

	public Student(int id, String name, String job, double money) {
		super(id, name, job);
		this.money = money;
	}
}
