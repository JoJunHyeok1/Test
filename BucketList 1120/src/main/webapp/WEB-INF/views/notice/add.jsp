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
<link
	href="http://cdnjs.cloudflare.com/ajax/libs/summernote/0.8.8/summernote.css"
	rel="stylesheet">
<script
	src="http://cdnjs.cloudflare.com/ajax/libs/summernote/0.8.8/summernote.js"></script>
<script>
	$('#summernote').summernote({
		height : 300, // 에디터 높이
		minHeight : null, // 최소 높이
		maxHeight : null, // 최대 높이
		focus : true, // 에디터 로딩후 포커스를 맞출지 여부
		lang : "ko-KR", // 한글 설정
		placeholder : '최대 2048자까지 쓸 수 있습니다' //placeholder 설정

	});
</script>
<title>Notice</title>
<link rel="stylesheet" href="/resources/css/add.css">
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
						<label>제목:</label> <input type="text" name="name">
					</div>
					<div class="contents">
						<label>내용:</label> <input type="text" name="contents">
					</div>
					<div class="subject">
						<label>설명:</label>
						<textarea name="subject"></textarea>
					</div>
					<div class="button">
						<button>등록</button>
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
</body>

</html>