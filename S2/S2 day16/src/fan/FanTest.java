package fan;

public class FanTest {
	public static void main(String[] args) {
		Fan fan = new Fan();
		String a = fan.toString();
		System.out.println(a);
		fan.setOn(true);
		a = fan.toString();
		System.out.println(a);
	}
}
