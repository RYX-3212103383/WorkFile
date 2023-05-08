package test2;

import java.io.Serializable;

class Computer implements Serializable {
	private static final long serialVersionUID = 2906642554793891381L;
	Integer id;
	String brand;
	String cup;
	Double price;
	String ram;
	String storage;
	String gpu;

	public Computer(Integer id, String brand, String cup, Double price, String ram, String storage, String gpu) {
		this.id = id;
		this.brand = brand;
		this.cup = cup;
		this.price = price;
		this.ram = ram;
		this.storage = storage;
		this.gpu = gpu;
	}

	public Computer() {
	}

	@Override
	public String toString() {
		return "Computer{" +
				"id=" + id +
				", brand='" + brand + '\'' +
				", cup='" + cup + '\'' +
				", price=" + price +
				", ram='" + ram + '\'' +
				", storage='" + storage + '\'' +
				", gpu='" + gpu + '\'' +
				'}';
	}
}
