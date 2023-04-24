package work22;

public class Bullen extends Weapen{
	private String type;
public void bullenAttack(){
	System.out.println("我是子弹"+type+"，速度"+speed+"，攻击力"+attack);
}
	public Bullen() {
	}

	public Bullen(int attack, int speed, String type) {
		super(attack, speed);
		this.type = type;
	}
}
