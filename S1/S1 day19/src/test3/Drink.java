package test3;

public abstract class Drink {
	public static final int COFFEE=1;
	public static final int BEER=2;
	public static final int MILK=3;
	public static Drink getDrink(int type) throws Exception {
		switch (type) {
			case COFFEE: {
				return new Coffee();
			}
			case BEER: {
				return new Bree();
			}
			case MILK: {
				return new Milk();
			}
			default: {
				throw new DrinkNotFoundException();
			}
		}
	}

	public abstract void taste();
}
