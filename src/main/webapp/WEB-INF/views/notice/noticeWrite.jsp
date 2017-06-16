<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>NOTICE WRITE FORM</h2>
	
	<form action="notice${path }" method="post">
	
	<input type="hidden" name="num" value="${dto.num }">
	<input type="text" name="writer" value="${dto.writer }"><br><br>
	<input type="text" name="title" value="${dto.title }"><br><br>
	<textarea rows="2" cols="110" name="contents">${dto.contents}</textarea>
	<button name="WRITE"> 입력 </button>
	
	
	</form>
</body>
</html>