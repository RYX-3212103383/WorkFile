package test21;

public class Faculty extends Employee{
	private MyDate workTime;
	private String level;

	public Faculty(String name, String address, String tel, String email, String office, double salary, MyDate myDate, MyDate workTime, String level) {
		super(name, address, tel, email, office, salary, myDate);
		this.workTime = workTime;
		this.level = level;
	}

	@Override
	public String toString() {
		return super.toString()+"Faculty{" +
				"workTime=" + workTime +
				", level='" + level + '\'' +
				'}';
	}
}
