package work2;

public class Teacher extends Person{
	protected double salary;
public void show(Teacher teacher){
	super.show(teacher);
	System.out.println("salary是"+salary);
}
	public Teacher() {
	}

	public Teacher(int id, String name, String job, double salary) {
		super(id, name, job);
		this.salary = salary;
	}
}
