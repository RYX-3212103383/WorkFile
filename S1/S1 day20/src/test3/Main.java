package test3;

public class Main {
	public static void main(String[] args) {
		String  employees[] = {"张新刘","肖战","刘青云","刘易斯","张学友","易烊千玺","王源","胡歌","刘禹锡","迪丽热巴","刘德华"};
		for (int i = 0; i < employees.length; i++) {
			if(employees[i].startsWith("刘")){
				System.out.println(employees[i]);
			}
		}
	}
}
