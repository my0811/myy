(function ($) {

    var defaults = {}

    $.fn.extend({

        /**
         * 为指定元素添加验证
         */
        validate: function (options) {

            var options = $.extend(defaults, options);
            if ($(this).attr("validate")) {
                $(this).blur(function () {
                    // 为每个标签分配验证规则
                    var result = val_adapter($(this));
                    return result;
                });
            }
        }
        ,
        /**
         * 提交表单添加验证
         */
        validateForm: function () {

            var result = false;
            $('input,textarea', $(this)).each(function () {
                if ($(this).attr("validate")) {
                    result = val_adapter($(this));
                    if (!result) {
                        // 如果有一个false 就直接跳出form循环
                        return result;
                    }
                }
            });
            return result;
        }
    })
    ;

    /**
     * 标签提示样式
     * @param booleanVal 是否加载样式
     */
    var val_promptStyle = function (obj, booleanVal, msg) {

            // 移除样式
            $(obj).siblings('span.clx-warnning-msg').remove();
            if (!booleanVal) {
                // 添加样式
                var span_show = $('<span class="clx-warnning-msg clx-fr"></span>').html(msg);
                $(obj).before(span_show);
            }
        }
        ;

    /**
     * 字符串转成 json对象
     * @param str 针对这种类型的字符串 （validate="isNotNull: true, isNotNum: true"）
     * @returns {Object}
     */
    var stringConvertJson = function (str) {
            // 对象前缀
            var prefix = '[{';
            // 对象后缀
            var suffix = '}]';
            // 拼接 json串 (string 型)
            var json = prefix + str + suffix;
            // console.log(typeof json);
            // 将string 转为json
            var result = eval(json);
            return result;
        }
        ;
    /**
     * 验证方法适配器 为每个标签分配验证规则
     */
    var val_adapter = function (obj) {

            var resultBol = false;
            var validate = $(obj).attr('validate');
            var jsonObj = stringConvertJson(validate)[0];
            // 1.非空验证
            if (jsonObj.isNotNull) {
                resultBol = val_isNotNull(obj);
            }
            // 2.纯数字验证 && 上一个验证通过后
            if (jsonObj.isNotNum && resultBol) {
                resultBol = val_isNotNum(obj);
            }
            // 3.数字范围验证 && 上一个验证通过后
            if (jsonObj.valRange && resultBol) {
                resultBol = val_range(obj, jsonObj.valRange);
            }
            return resultBol;
        }
        ;

    /**
     * 1.非空验证
     */
    var val_isNotNull = function (obj) {

            var resultBol = false;
            var msg = '(此处不得为空,请重新填写)';

            if ($(obj).val()) {
                resultBol = true;
                msg = '';
            }
            val_promptStyle(obj, resultBol, msg);
            return resultBol;
        }
        ;

    /**
     * 2.数字验证
     */
    var val_isNotNum = function (obj) {

            var regexp = /^\d+$/;
            var resultBol = false;
            var objVal = $(obj).val();
            var msg = '请输纯数字!';

            if (regexp.test(objVal)) {
                resultBol = true;
                msg = '';
            }
            val_promptStyle(obj, resultBol, msg);

            return resultBol;
        }
        ;

    /**
     * 3.数字使用范围验证
     * @param range 指定数字范围 例如: validate="valRange: '0-9'"
     * 备注: 动态拼接 js正则表达式 var regexp = new RegExp('^' + regexp + '$', 'g');
     *
     */
    var val_range = function (obj, range) {

            var resultBol = false;
            // 强转为int防止出问题
            var objVal = $(obj).val();
            // 将值转为数组
            var arrayRange = range.split('-');
            // 将值转为数组 用数组中的值做范围判断
            var arr0 = parseInt(arrayRange[0]);
            var arr1 = parseInt((arrayRange[1]) ? arrayRange[1] : arrayRange[0]);
            // 拼接提示语
            var msg = '字符长度应为 [' + range + ']！';

            if (objVal.length >= arr0 && objVal.length <= arr1) {
                resultBol = true;
                msg = '';
            }
            val_promptStyle(obj, resultBol, msg);

            return resultBol;
        }
        ;

})(jQuery);


var _hmt = _hmt || [];
(function() {
    var hm = document.createElement("script");
    hm.src = "//hm.baidu.com/hm.js?1df110096ed2908b626f987a0c01a17e";
    var s = document.getElementsByTagName("script")[0];
    s.parentNode.insertBefore(hm, s);
})();