package test21;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BookDaoImpl extends Book implements BookDao {
	static ArrayList<Book> booklist = new ArrayList();
	static{
		Book book1 = new Book(1, 2001, "《诗经》", 1.0, "孔子", "尹吉甫采集、孔子编订", 10);
		Book book2 = new Book(2, 2002, "《离骚》", 2.0, "屈原", "战国屈原", 20);
		Book book3 = new Book(3, 2003, "《梦溪笔谈》", 3.0, "沈括", "北宋科学家、政治家沈括所著", 30);
		Book book4 = new Book(4, 2004, "《孙子兵法》", 4.0, "孙武", "春秋末期孙武所著", 40);
		Book book5 = new Book(5, 2005, "《水经注》", 5.0, "郦道元", "北朝北魏郦道元所著", 50);
		Book book6 = new Book(6, 2006, "《世说新语》", 6.0, "刘义庆", "南朝宋刘义庆所著", 60);
		Book book7 = new Book(7, 2007, "《聊斋志异》", 7.0, "蒲松龄", "清朝小说家蒲松龄所作", 70);
		booklist.add(book1);
		booklist.add(book2);
		booklist.add(book3);
		booklist.add(book4);
		booklist.add(book5);
		booklist.add(book6);
		booklist.add(book7);
	}

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
			if (booklist.get(i).getId()==book.getId()) {
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
