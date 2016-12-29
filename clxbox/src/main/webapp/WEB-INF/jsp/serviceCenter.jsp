<%@ page language="java" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="zh-CN">
<head lang="zh-CN">
<meta charset="utf-8" />
<%@ include file="common-css/common-css.jsp"%>
<%@ include file="common-js/common-js.jsp"%>
<title>大连九江泰科技有限公司</title>
<meta name="keywords" content="" />
<meta name="description" content="大连九江泰科技有限公司官网" />
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
<meta name="renderer" content="webkit">
<meta name="viewport" content="width=device-width" />
<link href="./img/clx-box.ico" mce_href="./img/clx-box.ico" rel="bookmark" type="image/x-icon" />
<link href="./img/clx-box.ico" mce_href="./img/clx-box.ico" rel="icon" type="image/x-icon" />
<link href="./img/clx-box.ico" mce_href="./img/clx-box.ico" rel="shortcut icon" type="image/x-icon" />
<link href="./img/clx-box.png" mce_href="./img/clx-box.ico" rel="apple-touch-icon" type="image/x-icon" />
<link rel="stylesheet" type="text/css" href="./css/reset.css" />
<link rel="stylesheet" type="text/css" href="./css/function.css" />
<link rel="stylesheet" type="text/css" href="./css/reverb-app.css" />
<!--[if lt IE 9]>
    <script src="./js/html5shiv.js"></script>
    <![endif]-->
</head>
<body>
  <div class="wrap">
    <header>
      <%@ include file="common-base/common-navigate.jsp"%>
      <!-- 标记当前页面的url -->
      <input id="pageMark" type="hidden" value="serviceCenterController/initServiceCenter" />
      <div class="clx-staticImg-box clx-box-mid" style="background: url('./img/service center.jpg')"></div>
    </header>
    <article class="clx-common-article clx-box-mid">
      <div class="clx-common-article-box">
        <div>
          <h4 class="clx-article-fontColor clx-font-xl clx-font-bold">储留箱简介</h4>
        </div>
      </div>
      <div class="clx-common-article-box">
        <div class="clx-content-box clx-box-mid clx-SYfont-famliy clx-font-m clx-article-fontColor text-indent">
          <p>目前80%以上的储留箱智能快递终端分布在大连市内各大中高档小区，服务于十几万个家庭，上百万名用户，是大连地区最受欢迎的智能快递终端。</p>
          <p>解决住户需求：收发快件却家中无人；网购热潮邂逅临时出行；不花一分钱，储留箱帮你收快递</p>
          <p>解决快递需求：解决送件效率低时间长的问题；避免重复送件；工作更方便顺畅</p>
          <p>解决物业需求：所有快件均可放入储留箱安置，把空间还给自己；无需登记，省心省力；安全问题——交给监控；支持自定义形状，物品摆放随心所欲</p>
          <p>更多O2O功能：收快递，洗衣店，储物柜，线上线下活动 全方位立体化解决用户需求，功能增多实用性更强更便民，与人们的日常生活紧密相连。</p>
        </div>
      </div>
      <div class="clx-common-article-box">
        <div>
          <h4 class="clx-article-fontColor clx-font-xl clx-font-bold">快件查询</h4>
        </div>
      </div>
      <div class="clx-common-article-box">
        <div class="clx-content-box clx-box-mid">
          <form action="" class="clx-checkCode-form" autocomplete="off">
            <label for="userMobilePhone">运单编号:</label>
            <input id="userMobilePhone" class="input-style" type="text" style="width: 335px; margin-right: 54px;" />
            <label for="checkCode">验证码:</label>
            <input id="checkCode" class="input-style" type="text" style="width: 90px;" />
            <a class="clx-checkCode-img" href="#">
              <img src="./img/checkCode.png" alt="验证码图片" />
            </a>
            <a class="clx-checkCode-btn" tyoe="button" href="#" style="margin-left: 16px;">查询</a>
          </form>
        </div>
        <div class="clx-content-box clx-box-mid" style="width: 100px; padding: paddiu;">
          <img src="./img/onloading.gif" alt="" />
        </div>
        <div class="clx-content-box clx-box-mid clx-express " style="display: none;"></div>
      </div>
    </article>
    <footer>
      <div class="clx-footer clx-box-mid">
        <div class="clx-footer-box clx-fl">
          <h4 class="clx-font-ml clx-font-bold clx-article-fontColor clx-SYfont-famliy">联系我们</h4>
          <span class="clx-SYfont-famliy clx-font-m clx-block">地址:大连市沙河口区西安路</span>
          <span class="clx-SYfont-famliy clx-font-m clx-block">电话:+4000-999-105</span>
          <span class="clx-SYfont-famliy clx-font-m clx-block">邮箱:clx@clxbox.com</span>
          <div class="clx-clear"></div>
        </div>
        <div class="clx-footer-box clx-fr">
          <ul class="clx-footer-box-padding">
            <li class="clx-fl">
              <a class="clx-banner-box clx-blog" href="http://weibo.com/clxbox" target="_blank"></a>
              <p class="clx-font-s clx-article-fontColor">新浪微博</p>
            </li>
            <li class="clx-fl">
              <a class="clx-banner-box clx-weixin"></a>
              <p class="clx-font-s clx-article-fontColor">关注微信</p>
            </li>
            <li class="clx-fl clx-li-last">
              <img src="./img/clx-qr-code.jpg" alt="网站二维码" />
            </li>
          </ul>
        </div>
        <div class="clx-clear"></div>
      </div>
      <div class="clx-footer-finshed">
        <p class="clx-btn-fontColor clx-font-xs">
          Copyright © 2015
          <mark>
            <strong>大连九江泰科技有限公司</strong>
          </mark>
          All Rights Reserved
        </p>
        <p class="clx-btn-fontColor clx-font-xs">辽ICP备10000000号 辽公网安备11000000000000</p>
      </div>
    </footer>
  </div>
</body>
</html>