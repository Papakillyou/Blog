<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="true"%>
<html>
<head>
<meta charset="UTF-8">
<!-- jQuery文件。务必在bootstrap.min.js 之前引入 -->
<!-- <script src="http://apps.bdimg.com/libs/jquery/2.0.0/jquery.js"></script> -->
<script src="/blog/resources/js/jquery-2.2.0.js"></script>
<!-- 新 Bootstrap 核心 CSS 文件 -->
<link
	href="http://apps.bdimg.com/libs/bootstrap/3.3.0/css/bootstrap.min.css"
	rel="stylesheet">
<!-- 可选的Bootstrap主题文件（一般不使用） -->
<!--  <script src="http://apps.bdimg.com/libs/bootstrap/3.3.0/css/bootstrap-theme.min.css"></script>-->


<!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
<script
	src="http://apps.bdimg.com/libs/bootstrap/3.3.0/js/bootstrap.min.js">
	
</script>
<script src="/blog/resources/js/AddBlogAjax.js">
	
</script>
<title>管理员登录</title>
</head>
<body>
	<div class="container">
		<div class="masthead">
			<h3 class="text-muted page-header"></h3>
			<h3 class="text-muted page-header"></h3>
		</div>
	
		<!-- 添加博客界面 -->
		<div class="row">
			<div class="col-md-3"></div>
			<div class="col-md-9">
			<h3 class="text-muted page-header">请输入管理员账户和密码</h3>
			
				<form action="login.action" method="post"  class="form-horizontal" id="AddBlogForm">
				    <div class="form-group">
						<label for="blog_userl" class="col-md-2 control-label">账号:</label>
						<div class="col-md-6">
							<input type="text" name="blog_user" class="form-control"
								id="blog_user" placeholder="账号输入">
						</div>
						<div class="col-md-4"></div>
					</div>
					<div class="form-group">
						<label for="blog_passwordl" class="col-md-2 control-label">密码</label>
						<div class="col-md-6">
							<input type="text" name="blog_password" class="form-control"
								id="blog_password" placeholder="密码输入">
						</div>
						<div class="col-md-4"></div>
					</div>

					<div class="form-group">
						<div class="col-md-offset-2 col-md-10 ">
							<button type="submit" class="btn btn-default" id="submit1">登录</button>
						</div>
					</div>
				</form>
			</div>
		</div>
	</div>
</body>
</html>