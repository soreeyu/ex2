<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>NOTICE VIEW</h2>
	<a href="noticeUpdate?num=${dto.num}">NOTICE UPDATE</a>
	<a href="noticeDelete?num=${dto.num}">NOTICE DELETE</a>
	<table>
			<tr>
				<td>Num</td><td>Title</td><td>Writer</td><td>Contents</td><td>Date</td><td>Hit</td>
			</tr>
			
			<tr>
				<td>${dto.num }</td>
				<td>${dto.title }</td>
				<td>${dto.writer }</td>
				<td>${dto.contents }</td>
				<td>${dto.reg_date }</td>
				<td>${dto.hit }</td>
			</tr>
	</table>
</body>
</html>