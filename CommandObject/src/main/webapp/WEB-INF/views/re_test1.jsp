<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<h1>Test1 Result!!</h1>
<h2>data1, data2�� �����</h2>
<!--  
<h3>data1 : ${requestScope.dataBean.data1 }</h3>
<h3>data1 : ${requestScope.dataBean.data2 }</h3>-->

<!-- request������ ��ü�̸� �����ؼ� �����ϴ� ��� -->
<h3>data1 : ${requestScope.testBean.data1 }</h3>
<h3>data1 : ${requestScope.testBean.data2 }</h3>
</body>
</html>