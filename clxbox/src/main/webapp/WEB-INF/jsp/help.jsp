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
<link href="img/clx-box.ico" mce_href="img/clx-box.ico" rel="bookmark" type="image/x-icon" />
<link href="img/clx-box.ico" mce_href="img/clx-box.ico" rel="icon" type="image/x-icon" />
<link href="img/clx-box.ico" mce_href="img/clx-box.ico" rel="shortcut icon" type="image/x-icon" />
<link href="img/clx-box.png" mce_href="img/clx-box.ico" rel="apple-touch-icon" type="image/x-icon" />
<link rel="stylesheet" type="text/css" href="css/reset.css" />
<link rel="stylesheet" type="text/css" href="css/function.css" />
<link rel="stylesheet" type="text/css" href="css/reverb-app.css" />
<script src="js/clx/clx-validate.js"></script>
<script src="js/clx/$.scorll.min.js"></script>
<script src="js/clx/clx-help.js"></script>
<!--[if lt IE 9]>
    <script src="js/html5shiv.js"></script>
    <![endif]-->
</head>
<body>
  <div class="wrap">
    <header>
      <%@ include file="common-base/common-navigate.jsp"%>
      <!-- 标记当前页面的url -->
      <input id="pageMark" type="hidden" value="helpController/initHelp" />
      <div class="clx-staticImg-box clx-box-mid modelList" modelName="顶端" style="background: url('./img/clx-help.jpg')"></div>
    </header>
    <article class="clx-supper-article clx-box-mid">
      <div class="clx-paragraph" id="userPosition">
        <div class="clx-paragraph-title modelList" modelName="用户">
          <h4 class="clx-font-bold clx-font-xl clx-article-fontColor">用户使用流程</h4>
        </div>
        <div class="clx-paragraph-article">
          <h4 class="clx-article-fontColor clx-font-ml">用户使用流程:</h4>
          <div class="clx-paragraph-img clx-box-mid">
            <img src="./img/clx-receive.jpg" alt="用户使用流程图" />
          </div>
        </div>
      </div>
      <div class="clx-paragraph" id="courierPosition">
        <div class="clx-paragraph-title clx-position-father modelList " modelName="快递员">
          <div class="clx-fl">
            <h4 class="clx-font-bold clx-font-xl clx-article-fontColor">快递员申请注册</h4>
          </div>
          <span class="clx-fold-down clx-position-son"> </span>
          <span class="clx-clear"></span>
        </div>
        <div class="clx-paragraph-article clx-display">
          <h4 class="clx-article-fontColor clx-font-ml">注册:</h4>
          <div class="clx-paragraph-form-box">
            <form class="clx-common-form" id="form1" action="helpController/insertHelp" method="post" autocomplete="off" enctype="multipart/form-data">
              <ul>
                <li>
                  <label for="username">姓名:</label>
                  <input id="username" name="username" type="text" validate="isNotNull: true" />
                </li>
                <li>
                  <label for="idCode">身份证:</label>
                  <input id="idCode" name="idCode" type="text" validate="isNotNull: true" />
                </li>
                <li>
                  <label for="handPhone">手机号:</label>
                  <input id="handPhone" name="handPhone" type="text" validate="isNotNull: true" />
                </li>
                <li>
                  <label for="expressCompany">快递公司:</label>
                  <input id="expressCompany" name="expressCompany" type="text" validate="isNotNull: true" />
                </li>
                <li>
                  <label for="area">所在区域:</label>
                  <input id="area" name="area" type="text" validate="isNotNull: true" />
                </li>
                <li class="common-form-last">
                  <div class="clx-upload-group clx-fl">
                    <ul>
                      <li>
                        <h4>手持身份证正面照片:</h4>
                        <div class="clx-upload-imgbox">
                          <img src="./img/ldzx.jpg" alt="手持身份证正面照片" />
                        </div>
                        <a href="javascript:;" class="clx-upload">
                          <span>选择文件</span>
                          <input type="file" name="fileName" value="选择文件">
                        </a>
                      </li>
                      <li>
                        <h4>手持身份证背面照片:</h4>
                        <div class="clx-upload-imgbox">
                          <img src="./img/ldzx.jpg" alt="手持身份证背面照片" />
                        </div>
                        <a href="javascript:;" class="clx-upload">
                          <span>选择文件</span>
                          <input type="file" name="fileName" value="选择文件">
                        </a>
                      </li>
                      <li class="img-last-li">
                        <h4>快递员持本人工作证或名片的清晰照片:</h4>
                        <div class="clx-upload-imgbox">
                          <img src="./img/ldzx.jpg" alt="快递员持本人工作证或名片的清晰照片" />
                        </div>
                        <a href="javascript:;" class="clx-upload">
                          <span>选择文件</span>
                          <input type="file" name="fileName" value="选择文件">
                        </a>
                      </li>
                    </ul>
                  </div>
                  <div class="clx-content-group clx-fl">
                    <ul>
                      <li>
                        <h4>身份证正面照要求:</h4>
                        <div>
                          <p>
                            a)、证件的头像清晰，身份证号码清楚可辨认；
                            <br>
                            b)、必须和手持中的身份证为同一身份证；
                            <br>
                            c)、要求原图，无修改。
                            <br>
                          </p>
                        </div>
                      </li>
                      <li>
                        <ul>
                          <li>
                            <span> 示例: </span>
                            <div>
                              <img src="./img/id-Code-1.jpg" alt="身份证正面照示例" />
                            </div>
                            <div class="clx-clear"></div>
                          </li>
                          <li>
                            <span> </span>
                            <div>
                              <img src="./img/id-Code-2.jpg" alt="身份证反面照示例" />
                            </div>
                            <div class="clx-clear"></div>
                          </li>
                          <li>
                            <span> 示例: </span>
                            <div>
                              <img src="./img/id-Code-3.jpg" alt="带有名片照片示范" />
                            </div>
                            <div class="clx-clear"></div>
                          </li>
                        </ul>
                      </li>
                    </ul>
                  </div>
                  <div class="clx-clear"></div>
                </li>
              </ul>
              <div class="clx-common-form">
                <span class="input-check-part clx-font-xs clx-box-mid clx-agreement-box">
                  <input id="clx_agreement" name="clx_agreement" type="checkbox" value="1" />
                  <label for="clx_agreement">
                    <a class="clx-focus-fontColor" href="./clx-agreement.html" target="_blank">我已阅读《储留箱用户服务协议》并同意上述条款</a>
                  </label>
                </span>
              </div>
              <div class="clx-inline-checkCode clx-box-mid">
                <label for="checkCode">验证码:</label>
                <input id="checkCode" class="input-style" type="text" style="width: 90px;" />
                <a class="clx-checkCode-img" href="javascript:;">
                  <img src="./img/checkCode.jpg" alt="验证码图片" />
                </a>
              </div>
              <div class="clx-btn-box clx-box-mid">
                <input href="javascript:;" class="btn" id="okSubmit1" value="确认提交" type="button" />
              </div>
            </form>
          </div>
        </div>
      </div>
      <div class="clx-paragraph">
        <div class="clx-paragraph-title modelList" modelName="快递员使用流程">
          <h4 class="clx-font-bold clx-font-xl clx-article-fontColor">快递员使用流程</h4>
        </div>
        <div class="clx-paragraph-article">
          <div class="clx-paragraph-img clx-box-mid">
            <img src="./img/clx-send.jpg" alt="快递员使用流程图" />
          </div>
        </div>
      </div>
      <div class="clx-paragraph" id="propertyPosition">
        <div class="clx-paragraph-title modelList" modelName="物业">
          <h4 class="clx-font-bold clx-font-xl clx-article-fontColor">物业管理</h4>
        </div>
        <div class="clx-paragraph-article">
          <h4 class="clx-article-fontColor clx-font-ml">物业进驻方式</h4>
          <div class="clx-paragraph-form-box">
            <div class="clx-dialog-box">
              <span>①点击合作申请链接</span>
              <span>②填写进驻服务表格</span>
              <span>③留下您的联系方式</span>
              <span>④商谈进驻具体事宜</span>
              <span>⑤双方达成合作意向</span>
              <span>⑥储留箱进驻该小区</span>
              <span>⑦服务专员到场讲解</span>
              <span>⑧体验省时便利服务</span>
              <div class="clx-clear"></div>
            </div>
          </div>
        </div>
        <div class="clx-paragraph-article">
          <h4 class="clx-article-fontColor clx-font-ml">物业使用须知</h4>
          <div class="clx-paragraph-form-box">
            <div class="clx-dialog-box">
              <div class="clx-content-part">
                <p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;物业可引导本辖区内的快递员统一将当时未送达的包裹放入储留箱内，减少物业代收快递所产生的时间、空间和人力成本，解决困扰物业多年的收件问题。</p>
              </div>
            </div>
          </div>
        </div>
        <div class="clx-paragraph-article">
          <h4 class="clx-article-fontColor clx-font-ml">合作物业管理</h4>
          <div class="clx-paragraph-form-box">
            <div class="clx-dialog-box">
              <div class="clx-content-part">
                <p>
                  储留箱维护管理服务
                  <br />
                  一键呼叫：4000-999-105
                  <br />
                  应急邮箱：wilson_wu@clxbox.com
                  <br />
                </p>
              </div>
            </div>
          </div>
        </div>
      </div>
      <div class="clx-paragraph" id="problemPosition">
        <div class="clx-paragraph-title modelList" modelName="常见问题FAQ">
          <h4 class="clx-font-bold clx-font-xl clx-article-fontColor">常见问题</h4>
        </div>
        <div class="clx-paragraph-article">
          <div class="clx-dialog-box">
            <div class="clx-content-part clx-article-fontColor">
              <p>
              <h4 class="clx-font-bold clx-font-m">（1）储留箱是什么？</h4>
              <br />
              答：储留箱是大连九江泰科技有限公司生产的智能快递终端，遍布于大连市各大中高档小区，旨在于方便用户及时收取快递，解决困扰用户、物业、快递员多年的收件问题。当您无法及时接收快件时，快递员会把包裹投入储留箱，您可以在方便的时候取走快件。
              <br />
              <br />
              <br />
              <h4 class="clx-font-bold clx-font-m">（2）储留箱收取快件需要收费吗？</h4>
              <br />
              答：储留箱是我司社区便民服务的载体，旨在为广大用户提供服务，不会向用户索要收件费用。
              <br />
              <br />
              <br />
              <h4 class="clx-font-bold clx-font-m">（3）储留箱会不会泄露我的个人信息？</h4>
              <br />
              答：储留箱承诺不会泄露您的任何信息，并在这里教你几招实用的小技巧，请您平时做好如下措施，以防个人信息泄露。
              <br />
              浏览网站时要及时清理痕迹。现在，大家从网上获取信息几乎占据信息来源量的一半以上，可很多人浏览后认为无所谓，或者未提交，不会留下信息，其实你的任何输入都会留下痕迹，经过技术的处理，都可以提炼出相关信息数据。所以,登陆过网站，或使用公共电脑的朋友，一定要记得及时清理浏览过的痕迹。
              <br />
              参与活动时不要同时留下姓名和手机号码。有些市民喜欢参加各种活动，领取点小礼品，留下自己的姓名和手机号码。孰料，通过这样一个简单的信息，有备而来的营销公司可以检索出你的大量信息。所以，大家如果决定参加活动，也要选择性的参加，尽量避免同时留下真实姓名和手机号码。
              <br />
              填写的废弃表格不要乱扔。办理各种业务时，难免笔误，很多人习惯将废弃的表格随手一揉就扔了，你可知道很多人花钱到处买的信息一部分就来自于垃圾桶。
              <br />
              快递单不要太精确。据报道，诈骗者通过快递单获取信息的比例正在上升，甚至很多小偷也会留意快递单信息，在出手前，刻意打个电话，确认你是否在家。所以，既然留有电话可以联系，为了避免以上种种，填写快递单信息时，还是不要精确到门牌号了。铺设储留箱的小区业主，可以直接填写储留箱地址。例如：辽宁省大连市XX区XX小区XX号楼储留箱【186********】，为了保护广大业主安全，避免个人隐私外泄，我们建议广大业主在网购填写地址时隐去详细门牌号，用“储留箱“代替。当出现地址错误的时候,
              请拨打4000-999-105客服电话, 我们会安排值守人员为您联系快递人员解决问题。温馨提示, 在网购或者寄发快件时, 请确认有储留箱设备的小区名称, 避免为您造成不必要的困扰。）
              <br />
              陌生人借电话要谨防。也许有人认为陌生人借电话除了确实需要外，主要就是预防被拿跑了，其实高智商的犯罪已经不会只满足拿跑你一部手机了。那样不仅成功机会小，风险大代价也高。所以，很有可能你会紧接着就接到很多莫名奇怪的电话或短信。这时候，你要注意了，千万不要急于回复或乱回拨。你应该想到了，刚才借你电话的人是在有意套取你的号码信息，然后进行电话诈骗。
              <br />
              <br />
              <br />
              <br />
              <h4 class="clx-font-bold clx-font-m">（4）我为什么没有收到验证码短信？</h4>
              <br />
              答：当快件被快递员放入储留箱设备后, 系统会发送以10690开头、5687结尾的短信，凭借短信里的验证码, 开启对应箱格, 取走快件。
              <br />
              ①手机是否有安装360、腾讯管家、QQ通讯录等拦截软件，检查一下拦截短信。
              <br />
              ②若被运营商屏蔽, 拨打运营商的电话要求接受10690开头、5687结尾的短信。
              <br />
              ③如若以上操作仍无效，建议用户把手机重启试一下。
              <br />
              ④推荐关注微信平台（clx400），绑定手机号码, 就可以随时随地查询快件。
              <br />
              <br />
              <br />
              <h4 class="clx-font-bold clx-font-m">（5）我的快递能在储留箱里放多久？</h4>
              <br />
              答：储留箱作为小区公共资源，为小区业主提供全天候的便捷服务，但为了提高箱子周转率，储留箱提供24小时免费存放时间，如有快件超过24小时未被取走，系统将会自动通知快递员回收快件。所以希望广大业主都能及时取件，让更多的业主都享受到储留箱的便捷服务。为了避免为您造成不必要的困扰, 请关注手机消息,
              及时取走您的快件。
              </p>
            </div>
          </div>
        </div>
      </div>
      <div class="clx-paragraph" id="surveyPosition">
        <div class="clx-paragraph-title clx-position-father modelList" modelName="反馈与调查">
          <div class="clx-fl">
            <h4 class="clx-font-bold clx-font-xl clx-article-fontColor">反馈与调查</h4>
          </div>
          <span class="clx-fold-down clx-position-son"> </span>
          <span class="clx-clear"></span>
        </div>
        <div class="clx-paragraph-article clx-display">
          <form class="clx-common-form" id="form1" action="helpController/insertHelp" method="post" autocomplete="off">
            <ul>
              <li>
                <label>您的身份</label>
                <div class="clx-clear"></div>
                <span class="input-check-part">
                  <input id="check-1" name="xx" type="radio" />
                  <label for="check-1">物业</label>
                </span>
                <span class="input-check-part">
                  <input id="check-2" name="xx" type="radio" />
                  <label for="check-2">业主</label>
                </span>
                <span class="input-check-part">
                  <input id="check-3" name="xx" type="radio" />
                  <label for="check-3">快递员</label>
                </span>
                <span class="input-check-part">
                  <input id="check-4" name="xx" type="radio" />
                  <label for="check-4">其他</label>
                </span>
                <span class="clx-input-group">
                  <input name="another" type="text" style="width: 90px;" disabled="disabled" />
                </span>
              </li>
              <li>
                <label>您所在的区域名称:</label>
                <div class="clx-clear"></div>
                <div class="clx-select-box clx-fl" id="sheng">
                  <select class="clx-select clx-display" name="" id="">
                    <option value="0">请选择</option>
                    <option value="2">河北</option>
                    <option value="1" selected>辽宁</option>
                  </select>
                </div>
                <span class="clx-fl clx-select-title">省</span>
                <div class="clx-select-box clx-fl" id="shi">
                  <select class="clx-select clx-display" name="" id="">
                    <option value="0">请选择</option>
                    <option value="1">北京</option>
                    <option value="2" selected>大连</option>
                    <option value="3">沈阳</option>
                  </select>
                </div>
                <span class="clx-fl clx-select-title">市</span>
                <!--下拉列表begin-->
                <div class="clx-select-box clx-fl" id="qu">
                  <select class="clx-select clx-display" name="" id="">
                    <option value="0">请选择</option>
                    <option value="1">沙河口</option>
                    <option value="2">皇姑</option>
                  </select>
                </div>
                <!--下拉列表end-->
                <!--下拉列表title-->
                <span class="clx-fl clx-select-title">区</span>
                <div class="clx-clear"></div>
              </li>
              <li>
                <label for="detailAddress">区域详细地址:</label>
                <input id="detailAddress" name="detailAddress" type="text" validate="isNotNull: true" />
              </li>
              <li>
                <label for="usedTerminal">您是否使用过其他智能快递终端:</label>
                <input id="usedTerminal" name="usedTerminal" type="text" />
              </li>
              <li>
                <label for="userSuggestion">您对我们的储留箱有何意见和建议:</label>
                <input id="userSuggestion" name="userSuggestion" type="text" />
              </li>
              <li>
                <div class="clx-textare-group">
                  <label for="userFeedback">您想反馈的问题:</label>
                  <textarea id="userFeedback" name="userFeedback" style="width: 922px" validate="isNotNull: true"></textarea>
                </div>
                <small>（请清晰描述并详细说明）</small>
              </li>
              <li>
                <div></div>
              </li>
              <li>
                <label for="localManager">区域负责人:</label>
                <input id="localManager" name="localManager" type="text" />
              </li>
              <li>
                <label for="localManagerTel">区域负责人联系电话:</label>
                <input id="localManagerTel" name="localManagerTel" type="text" />
              </li>
              <li>
                <label for="visitorName">您的姓名:</label>
                <input id="visitorName" name="visitorName" type="text" validate="isNotNull: true" />
              </li>
              <li>
                <label for="visitorTel">您的电话:</label>
                <input id="visitorTel" name="visitorTel" type="text" validate="isNotNull: true" />
              </li>
              <li>
                <label for="visitorMail">您的邮箱:</label>
                <input id="visitorMail" name="visitorMail" type="text" validate="isNotNull: true" />
                <small>（所有提交申请的用户均有机会出现在我们的年度页面，并收到储留箱送给您的致谢礼物，为此，请您留下正确的联系方式，方便我们联系您。同时，储留箱承诺不会泄露您的任何信息） </small>
              </li>
            </ul>
            <div class="clx-inline-checkCode clx-box-mid">
              <label for="checkCode">验证码:</label>
              <input id="checkCode" class="input-style" type="text" style="width: 90px;" />
              <a class="clx-checkCode-img" href="javascript:;">
                <img src="./img/checkCode.jpg" alt="验证码图片" />
              </a>
            </div>
            <div class="clx-btn-box clx-box-mid">
              <input href="javascript:;" class="btn " id="okSubmit2" value="确认提交" type="button" />
            </div>
          </form>
        </div>
      </div>
      <div class="m-layer z-display" id="confirm"></div>
    </article>
    <footer>
      <div class="clx-footer clx-box-mid">
        <div class="clx-footer-box clx-fl">
          <h4 class="clx-font-ml clx-font-bold clx-article-fontColor clx-SYfont-famliy">联系我们</h4>
          <span class="clx-SYfont-famliy clx-font-m clx-block">地址:大连市沙河口区西安路</span>
          <span class="clx-SYfont-famliy clx-font-m clx-block">电话:4000-999-105</span>
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
              <span class="clx-banner-box clx-weixin"></span>
              <p class="clx-font-s clx-article-fontColor">微信平台</p>
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
        <div class="clx-friend-href clx-box-mid">
          <ul class="clx-box-mid">
            <span class="clx-fl"> 友情链接:</span>
            <li>
              <a href="http://m.kuaidi100.com" target="_blank">快递查询</a>
            </li>
            <li>
              <a href="http://map.baidu.com/" target="_blank">百度地图</a>
            </li>
            <li>
              <a href="http://m.kuaidi100.com" target="_blank">斑马科技</a>
            </li>
          </ul>
        </div>
      </div>
    </footer>
  </div>
</body>
</html>
