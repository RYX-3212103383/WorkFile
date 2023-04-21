package test21;

public interface UserDao {
	int add(User user);

	int update(User user);

	int delete(int id);

	User findOne(int id);

	User[] findAll();
}
