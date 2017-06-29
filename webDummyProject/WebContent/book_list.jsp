<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
</head>
<body>
	<c:if test="${empty bookList }">
		<h2>EMPTY BOOK LIST</h2>
	</c:if>
	<c:if test="${not empty bookList }">
		<table class="w3-table-all w3-hoverable">
			<tr>
				<th>bookNum</th>
				<th>title</th>
				<th>publisher</th>
				<th>year</th>
				<th>price</th>
			</tr>
			<c:forEach items="${bookList }" var="book">
				<tr>
					<td>${book.bookNum}</td>
					<td>${book.bookTitle}</td>
					<td>${book.bookPublisher}</td>
					<td>${book.bookYear}</td>
					<td>${book.bookPrice}</td>
				</tr>
			</c:forEach>
		</table>
	</c:if>
</body>
</html>