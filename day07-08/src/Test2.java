/**
 * @author RYX
 */
public class Test2 {
	public static void main(String[] args) {
		int sum=0;
		for(int i=15;i<=100;i+=15) {
			if (i % 15 == 0) {
				System.out.println(i);
				sum+=i;
			}
		}
		System.out.println("和为"+sum);
	}
}
