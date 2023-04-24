package test3;

import static test3.Drink.*;

public class Test {
	public static void main(String[] args) {
		try {
			Drink drink = getDrink(COFFEE);
			drink.taste();
			drink = getDrink(BEER);
			drink.taste();
			drink = getDrink(MILK);
			drink.taste();
			drink = getDrink(4);
			drink.taste();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
