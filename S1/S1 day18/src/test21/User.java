package test21;

public class User {
	private int id;
	private String name;
	private String address;
	private String job;

	public User() {
	}

	public User(int id, String name, String address, String job) {
		this.id = id;
		this.name = name;
		this.address = address;
		this.job = job;
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

	public String getAdd() {
		return address;
	}

	public void setAdd(String add) {
		this.address = add;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	@Override
	public String toString() {
		return "User{" +
				"id=" + id +
				", name='" + name + '\'' +
				", address='" + address + '\'' +
				", job='" + job + '\'' +
				'}';
	}
}
