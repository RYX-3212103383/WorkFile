package test21;

import java.util.HashMap;

public interface ShopDao {
	Integer add(Product product);

	HashMap<Integer, Product> query();

	Integer update(ShopDaoImpl shop);

	Double pay();

	void end();
}
