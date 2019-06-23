<%@ page language="java" contentType="text/html; charset=UTF-8"
		 pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="true"%>
<html>
<head>
	<meta charset="UTF-8">
	<!-- 新 Bootstrap 核心 CSS 文件 -->
	<link
			href="http://apps.bdimg.com/libs/bootstrap/3.3.0/css/bootstrap.min.css"
			rel="stylesheet">

	<!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
	<script
			src="http://apps.bdimg.com/libs/bootstrap/3.3.0/js/bootstrap.min.js">

	</script>
	<title>所有博客</title>
</head>
<body>
<div class="container">
	<div class="row">
		<div class="col-md-2"></div>
		<div class="col-md-10">
			<h3 class="text-muted page-header">Welcome</h3>
			<form action="login.action" method="get" class="form-horizontal">
				<div class="form-group">
					<div class="col-md-offset-2 col-md-10 " style="text-align: right">
						<button type="submit" class="btn btn-default" id="submit0">管理员登录</button>
					</div>
				</div>
				<div class="container">
					<table style="word-wrap:break-word; word-break:break-all;">
						<c:forEach var="row" items="${data}">
							<tr>
								<td>${row.blogId} &nbsp;<a href="javascript:getContent(${row.blogId})">
									<h4>${row.title}</h4></a></td>
								<td>${row.blogTime}</td>
							</tr>
							<tr>
								<td>___________________________________________________________________________________________</td>
							</tr>
						</c:forEach>
					</table>
				</div>
			</form>
		</div>
	</div>
</div>
</body>

<script type="text/javascript">
    function getContent(blogId) {
        window.location = "read.action?id=" + blogId;
    }
</script>

</html>