<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<h1>Hello MethodPrj!</h1>

<img src ="img/1.svg"/ width="150" height="50">

<a href = "test1">test1 get</a></br>

<form method="post" action="test2">
ID : <input type = "text" name = "userid"/></br/>
Pass : <input type = "password" name = "pass"/><br/>
<button type = "submit">Login</button>
</form>

<a href = "test3">test3 get_post</a><br/>

<a href = "test4">test4 get</a><br/>

<form method="post" action="test5">
email : <input type = "text" name = "useremail"/></br/>
<button type = "submit">Login</button>
</form>
</body>
</html>