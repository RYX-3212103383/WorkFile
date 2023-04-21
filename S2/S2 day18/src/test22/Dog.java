package test22;

public class Dog extends Animal implements LandDao{
	int numberOfLegs;
	public Dog(String name, boolean happy, boolean scare, int legs) {
		super(name, happy, scare);
		numberOfLegs(legs);
	}

	public Dog() {
		super();
	}

	@Override
	public void numberOfLegs(int lenum) {
		numberOfLegs=lenum;
		System.out.println(getName()+"有"+ numberOfLegs +"条腿");
	}

	@Override
	void defaultAct() {
		System.out.println("汪汪叫");
	}
	@Override
	void happyAct() {
		System.out.println("旺旺叫");
	}

	@Override
	void scareAct() {
		System.out.println("呜呜");
	}

	public int getNumberOfLegs() {
		return numberOfLegs;
	}

	public void setNumberOfLegs(int numberOfLegs) {
		this.numberOfLegs = numberOfLegs;
	}
}
