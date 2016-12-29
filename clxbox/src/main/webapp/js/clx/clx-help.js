$(function() {
    // 给所有表单添加验证
    $(':text, textarea').each(function() {
        $(this).validate();
    });
    // 置顶按钮事件
    $('#pageTop').click(function() {
        $('html, body').stop().animate({
            'scrollTop' : 0
        }, 1000);
    });
    // 添加模块的显示隐藏事件
    $().showOrHide();
    // 单选按钮被选中时 激活对应的文件框
    $('form').radioToggle();
    // 页面滚动
    $.fn.my_scroll.scroll($(".modelList"), {
        scrollSpeed : 800
    });
    // 滚动导航
    $.fn.my_scroll.rightNavigate();

    $('#okSubmit1').click(function() {
        var obj = $(this);
        // var result = $('#form1').validateForm();
        // if (result) {
        $('#form1').submit();
        // }
        // $.messager.confirm('信息提示', '此功能未开通，敬请期待！', function(data) {
        // if (data) {
        // obj.attr('disabled', true);
        // obj.addClass('clx-disable');
        // }
        // });
    });

    $('#okSubmit2').click(function() {
        var obj = $(this);
        var result = $('#form2').validateForm();
        // $.messager.confirm('信息提示', '此功能未开通，敬请期待！', function(data) {
        // if (data) {
        // obj.attr('disabled', true);
        // obj.addClass('clx-disable');
        // }
        // });
    });

    // 测试下拉列表
    $.fn.sel.select($('#sheng'));
    $.fn.sel.select($('#shi'));
    $.fn.sel.select($('#qu'));

    // 验证码
    $('.clx-checkCode-img').verifyCode();

});

var _hmt = _hmt || [];
(function() {
    var hm = document.createElement("script");
    hm.src = "//hm.baidu.com/hm.js?1df110096ed2908b626f987a0c01a17e";
    var s = document.getElementsByTagName("script")[0];
    s.parentNode.insertBefore(hm, s);
})();