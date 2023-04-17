/**
 * @author RYX
 */
public class Employee {
	private int id;
	private String name;
	private String address;
	private long tel;
	private String state;
	private double salary;

	public Employee() {
	}

	public Employee(int id, String name, String address, long tel, String state, double salary) {
		this.id = id;
		this.name = name;
		this.address = address;
		this.tel = tel;
		this.state = state;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public long getTel() {
		return tel;
	}

	public void setTel(long tel) {
		this.tel = tel;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
}
