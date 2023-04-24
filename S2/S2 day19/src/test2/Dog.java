package test2;

public class Dog implements Pet {
	@Override
	public void eat() {
		System.out.println("狗在吃");
	}

	@Override
	public void cry() {
		System.out.println("狗在哭");
	}
}
