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
<div class="search">
    <div class="container">
        <div class="input">
            <form class="form-horizontal" role="form">
                <fieldset>
                    <legend>症状查询</legend>
                    <div class="form-group">
                        <div class="col-sm-4">
                            <input class="form-control" id="ds_host" type="text" placeholder="请在这里输入你的症状。。。"/>
                        </div>
                    </div>
                </fieldset>
            </form>
            <div class="bs-docs-example">
                <table class="table table-striped">
                    <thead>
                    <tr>
                        <th>#</th>
                        <th>可能的症状</th>
                        <th>查询明细</th>
                    </tr>
                    </thead>
                    <tbody>
                    <tr>
                        <td>1</td>
                        <td>流鼻血</td>
                        <td><h6 class="t-button">
                            <a href="javascript:void(0);" onclick="showalert(0);"><span class="label label-primary">点击查询</span></a>
                        </h6></td>
                    </tr><tr>
                        <td>1</td>
                        <td>流鼻血</td>
                        <td><h6 class="t-button">
                            <a href="javascript:void(0);" onclick="showalert(0);"><span class="label label-primary">点击查询</span></a>
                        </h6></td>
                    </tr><tr>
                        <td>1</td>
                        <td>流鼻血</td>
                        <td><h6 class="t-button">
                            <a href="javascript:void(0);" onclick="showalert(0);"><span class="label label-primary">点击查询</span></a>
                        </h6></td>
                    </tr><tr>
                        <td>1</td>
                        <td>流鼻血</td>
                        <td><h6 class="t-button">
                            <a href="javascript:void(0);" onclick="showalert(0);"><span class="label label-primary">点击查询</span></a>
                        </h6></td>
                    </tr>

                    </tbody>
                </table>
            </div>
            <nav>
                <ul class="pagination pagination-lg">
                    <li><a href="#" aria-label="Previous"><span aria-hidden="true">«</span></a></li>
                    <li><a href="#">1</a></li>
                    <li><a href="#">2</a></li>
                    <li><a href="#">3</a></li>
                    <li><a href="#">4</a></li>
                    <li><a href="#">5</a></li>
                    <li><a href="#" aria-label="Next"><span aria-hidden="true">»</span></a></li>
                </ul>
            </nav>
        </div>
    </div>
</div>
<script type="text/javascript">
    function showalert(num){
        bootbox.alert({
            buttons: {
                ok: {
                    label: '确定',
                    className: 'btn-myStyle'
                }
            },
            message: '你好，鼻子偶尔出血的原因有上火、气候干燥、鼻中隔偏曲、凝血功能障碍等。 建议你饮食清淡，避免吃些辛辣刺激性强的的食物，可以一天吸入湿化的空气，如果出血较严重建议你完善鼻内镜和凝血常规检查。',
            callback: function() {
            },
            title: "症状详情",
        });
    }
</script>


</body>
</html>