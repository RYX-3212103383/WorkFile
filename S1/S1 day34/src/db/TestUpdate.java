package db;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class TestUpdate {
	public void update(String sql) {
		Connection conn=new JDBCHelper().getConn();
		try{
			PreparedStatement pstmt=conn.prepareStatement(sql);
			int i=pstmt.executeUpdate();
			System.out.println(i+"行被影响");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		TestUpdate update = new TestUpdate();
		String sql="UPDATE `goods` SET `name` = '闲555趣', `barcode` = '6904962300203', `price` = 9.50, `number` = 78, `positionId` = 1, `kindId` = 1 WHERE `goodsId` = 25;";
		update.update(sql);
	}
}
