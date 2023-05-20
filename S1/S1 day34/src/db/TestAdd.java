package db;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class TestAdd {
	public void add(String sql){
		Connection conn=new JDBCHelper().getConn();
		try{
			PreparedStatement pstmt=conn.prepareStatement(sql);
			int i=pstmt.executeUpdate();
			System.out.println(i+"行被添加");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		TestAdd add=new TestAdd();
		String sql="INSERT INTO `goods` (`goodsId`, `name`, `barcode`, `price`, `number`, `positionId`, `kindId`) VALUES (25, '火鸡面', '6904682303603', 8.50, 98, 1, 1);";
		add.add(sql);
	}
}
