<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>회원가입 성공!!</h3>
<h4>name : ${requestScope.userName }</h4>
<h4>id : ${requestScope.userId }</h4>
<h4>pass : ${requestScope.userPass }</h4>
<h4>birth : ${requestScope.userBirth }</h4>
<h4>phone : ${requestScope.userPhone }</h4>
</body>
</html>