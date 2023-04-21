package test22;

public class Frog extends Animal implements WaterDao, LandDao {
	int numberOfLegs;
	boolean hasGills;
	boolean hasEggs;

	public Frog(String name, boolean happy, boolean scare, int legs) {
		super(name, happy, scare);
		numberOfLegs(legs);
	}

	public Frog() {
		super();
	}

	@Override
	public void numberOfLegs(int lenum) {
		numberOfLegs=lenum;
		System.out.println(getName() + "有" + numberOfLegs + "条腿");
	}

	@Override
	public boolean hasGills() {
		hasGills = true;
		return true;
	}

	@Override
	public void gills() {
		if (hasGills == true) {
			System.out.println("有鳃");
		} else {
			System.out.println("没有鳃");
		}
	}

	@Override
	public boolean hasLaysEggs() {
		hasEggs = true;
		return true;
	}

	@Override
	public void eggs() {
		if (hasEggs == true) {
			System.out.println("是卵生");
		} else {
			System.out.println("不是卵生");
		}
	}

	@Override
	void defaultAct() {
		System.out.println("呱叫");
	}
	@Override
	void happyAct() {
		System.out.println("呱呱呱");
	}

	@Override
	void scareAct() {
		System.out.println("扑通一声跳入水中");
	}

	public int getNumberOfLegs() {
		return numberOfLegs;
	}

	public void setNumberOfLegs(int numberOfLegs) {
		this.numberOfLegs = numberOfLegs;
	}
}
