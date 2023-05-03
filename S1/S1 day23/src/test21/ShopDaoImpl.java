package test21;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ShopDaoImpl extends Product implements ShopDao {
	static HashMap<Integer, Product> p1 = new HashMap<>();

	static {
		Product product1 = new Product(1, "《诗  经》", 1.0, 10);
		Product product2 = new Product(2, "《离  骚》", 2.0, 20);
		Product product3 = new Product(3, "《梦溪笔谈》", 3.0, 30);
		Product product4 = new Product(4, "《孙子兵法》", 4.0, 40);
		Product product5 = new Product(5, "《水经注》", 5.0, 50);
		Product product6 = new Product(6, "《世说新语》", 6.0, 60);
		Product product7 = new Product(7, "《聊斋志异》", 7.0, 70);
		p1.put(1,product1);
		p1.put(2,product2);
		p1.put(3,product3);
		p1.put(4,product4);
		p1.put(5,product5);
		p1.put(6,product6);
		p1.put(7,product7);
	}

	HashMap<Integer, Product> productHashMap = p1;

	@Override
	public Integer add(Product product) {
		try {
			Integer key;
			key = product.getId();
			productHashMap.put(key, product);
		} catch (Exception e) {
			return -1;
		}
		return 1;
	}

	@Override
	public HashMap<Integer, Product> query() {
		return productHashMap;
	}

	@Override
	public Integer update(ShopDaoImpl shop) {
		return null;
	}

	@Override
	public Double pay() {
		Double pay=0.0;
		if (productHashMap.size() == 0) {
			return -1.0;
		}
		try {
			Set<Map.Entry<Integer, Product>> entries = productHashMap.entrySet();
			for (Map.Entry<Integer, Product> entry : entries) {
				pay+=(entry.getValue().getPrice()*entry.getValue().getNum());
			}
		} catch (Exception e) {
			return -1.0;
		}
		return pay;
	}

	@Override
	public void end() {
		System.exit(1);
	}
}
