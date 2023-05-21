package dao.impl;

import entity.Goods;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class GoodsDaoImplTest extends GoodsDaoImpl {
	Goods good = new Goods();
	Goods good2 = new Goods();

	{
		good.setGoodsId(25);
		good.setName("商品25");
		good.setBarcode("6901209887081");
		good.setPrice(60.3);
		good.setNumber(20);
		good.setPositionId(6);
		good.setKindId(4);
	}

	{
		good2.setGoodsId(25);
		good2.setName("商品30");
		good2.setBarcode("6901209288081");
		good2.setPrice(6.3);
		good2.setNumber(210);
		good2.setPositionId(6);
		good2.setKindId(3);
	}

	@Test
	public void testAdd() {
		int i = super.add(good);
		Assert.assertEquals(1, i);
		System.out.println(i);
	}


	@Test
	public void testUpdate() {
		super.update(good2);
	}

	@Test
	public void testSelect() {
		Goods good = super.select(25);
		System.out.println(good);
	}

	@Test
	public void testDelete() {
		int i = super.delete(25);
		System.out.println(i);
		Assert.assertEquals(1, i);
	}

	@Test
	public void testSelectAll() {
		List<Goods> goods = super.selectAll();
		System.out.println(goods);
	}
}