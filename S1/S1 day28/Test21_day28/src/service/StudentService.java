package service;

import entity.Student;

import java.util.List;

public interface StudentService {
	public List<Student> findAll();
	public Student findOne(Integer id);
	public List<Student> findByLike(Student student);
	public boolean add(Student student);
	public boolean delete(Integer id);
	public boolean update(Student student);
}
