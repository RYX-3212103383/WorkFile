package test21;

public class Student {
	private String GRADE_1;
	private String GRADE_2;
	private String GRADE_3;
	private String GRADE_4;
	private String grade;

	public Student(String GRADE_1, String GRADE_2, String GRADE_3, String GRADE_4, String grade) {
		this.GRADE_1 = GRADE_1;
		this.GRADE_2 = GRADE_2;
		this.GRADE_3 = GRADE_3;
		this.GRADE_4 = GRADE_4;
		this.grade = grade;
	}

	@Override
	public String toString() {
		return "Student{" +
				"GRADE_1='" + GRADE_1 + '\'' +
				", GRADE_2='" + GRADE_2 + '\'' +
				", GRADE_3='" + GRADE_3 + '\'' +
				", GRADE_4='" + GRADE_4 + '\'' +
				", grade='" + grade + '\'' +
				'}';
	}
}
