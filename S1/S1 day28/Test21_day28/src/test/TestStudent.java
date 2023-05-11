package test;

import entity.Student;
import service.StudentService;
import service.impl.StudentServiceImpl;
import org.junit.Before;
import org.junit.Test;

import java.util.List;
public class TestStudent {
	//调服务层
	private StudentService service;

	@Before
	public void init() {
		service = new StudentServiceImpl();//要在before创建，这注意
	}

	//1.查所有 不用写main方法
	@Test
	public void findAll() {
		List<Student> lists = service.findAll();
		for (Student student : lists) {
			System.out.println(student);
		}
	}

	@Test
	public void findOne() {
		Student student = service.findOne(910);
		System.out.println(student);
	}

	@Test
	public void findByLike() {
		Student stu = new Student();
		//stu.setName("王");
		// stu.setSex("男");
		//stu.setAddress("长沙");
		stu.setDepartment("计算机系");
		List<Student> lists = service.findByLike(stu);
		for (Student list : lists) {
			System.out.println(list);
		}
	}

	@Test
	public void add() {
		Student stu = new Student();
		stu.setName("嫦娥");
		stu.setSex("女");
		stu.setAddress("天上");
		stu.setDepartment("神仙");
		stu.setBirth(2000 + "");

		boolean flag = service.add(stu);
		if (flag) {
			System.out.println("添加成功");
		} else {
			System.out.println("添加失败");
		}
	}

	@Test
	public void delete() {
		boolean flag = service.delete(911);
		if (flag) {
			System.out.println("删除成功");
		} else {
			System.out.println("删除失败");
		}
	}

	@Test
	public void update() {
		//1.先查单个
		Student changer = service.findOne(912);
		System.out.println(changer);
		//只改部门
		changer.setDepartment("月宫");
		//处理日期
		changer.setBirth(changer.getBirth().substring(0, 4));
		boolean flag = service.update(changer);
		if (flag) {
			System.out.println("修改成功");
		} else {
			System.out.println("修改失败");
		}

	}
}