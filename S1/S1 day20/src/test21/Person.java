package test21;

public class Person {
	private String name;
	private String address;
	private String tel;
	private String email;

	public Person(String name, String address, String tel, String email) {
		this.name = name;
		this.address = address;
		this.tel = tel;
		this.email = email;
	}

	@Override
	public String toString() {
		return "Person{" +
				"name='" + name + '\'' +
				", address='" + address + '\'' +
				", tel='" + tel + '\'' +
				", email='" + email + '\'' +
				'}';
	}
}
