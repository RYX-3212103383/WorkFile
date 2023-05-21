package dao.impl;

import dao.GoodsDao;
import db.JDBCHelper;
import entity.Goods;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class GoodsDaoImpl extends JDBCHelper implements GoodsDao {
	@Override
	public int add(Goods goods) {
		String sql = "INSERT INTO `goods` (`goodsId`, `name`, `barcode`, `price`, `number`, `positionId`, `kindId`) VALUES (?, ?, ?, ?, ?, ?, ?)";
		int i = super.update(sql, goods.getGoodsId(), goods.getName(), goods.getBarcode(), goods.getPrice(), goods.getNumber(), goods.getPositionId(), goods.getKindId());
		return i;
	}

	@Override
	public int delete(Integer id) {
		String sql = "delete from goods where goodsid=?";
		int i=super.update(sql, id);
		return i;
	}

	@Override
	public int update(Goods goods) {
		String sql = "UPDATE `goods` SET `name` = ?, `barcode` = ?, `price` = ?, `number` = ?, `positionId` = ?, `kindId` = ? WHERE `goodsId` = ?;";
		int i = super.update(sql, goods.getName(), goods.getBarcode(), goods.getPrice(), goods.getNumber(), goods.getPositionId(), goods.getKindId(), goods.getGoodsId());
		return i;
	}

	@Override
	public Goods select(Integer id) {
		String sql = "select * from goods where goodsid = ?";
		ResultSet rs = super.query(sql, id);
		try {
			while (rs.next()) {
				Goods temp = new Goods();
				temp.setGoodsId(rs.getInt("goodsId"));
				temp.setName(rs.getString("name"));
				temp.setBarcode(rs.getString("barcode"));
				temp.setPrice(rs.getDouble("price"));
				temp.setNumber(rs.getInt("number"));
				temp.setPositionId(rs.getInt("positionId"));
				temp.setKindId(rs.getInt("kindId"));
				return temp;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<Goods> selectAll() {
		String sql = "select * from goods";
		ResultSet rs = super.query(sql);
		List<Goods> goods=new ArrayList<>();
		try {
			while (rs.next()) {
				Goods temp = new Goods();
				temp.setGoodsId(rs.getInt("goodsId"));
				temp.setName(rs.getString("name"));
				temp.setBarcode(rs.getString("barcode"));
				temp.setPrice(rs.getDouble("price"));
				temp.setNumber(rs.getInt("number"));
				temp.setPositionId(rs.getInt("positionId"));
				temp.setKindId(rs.getInt("kindId"));
				goods.add(temp);
			}
			return goods;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
