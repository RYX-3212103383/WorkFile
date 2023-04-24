package test3;

public class TestPlane {
	public static void main(String[] args) {
		PlaneDao bird = new Bird();
		UFO UFO = new UFO();
		Person person = new Person();
		person.driver(bird);
		person.driver(UFO);
	}

}
