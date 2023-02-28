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
@WebServlet("/delete")
public class DeleteTeacher extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String id = req.getParameter("id");
		TeacherServices teacherServices = new TeacherServices();
		Teacher teacher = new Teacher();
		teacher.setId(1);
		teacherServices.delete(1);
		
		RequestDispatcher requestDispatcher = req.getRequestDispatcher("School.html");
		requestDispatcher.forward(req, resp);
	}
}
