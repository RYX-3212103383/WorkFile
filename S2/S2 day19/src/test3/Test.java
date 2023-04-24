package test3;

import static test3.Drink.getDrink;

public class Test {
	public static void main(String[] args) {
		try {
			Drink drink1 = getDrink(1);
			drink1.taste();
			Drink drink2 = getDrink(2);
			drink2.taste();
			Drink drink3 = getDrink(3);
			drink3.taste();
			Drink drink4 = getDrink(4);
			drink4.taste();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
