package test7;

import java.util.HashMap;

public class Main {
	public static void main(String[] args) {
		HashMap<Integer, Dog> hm = new HashMap<>();
		hm.put(1,new Dog("旺财",5));
		hm.put(2,new Dog("小黑",6));
		hm.put(3,new Dog("大壮",2));
		for (int i = 0; i < hm.size(); i++) {
			System.out.println(hm.get(i+1));
		}
	}
}
