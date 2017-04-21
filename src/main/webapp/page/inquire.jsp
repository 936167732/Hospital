<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE>
<html>
<head>
    <title>天使医生</title>
    <link href="${pageContext.request.contextPath }/page/css/bootstrap.css" type="text/css" rel="stylesheet" media="all">
    <link href="${pageContext.request.contextPath }/page/css/style.css" type="text/css" rel="stylesheet" media="all">
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
    } 
    
    </script>
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
        .side-bar a,.chat-tips i {background: url(${pageContext.request.contextPath }/page/images/right_bg.png) no-repeat;}
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
<script src="http://cdn.bootcss.com/bootstrap/3.2.0/js/bootstrap.min.js"></script>
<script src="http://bootboxjs.com/bootbox.js"></script>
<!--header-->
<div class="side-bar">
    <a href="#" class="icon-qq">客服聊天</a>
    <a href="#" class="icon-chat"> <div class="chat-tips"><i></i>
        <img style="width:138px;height:138px;" src="${pageContext.request.contextPath }/page/helloweba.jpg" alt="微信订阅号"></div></a>
    <a target="_blank" href="" class="icon-blog">微博</a>
    <a href="https://mail.qq.com/" class="icon-mail">mail</a>
</div>
<div class="header">
    <div class="container">
        <div class="header-logo">
            <a href="index.jsp"><img src="${pageContext.request.contextPath }/page/images/logo.png" alt="logo"/></a>
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
        
        <script type="text/javascript" src="/try/bootstrap/twitter-bootstrap-v2/docs/assets/js/jquery.js"></script>
        <script type="text/javascript" src="/try/bootstrap/twitter-bootstrap-v2/docs/assets/js/bootstrap-dropdown.js"></script>

        <div class="bs-docs-example">
        	
        	<form class="navbar-form navbar-right" method="post" action="${pageContext.request.contextPath }/AppointmentServlet?method=findAppointment">
            <div class="form-group">
                <input name="pidcard" type="text" class="form-control" placeholder="请输入身份证号码查询">
                <button type="submit" class="btn btn-default"></button>
            </div>
       		</form>
        
            <table class="table table-striped">
                <thead>
                <tr>
                    <th>姓名</th>
                    <th>性别</th>
                    <th>年龄</th>
                    <th>手机号</th>
                    <th>身份证号</th>
                    <th>预约的医生</th>
                </tr>
                </thead>
                <tbody>
                <c:forEach items="${appointmentList }" var="patient">
            		<tr>
            		
                	<td>${patient.pname}</td>
                	<td>${patient.psex }</td>
                	<td>${patient.page}</td>
                	<td>${patient.pphonenum}</td>
                	<td>${patient.pidcard}</td>
                	<td>${patient.pdoctor}</td>
                	
                    <tr/>
                </c:forEach>
                </tbody>
            </table>
        </div>
        <nav>
            <ul class="pagination pagination-lg">
             <!--
                <li><a href="#" aria-label="Previous"><span aria-hidden="true">«</span></a></li>
                <li><a href="#">1</a></li>
                <li><a href="#">2</a></li>
                <li><a href="#">3</a></li>
                <li><a href="#">4</a></li>
                <li><a href="#">5</a></li>
                <li><a href="#" aria-label="Next"><span aria-hidden="true">»</span></a></li>
              -->
                 
              	<li><a href="${pageContext.request.contextPath }/AppointmentServlet?method=selectByPage&currentPage=1">首页</a></li>
              	<c:if test="${page.currentpage!=1 }">
              		<li><a href="${pageContext.request.contextPath }/AppointmentServlet?method=selectByPage&currentPage=${page.currentpage-1 }" aria-label="Previous"><span aria-hidden="false">«</span></a></li>
              	</c:if>
 
       			<c:forEach begin="${page.lpage}" end="${page.rpage}" var="pageNum">
       				
            		<li><a href="${pageContext.request.contextPath }/AppointmentServlet?method=selectByPage&currentPage=${pageNum }">${pageNum }</a></li>
           
        		</c:forEach>
        		
        		<c:if test="${page.currentpage!=page.last }">
        			<li><a href="${pageContext.request.contextPath }/AppointmentServlet?method=selectByPage&currentPage=${page.currentpage+1 }" aria-label="Next"><span aria-hidden="false">»</span></a></li>
        		</c:if>
        		<li><a href="${pageContext.request.contextPath }/AppointmentServlet?method=selectByPage&currentPage=${page.last }">尾页</a></li>
                 
            </ul>
        </nav>
    </div>
</div>

</body>
</html>