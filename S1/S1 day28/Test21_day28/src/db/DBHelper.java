package db;

import java.sql.*;

public class DBHelper {
	protected static Connection conn;
	protected PreparedStatement pstmt;
	protected ResultSet rs;
	//
	private static final String URL = "jdbc:mysql://localhost:3306/java95?useUnicode=true&characterEncoding=utf-8&useSSL=false";
	private static final String USER_NAME = "root";
	private static final String PASSWORD = "123456";

	public static Connection getConnection() {

		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(URL, USER_NAME, PASSWORD);
			System.out.println("连接数据成功");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}

	public static void closeAll(ResultSet rs, PreparedStatement pstmt, Connection conn) {
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
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		getConnection();
	}
}