/**
 * @author RYX
 */
public class Test6 {
	public static void main(String[] args) {
		int shoesPrice = 58;
		int shoesNum = 1;
		int clothPrice = 30;
		int clothNum = 3;
		double bagPrice = 55.8;
		int bagsNum = 5;
		int count = 500;
		System.out.println("付款:" + count + "\t找零:" + (count - shoesPrice * shoesNum - clothPrice * clothNum - bagPrice * bagsNum));
	}
}
