package db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Testdelete {
	public void delete(String sql) {
		Connection conn = new JDBCHelper().getConn();
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			int i = pstmt.executeUpdate();
			System.out.println(i+"行被删除");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		Testdelete delete = new Testdelete();
		String sql="delete from goods where goodsId=25;";
		delete.delete(sql);
	}
}
