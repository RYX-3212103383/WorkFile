package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

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
		} catch (ClassNotFoundException e) {
			System.out.println("驱动加载失败,无驱动包或driver错误");
		} catch (SQLException e) {
			System.out.println("数据库连接失败,检查url,username,password");
		}
		return null;
	}
}
