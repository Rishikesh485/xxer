package com.jsp.teacher.student.dao;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.teacher.student.dto.Teacher;


public class TeacherDao {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("sahil");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();

	public void create(Teacher teacher) {
		entityTransaction.begin();
		entityManager.persist(teacher);
		entityTransaction.commit();
	}

	public void update(Teacher teacher) {
		Teacher teacher2 = entityManager.find(Teacher.class, teacher.getId());
		if (teacher2 != null) {
			entityTransaction.begin();
			if (teacher.getName() != null) {
				teacher2.setName(teacher.getName());
			}
			if (teacher.getEmail() != null) {
				teacher2.setEmail(teacher.getEmail());
			}
			if (teacher.getSubject() != null) {
				teacher2.setSubject(teacher.getSubject());
			}
			if (teacher.getPassword() != null) {
				teacher2.setPassword(teacher.getPassword());
			}
			
			entityManager.merge(teacher2);
			entityTransaction.commit();
		}
	}

	public void delete(int id) {
		Teacher teacher = entityManager.find(Teacher.class, id);
		if (teacher != null) {
			entityTransaction.begin();
			entityManager.remove(teacher);
			entityTransaction.commit();
		}
	}




}
