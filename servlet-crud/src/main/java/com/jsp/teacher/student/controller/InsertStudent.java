package com.jsp.teacher.student.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsp.teacher.student.dto.Student;
import com.jsp.teacher.student.services.StudentServices;
@WebServlet("/registerStudent")
public class InsertStudent extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name = req.getParameter("name");
		String email = req.getParameter("emaild");
		String password = req.getParameter("password");
		
		System.out.println(name);
		System.out.println(email);
		System.out.println(password);
		
		StudentServices studentServices = new StudentServices();
		Student student = new Student();
		student.setName(name);
		student.setEmail(email);
		student.setPassword(password);
		studentServices.create(student);
		
		RequestDispatcher requestDispatcher = req.getRequestDispatcher("School.html");
		requestDispatcher.forward(req, resp);
	
	}
}