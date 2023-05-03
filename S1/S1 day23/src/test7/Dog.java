package test7;

public class Dog {
	String name;
	Integer age;

	public Dog() {
	}

	public Dog(String name, Integer age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "名字:" + name +
				"\t年龄:" + age;
	}
}
