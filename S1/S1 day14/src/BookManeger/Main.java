package BookManeger;

import java.util.Scanner;

/**
 * @author RYX
 */
public class Main {
	Scanner input = new Scanner(System.in);
	//Book book=new Book();
	Book[] books = new Book[1000];
	Book book = new Book();

	public static void main(String[] args) {
		Main obj2 = new Main();
		obj2.menu();
	}

	void adddefault() {
		books[0] = new Book();
		books[0].setId(1);
		books[0].setName("张三自传");
		books[0].setAuthor("张三");
		books[0].setPrice(9.66);
		books[0].setNum(21);
		books[1] = new Book();
		books[1].setId(2);
		books[1].setName("李四自传");
		books[1].setAuthor("李四");
		books[1].setPrice(5.99);
		books[1].setNum(234);
		books[2] = new Book();
		books[2].setId(3);
		books[2].setName("王五自传");
		books[2].setAuthor("王五");
		books[2].setPrice(8.68);
		books[2].setNum(10);
	}

	private void menu() {
		adddefault();
		for (; ; ) {
			System.out.print("欢迎使用图书管理系统!\n" +
					"1.添加图书\n" +
					"2.删除图书\n" +
					"3.修改图书\n" +
					"4.查找图书\n" +
					"5.退出系统\n" +
					"请选择操作:");
			int nextInt = input.nextInt();
			switch (nextInt) {
				case 1: {
					addBook();
					break;
				}
				case 2: {
					deletdBook();
					break;
				}
				case 3: {
					updateBook();
					break;
				}
				case 4: {
					selectBook();
					break;
				}
				case 5: {
					System.exit(-1);
					break;
				}
			}
		}
	}

	private void addBook() {
		int index = -1;
		for (int i = 0; i < books.length; i++) {
			if (books[i] == null) {
				index = i;
				break;
			}
		}
		//System.out.print("请输入书本ID:");
		int id = index + 1;
		System.out.print("请输入书本名称:");
		String name = input.next();
		System.out.print("请输入书本作者:");
		String author = input.next();
		System.out.print("请输入书本价格:");
		double price = input.nextDouble();
		System.out.print("请输入书本数量:");
		int num = input.nextInt();
		books[index] = new Book();
		books[index].setId(id);
		books[index].setName(name);
		books[index].setAuthor(author);
		books[index].setPrice(price);
		books[index].setNum(num);
	}

	private void deletdBook() {
		printBooks(books);
		System.out.println("===============\n输入删除的书本ID");
		int id = input.nextInt();
		for (int i = 0; i < books.length; i++) {
			if (books[i] == null) {
				continue;
			} else if (books[i].getId() == id) {
				books[i] = null;
			}
		}
	}

	private void updateBook() {
		printBooks(books);
		System.out.println("===============\n输入修改的书本ID");
		int id = input.nextInt();
		for (int i = 0; i < books.length; i++) {
			if (books[i] == null) {
				continue;
			} else if (books[i].getId() == id) {
				System.out.print("请输入修改后的书本名称:");
				String name = input.next();
				System.out.print("请输入修改后的书本作者:");
				String author = input.next();
				System.out.print("请输入修改后的书本价格:");
				double price = input.nextDouble();
				System.out.print("请输入修改后的书本数量:");
				int num = input.nextInt();
				books[i].setName(name);
				books[i].setAuthor(author);
				books[i].setPrice(price);
				books[i].setNum(num);
			}
		}
	}

	private void selectBook() {
		printBooks(books);
		System.out.println("===============\n输入查找的书本ID");
		int id = input.nextInt();
		for (int i = 0; i < books.length; i++) {
			if (books[i] == null) {
				continue;
			} else if (books[i].getId() == id) {
				printone(books[i]);
			}
		}
	}

	public void printBooks(Book[] book) {
		System.out.println("ID\t\t书名\t\t\t作者\t\t价格\t\t数量");
		for (int i = 0; i < books.length; i++) {
			if (books[i] == null) {
				continue;
			} else {
				System.out.print(books[i].getId() + "\t\t" + books[i].getName() + "\t\t" + books[i].getAuthor() + "\t\t" + books[i].getPrice() + "\t" + books[i].getNum() + "\n");
			}
		}
	}

	public void printone(Book book) {
		System.out.println("ID\t\t书名\t\t\t作者\t\t价格\t\t数量");
		System.out.print(book.getId() + "\t\t" + book.getName() + "\t\t" + book.getAuthor() + "\t\t" + book.getPrice() + "\t" + book.getNum() + "\n");
	}
}
