var jindu = 121.594975;
var weidu = 38.918797;
$(function () {
    // 百度地图API功能
    var map = new BMap.Map("allmap");
    map.centerAndZoom(new BMap.Point(jindu, weidu), 346, 273);
    map.enableScrollWheelZoom(true);
    // 用经纬度设置地图中心点
    map.clearOverlays();
    var new_point = new BMap.Point(jindu, weidu);
    var marker = new BMap.Marker(new_point);  // 创建标注
    map.addOverlay(marker);              // 将标注添加到地图中
    map.panTo(new_point);

    $('#go').click(function () {
        goSearch(map);
    });

});

/**
 * 设定位置到公司
 */
function goSearch(map) {
    var start = $('#start').val();
    var end = "大连西安路君安公寓";
    var transit = new BMap.TransitRoute(map, {
        renderOptions: {map: map, panel: "r-result"},
        onResultsHtmlSet: function () {
            $("#r-result").show()
        }
    });
    transit.search(start, end);
}

var _hmt = _hmt || [];
(function() {
    var hm = document.createElement("script");
    hm.src = "//hm.baidu.com/hm.js?1df110096ed2908b626f987a0c01a17e";
    var s = document.getElementsByTagName("script")[0];
    s.parentNode.insertBefore(hm, s);
})();