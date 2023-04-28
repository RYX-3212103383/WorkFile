package test21;

public class Book {
	private Integer id;
	private Integer year;
	private String name;
	private Double price;
	private String author;
	private String info;
	private Integer num;

	public Book() {
	}

	public Book(int id, int year, String name, double price, String author, String info, int num) {
		this.id = id;
		this.year = year;
		this.name = name;
		this.price = price;
		this.author = author;
		this.info = info;
		this.num = num;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	@Override
	public String toString() {
		return "Book{" +
				"id=" + id +
				", year=" + year +
				", name='" + name + '\'' +
				", price=" + price +
				", author='" + author + '\'' +
				", info='" + info + '\'' +
				", num=" + num +
				'}';
	}
}
