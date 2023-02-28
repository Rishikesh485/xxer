package com.jsp.teacher.student.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsp.teacher.student.dto.Teacher;
import com.jsp.teacher.student.services.TeacherServices;

import antlr.debug.NewLineEvent;

@WebServlet("/registerTeacher")
public class InsertTeacher extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name = req.getParameter("name");
		String email = req.getParameter("emaild");
		String password = req.getParameter("password");
		String subject = req.getParameter("name1");
		
		
		TeacherServices teacherServices = new TeacherServices();
		Teacher teacher = new Teacher();
		teacher.setName(name);
		teacher.setEmail(email);
		teacher.setPassword(password);
		teacher.setSubject(subject);
		teacherServices.create(teacher);
		
		RequestDispatcher requestDispatcher = req.getRequestDispatcher("School.html");
		requestDispatcher.forward(req, resp);
	
	}

}
