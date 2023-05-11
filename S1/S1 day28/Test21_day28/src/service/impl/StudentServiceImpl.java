package service.impl;

import dao.StudentDao;
import dao.impl.StudentDaoImpl;
import entity.Student;
import service.StudentService;

import java.util.List;

public class StudentServiceImpl implements StudentService {
	//调dao层
	StudentDao studentDao = new StudentDaoImpl();

	@Override
	public List<Student> findAll() {
		return studentDao.findAll();
	}

	@Override
	public Student findOne(Integer id) {
		return studentDao.findOne(id);
	}

	@Override
	public List<Student> findByLike(Student student) {
		return studentDao.findByLike(student);
	}

	@Override
	public boolean add(Student student) {
		return studentDao.add(student) > 0 ? true : false;
	}

	@Override
	public boolean delete(Integer id) {
		return studentDao.delete(id) > 0 ? true : false;
	}

	@Override
	public boolean update(Student student) {
		return studentDao.update(student) > 0 ? true : false;
	}
}