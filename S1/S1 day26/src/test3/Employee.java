package test3;

import java.io.Serializable;
import java.util.Date;

public class Employee implements Serializable {
	private static final long serialVersionUID = 2906642554793891381L;
	String firstname;
	String lastname;
	String level;
	Integer salary;

	public Employee(String firstname, String lastname, String level, Integer salary) {
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
