package work1;

public class Animal {
	protected String name;

	public Animal() {
	}

	public Animal(String name) {
		this.name = name;
	}

	public void eat(){
		System.out.print("\t吃");
	}
	public void sleep(){
		System.out.print("\t睡");
	}
	public void run(){
		System.out.print("\t跑\n");
	}
	public void print(Animal animal){
		System.out.print(name);
		animal.eat();
		animal.sleep();
		animal.run();
	}
}
