package test22;

public class Cat extends Animal implements LandDao{
	int legs;
	public Cat(String name, boolean happy, boolean scare, int legs) {
		super(name, happy, scare);
		numberOfLegs(legs);
	}

	public Cat() {
		super();
	}

	@Override
	public void numberOfLegs(int lenum) {
		System.out.println(getName()+"有"+ lenum +"条腿");
	}

	@Override
	void happyAct() {
		System.out.println("咕噜咕噜");
	}

	@Override
	void scareAct() {
		System.out.println("嘶嘶");
	}
}
