package work24;

public class Dog extends Animal {
	private String weiBa;

	public Dog() {
	}

	public Dog(String name, String sex, String weiBa) {
		super(name, sex);
		this.weiBa = weiBa;
	}

	public void show() {
		super.show();
		System.out.print("我有" + weiBa+"\n");
	}
}
