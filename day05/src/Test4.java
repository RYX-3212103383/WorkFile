/**
 * @author RYX
 */
public class Test4 {
	public static void main(String[] args) {
		int flag=0;
		for (int i = 1; i <= 100; i++) {
			if (i % 15 == 0) {
				System.out.print(i+"\t");
				flag++;
			} else if (i % 3 == 0) {
				System.out.print(i+"\t");
				flag++;
			} else if (i % 5 == 0) {
				System.out.print(i+"\t");
				flag++;
			}
			if (flag==10){
				System.out.print("\n");
				flag=0;
			}
		}
	}
}
