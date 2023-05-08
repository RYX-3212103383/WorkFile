package test1;

public class Book {
	private String name;
	private Double price;
	private String author;

	public Book() {
	}

	public Book(String name, Double price, String author) {
		this.name = name;
		this.price = price;
		this.author = author;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	@Override
	public String toString() {
		return "书名:" + name +
				"\t价格:" + price +
				"\t作者:" + author+"\n";
	}
}
