package test22;

public abstract class Animal {
	private String name;
	private boolean happy;
	private boolean scare;
	private boolean carnivorous;
	private boolean mammals;

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

	abstract void happyAct();

	abstract void scareAct();
	abstract void defaultAct();

	void moodreply() {
		defaultAct();
		if (happy) {
			happyAct();
		}
		if (scare) {
			scareAct();
		}
	}
}
