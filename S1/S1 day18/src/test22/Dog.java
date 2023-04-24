package test22;

public class Dog extends Animal implements LandDao {
	protected int numberOfLegs;

	public Dog(String name, boolean happy, boolean scare, int legs) {
		super(name, happy, scare);
		numberOfLegs(legs);
	}

	public Dog() {
		super();
	}

	@Override
	public int numberOfLegs(int lenum) {
		numberOfLegs = lenum;
		System.out.println(getName() + "有" + numberOfLegs + "条腿");
		return lenum;
	}

	@Override
	public void defaultAct() {
		System.out.println("汪汪叫");
	}

	@Override
	public void happyAct() {
		System.out.println("旺旺叫");
	}

	@Override
	public void scareAct() {
		System.out.println("呜呜");
	}

}
