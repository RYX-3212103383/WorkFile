package test21;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
			ArrayList<Integer> list = new ArrayList<>();
			System.out.println("输入数字，非数字停止");
			for (; input.hasNextInt(); ) {
				list.add(list.size(), input.nextInt());
			}
			removeDuplicate(list);
			System.out.println(list);
	}

	private static void removeDuplicate(ArrayList<Integer> list) {
		for (int i = 0; i < list.size(); i++) {
			for (int j = i + 1; j < list.size(); j++) {
				if (list.get(i) == list.get(j)) {
					list.remove(j);
					j--;
				}
			}
		}
	}
}
