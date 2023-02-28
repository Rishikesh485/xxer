<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>Introduction to JSP</h2>

<%! String name ="SAHIL"; %>
<%= "Welcome"+"  " +name %>
<br>
<!-- Method to add 2 numbers -->

<%! int addTwoNumbers(int a, int b){ 
	return (a+b);} %>
	<br>
<%= "Addition of two numbers is "+addTwoNumbers(2, 5) %>
<br>

<%! int array[]={1,2,3,4,5}; %><br>
<% for(int i=0;i<array.length;i++){}
	%>
<%=  %>
</body>
</html>