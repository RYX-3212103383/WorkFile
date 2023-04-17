import java.util.Scanner;

/**
 * @author RYX
 */
public class Test1 {
	public static void main(String[] args) {
		System.out.println("请输入3门课程成绩");
		Scanner sc = new Scanner(System.in);
		int java = sc.nextInt();
		int sql = sc.nextInt();
		int html = sc.nextInt();
		System.out.println("java\tsql\thtml\t总分\t平均分");
		System.out.println(java + "\t\t" + sql + "\t" + html + "\t\t" + (java + sql + html) + "\t" + (double) (java + sql + html) / 3);
		int mine = java - sql;
		if (mine < 0) {
			mine = -mine;
		}
		System.out.println("Java课和SQL课成绩之差" + mine);
	}
}
