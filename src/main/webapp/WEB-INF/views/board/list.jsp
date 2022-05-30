<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/layout/header.jspf" %>
<div class="container">
<table class="table">
	<tr>
		<th>번호</th>
		<th>제목</th>
		<th>작성자</th>
		<th>등록일</th>
	</tr>
	<c:forEach items="${list}" var="b">
	<tr>
		<td>${b.bno}</td>
		<td>
			<a href="get?bno=${b.bno}">${b.title }</a>
		</td>
		<td>${b.writer }</td>
		<td>${b.regDate }</td>
	</tr>
	</c:forEach>	
</table>
<a href="${pageContext.request.contextPath}/board/register" class="btn btn-primary">
	글 등록
</a>
${message}
</div>
<%@ include file="/WEB-INF/views/layout/footer.jspf" %>
