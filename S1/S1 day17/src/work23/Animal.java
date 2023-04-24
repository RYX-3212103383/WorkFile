package work23;

public class Animal {
	protected String name;
	protected double weight;

	public Animal() {
	}

	public Animal(String name, double weight) {
		this.name = name;
		this.weight = weight;
	}

	public void eat() {
		System.out.println("真好吃");
	}
}
