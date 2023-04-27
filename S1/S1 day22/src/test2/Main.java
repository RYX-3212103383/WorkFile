package test2;

import java.util.LinkedList;
import java.util.List;

public class Main {
	public static void print(List list) {
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + "\t");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<>();
		list.add("《水浒传》");
		list.add("《三国演义》");
		list.add("《西游记》");
		print(list);
		list.addFirst("《红楼梦》");
		list.addLast("《小王子》");
		print(list);
		list.set(list.indexOf("《小王子》"),"《追风筝的人》");
		list.remove("《追风筝的人》");
		print(list);
	}
}
