package test3;

public abstract class Drink {
	public static Drink getDrink(int type) throws Exception {
		switch (type) {
			case 1: {
				return new Coffee();
			}
			case 2: {
				return new Bree();
			}
			case 3: {
				return new Milk();
			}
			default: {
				throw new DrinkNotFoundException();
			}
		}
	}

	public abstract void taste();
}
