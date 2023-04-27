package test21;

import java.util.List;
import java.util.Scanner;

public class Test {
	public static Book book1 = new Book(1, 2001, "《诗经》", 1.0, "孔子", "尹吉甫采集、孔子编订", 10);
	public static Book book2 = new Book(2, 2002, "《离骚》", 2.0, "屈原", "战国屈原", 20);
	public static Book book3 = new Book(3, 2003, "《梦溪笔谈》", 3.0, "沈括", "北宋科学家、政治家沈括所著", 30);
	public static Book book4 = new Book(4, 2004, "《孙子兵法》", 4.0, "孙武", "春秋末期孙武所著", 40);
	public static Book book5 = new Book(5, 2005, "《水经注》", 5.0, "郦道元", "北朝北魏郦道元所著", 50);
	public static Book book6 = new Book(6, 2006, "《世说新语》", 6.0, "刘义庆", "南朝宋刘义庆所著", 60);
	public static Book book7 = new Book(7, 2007, "《聊斋志异》", 7.0, "蒲松龄", "清朝小说家蒲松龄所作", 70);
	public static Book[] bookdata = {book1, book2, book3, book4, book5, book6, book7};

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		BookDaoImpl books = new BookDaoImpl();
		for (int i = 0; i < bookdata.length; i++) {
			books.add(bookdata[i]);
		}
		for (; ; ) {
			System.out.print("1.增加\n" + "2.删除\n" + "3.修改\n" + "4.查询一个\n" + "5.查询所有\n" + "6.关键字查询\n" + "0.退出\n" + "输入操作代码\n");
			int optioncode = input.nextInt();
			switch (optioncode) {
				case 1: {
					int id = 1;
					for (int i = 0; i < books.getBooklist().size(); i++) {
						if (books.getBooklist().get(i).getId() != id) {
							break;
						}
						id++;
					}
					int year, num;
					String name;
					double price;
					String author, info;
					System.out.println("请输入书名");
					name = input.next();
					System.out.println("请输入出版年份");
					year = input.nextInt();
					System.out.println("请输入作者");
					author = input.next();
					System.out.println("请输入书本简介");
					info = input.next();
					System.out.println("请输入书本价格-");
					price = input.nextDouble();
					System.out.println("请输入书本数量");
					num = input.nextInt();
					Book book = new Book(id, year, name, price, author, info, num);
					int returncode = books.add(book);
					if (returncode == 1) {
						System.out.println("添加成功");
					} else {
						System.out.println("添加失败");
					}
					break;
				}
				case 2: {
					System.out.println("输入想删除的书本id");
					int id = input.nextInt();
					int returncode = books.del(id);
					if (returncode == 1) {
						System.out.println("删除成功");
					} else {
						System.out.println("删除失败");
					}
					break;
				}
				case 3: {
					System.out.println("输入想修改的书本id");
					int id = input.nextInt();
					for (int i = 0; i < books.getBooklist().size(); i++) {
						if (books.getBooklist().get(i).getId() == id) {
							int year, num;
							String name;
							double price;
							String author, info;
							System.out.println("请新的输入书名");
							if (input.hasNext()) {
								name = input.next();
							} else {
								name = books.getBooklist().get(i).getName();
							}
							System.out.println("请新的输入出版年份");
							if (input.hasNextInt()) {
								year = input.nextInt();
							} else {
								year = books.getBooklist().get(i).getYear();
							}
							System.out.println("请新的输入作者");
							if (input.hasNext()) {
								author = input.next();
							} else {
								author = books.getBooklist().get(i).getAuthor();
							}
							System.out.println("请新的输入书本简介");
							if (input.hasNext()) {
								info = input.next();
							} else {
								info = books.getBooklist().get(i).getInfo();
							}
							System.out.println("请新的输入书本价格");
							if (input.hasNextDouble()) {
								price = input.nextDouble();
							} else {
								price = books.getBooklist().get(i).getPrice();
							}
							System.out.println("请新的输入书本数量(最后一项)");
							if (input.hasNextInt()) {
								num = input.nextInt();
							} else {
								num = books.getBooklist().get(i).getNum();
							}
							Book book = new Book(id, year, name, price, author, info, num);
							books.update(book);
							break;
						}
					}
					System.out.println("没有相应id的书");
					break;
				}
				case 4: {
					System.out.println("输入想查找的书本id");
					int id = input.nextInt();
					Book book = books.findOne(id);
					if (book != null) {
						System.out.println(book);
					} else {
						System.out.println("没有对应id的书");
					}
					break;
				}
				case 5: {
					if (books.getBooklist().size() > 0) {
						for (int i = 0; i < books.getBooklist().size(); i++) {
							System.out.println(books.getBooklist().get(i).toString());
						}
					} else {
						System.out.println("对象为空");
					}
					break;
				}
				case 6: {
					System.out.println("输入关键字");
					String keyword = input.next();
					List<Book> list = books.findByLike(keyword);
					if (list.size() > 0) {
						for (int i = 0; i < list.size(); i++) {
							System.out.println(list.get(i));
						}
					} else {
						System.out.println("对象为空");
					}
					break;
				}
				case 0: {
					System.exit(0);
					break;
				}
				default: {
					System.out.println("输入有误");
					break;
				}
			}
		}
	}
}
