(function ($) {
    function sel_span() {
        var span = $('<span class="u-btns"></span>');
        return span;
    };

    function sel_span_a() {
        var a = $('<a type="button" class="u-btn"></a>');
        return a;
    };

    function sel_span_a_spantxt() {
        var span = $('<span class="btntxt"></span>');
        return span;
    };

    function sel_span_a_spansel() {
        var span = $(' <span class="btnsel"></span>');
        return span;
    };

    function sel_span_menu() {
        var menu = $(' <menu class="u-menu u-menu-max"></menu>');
        return menu;
    };

    function sel_span_menu_li() {
        var li = $('<li></li>');
        return li;
    };

    function sel_span_menu_li_a() {
        var a = $('<a href="javascript:;" data-value=""></a>');
        return a;
    };

    $.fn.sel = {
        select: function (obj) {
            var select = $('select', obj);
            var span = sel_span().appendTo(obj);
            var span_a = sel_span_a().appendTo(span);
            var span_a_spantxt = sel_span_a_spantxt().appendTo(span_a);
            var span_a_spansel = sel_span_a_spansel().appendTo(span_a);
            var span_menu = sel_span_menu().appendTo(span);

            // 下拉列表点击事件
            span_a.click(function () {
                span_menu.slideToggle();
            });
            // 循环生成列表
            $.each($('option', select), function (k, v) {
                var option = $(this);
                var span_menu_li = sel_span_menu_li().appendTo(span_menu);
                var span_menu_li_a = sel_span_menu_li_a().appendTo(span_menu_li);
                // a 标签添加属性
                span_menu_li_a.prop('data-value', k);
                span_menu_li_a.html(v.text);
                // 显示被选中的数据
                if ($(this).attr('selected')) {
                    span_a_spantxt.html(v.text);
                }
                // 列表点击事件
                span_menu_li.click(function () {
                    span_menu.slideToggle();
                    span_a_spantxt.html(v.text);
                    option.attr('selected', true).siblings().attr('selected', false);
                });
            });
        }
    };
})
(jQuery);