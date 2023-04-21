package test22;

public class Test {
	public static void main(String[] args) {
		Cat cat=new Cat("猫咪",true,true,4);
		cat.moodreply();
		System.out.println("-----------");
		Dog dog=new Dog("狗子",true,true,4);
		dog.moodreply();
		System.out.println("-----------");
		Frog frog=new Frog("呱呱",true,true,4);
		frog.moodreply();
		frog.gills();
		frog.hasLaysEggs();
		frog.eggs();
	}
}
