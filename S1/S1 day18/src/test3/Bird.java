package test3;

public class Bird implements PlaneDao {
	@Override
	public void Fly() {
		System.out.println("Bird起飞了");
	}

	@Override
	public void Land() {
		System.out.println("Bird降落了");
	}
}
