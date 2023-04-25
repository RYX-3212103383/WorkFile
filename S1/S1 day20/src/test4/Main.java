package test4;

public class Main {
	public static void main(String[] args) {
		String  actor[] = {"张新成","肖战","古力娜扎","刘禹锡","斯琴高娃","易烊千玺","古川雄厚","胡歌","刘少云","迪丽热巴","刘德华"};
		for (int i = 0; i < actor.length; i++) {
			if(actor[i].length()==4){
				System.out.println(actor[i]);
			}
		}
	}
}
