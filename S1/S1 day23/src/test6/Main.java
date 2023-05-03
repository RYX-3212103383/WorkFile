package test6;

import java.util.Hashtable;

public class Main {
	public static void main(String[] args) {
		Hashtable<Integer, String> ht = new Hashtable<>();
		ht.put(1, "aa");
		ht.put(2, "bb");
		ht.put(3, "cc");
		for (int i = 0; i < ht.size(); i++) {
			System.out.println(ht.get(i+1));
		}
	}
}
