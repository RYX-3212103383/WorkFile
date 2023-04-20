package work1;

public class Dog extends Animal {
	protected int fidelity;

	public Dog( String name ,int fidelity) {
		super(name);
		this.fidelity = fidelity;
	}
	public void fidelity(){
		System.out.println("忠诚度为"+fidelity);
	}
}
