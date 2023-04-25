package test21;

public class Staff extends Employee{
	private String jobName;

	public Staff(String name, String address, String tel, String email, String office, double salary, MyDate myDate, String jobName) {
		super(name, address, tel, email, office, salary, myDate);
		this.jobName = jobName;
	}

	@Override
	public String toString() {
		return super.toString()+"Staff{" +
				"jobName='" + jobName + '\'' +
				'}';
	}
}
