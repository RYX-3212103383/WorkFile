/**
 * @author RYX
 */
public class Book {
	private int id;
	private String author;
	private double price;
	private int num;
	private int pages;

	public void show(Book book) {
		System.out.println("id:" + getId());
		System.out.println("作者:" + getAuthor());
		System.out.println("价格:" + getPrice());
		System.out.println("数量:" + getNum());
		System.out.println("页数:" + getPages());
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}

}
