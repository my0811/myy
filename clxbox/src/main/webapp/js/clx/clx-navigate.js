$(function() {

    $('#navi').append(createNavigate());
    // 绑定事件
    $('#skipForm a').each(function() {
        $(this).click(function() {
            if ($(this).attr('class') != 'logo') {
                var url = getUrl($(this));
                skipForm(url);
            }
        });
    });
});

function navi_ul() {
    var ul = $('<ul class="clx-fr"></ul>');
    return ul;
};

function navi_li() {
    var li = $('<li></li>');
    return li;
};

function navi_a() {
    var a = $('<a class="clx-font-s clx-btn-fontColor" href="javascript:;" ></a>');
    return a;
};

function createNavigate() {

    /**
     * <pre>
     * 注意 添加url时，要在对应的页面上 添加 一个对应url的隐藏域
     *     &lt;!-- 标记当前页面的url --&gt;
     *     &lt;input id=&quot;pageMark&quot; type=&quot;hidden&quot; value=&quot;对应的url&quot; /&gt;
     * </pre>
     */
    var options = {
        'serviceCenterController/initServiceCenter' : '服务中心',
        'districtSettledController/initDistrictSettled' : '入驻小区',
        'coopApplyController/initCoopApply' : '合作申请',
        'helpController/initHelp' : '使用帮助',
        'aboutController/initAbout' : '关于我们',
        'joinInController/initJoinIn' : '加入我们'
    };

    var ul = navi_ul();
    $.each(options, function(k, v) {
        var ul_li = navi_li();
        var ul_li_a = navi_a();
        ul_li.appendTo(ul);
        ul_li_a.appendTo(ul_li);
        ul_li_a.attr('page-url', k);
        ul_li_a.html(v);

        if ($('#pageMark').val() == k) {
            ul_li.addClass('clx-active');
        }
    });
    return ul;
};

function getUrl(obj) {
    var url = obj.attr('page-url');
    return url;
}

function skipForm(url) {
    $('#skipForm').attr('action', url).submit();
}