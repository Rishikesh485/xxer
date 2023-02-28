package com.jsp;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/register1")
public class Registration extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name = req.getParameter("name");
		String email = req.getParameter("emaild");
		String password = req.getParameter("password");
		
		System.out.println(name);
		System.out.println(email);
		System.out.println(password);
		
		RequestDispatcher requestDispatcher = req.getRequestDispatcher("Sucess.jsp");
		requestDispatcher.forward(req, resp);
		
		
	}

}
