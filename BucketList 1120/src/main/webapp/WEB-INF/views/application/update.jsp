<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<!-- Bootstrap CSS -->
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3"
	crossorigin="anonymous">
<title>Update</title>
<link rel="stylesheet" href="../../resources/css/update.css">
</head>

<body>
	<div class="top_manu">
		<div class="line">
			<a href="index/">
				<div class="logo"></div>
			</a>

			<div class="manu">
				<a href="introduce">회사소개</a> <a href="">게시판</a> <a href="">신청</a> <a
					href="">모집</a> <a href="sign-in/signin.html">login</a>
			</div>
		</div>
	</div>

	<div class="main_photo">
		<!-- 메인사진부분 -->
		<div class="line">
			<div class="text1">
				For people's <br>Dreams</br>
			</div>
			<div class="introduce_box">
				<form method="post">
					<div class="name">
						<label>제목:</label> <input type="text" name="name"
							value="${item.name}">
					</div>
					<div class="contents">
						<label>구분:</label> <input type="text" name="part"
							value="${item.part}">
					</div>
					<div class="contents">
						<label>내용:</label> <input type="text" name="subject"
							value="${item.subject}">
					</div>
					<div class="button">
						<button>수정</button>
					</div>
				</form>
			</div>
		</div>
</body>
<div class="bottom">
	<div class="line">
		<div class="text5">COPYRIGHT ⓒ BUCKETLIST Construction
			Co.,Ltd.ALL RIGHTS RESERVED</div>
	</div>
</div>





<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p"
	crossorigin="anonymous"></script>


</html>

