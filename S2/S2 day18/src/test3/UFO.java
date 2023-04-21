package test3;

public class UFO implements PlaneDao {
	@Override
	public void Fly() {
		System.out.println("UFO起飞了");
	}

	@Override
	public void Land() {
		System.out.println("UFO降落了");
	}
}
