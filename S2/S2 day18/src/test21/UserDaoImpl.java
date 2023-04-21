package test21;

public class UserDaoImpl implements UserDao{
	@Override
	public int add(User user) {
		System.out.println("添加了一个学生"+user.toString());
		return 0;
	}

	@Override
	public int update(User user) {
		System.out.println("更新了一个学生"+user.toString());
		return 0;
	}

	@Override
	public int delete(int id) {
		System.out.println("删除了一个学生="+id);
		return 0;
	}

	@Override
	public User findOne(int id) {
		System.out.println("查找了一个学生="+id);
		return null;
	}

	@Override
	public User[] findAll() {
		System.out.println("查找所有学生");
		return new User[0];
	}
}
