/**
 * @author RYX
 */
public class Test7 {
	public static void main(String[] args) {
		int java = 100;
		int sql = 90;
		int html = 80;
		System.out.println("java比sql分数高了" + (java - sql) + "分");
		System.out.println("Java" + java + "分,sql" + sql + "分,html" + html + "分,总分为:" + (java + sql + html));
		System.out.println("三门课的平均分为" + ((java + sql + html)/ 3));
	}
}
