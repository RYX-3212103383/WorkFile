package dao;

import entity.Student;

import java.util.List;

public interface StudentDao {

	public List<Student> findAll();

	public Student findOne(Integer id);

	public List<Student> findByLike(Student student);

	public int add(Student student);

	public int delete(Integer id);

	public int update(Student student);
}
