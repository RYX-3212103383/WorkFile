package test22;

public class Test {
	public static void main(String[] args) {
		Cat cat=new Cat("猫咪",true,true,4);
		cat.moodreply();
		cat.setCarnivorous(true);
		cat.setMammals(true);
		cat.isCarn();
		cat.isMam();
		System.out.println("-----------");
		Dog dog=new Dog("狗子",true,true,4);
		dog.moodreply();
		dog.setCarnivorous(true);
		dog.setMammals(true);
		dog.isCarn();
		dog.isMam();
		System.out.println("-----------");
		Frog frog=new Frog("呱呱",true,true,4);
		frog.moodreply();
		frog.gills();
		frog.hasLaysEggs();
		frog.eggs();
		frog.setCarnivorous(true);
		frog.setMammals(false);
		frog.isCarn();
		frog.isMam();
	}
}
