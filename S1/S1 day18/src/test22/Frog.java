package test22;

public class Frog extends Animal implements WaterDao, LandDao {
	protected int numberOfLegs;
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
	public int numberOfLegs(int lenum) {
		numberOfLegs = lenum;
		System.out.println(getName() + "有" + numberOfLegs + "条腿");
		return lenum;
	}

	@Override
	public boolean hasGills() {
		hasGills = true;
		return true;
	}

	@Override
	public void gills() {
		if (hasGills) {
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
		if (hasEggs) {
			System.out.println("是卵生");
		} else {
			System.out.println("不是卵生");
		}
	}

	@Override
	public void defaultAct() {
		System.out.println("呱叫");
	}

	@Override
	public void happyAct() {
		System.out.println("呱呱呱");
	}

	@Override
	public void scareAct() {
		System.out.println("扑通一声跳入水中");
	}

}
