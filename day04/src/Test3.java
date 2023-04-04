/**
 * @author RYX
 */
public class Test3 {
	public static void main(String[] args) {
		int age = (int) (Math.random() * (80 - 0 + 1) + 0);
		System.out.println(age);
		if (age < 10) {
			System.out.println("童年");
		} else if (age >= 10 && age < 19) {
			System.out.println("少年");
		} else if (age >= 19 && age < 30) {
			System.out.println("青年");
		} else if (age >= 30 && age < 59) {
			System.out.println("中年");
		} else {
			System.out.println("老年");
		}
	}
}