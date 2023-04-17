/**
 * @author RYX
 */
public class Test6 {
	public static void main(String[] args) {
		double x = 0.0001;
		int time = 0;
		while (x <= 8848) {
			x *= 2;
			time++;
		}
		System.out.println("折叠" + time + "次后达到" + x + "米，超过珠峰");
	}
}
