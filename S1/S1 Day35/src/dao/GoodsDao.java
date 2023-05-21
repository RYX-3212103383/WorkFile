package dao;

import entity.Goods;

import java.util.List;

public interface GoodsDao {
	int add(Goods goods);

	int delete(Integer id);

	int update(Goods goods);

	Goods select(Integer id);

	List<Goods> selectAll();
}
