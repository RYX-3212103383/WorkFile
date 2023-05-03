package test21;

public class Product {
Integer id;
String name;
Double price;
Integer num;

	public Product(Integer id, String name, Double price, Integer num) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.num = num;
	}

	public Product() {
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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

	public Integer getNum() {
		return num;
	}

	public void setNum(Integer num) {
		this.num = num;
	}

	@Override
	public String toString() {
		return id +
				"\t\t\t" + name +
				"\t\t\t" + price +
				"\t\t\t" + num;
	}
}
