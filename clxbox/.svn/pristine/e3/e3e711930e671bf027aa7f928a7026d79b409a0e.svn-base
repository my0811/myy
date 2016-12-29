$(function() {
    // 给所有表单添加验证
    $(':text, textarea').each(function() {
        $(this).validate();
    });
    // 单选按钮被选中时 激活对应的文件框
    $('form').radioToggle();
    // 添加模块的显示隐藏事件
    $().showOrHide();

    $('#okSubmit1').click(function() {
        var obj = $(this);
        $.messager.confirm('信息提示', '此功能未开通，敬请期待！', function(data) {
            if (data) {
                obj.attr('disabled', true);
                obj.addClass('clx-disable');
            }
        });
    });

    $('#okSubmit2').click(function() {
        var obj = $(this);
        $.messager.confirm('信息提示', '此功能未开通，敬请期待！', function(data) {
            if (data) {
                obj.attr('disabled', true);
                obj.addClass('clx-disable');
            }
        });
    });

    $('#okSubmit3').click(function() {
        var obj = $(this);
        $.messager.confirm('信息提示', '此功能未开通，敬请期待！', function(data) {
            if (data) {
                obj.attr('disabled', true);
                obj.addClass('clx-disable');
            }
        });
    });

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