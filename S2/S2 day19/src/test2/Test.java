package test2;

public class Test {
	public static void main(String[] args) {
		Shop shop = new Shop();
		try {
			shop.sellPet(3);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("程序结束");
	}
}
