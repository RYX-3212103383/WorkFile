package test22;

public abstract class Animal {
	protected String name;
	protected boolean happy;
	protected boolean scare;
	protected boolean carnivorous;
	protected boolean mammals;
	public void isCarn(){
		if (isCarnivorous()){
			System.out.println("是食肉");
		}else {
			System.out.println("不是食肉");
		}
	}
	public void isMam(){
		if (isMammals()){
			System.out.println("是哺乳");
		}else {
			System.out.println("不是哺乳");
		}
	}

	public Animal(String name, boolean happy, boolean scare) {
		this.name = name;
		this.happy = happy;
		this.scare = scare;
	}

	public Animal() {
	}

	public boolean isCarnivorous() {
		return carnivorous;
	}

	public void setCarnivorous(boolean carnivorous) {
		this.carnivorous = carnivorous;
	}

	public boolean isMammals() {
		return mammals;
	}

	public void setMammals(boolean mammals) {
		this.mammals = mammals;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isHappy() {
		return happy;
	}

	public void setHappy(boolean happy) {
		this.happy = happy;
	}

	public boolean isScare() {
		return scare;
	}

	public void setScare(boolean scare) {
		this.scare = scare;
	}

	public abstract void happyAct();

	public abstract void scareAct();
	public abstract void defaultAct();

	public void moodreply() {
		defaultAct();
		if (happy) {
			happyAct();
		}
		if (scare) {
			scareAct();
		}
	}
}
