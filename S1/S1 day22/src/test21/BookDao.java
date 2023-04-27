package test21;

import java.util.List;

public interface BookDao {
	int add(Book book);

	int update(Book book);

	int del(int id);

	Book findOne(int id);

	List<Book> findAll();

	List<Book> findByLike(String keyword);

}
