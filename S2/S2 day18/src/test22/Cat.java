package test22;

public class Cat extends Animal implements LandDao{
	protected int numberOfLegs;
	public Cat(String name, boolean happy, boolean scare, int legs) {
		super(name, happy, scare);
		numberOfLegs(legs);
	}

	public Cat() {
		super();
	}

	@Override
	public void numberOfLegs(int lenum) {
		numberOfLegs=lenum;
		System.out.println(getName()+"有"+ numberOfLegs +"条腿");
	}

	@Override
	public void defaultAct() {
		System.out.println("喵喵叫");
	}

	@Override
	public void happyAct() {
		System.out.println("咕噜咕噜");
	}

	@Override
	public void scareAct() {
		System.out.println("嘶嘶");
	}

	public int getNumberOfLegs() {
		return numberOfLegs;
	}

	public void setNumberOfLegs(int numberOfLegs) {
		this.numberOfLegs = numberOfLegs;
	}
}
