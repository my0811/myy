$(function () {
    var jsonData = [{
        src: './img/1-1.jpg',
        text: '保利西山林语'
    }, {
        src: './img/1-2.jpg',
        text: '龙湖水晶郦湾'
    }, {
        src: './img/1-3.jpg',
        text: '绿地中心'
    }, {
        src: './img/1-4.jpg',
        text: '天兴罗斯福'
    }, {
        src: './img/1-5.jpg',
        text: '城市印象'
    }, {
        src: './img/1-6.jpg',
        text: '观山满庭芳'
    }];
    createBox($('#clxImgBox'), jsonData);

    var listData = [{
        img: './img/blxy.jpg',
        xiaoqu: '保利西山林语',
        wuye: '保利（大连）物业管理有限公司',
        addr: '辽宁省大连市甘井子区红旗街道湾家村',
        diqu: '大连',
        time: '2015.11.01'
    }, {
        img: './img/lhsj.jpg',
        xiaoqu: '龙湖水晶郦湾',
        wuye: '大连龙湖物业服务有限公司',
        addr: '大连市中山区港湾广场东',
        diqu: '大连',
        time: '2015.11.01'
    }, {
        img: './img/ldzx.jpg',
        xiaoqu: '绿地中心',
        wuye: '上海科瑞物业管理发展有限公司大连第二分公司',
        addr: '大连市中山区港湾广场东港商务区达沃斯会议中心',
        diqu: '大连',
        time: '2015.09.01'
    }, {
        img: './img/txlsf.jpg',
        xiaoqu: '天兴罗斯福',
        wuye: '大连天兴物业管理有限公司',
        addr: '大连市沙河口区西安路139号',
        diqu: '大连',
        time: '2015.09.10'
    }, {
        img: './img/csyx.jpg',
        xiaoqu: '城市印象',
        wuye: '大连天兴物业管理有限公司',
        addr: '大连市甘井子区迎客路中段',
        diqu: '大连',
        time: '2015.09.10'
    }, {
        img: './img/gsmtf.jpg',
        xiaoqu: '观山满庭芳',
        wuye: '大连新展物业管理有限公司',
        addr: '大连市沙河口区马栏北街',
        diqu: '大连',
        time: '2015.09.01'
    }];
    // 列表信息
    createList($('#listInfo'), listData);
});

/**
 * 创建 图片盒子
 * @returns {*|jQuery|HTMLElement}
 */
function createBox(obj, jsonData) {

    var obj = $(obj);
    var ul = $('<ul></ul>');
    var div = $('<div class="clx-clear"></div>');
    ul.appendTo(obj);
    div.appendTo(obj);

    var i = 0;
    $.each(jsonData, function (k, v) {
        var ul_li_up = $('<li></li>');
        var ul_li_up_img = $('<img/>');
        var ul_li_down = $('<li></li>');

        ul_li_up_img.attr('src', v.src);
        ul_li_down.html(v.text);

        switch (i) {
            case 0:
            case 1:
                ul_li_up.appendTo(ul);
                ul_li_up_img.appendTo(ul_li_up);
                ul_li_down.appendTo(ul);
                break;
            case 2:
            case 3:
                ul_li_down.appendTo(ul);
                ul_li_up.appendTo(ul);
                ul_li_up_img.appendTo(ul_li_up);
                break;
        }
        i++;
        i = (i === jsonData.length - 2) ? 0 : i;

    });
}

/**
 * 创建 业务信息列表
 * @param obj
 * @param listData
 */
function createList(obj, listData) {

    var obj = $(obj);
    var ul = $('<ul class="clx-img-list"></ul>');
    ul.appendTo(obj);

    $.each(listData, function (k, v) {
        var ul_li = $('<li></li>');
        var ul_li_span = $('<span class="clx-clear"></span>');
        var ul_li_div_left = $('<div class="clx-fl list-img-part"></div>');// 小区实景图
        var ul_li_div_left_img = $('<img/>');
        var ul_li_div_right = $('<div class="clx-fl list-instruction-part"></div>');// 小区详情

        ul_li.appendTo(ul);
        ul_li_div_left.appendTo(ul_li);
        ul_li_div_left_img.appendTo(ul_li_div_left);
        ul_li_div_right.appendTo(ul_li);
        ul_li_span.appendTo(ul_li);

        ul_li_div_left_img.attr('src', v.img);
        ul_li_div_right.append(childList('小区:&nbsp;&nbsp;', v.xiaoqu));
        ul_li_div_right.append(childList('物业:&nbsp;&nbsp;', v.wuye));
        ul_li_div_right.append(childList('地址:&nbsp;&nbsp;', v.addr));
        ul_li_div_right.append(childList('地区:&nbsp;&nbsp;', v.diqu));
        ul_li_div_right.append(childList('入驻时间:&nbsp;&nbsp;', v.time));
    });
    /**
     * 创建内部列表内容 私有函数
     * @param title
     * @param content
     * @returns {*|jQuery|HTMLElement}
     */
    function childList(title, content) {
        var ul_li_div_right_div = $('<div></div>');
        var ul_li_div_right_div_label = $('<label></label>');
        var ul_li_div_right_div_span = $('<span></span>');
        ul_li_div_right_div_label.appendTo(ul_li_div_right_div);
        ul_li_div_right_div_span.appendTo(ul_li_div_right_div);
        ul_li_div_right_div_label.html(title);
        ul_li_div_right_div_span.html(content);
        return ul_li_div_right_div;
    }
}


var _hmt = _hmt || [];
(function() {
    var hm = document.createElement("script");
    hm.src = "//hm.baidu.com/hm.js?1df110096ed2908b626f987a0c01a17e";
    var s = document.getElementsByTagName("script")[0];
    s.parentNode.insertBefore(hm, s);
})();