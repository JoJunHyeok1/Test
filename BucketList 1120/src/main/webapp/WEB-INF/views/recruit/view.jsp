<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<title>Insert title here</title>
</head>
<body>
 <div>
 	<div>
 		<label>제품번호:</label>
 		<span>${item.code}</span>
 	</div>
 	<div>
 		<label>제품명:</label>
 		<span>${item.name}</span>
 	</div>
 	<div>
 		<label>구분:</label>
 		<span>${item.part}</span>
 	</div>
 		<div>
 		<label>내용:</label>
 		<span>${item.subject}</span>
 	</div>

 	<div>
 		<a href="..">목록</a>
 	</div>
 	
 </div>
 
</body>
 
</html>