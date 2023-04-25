package test21;

public class Employee extends Person {
	private String office;
	private double salary;
	private MyDate myDate;

	public Employee(String name, String address, String tel, String email, String office, double salary, MyDate myDate) {
		super(name, address, tel, email);
		this.office = office;
		this.salary = salary;
		this.myDate = myDate;
	}

	@Override
	public String toString() {
		return super.toString()+"Employee{" +
				"office='" + office + '\'' +
				", salary=" + salary +
				", myDate=" + myDate +
				'}';
	}
}
