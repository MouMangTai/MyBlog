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
	<div class="container" style="margin-top:100px;" id="main">
		<!-- 標題row -->
		
		 <div class="row" style="display:none;" id="Main_Title">
			<div class="col-md-4 col-md-offset-4" >
				<center>
					<div style="padding-top:2px;width:250px; height:40px;background-color: black">
						<font color="white"><h4>MouMangTai's Blog</h4></font>
					</div>
				</center>
			</div>
		</div> 
		<!-- 簡介row -->
		 <div class="row" style="margin-top:5px;display:none;" id="Main_Intro">
			<div class="col-md-2 col-md-offset-5">
				<center>
					<h6>JavaWeb开发</h6>
				</center>
			</div>
		</div> 
		<!-- 導航row -->
		 <div class="row" style="margin-top:15px;margin-bottom:120px;display:none;" id="Main_Nav">
			<center>
				<div style="width:400px;display:flex;justify-content:space-around; ">
					//<center>
						<div style="width:20px;"><span id="Home" class="glyphicon glyphicon glyphicon-home" style="font-size: 15px" aria-hidden="true"></span></div>
						<div style="width:20px;"><span class="glyphicon glyphicon glyphicon-paperclip" style="font-size: 15px" aria-hidden="true"></span></div>
						<div style="width:20px;"><span class="glyphicon glyphicon glyphicon-user" style="font-size: 15px" aria-hidden="true"></span></div>
						<div style="width:20px;"><span class="glyphicon glyphicon glyphicon-tag" style="font-size: 15px" aria-hidden="true"></span></div>
					</center>
				</div>
			</center>
		</div> 
		<!-- 文章标题栏 -->
	    <div class="row">
			<center>
				<h4>标题</h4>
			</center>
		</div> 
		<!-- 文章属性栏目 -->
		<div class="row">
			<center>
				<h6>2019-4-9 15:20:20 | category of name | visitors 2000</h6>
			</center>
		</div>
		<div class="row">
			<div  style="word-break:break-all;width:500px;">
				<h4>assssssssssssssssssssssssssssssssssssssassssssssssssssssssssssssssssssssssssssasssssssssss
				sssssssssssssssssssssssssssassssssssssssssssssssssssssssssssssssssassssssssssssssssssssssssssssssssssssssassssssssssssssssssssssssssssssssssssssasssssssssss
				sssssssssssssssssssssssssssassssssssssssssssssssssssssssssssssssssassssssssssssssssssssssssssssssssssssssassssssssssssssssssssssssssssssssssssssasssssssssss
				sssssssssssssssssssssssssssassssssssssssssssssssssssssssssssssssssassssssssssssssssssssssssssssssssssssssassssssssssssssssssssssssssssssssssssssasssssssssss
				sssssssssssssssssssssssssssassssssssssssssssssssssssssssssssssssss</h4>
			</div>
		</div>
		<div class="row" style="margin-top:15px;">
			<center>
				<button style="background-color:black;" class="btn btn-primary btn-sm">Read More</button>
			</center>
		</div> 
	</div>
	<script type="text/javascript">
		//加载标题
		function load_title(){
			var title = $("<div></div>").addClass("row").attr("style","display:none").attr("id","Main_Title")
					.append($("<div></div>").addClass("col-md-4 col-md-offset-4")
					.append($("<center></center>")
					.append($("<div></div>").attr("style","padding-top:2px;width:250px; height:40px;background-color: black")
					.append($("<font></font>").attr("color","white")
					.append($("<h4></h4>").append("MouMangTai's Blog"))))));
			$("#main").append(title);
		}
		//加载简介
		function load_Intro(){
			var intro = $("<div></div>").addClass("row").attr("style","margin-top:5px;display:none;").attr("id","Main_Intro")
					.append($("<div></div>").addClass("col-md-2 col-md-offset-5")
					.append($("<center></center>")
					.append($("<h6></h6>").append("JavaWeb开发"))));
			$("#main").append(intro);
		}
		//加载导航
		function load_Nav(){
			var nav = $("<div></div>").addClass("row").attr("style","margin-top:15px;margin-bottom:120px;display:none;").attr("id","Main_Nav")
					.append($("<center></center>")
					.append($("<div></div>").attr("style","width:400px;display:flex;justify-content:space-around;")
						.append($("<div></div>").attr("style","width:20px;").attr("id","home")
								.append($("<span></span>").addClass("glyphicon glyphicon glyphicon-home").attr("style","font-size: 15px").attr("aria-hidden","true")))
						.append($("<div></div>").attr("style","width:20px;")
								.append($("<span></span>").addClass("glyphicon glyphicon glyphicon-paperclip").attr("style","font-size: 15px").attr("aria-hidden","true")))
						.append($("<div></div>").attr("style","width:20px;")
								.append($("<span></span>").addClass("glyphicon glyphicon glyphicon-user").attr("style","font-size: 15px").attr("aria-hidden","true")))
						.append($("<div></div>").attr("style","width:20px;")
								.append($("<span></span>").addClass("glyphicon glyphicon glyphicon-tag").attr("style","font-size: 15px").attr("aria-hidden","true")))));
			$("#main").append(nav);
		}
		//跳转第几页
		function to_page(pn){
			//首先加载标题页面
			$("#main").empty();
			load_title();
			load_Intro();
			load_Nav();
			$("#Main_Title").show(200,function(){
				$("#Main_Intro").show(200,function(){
					$("#Main_Nav").show(200);
				});
			});
			$.ajax({
				url:"${APP_PATH}/arts",
				type:"GET",
				data:"pn="+pn,
				success:function(result){
					var arts = result.map.pageInfo.list;
					var div = $("<div></div>").attr("style","display:none");
					$.each(arts,function(index,item){
						var title = $("<div></div>").addClass("row")
								.append($("<center></center>")
								.append($("<h4></h4>").append(item.artTitle)));
						var property = $("<div></div>").addClass("row")
								.append($("<center></center>")
								.append($("<h6></h6>").append(item.artPostTime.toString()+ " | category of "+ item.artCategory+ " | visitors "+ item.artVisitor)));
						var context = $("<div></div>").append().addClass("row").attr("style","margin-top:50px;margin-bottom:50px;")
								.append($("<div></div>").attr("style","word-break:break-all;width:500px;margin:0 auto;")
								.append($("<h4></h4>")).append(item.artContext));
						var btn = $("<div></div>").addClass("row").attr("style","margin-top:30px;")
								.append($("<center></center>")
								.append($("<button></button>").addClass("btn btn-primary btn-sm").attr("style","background-color:black;margin-bottom:100px;").append("Read More")));
						div.append(title).append(property).append(context).append(btn);
						$("#main").append(div);
						div.show(1000);
					});
				}
			});
		}
		$("#Home").click(function(){
			to_page(2);
		});
		//获取数据库文章信息
		//显示文章内容
		$(function(){
			//跳转到第一页
			to_page(1);
		});
	</script>
</body>
</html>