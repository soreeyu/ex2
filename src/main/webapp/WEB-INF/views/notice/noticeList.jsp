<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	var m ='${message}';
	if(m != ''){
		alert(m);
	}
</script>
</head>
<body>
	<h2>NOTICE LIST</h2>
	<a href="noticeView">NOTICE VIEW</a>
	<a href="noticeWrite">NOTICE WRITE</a>
		<table>
			<tr>
				<td>Num</td><td>Title</td><td>Writer</td><td>Contents</td><td>Date</td><td>Hit</td>
			</tr>
			<c:forEach items="${list }" var="i">
			<tr>
				<td>${i.num }</td>
				<td><a href="noticeView?num=${i.num }">${i.title }</a></td>
				<td>${i.writer }</td>
				<td>${i.contents }</td>
				<td>${i.reg_date }</td>
				<td>${i.hit }</td>
			</tr>
			</c:forEach>
		</table>
</body>
</html>