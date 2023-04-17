/**
 * @author RYX
 */
public class Test4 {
	public static void main(String[] args) {
		int sum=0;
		int x=1;
		for(int i=1;i<=5;i++){
			x*=i;
			//System.out.println(x);
			sum+=x;
		}
		System.out.println(sum);
	}
}
