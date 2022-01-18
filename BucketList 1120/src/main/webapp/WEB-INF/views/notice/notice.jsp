<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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
<title>Notice</title>
<link rel="stylesheet" href="../resources/css/notice.css">
</head>

<body>
	<div class="top_manu">
		<div class="line">
			<a href="../">
				<div class="logo"></div>
			</a>

			<div class="manu">
				<a href="introduce">회사소개</a> <a href="notice/">게시판</a> <a href="../application/">신청</a> <a
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

				<h1 class="con">게시글 목록</h1>

				<section class="article-list table-common con">
					<table border="1">
						<div>
							<form>
								<select name="search">
									<option>검색항목</option>
									<option value="1">번호</option>
									<option value="2">제목</option>
									<option value="3">내용</option>
								</select> <input type="text" name="keyword">
								<button>검색</button>
							</form>
						</div>
						<thead>
							<tr>
								<th>번호</th>
								<th>제목</th>
								<th>내용</th>
								<th>날짜</th>
								<th>관리</th>

							</tr>
						</thead>
						<tbody>
							<c:forEach var="item" items="${notice}">
								<tr>
									<td>${item.code}</td>
									<td>${item.name}</td>
									<td><a href="view/${item.code}">${item.contents}</a></td>
									<td>${item.reg_date}</td>
									<td><a href="delete/${item.code}">삭제</a> <a
										href="update/${item.code}">변경</a></td>
								</tr>
							</c:forEach>
							<c:if test="${list.size()<1}">
								<tr>
									<td>등록된 글이 없습니다</td>
								</tr>
							</c:if>
						</tbody>
						<tfoot>
							<tr>
								<td colspan="7">
									<div class="pagination justify-content-center">
										<div class="page-item">
											<a href="?page=1${pager.query}" class="page-link">처음</a>
										</div>
										<div class="page-item">
											<a href="?page=${pager.prev}${pager.query}" class="page-link">이전</a>
										</div>
										<c:forEach var="page" items="${pager.list}">
											<div class="page-item ${page == pager.page ? 'active':''}">
												<a href="?page=${page}${pager.query}" class="page-link">${page}</a>
											</div>
										</c:forEach>

										<div class="page-item">
											<a href="?page=${pager.next}${pager.query}" class="page-link">다음</a>
										</div>
										<div class="page-item">
											<a href="?page=${pager.last}${pager.query}" class="page-link">마지막</a>
										</div>
									</div>
								</td>
							</tr>
						</tfoot>
					</table>
				</section>
				<!-- <button class="write"><a href"#">글쓰기</a></button> 글쓰기 버튼 -->

				<div class="write">
					<a href="add">글쓰기</a>
				</div>

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