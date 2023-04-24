package test21;

public class Test {
	public static void main(String[] args) {
		User stu = new User(1, "张三", "地球", "学生");
		UserDao AAAA = new UserDaoImpl();
		AAAA.add(stu);
		AAAA.update(stu);
		AAAA.delete(stu.getId());
		AAAA.findAll();
		AAAA.findOne(stu.getId());
	}
}
