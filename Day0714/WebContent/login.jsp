<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		
		if (id.equals("test")){
			if(pw.equals("1234")){
				%>
				<h1>로그인성공</h1>
				<%
				 response.sendRedirect("main.jsp");
			} else{%><h1>비번을 확인하세요</h1><%
				response.sendRedirect("login.html");	
			}
		}else{ %><h1>아이디를 확인하세요</h1><%
			response.sendRedirect("login.html");}%>
		
		
</body>
</html>