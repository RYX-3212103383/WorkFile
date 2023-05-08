package test3;

import java.io.Serializable;
import java.util.Date;

public class Employee implements Serializable {
	private static final long serialVersionUID = 2906642554793891381L;
	String firstname;
	String lastname;
	String level;
	Double salary;

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getLevel() {
		return level;
	}

	public void setLevel(String level) {
		this.level = level;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public Employee(String firstname, String lastname, String level, Double salary) {
		this.firstname = firstname;
		this.lastname = lastname;
		this.level = level;
		this.salary = salary;
	}


	public Employee() {
	}

	@Override
	public String toString() {
		return firstname + '\\'+lastname +'\\'+ level+'\\' +salary+"\n";
	}
}
