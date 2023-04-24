package test1;

public class Test {
	public static void main(String[] args) {
		int x=10,y=0;
		try {
			int c=x/y;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("默认方法");
		}
	}
}
