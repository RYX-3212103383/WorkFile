package work21;

public class Test {
	public static void main(String[] args) {
		Graduate stu1=new Graduate("张三",25,"研究生","机械制造");
		stu1.graduateShow();
		Undergraduate stu2=new Undergraduate("李四",20,"本科生","临床医学");
		stu2.undergraduateShow();
	}
}
