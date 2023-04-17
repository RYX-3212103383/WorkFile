package BookManeger;

/**
 * @author RYX
 */
public class Book {
	int id;
	String name;
	String author;
	double price;
	int num;

	public Book createBook(int id, String name, String author, double price, int num) {
		Book book=new Book();
		this.id = id;
		this.name = name;
		this.author = author;
		this.price = price;
		this.num = num;
		return book;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

}
