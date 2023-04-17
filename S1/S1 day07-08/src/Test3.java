/**
 * @author RYX
 */
public class Test3 {
	public static void main(String[] args) {
		int flag=0;
		for(int i=1;i<=25;i++){
			System.out.print((char)(i+65)+"\t");
			flag++;
			if(flag==10){
				System.out.println();
				flag=0;
			}
		}
	}
}
