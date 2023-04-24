package work22;

public class Test {
	public static void main(String[] args) {
		Tank tank=new Tank(1000,20,"上");
		tank.tankAttack();
		Bullen bullen=new Bullen(20,800,"9.7mm子弹");
		bullen.bullenAttack();
	}
}
