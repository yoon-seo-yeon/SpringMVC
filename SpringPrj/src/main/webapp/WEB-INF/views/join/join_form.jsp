<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>회원가입</h1>
<form method="post" action="join_form">
	name : <input type="text" name="userName"/><br/>
	id : <input type="text" name="userId"/><br/>
	pass : <input type="text" name="userPass"/><br/>
	birth : <input type="text" name="userBirth"/><br/>
	phone : <input type="text" name="userPhone"/><br/>
	<button type="submit">회원가입 완료</button>
</form>
</body>
</html>