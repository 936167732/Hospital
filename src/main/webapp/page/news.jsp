<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE>
<html>
<head>
	<title>天使医生</title>
	<link href="css/bootstrap.css" type="text/css" rel="stylesheet" media="all">
	<link href="css/style.css" type="text/css" rel="stylesheet" media="all">
	<!-- Custom Theme files -->
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
	<meta name="keywords" content="Doctor Plus Responsive web template, Bootstrap Web Templates, Flat Web Templates, Andriod Compatible web template,
	Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyErricsson, Motorola web design"/>
	<script type="application/x-javascript"> addEventListener("load", function () {
        setTimeout(hideURLbar, 0);
    }, false);
    function hideURLbar() {
        window.scrollTo(0, 1);
    } </script>
	<!-- //Custom Theme files -->
	<!-- js -->
	<script src="${pageContext.request.contextPath }/page/js/jquery-1.11.1.min.js"></script>
	<!-- //js -->
	<!-- start-smoth-scrolling-->
	<script type="text/javascript" src="${pageContext.request.contextPath }/page/js/move-top.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath }/page/js/easing.js"></script>
	<script type="text/javascript">
        jQuery(document).ready(function ($) {
            $(".scroll").click(function (event) {
                event.preventDefault();
                $('html,body').animate({scrollTop: $(this.hash).offset().top}, 1000);
            });
        });
	</script>
	<!--//end-smoth-scrolling-->
	<style>
        .side-bar a,.chat-tips i {background: url(images/right_bg.png) no-repeat;}
        .side-bar {width: 66px;position: fixed;bottom: 20px;right: 25px;font-size: 0;line-height: 0;z-index: 100;}
        .side-bar a {width: 66px;height: 66px;display: inline-block;background-color: #ddd;margin-bottom: 2px;}
        .side-bar a:hover {background-color: #669fdd;}
        .side-bar .icon-qq {background-position: 0 -62px;}
        .side-bar .icon-chat {background-position: 0 -130px;position: relative;}
        .side-bar .icon-blog {background-position: 0 -198px;}
        .side-bar .icon-mail {background-position: 0 -266px;}
        .side-bar .icon-chat:hover .chat-tips {display: block;}
        .chat-tips {padding: 20px;border: 1px solid #d1d2d6;position: absolute;right: 78px;top: -55px;background-color: #fff;display: none;}
        .chat-tips i {width: 9px;height: 16px;display: inline-block;position: absolute;right: -9px;top: 80px;background-position:-88px -350px;}
        .chat-tips img {width: 138px;height: 138px;}
    </style>
</head>
<body>
<div class="side-bar">
    <a href="#" class="icon-qq">客服聊天</a>
    <a href="#" class="icon-chat"> <div class="chat-tips"><i></i>
        <img style="width:138px;height:138px;" src="${pageContext.request.contextPath }/page/images/helloweba.jpg" alt="微信订阅号"></div></a>
    <a target="_blank" href="" class="icon-blog">微博</a>
    <a href="https://mail.qq.com/" class="icon-mail">mail</a>
</div>
<script src="http://cdn.bootcss.com/bootstrap/3.2.0/js/bootstrap.min.js"></script>
<script src="http://bootboxjs.com/bootbox.js"></script>
<!--header-->

<div class="header">
	<div class="container">
		<div class="header-logo">
			<a href="index.html"><img src="${pageContext.request.contextPath }/page/images/logo.png" alt="logo"/></a>
		</div>
		<div class="header-info">
			<!--<ur class="nav1">-->
			<!--<li><h3><a href="contact.html"><span style="color: #ebfffa">登录</span></a></h3></li>-->
			<!--<li><h3><a href="contact.html"><span style="color: #ebfffa">注册</span></a></h3></li>-->
			<!--</ur>-->
		</div>
		<div class="clearfix"></div>
	</div>
</div>
<!--//header-->
<!--header-bottom-->
<div class="header-bottom">
	<div class="container">
		<!--top-nav-->
		<div class="top-nav cl-effect-5">
			<span class="menu-icon"><img src="${pageContext.request.contextPath }/page/images/menu-icon.png" alt=""/></span>
			<ul class="nav1">
                <li><a href="${pageContext.request.contextPath }/page/index.jsp" class="active"><span data-hover="首页">首页</span></a></li>
                <li><a href="${pageContext.request.contextPath }/page/services.jsp"> <span data-hover="关于医院">关于医院</span></a></li>
                <li><a href="${pageContext.request.contextPath }/yuyueServlet"> <span data-hover="预约医生">预约医生</span></a></li>
                <li><a href="${pageContext.request.contextPath }/page/search.jsp"> <span data-hover="症状查询">症状查询</span></a></li>
                <li><a href="${pageContext.request.contextPath }/page/news.jsp"> <span data-hover="养生之道">养生之道</span></a></li>
                <li><a href="${pageContext.request.contextPath }/page/inquire.jsp"> <span data-hover="我的预约">我的预约</span></a></li>
            </ul>
			<!-- script-for-menu -->
			<script>
                $("span.menu-icon").click(function () {
                    $("ul.nav1").slideToggle(300, function () {
                        // Animation complete.
                    });
                });
			</script>
			<!-- /script-for-menu -->
		</div>
		<!--//top-nav-->
		<form class="navbar-form navbar-right">
			<div class="form-group">
				<input type="text" class="form-control" placeholder="Search">
				<button type="submit" class="btn btn-default"></button>
			</div>
		</form>
		<div class="clearfix"></div>
	</div>

</div>
<!--//header-bottom-->
<div class="services">
    <div class="container">
        <h3>最近发布</h3>
        <div class="row services-info">
            <div class="col-sm-6 col-md-4 services-grids">
                <div class="thumbnail">
                    <div class="moments-bottom">
                        <a href="images/img9.jpg">
                            <img src="${pageContext.request.contextPath }/page/images/img9.jpg" class="img-responsive zoom-img " alt="">
                        </a>
                    </div>
                    <div class="caption services-caption">
                        <h4><a href="single.html">春季疾病</a></h4>
                        <p>春季是一个疾病多发的季节，我们要采取有效的方法来预防疾病</p>
                    </div>
                </div>
            </div>
            <div class="col-sm-6 col-md-4 services-grids">
                <div class="thumbnail">
                    <div class="moments-bottom">
                        <a href="images/img10.jpg">
                            <img src="${pageContext.request.contextPath }/page/images/img10.jpg" class="img-responsive zoom-img " alt="">
                        </a>
                    </div>
                    <div class="caption services-caption">
                        <h4><a href="single.html">春季疾病</a></h4>
                        <p>春季是一个疾病多发的季节，我们要采取有效的方法来预防疾病</p>
                    </div>
                </div>
            </div>
            <div class="col-sm-6 col-md-4 services-grids">
                <div class="thumbnail">
                    <div class="moments-bottom">
                        <a href="images/img11.jpg">
                            <img src="${pageContext.request.contextPath }/page/images/img11.jpg" class="img-responsive zoom-img " alt="">
                        </a>
                    </div>
                    <div class="caption services-caption">
                        <h4><a href="single.html">Facilisis dignissimos luptat</a></h4>
                        <p>Cras justo odioda pibus facilisis dignissimos voluptatem accusantium</p>
                    </div>
                </div>
            </div>
            <div class="col-sm-6 col-md-4 services-grids">
                <div class="thumbnail">
                    <div class="moments-bottom">
                        <a href="images/img12.jpg">
                            <img src="${pageContext.request.contextPath }/page/images/img12.jpg" class="img-responsive zoom-img " alt="">
                        </a>
                    </div>
                    <div class="caption services-caption">
                        <h4><a href="single.html">Facilisis dignissimos luptat</a></h4>
                        <p>Cras justo odioda pibus facilisis dignissimos voluptatem accusantium</p>
                    </div>
                </div>
            </div>
            <div class="col-sm-6 col-md-4 services-grids">
                <div class="thumbnail">
                    <div class="moments-bottom">
                        <a href="images/img13.jpg">
                            <img src="${pageContext.request.contextPath }/page/images/img13.jpg" class="img-responsive zoom-img " alt="">
                        </a>
                    </div>
                    <div class="caption services-caption">
                        <h4><a href="single.html">Facilisis dignissimos luptat</a></h4>
                        <p>Cras justo odioda pibus facilisis dignissimos voluptatem accusantium</p>
                    </div>
                </div>
            </div>
            <div class="col-sm-6 col-md-4 services-grids">
                <div class="thumbnail">
                    <div class="moments-bottom">
                        <a href="images/img14.jpg">
                            <img src="${pageContext.request.contextPath }/page/images/img14.jpg" class="img-responsive zoom-img " alt="">
                        </a>
                    </div>
                    <div class="caption services-caption">
                        <h4><a href="single.html">Facilisis dignissimos luptat</a></h4>
                        <p>Cras justo odioda pibus facilisis dignissimos voluptatem accusantium</p>
                    </div>
                </div>
            </div>
            <div class="col-sm-6 col-md-4 services-grids">
                <div class="thumbnail">
                    <div class="moments-bottom">
                        <a href="images/img15.jpg">
                            <img src="${pageContext.request.contextPath }/page/images/img15.jpg" class="img-responsive zoom-img " alt="">
                        </a>
                    </div>
                    <div class="caption services-caption">
                        <h4><a href="single.html">Facilisis dignissimos luptat</a></h4>
                        <p>Cras justo odioda pibus facilisis dignissimos voluptatem accusantium</p>
                    </div>
                </div>
            </div>
            <div class="col-sm-6 col-md-4 services-grids">
                <div class="thumbnail">
                    <div class="moments-bottom">
                        <a href="images/img16.jpg">
                            <img src="${pageContext.request.contextPath }/page/images/img16.jpg" class="img-responsive zoom-img " alt="">
                        </a>
                    </div>
                    <div class="caption services-caption">
                        <h4><a href="single.html">Facilisis dignissimos luptat</a></h4>
                        <p>Cras justo odioda pibus facilisis dignissimos voluptatem accusantium</p>
                    </div>
                </div>
            </div>
            <div class="col-sm-6 col-md-4 services-grids">
                <div class="thumbnail">
                    <div class="moments-bottom">
                        <a href="images/img17.jpg">
                            <img src="${pageContext.request.contextPath }/page/images/img17.jpg" class="img-responsive zoom-img " alt="">
                        </a>
                    </div>
                    <div class="caption services-caption">
                        <h4><a href="single.html">Facilisis dignissimos luptat</a></h4>
                        <p>Cras justo odioda pibus facilisis dignissimos voluptatem accusantium</p>
                    </div>
                </div>
            </div>
            <div class="clearfix"> </div>
        </div>
        <!--light-box-js -->
        <script src="${pageContext.request.contextPath }/page/js/jquery.chocolat.js"></script>
        <!--light-box-files -->
        <script type="text/javascript">
            $(function() {
                $('.moments-bottom a').Chocolat();
            });
        </script>
        <!--//end-gallery js-->
    </div>
</div>

</body>
</html>