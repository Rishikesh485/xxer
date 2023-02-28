package com.jsp.teacher.student.services;

import java.util.List;

import com.jsp.teacher.student.dao.TeacherDao;
import com.jsp.teacher.student.dto.Teacher;

public class TeacherServices {
	TeacherDao teacherDao = new TeacherDao();
	public void create(Teacher teacher) {
		teacherDao.create(teacher);
	}

	public void update(Teacher teacher) {
		teacherDao.update(teacher);
	}

	public void delete(int id) {
		teacherDao.delete(id);
	}

}
