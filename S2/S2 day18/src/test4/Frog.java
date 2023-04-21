package test4;

public class Frog implements LandLivingDao,WaterLivingDao{
	@Override
	public void run() {
		System.out.println("我可以跑，因为我是陆生生物");
	}

	@Override
	public void swim() {
		System.out.println("我可以游，因为我是水生生物");
	}
}
