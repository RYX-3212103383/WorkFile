package cat;

public class Cat {
	private static int count = 0;

	public Cat() {
		count++;
	}

	public void showCat() {
		System.out.println("猫的数量" + count);
	}
}
