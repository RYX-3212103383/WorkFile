package test1;

import java.io.Serializable;
import java.util.Date;

class Student implements Serializable {
	private static final long serialVersionUID = 2906642554793891381L;
	Integer id;
	String name;
	Double weight;
	Date bith;

	public Student(Integer id, String name, Double weight, Date bith) {
		this.id = id;
		this.name = name;
		this.weight = weight;
		this.bith = bith;
	}

	public Student() {
	}

	@Override
	public String toString() {
		return "Student{" +
				"id=" + id +
				", name='" + name + '\'' +
				", weight=" + weight +
				", bith=" + bith +
				'}';
	}
}
