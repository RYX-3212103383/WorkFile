package work24;

public class Animal {
	public String name;
	public String sex;

	public Animal() {
	}

	public Animal(String name, String sex) {
		this.name = name;
		this.sex = sex;
	}

	public void show() {
		System.out.print("我是" + name + ",我是" + sex + ",");
	}
}
