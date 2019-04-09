<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<%
	pageContext.setAttribute("APP_PATH", request.getContextPath());
%>
<script src="${APP_PATH }/statics/jquery/2.0.0/jquery.min.js"></script>
<link
	href="${APP_PATH }/statics/bootstrap-3.3.7-dist/css/bootstrap.min.css"
	rel="stylesheet">
<script
	src="${APP_PATH }/statics/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
</head>
<body>
	<!-- 博客頁面主面板 -->
	<div class="container" style="margin-top: 50px;">
		<!-- 標題row -->
		<div class="row">
			<div class="col-md-4 col-md-offset-4">
				<center>
					<div style="padding:1px;width:250px; height:35px;background-color: black">
						<font color="white"><h4>MouMangTai</h4></font>
					</div>
				</center>
			</div>
		</div>
		<!-- 簡介row -->
		<div class="row" style="margin-top:5px;">
			<div class="col-md-2 col-md-offset-5">
				<center>
					<h6>asdasdsads</h6>
				</center>
			</div>
		</div>
		<!-- 導航row -->
		<div class="row" style="margin-top:15px;">
			<div class="col-md-5"></div>
			<div class="col-md-1">
				<center>
					<span class="glyphicon glyphicon glyphicon-home" style="font-size: 10px" aria-hidden="true"></span><br>
					<div style="margin-top:5px;">home</div>
				</center>
			</div>
			<div class="col-md-1">
				<center>
					<span class="glyphicon glyphicon glyphicon-home" style="font-size: 10px" aria-hidden="true"></span><br>
					<div style="margin-top:5px;">home</div>
				</center>
			</div>
			<div class="col-md-5"></div>
		</div>
	</div>
</body>
</html>