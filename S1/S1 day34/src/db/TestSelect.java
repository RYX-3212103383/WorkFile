package db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class TestSelect {
	public static void main(String[] args) {
		TestSelect select = new TestSelect();
		String sql = "select * from goods";
		select.select(sql);
	}

	public ResultSet select(String sql) {
		Connection conn = new JDBCHelper().getConn();
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
/*			if (rs != null) {
				while (rs.next()) {
					for (int i = 1;; i++) {
						try {
							System.out.print(rs.getString(i) + "\t");
						} catch (Exception e) {
							System.out.println();
							break;
						}
					}
				}
			}*/
			return rs;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}

