package test21;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BookDaoImpl extends Book implements BookDao {
	ArrayList<Book> booklist = new ArrayList();

	public ArrayList<Book> getBooklist() {
		return booklist;
	}

	@Override
	public int add(Book book) {
		try {
			booklist.add(book);
			return 1;
		} catch (Exception e) {
			return -1;
		}
	}

	@Override
	public int update(Book book) {
		for (int i = 0; i < booklist.size(); i++) {
			if (booklist.get(i).getId() == book.getId()) {
				booklist.set(i,book);
				return 1;
			}
		}
		return -1;
	}

	@Override
	public int del(int id) {
		for (int i = 0; i < booklist.size(); i++) {
			if (booklist.get(i).getId() ==id) {
				booklist.remove(i);
				return 1;
			}
		}
		return -1;
	}

	@Override
	public Book findOne(int id) {
		for (int i = 0; i < booklist.size(); i++) {
			if (booklist.get(i).getId() == id) {
				return booklist.get(i);
			}
		}
		return null;
	}

	@Override
	public List<Book> findAll() {
		return booklist;
	}

	@Override
	public List<Book> findByLike(String keyword) {
		Pattern pattern= Pattern.compile(".*" + keyword + ".*", Pattern.CANON_EQ);
		List<Book> book=new ArrayList<>();
		for (int i = 0; i < booklist.size(); i++) {
			String str=booklist.get(i).toString();
			Matcher matcher = pattern.matcher(str);
			if (matcher.matches()) {
				book.add(booklist.get(i));
			}
		}
		return book;
	}
}
