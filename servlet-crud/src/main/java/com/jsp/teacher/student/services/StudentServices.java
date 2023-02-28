package com.jsp.teacher.student.services;

import com.jsp.teacher.student.dao.StudentDao;
import com.jsp.teacher.student.dto.Student;

public class StudentServices {
	StudentDao studentDao = new StudentDao();
	public void create(Student student) {
		studentDao.create(student);
	}

	public void update(Student student) {
		studentDao.update(student);
	}

	public void delete(int id) {
		studentDao.delete(id);
	}


}
