package test2;

public class Main {
	public static void main(String[] args) {
		String images[] ={"小猫jpg猫.png","小花jpg花.jpg","小不点.png","小jpg乖乖.bmp","鼠标.jpg","键盘.jpg","白月光.mp3"};
		for (int i = 0; i < images.length; i++) {
			if(images[i].endsWith(".jpg")){
				System.out.println(images[i]);
			}
		}
	}
}
