<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<script src="http://how2j.cn/study/jquery.min.js"></script>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>MouMangTai's blog</title>
</head>
<script>

	$(function(){
		$("#div1").fadeIn(500);
		$("#div2").animate({top:'0px'},500,function(){
			$("#div3").fadeIn(200);
			$("#div3").animate({top:'-40px'},200,function(){
				$('#div4').fadeIn(200);
			});
		});
		$(".div5").mouseenter(function(){
			$(this).find("font").toggleClass("b");
		});
		$(".div5").mouseleave(function(){
			$(this).find("font").toggleClass("b");
		});
		$(".div6").mouseenter(function(){
			$(this).find("font").toggleClass("c");
		});
		$(".div6").mouseleave(function(){
			$(this).find("font").toggleClass("c");
		});
		$("#div0").animate({top:'0'},1400,function(){
			$("#div_fixed").click(function(){
				var width = $("#div0").attr("width");
				if(width=="100%"){
					$("#div0").animate({width:'75%'},150);
					$("#div0").attr("width","75%");
					$("#div_cebian").fadeIn(150);
					$("#div7").animate({left:"0"},75);
					$("#div_fixed").attr("background-color","black");
				}else{
					$("#div0").animate({width:'100%'},150);
					$("#div0").attr("width","100%");
					$("#div7").animate({left:"50px"},75);
					$("#div_cebian").fadeOut(150);
					$("#div_fixed").attr("background-color","white");
				}
			});
		});
		
	})
	
	
</script>
<style>
	#div0{
		position:relative;
		height:100%;
		top:-30px;
	}
	#div1{
		width:180px;
		height:25px;
		padding:8px 20px 5px 20px;
		background-color:#282828;
		margin:50px;
		display:none;
	}
	#div2 {
		color:white;
		position:relative;
		top:-10px;
	}
	#div3 {
		font-size:10px;
		color:#989898;
		position:relative;
		display:none;
		top:-50px;
	}
	#div4{
		width:400px;
		height:50px;
		display:none;
	}
	.div5{
		width:60px;
		height:45px;
		display:inline;
		float:left;
		margin-left:15px;
		cursor:pointer;
	}
	.b{
		border-bottom:1px solid black;
	}
	.c{
		border-bottom:1px solid white;
	}
	.div5 font{
		font-size:7px;
	}
	.div5 img{
		margin-bottom:5px;
		
	}
	#div_fixed{
		position:fixed;
		width:20px;
		height:20px;
		top:10px;
		left:98%;
		background-color:white;
		cursor:pointer;
		border-top:1px black solid;
		border-bottom:1px black solid;
	}
	#div_cebian{
		position:fixed;
		width:350px;
		height:100%;
		top:0;
		right:0;
		background-color:black;
		display:none;
	}
	.div6{
		display:inline;
		width:30px;
		margin-left:10px;
		margin-right:10px;
	}
</style>
<body>
	<div id="box">
		<div id="div0" width="100%" >
			<center>
			<div id="div1">
				<div id="div2"><font>WangQiongDi's blog</font></div>
			</div>
			<div id="div3">Code more and talk less</div>
			<div id="div4">
				<a href="home.jsp"><div class="div5" ><img src="images/home.jpg"><br><font>Home</font></div></a>
				<div class="div5" ><img src="images/contact.jpg"><br><font>Contact</font></div>
				<div class="div5" ><img src="images/home.jpg"><br><font>Home</font></div>
				<div class="div5" ><img src="images/contact.jpg"><br><font>Contact</font></div>
				<div class="div5" ><img src="images/home.jpg"><br><font>Home</font></div>
			</div>
			</center>
			
		</div>
		
		<div id="div_cebian">
			<center>
			<div id="div7" style="position:relative;left:50px;">
				<div  style="padding-top:30px;padding-left:30px; ">
					<div ><img style="float:left;border:solid 3px #E8E8E8" width="20%"src="images/head.JPG"></div>
					<div style="padding-top:20px"><font color="white">WangQiongDi's blog</font><br></div>
					<div style="padding-top:10px"><font size="1px" color="#E8E8E8">Code more and talk less</font></div>
				</div>
				<div style="margin-top:50px;width:100%;cursor:pointer;">
					<div class="div6"  ><img src="images/github.jpg"><font size="2px" color="#E8E8E8">GitHub</font></div>
					
				</div>
				</div>
			</center>
		</div>
		<div id="div_fixed"> 
			<hr>
		</div>
	</div>
	
</body>
</html>