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
<script src="js/clx/clx-districtSettled.js"></script>
<!--[if lt IE 9]>
    <script src="./js/html5shiv.js"></script>
    <![endif]-->
</head>
<body>
  <div class="wrap">
    <header>
      <%@ include file="common-base/common-navigate.jsp"%>
      <!-- 标记当前页面的url -->
      <input id="pageMark" type="hidden" value="districtSettledController/initDistrictSettled" />
      <div class="clx-staticImg-box clx-box-mid" id="clxImgBox" style="background: url('./img/district-bq.jpg')"></div>
    </header>
    <article class="clx-common-article clx-box-mid">
      <div class="clx-common-article-box">
        <div>
          <h4 class="clx-article-fontColor clx-font-xl clx-font-bold">部分入驻小区</h4>
        </div>
      </div>
      <div class="clx-common-article-box" id="listInfo"></div>
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