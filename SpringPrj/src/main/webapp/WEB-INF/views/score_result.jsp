<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Score Result!!</h1>
<h2>이름 : ${requestScope.name }</h2>
<h2>국어 : ${requestScope.ko }</h2>
<h2>영어 : ${requestScope.en }</h2>
<h2>수학 : ${requestScope.ma }</h2>
<h2>스프링 : ${requestScope.sp }</h2>
<h2>총점 : ${requestScope.total }</h2>
<h2>평균 : ${requestScope.avg }</h2>
</body>
</html>