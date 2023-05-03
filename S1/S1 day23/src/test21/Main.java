package test21;

import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ShopDaoImpl product = new ShopDaoImpl();
		for (; ; ) {
			System.out.print("=====================\n" +
					"请您选择如下命令进行操作:\n" +
					"添加商品到购物车add\n" +
					"查看购物车商品query\n" +
					"修改购物车商品数量update\n" +
					"结算购物车商品金额pay\n" +
					"结束程序end\n" +
					"=====================\n" +
					"请输入您的命令:\n");
			String operacode = input.next();
			if ("add".equals(operacode)) {
				int id = 1;
				for (; ; id++) {
					if (!product.query().containsKey(id)) {
						break;
					}
				}
				int num;
				String name;
				double price;
				System.out.println("请输入商品名");
				name = input.next();
				System.out.println("请输入商品价格");
				price = input.nextDouble();
				System.out.println("请输入商品数量");
				num = input.nextInt();
				Product pro = new Product(id, name, price, num);
				int returncode = product.add(pro);
				if (returncode == 1) {
					System.out.println("添加成功");
				} else {
					System.out.println("添加失败");
				}
			} else if ("query".equals(operacode)) {
				listproduct(product);
			} else if ("update".equals(operacode)) {
				System.out.println("输入要修改的商品id");
				int id = input.nextInt();
					if (!product.query().containsKey(id)) {
						System.out.println("没有对应商品id");
						break;
					}
				int num;
				String name;
				double price;
				System.out.println("请输入新的商品名");
				name = input.next();
				System.out.println("请输入新的商品价格");
				price = input.nextDouble();
				System.out.println("请输入新的商品数量");
				num = input.nextInt();
				Product pro = new Product(id, name, price, num);
				int returncode = product.add(pro);
				if (returncode == 1) {
					System.out.println("添加成功");
				} else {
					System.out.println("添加失败");
				}
				//product.update();
			} else if ("pay".equals(operacode)) {
				listproduct(product);
				Double pay = product.pay();
				System.out.println("总价为" + pay);
			} else if ("end".equals(operacode)) {
				System.out.println("系统退出");
				product.end();
			} else {
				System.out.println("输入有误,重新选择");
			}
		}
	}

	private static void listproduct(ShopDaoImpl product) {
		System.out.println("======================查看商品信息======================");
		System.out.println("商品id\t\t商品名称\t\t\t\t商品价格\t\t商品数量");
		Set<Map.Entry<Integer, Product>> entries = product.query().entrySet();
		for (Map.Entry<Integer, Product> entry : entries) {
			System.out.println(entry.getValue());
		}
		System.out.println("======================================================");
	}
}
