package work2;

public class Test {
	public static void main(String[] args) {
		Student stu=new Student(1,"张三","学生",18000);
		stu.show(stu);
		Teacher tea=new Teacher(2,"李四","老师",8000);
		tea.show(tea);
	}
}
