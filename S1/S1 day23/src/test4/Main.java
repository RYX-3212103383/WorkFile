package test4;

import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		Hashtable<String, String> ht = new Hashtable();
		ht.put("长沙", "0731");
		ht.put("娄底", "0738");
		ht.put("永州", "0746");
		print(ht);
	}

	private static void print(Hashtable<String, String> map) {
		Set<Map.Entry<String, String>> entries = map.entrySet();
		for (Map.Entry<String, String> entry : entries) {
			System.out.println(entry.getValue() + "---" + entry.getKey());
		}
	}
}
