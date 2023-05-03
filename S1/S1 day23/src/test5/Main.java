package test5;

import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		Hashtable<Integer,Book> ht=new Hashtable<>();
		ht.put(1,new Book("张三自传",99.0,"张三"));
		ht.put(2,new Book("李四自传",56.0,"李四"));
		ht.put(3,new Book("王五自传",52.0,"王五"));
		print(ht);
		System.out.println("id为1的书");
		System.out.println(ht.get(1));;
		System.out.println("删除id为1的书");
		ht.remove(1);
		print(ht);
	}

	private static void print(Hashtable<Integer, Book> map) {
		Set<Map.Entry<Integer, Book>> entries = map.entrySet();
		for (Map.Entry<Integer, Book> entry : entries) {
			System.out.println("id:"+entry.getKey() + "\t" + entry.getValue());
		}
	}
}
