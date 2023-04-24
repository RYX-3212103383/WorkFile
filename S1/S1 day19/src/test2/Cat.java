package test2;

public class Cat implements Pet {
	@Override
	public void eat() {
		System.out.println("猫在吃");
	}

	@Override
	public void cry() {
		System.out.println("猫在哭");
	}
}
