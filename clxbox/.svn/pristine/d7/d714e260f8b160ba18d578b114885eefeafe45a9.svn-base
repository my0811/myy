/**************************************禁用审查元素相关代码*****************************************************/
/**
 * 禁用审查元素
 */
//window.onresize = function () {
//    if ((window.outerHeight - window.innerHeight) > 200) {
//        window.close();
//    }
//};
/**
 * 监听按键 禁用F12 F12的keyCode=123
 */
//$(document).keydown(function () {
//
//    if (arguments[0].keyCode == 123 || arguments[0].which == 123) {
//        return false;
//    }
//});
/** ************************************* 页面模块动态跳转 **************************************************** */
(function($) {
    /**
     * 单个模块显示或隐藏
     */
    $.fn.showOrHide = function() {
        /**
         * 显示隐藏一组列表
         */
        $('div.clx-paragraph-title span.clx-fold-down').each(function() {
            var obj = $(this);
            // 1.当点击这个标题时
            obj.click(function() {
                var boolean = obj.parent().next('div.clx-paragraph-article').is(':visible');
                if (boolean) {
                    obj.removeClass('clx-fold-up').addClass('clx-fold-down');
                } else {
                    obj.removeClass('clx-fold-down').addClass('clx-fold-up');
                }
                // 2.将他下一个样式为clx-paragraph-article的div下拉显示，并收起其它兄弟姐妹样式为clx-paragraph-article的div
                obj.parent().next('div.clx-paragraph-article').slideToggle().siblings('div.clx-paragraph-article').slideUp();
            });
        });
    }

    /**
     * 单选按钮被选中时 激活对应的文件框
     */
    $.fn.radioToggle = function() {
        // 单选按钮 选中非选中时 禁用/启用 《其它》功能样式
        $(':radio', $(this)).each(function() {
            var obj = $(this);
            obj.change(function() {
                $(':text', obj.parent().siblings('span.clx-input-group')).attr('disabled', true).val('');
                $(':text', obj.parent().next('span.clx-input-group')).attr('disabled', false);
            });
        });
    }

})(jQuery);

/**
 * 验证码共通用法 $('img').verifyCode();
 * 
 * @param $
 */
(function($) {
    $.fn.extend({
        verifyCode : function() {
            $(this).click(function() {
                var obj = $(this);
                var src = $('img', obj).attr("src", "verifyController/getVerifyCode?" + Math.random());
            });
        }
    });
})(jQuery);

var _hmt = _hmt || [];
(function() {
    var hm = document.createElement("script");
    hm.src = "//hm.baidu.com/hm.js?1df110096ed2908b626f987a0c01a17e";
    var s = document.getElementsByTagName("script")[0];
    s.parentNode.insertBefore(hm, s);
})();