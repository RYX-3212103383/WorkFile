package test3;

import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		Hashtable<String, String> ht = new Hashtable();
		ht.put("孙莉", "黄磊");
		ht.put("邓超", "孙俪");
		ht.put("郭靖", "黄蓉");
		print(ht);
		Set<Map.Entry<String, String>> entries = ht.entrySet();
		print(ht);
		for (Map.Entry<String, String> entry : entries) {
			System.out.println(entry.getValue());
		}
		System.out.print("邓超媳妇:");
		System.out.println(ht.get("邓超"));
		System.out.println("移除郭靖");
		ht.remove("移除");
		print(ht);
		System.out.println("元素个数");
		System.out.println(ht.size());
		System.out.println("清空");
		ht.clear();
		print(ht);
	}

	private static void print(Hashtable<String, String> map) {
		Set<Map.Entry<String, String>> entries = map.entrySet();
		for (Map.Entry<String, String> entry : entries) {
			System.out.println(entry.getKey() + "---" + entry.getValue());
		}
	}

}
