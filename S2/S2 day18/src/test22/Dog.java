package test22;

public class Dog extends Animal implements LandDao{
	public Dog(String name, boolean happy, boolean scare, int legs) {
		super(name, happy, scare);
		numberOfLegs(legs);
	}

	public Dog() {
		super();
	}

	@Override
	public void numberOfLegs(int lenum) {
		System.out.println(getName()+"有"+ lenum +"条腿");
	}

	@Override
	void happyAct() {
		System.out.println("旺旺叫");
	}

	@Override
	void scareAct() {
		System.out.println("呜呜");
	}

}
