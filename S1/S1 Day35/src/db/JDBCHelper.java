package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class JDBCHelper {
	private String userName = "root";
	private String passWord = "111111";
	private String driver = "com.mysql.cj.jdbc.Driver";
	private String url = "jdbc:mysql://127.0.0.1:3306/java107?serverTimezone=UTC";

	public Connection getConn() {
		try {
			Class.forName(driver);
			Connection conn = DriverManager.getConnection(url, userName, passWord);
			return conn;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	public void closeAll(ResultSet rs, PreparedStatement pstmt, Connection conn) {
		try {
			if (rs != null) {
				rs.close();
				rs = null;
			}
			if (pstmt != null) {
				pstmt.close();
				pstmt = null;
			}
			if (conn != null) {
				conn.close();
				conn = null;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public ResultSet query(String sql, Object... args) {
		Connection conn = getConn();
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			if (args != null && args.length > 0) {
				for (int i = 0; i < args.length; i++) {
					pstmt.setObject(i + 1, args[i]);
				}
			}
			ResultSet rs = pstmt.executeQuery();
			return rs;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	public int update(String sql, Object... args) {
		Connection conn = getConn();
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			for (int i = 0; i < args.length; i++) {
				pstmt.setObject(i + 1, args[i]);
			}
			int i = pstmt.executeUpdate();
			return i;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return -1000;
	}
}
