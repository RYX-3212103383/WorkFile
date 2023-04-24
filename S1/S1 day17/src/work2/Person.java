package work2;

public class Person {
	protected int id;
	protected String name;
	protected String job;
public void show(Person person){
	System.out.println("id是"+id);
	System.out.println("name是"+name);
	System.out.println("job是"+job);
}
	public Person() {
	}

	public Person(int id, String name, String job) {
		this.id = id;
		this.name = name;
		this.job = job;
	}
}
