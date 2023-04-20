package work23;

public class Dog extends Animal{
	public Dog() {
	}

	public Dog(String name, double weight) {
		super(name, weight);
	}

	public void bite(){
		System.out.println("惹我罗，咬死你！");
	}
}
