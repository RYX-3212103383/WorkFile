package test1;

public class Main {
	public static void main(String[] args) {
		String names[] = {"李白","杜甫","白居易","王维","杜牧","李商隐","孟浩然","刘禹锡","贺知章"};
		for (int i = 0; i < names.length; i++) {
			if(names[i].contains("白")||names[i].contains("浩")||names[i].contains("牧"))
				System.out.println(names[i]);
		}
	}
}
