package work1;

public class Cat extends Animal {
	protected int tsundere;

	public Cat(String name, int tsundere) {
		super(name);
		this.tsundere = tsundere;
	}
	public void tsundere(){
		System.out.println("傲娇值为"+tsundere);
	}
}
