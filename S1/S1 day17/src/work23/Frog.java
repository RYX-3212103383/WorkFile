package work23;

public class Frog extends Animal{
	public Frog() {
	}

	public Frog(String name, double weight) {
		super(name, weight);
	}

	public void swim(){
		System.out.println("洗个澡，真凉快！");
	}
}
