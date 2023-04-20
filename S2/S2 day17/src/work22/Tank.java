package work22;


public class Tank extends Weapen{
	private String dir;

	public void tankAttack() {
		System.out.println("我是坦克，向"+dir+"方向运动,速度"+speed+",攻击力"+attack);
	}

	public Tank() {
	}

	public Tank(int attack, int speed, String dir) {
		super(attack, speed);
		this.dir = dir;
	}
}
