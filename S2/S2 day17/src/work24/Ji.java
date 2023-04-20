package work24;

public class Ji extends Animal {
	private String chiBang;

	public Ji() {
	}

	public Ji(String name, String sex, String chibang) {
		super(name, sex);
		chiBang = chibang;
	}

	public void show() {
		super.show();
		System.out.print("我有" + chiBang+"\n");
	}
}
