<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE>
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
    <!--//end-smoth-scrolling-->
</head>
<body>
<div class="side-bar">
    <a href="#" class="icon-qq">客服聊天</a>
    <a href="#" class="icon-chat"> <div class="chat-tips"><i></i>
        <img style="width:138px;height:138px;" src="${pageContext.request.contextPath }/page/image/helloweba.jpg" alt="微信订阅号"></div></a>
    <a target="_blank" href="" class="icon-blog">微博</a>
    <a href="https://mail.qq.com/" class="icon-mail">mail</a>
</div>

<!--header-->
<div class="header">
    <div class="container">
        <div class="header-logo">
            <a href="${pageContext.request.contextPath }/page/index.jsp"><img src="${pageContext.request.contextPath }/page/images/logo.png" alt="logo"/></a>
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
<!--banner-->
<div class="banner">
    <div class="container ">
        <!-- banner-text Slider starts Here -->
        <script src="${pageContext.request.contextPath }/page/js/responsiveslides.min.js"></script>
        <script>
            // You can also use "$(window).load(function() {"
            $(function () {
                // Slideshow 4
                $("#slider3").responsiveSlides({
                    auto: true,
                    pager: true,
                    nav: false,
                    speed: 500,
                    namespace: "callbacks",
                    before: function () {
                        $('.events').append("<li>before event fired.</li>");
                    },
                    after: function () {
                        $('.events').append("<li>after event fired.</li>");
                    }
                });
            });
        </script>
        <!--//End-slider-script -->
        <div id="top" class="callbacks_container">
            <ul class="rslides" id="slider3">
                <li>
                    <div class="banner-text">
                        <h1>症状查询</h1>
                        <p>在这里，如果你的身体有什么不舒服，你可以在这里输入你的症状，可以查询解决方法，也可以提交自己的症状，会有专门的医生来为你做解答，医生会根据你的情况来为你做相应的就诊建议。</p>
                    </div>
                </li>
                <li>
                    <div class="banner-text">
                        <h1>预约医生</h1>
                        <p>如果你有去医院看医生的打算，这这里，你可以预约医生，不论是普通号还是专家号，不论是外科、内科还是骨科等等等等，我们这里都有，来为你提供全方位的服务。</p>
                    </div>
                </li>
                <li>
                    <div class="banner-text">
                        <h1>养生之道</h1>
                        <p>
                            你真的知道该如何保养自己的身体，如果不知道的话，那就关注我们把！在这里有最专业的医生来为你的普及一些生活小常识，会教你如何预防一些疾病，希望我们的努力能为你的高品质的生活添砖加瓦。</p>
                    </div>
                </li>
            </ul>
        </div>
    </div>
</div>
<!--//banner-->
<!--banner-bottom-->
<div class="banner-bottom">
    <div class="container">
        <h2>我们的医院拥有各种设备，以及最专业的医生团队来为您的健康保驾护航</h2>
        <a href="#gallery" class="arrow scroll"> </a>
    </div>
</div>
<!--//banner-bottom-->
<!--gallery-->
<div class="gallery" id="gallery">
    <div class="col-md-6 gallery-left">
        <h4>最专业的医生</h4>
        <p>Lorem Ipsum was popularised in the with the release of Letraset sheets contai ningthe with the release
            of </p>
    </div>
    <div class="col-md-6 gallery-right">
        <div class="gallery-grid-a">
            <h4>最负责的态度</h4>
            <p>Lorem Ipsum was popularised in the with the release of Letraset sheets contai ningthe with the release
                of </p>
        </div>
        <div class="gallery-grid-b">
            <h4>最好的设备</h4>
            <p>Lorem Ipsum was popularised in the with the release of Letraset sheets contai ningthe with the release
                of </p>
        </div>
    </div>
    <div class="clearfix"></div>
</div>
<!--//gallery-->
<script type="text/javascript">
    $(document).ready(function () {
        /*
         var defaults = {
         containerID: 'toTop', // fading element id
         containerHoverID: 'toTopHover', // fading element hover id
         scrollSpeed: 1200,
         easingType: 'linear'
         };
         */

        $().UItoTop({easingType: 'easeOutQuart'});

    });
</script>
<a href="#" id="toTop" style="display: block;"> <span id="toTopHover" style="opacity: 1;"> </span></a>
<!--//smooth-scrolling-of-move-up-->
<!-- Bootstrap core JavaScript
================================================== -->
<!-- Placed at the end of the document so the pages load faster -->
<script src="${pageContext.request.contextPath }/page/js/bootstrap.js"></script>
</body>
</html>