package test21;

public class Test {
	public static void main(String[] args) {
		Person person = new Person("张三", "地球", "10066665", "iasbkas@iha.com");
		Employee employee = new Employee("李四", "美国", "1216513216",
				"iauekajg@aoih.com", "第一工作室", 9999.3,
				new MyDate(2000, 10, 25));
		Student student = new Student("大一", "大二", "大三",
				"大四", "大学");
		Staff staff = new Staff("李四", "美国", "1216513216",
				"iauekajg@aoih.com", "第一工作室",
				9999.3, new MyDate(2000, 10, 25), "CEO");
		Faculty faculty = new Faculty("李四", "美国", "1216513216",
				"iauekajg@aoih.com", "第一工作室",
				9999.3, new MyDate(2000, 10, 25),
				new MyDate(2020, 10, 19), "高");
		System.out.println(person.toString());
		System.out.println(employee.toString());
		System.out.println(student.toString());
		System.out.println(staff.toString());
		System.out.println(faculty.toString());
	}
}
