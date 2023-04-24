package test2;

public class Shop {
	void sellPet(int i) throws Exception {
		if (i == 1) {
			Pet pet = new Cat();
			pet.eat();
			pet.cry();
		} else if (i == 2) {
			Pet pet = new Dog();
			pet.eat();
			pet.cry();
		} else {
			throw new MyException();
		}
	}
}
