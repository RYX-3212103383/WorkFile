package work1;

public class Test {
	public static void main(String[] args) {
		Dog dog=new Dog("汪汪",5);
		dog.print(dog);
		dog.fidelity();
		Cat cat=new Cat("喵喵",6);
		cat.print(cat);
		cat.tsundere();
	}
}
