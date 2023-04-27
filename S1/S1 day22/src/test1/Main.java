package test1;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void print(List list) {
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + "\t");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("《射雕英雄传》");
		list.add("《笑傲江湖》");
		list.add("《倚天屠龙记》");
		print(list);
		list.remove(2);
		list.add("《天龙八部》");
		list.set(list.indexOf("《笑傲江湖》"), "《笑傲江湖2》");
		print(list);
	}

}
