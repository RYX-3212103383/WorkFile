package dao.impl;

import dao.StudentDao;
import db.DBHelper;
import entity.Student;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class StudentDaoImpl extends DBHelper implements StudentDao {
	@Override
	public List<Student> findAll() {
		List<Student> lists = null;
		//1.连
		conn = getConnection();
		//2.送
		String sql = "select * from student";
		try {
			pstmt = conn.prepareStatement(sql);
			//3.执行
			rs = pstmt.executeQuery();
			//4.查出来
			if (rs != null) {
				lists = new ArrayList<>();
				while (rs.next()) {
					//
					Student stu = new Student();
					stu.setId(rs.getInt("id"));
					stu.setName(rs.getString("name"));
					stu.setSex(rs.getString("sex"));
					stu.setBirth(rs.getString("birth"));
					stu.setDepartment(rs.getString("department"));
					stu.setAddress(rs.getString("address"));
					lists.add(stu);
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			closeAll(rs, pstmt, conn);
		}

		return lists;
	}

	@Override
	public Student findOne(Integer id) {
		conn = getConnection();

		try {
			String sql = "select * from student where id = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, id);
			rs = pstmt.executeQuery();
			if (rs != null) {
				while (rs.next()) {
					Student stu = new Student();
					stu.setId(rs.getInt("id"));
					stu.setName(rs.getString("name"));
					stu.setSex(rs.getString("sex"));
					stu.setBirth(rs.getString("birth"));
					stu.setDepartment(rs.getString("department"));
					stu.setAddress(rs.getString("address"));
					return stu;
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			closeAll(rs, pstmt, conn);
		}
		return null;
	}

	@Override
	public List<Student> findByLike(Student student) {
		List<Student> lists = null;
		//1.连
		conn = getConnection();
		try {
			//2.送  难点：拼字符串  StringBuffer
			//2.1查所有
			StringBuffer sql = new StringBuffer("select * from student where 1 = 1 ");
			//2.1其它的
			if (student != null) {
				//按姓名模糊查
				if (student.getName() != null && !"".equals(student.getName())) {
					//双引号+变量+双引号
					sql.append("and name like '%" + student.getName() + "%'");
				}
				//按性别精确查
				if (student.getSex() != null && !"".equals(student.getSex())) {
					sql.append("and sex = '" + student.getSex() + "'");
				}
				//按系精确查
				if (student.getDepartment() != null && !"".equals(student.getDepartment())) {

					sql.append("and department = '" + student.getDepartment() + "'");
				}
				//按地址模糊查
				if (student.getAddress() != null && !"".equals(student.getAddress())) {
					sql.append("and address like '%" + student.getAddress() + "%'");
				}
			}

			pstmt = conn.prepareStatement(sql.toString());

			System.out.println(pstmt);//就可以看到控制台拼好的sql语句
			//3.执行
			rs = pstmt.executeQuery();
			//4.查出来
			if (rs != null) {
				lists = new ArrayList<>();//创建集合，用来装学生的
				while (rs.next()) {
					//
					Student stu = new Student();
					stu.setId(rs.getInt("id"));
					stu.setName(rs.getString("name"));
					stu.setSex(rs.getString("sex"));
					stu.setBirth(rs.getString("birth"));
					stu.setDepartment(rs.getString("department"));
					stu.setAddress(rs.getString("address"));
					lists.add(stu);
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			closeAll(rs, pstmt, conn);
		}

		return lists;
	}

	@Override
	public int add(Student student) {
		//1.连
		conn = getConnection();
		//2.送

		try {
			String sql = "insert into student(name,sex,birth,department,address) values (?,?,?,?,?)";
			pstmt = conn.prepareStatement(sql);
			//为问号全部赋值
			pstmt.setString(1, student.getName());
			pstmt.setString(2, student.getSex());
			pstmt.setString(3, student.getBirth());
			pstmt.setString(4, student.getDepartment());
			pstmt.setString(5, student.getAddress());
			//3.执行
			int i = pstmt.executeUpdate();
			return i;
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			closeAll(null, pstmt, conn);
		}
		return 0;
	}

	@Override
	public int delete(Integer id) {
		//1.连
		conn = getConnection();
		//2.送
		String sql = "delete from student where id = ?";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, id);
			//3.执行
			int i = pstmt.executeUpdate();
			return i;
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			closeAll(null, pstmt, conn);
		}
		return 0;
	}

	@Override
	public int update(Student student) {
		conn = getConnection();
		try {
			String sql = "update student set name=?,sex=?,birth=?,department=?,address=? where id=?";
			pstmt = conn.prepareStatement(sql);
			//为问号赋值
			pstmt.setString(1, student.getName());
			pstmt.setString(2, student.getSex());
			pstmt.setString(3, student.getBirth());
			pstmt.setString(4, student.getDepartment());
			pstmt.setString(5, student.getAddress());
			pstmt.setInt(6, student.getId());
			//执行
			int i = pstmt.executeUpdate();
			return i;
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			closeAll(null, pstmt, conn);
		}
		return 0;
	}
}
