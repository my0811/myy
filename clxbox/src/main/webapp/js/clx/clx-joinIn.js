(function ($) {

    var defaults = {
        titleName: '职位名称',
        titleDept: '工作部门',
        titleTime: '发布时间',
        jsonData: [{}]
    }

    $.fn.extend({
        /**
         * 显示列表
         */
        clxList: function (options) {

            var options = $.extend(defaults, options);
            // 为当前对象启别名，为了不和each中的this 冲突
            var obj = $(this);
            var ul = $('<ul class="clx-box-mid clx-common-list"></ul>');
            var ul_li_title = $('<li class="clx-common-list-first clx-article-fontColor clx-font-m clx-font-bold"></li>');
            var ul_li_title_span_name = $('<span></span>');
            var ul_li_title_span_dept = $('<span></span>');
            var ul_li_title_span_time = $('<span class="list-span"></span>');

            ul.appendTo(obj);
            ul_li_title.appendTo(ul);
            ul_li_title_span_name.appendTo(ul_li_title);
            ul_li_title_span_dept.appendTo(ul_li_title);
            ul_li_title_span_time.appendTo(ul_li_title);

            ul_li_title_span_name.html(options.titleName);
            ul_li_title_span_dept.html(options.titleDept);
            ul_li_title_span_time.html(options.titleTime);

            $.each(options.jsonData, function (k, v) {
                var ul_li_contents = $('<li></li>');
                var ul_li_contents_span_name = $('<span></span>');
                var ul_li_contents_span_name_a = $('<a href="javascript:;"></a>');
                var ul_li_contents_span_dept = $('<span></span>');
                var ul_li_contents_span_time = $('<span class="list-span"></span>');

                ul_li_contents.appendTo(ul);
                ul_li_contents_span_name.appendTo(ul_li_contents);
                ul_li_contents_span_dept.appendTo(ul_li_contents);
                ul_li_contents_span_time.appendTo(ul_li_contents);
                ul_li_contents_span_name_a.appendTo(ul_li_contents_span_name);

                ul_li_contents_span_name_a.html(v.name);
                ul_li_contents_span_dept.html(v.dept);
                ul_li_contents_span_time.html(v.time);

                // 添加弹框
                ul_li_contents_span_name_a.click(function () {
                    $.messager.alert(v.name, v.contentText);
                });
            });
        }
    });
})(jQuery);

/**
 * 初始化 函数
 */
$(function () {
    // 1 先加载List
    $('#clxList').clxList({
        jsonData: [{
            name: '平面设计',
            dept: '技术部',
            time: '2015-08-26',
            contentText: '岗位职责： <br/><br/> 1、根据项目要求完成具体的平面视觉设计工作； 2、参与创意讨论，负责创意、设计、制作各类视觉宣传文档（ 平面广告、画册、海报、单页、刊物） 等工作； 3、参与品牌视觉设计工作（包括Logo设计、网站设计、UI界面设计等）； 4、保证设计产品的整体美感，达到良好的视觉表达效果。 <br/><br/><br/>任职要求： <br/>1、至少有1年以上相关工作经验；<br/> 2、对色彩及作品有独特眼光， 具有较高设计水准与一定的文字驾驭能力，能够通过色彩元素与设计理念阐述表达一定的设计思想内涵；<br/> 3、有责任感，工作认真、细致，适应能力强，能快速熟悉公司业务流程；<br/> 4、执行能力突出，熟悉熟练掌握 <br/>    Photoshop 、 Illustrator  等各类软件；<br/>    5、面试时需要展示自己的作品。<br/>'
        }, {
            name: '网页美工',
            dept: '技术部',
            time: '2015-08-26',
            contentText: '岗位职责：<br/> <br/>1、负责产品Web前端部分的开发与维护； <br/>2、负责与交互、视觉设计师沟通协调，进行设计内容的技术实现； <br/>3、配合技术开发人员完成Web前端开发。 <br/>4、负责flash推广物料，展示物料的制作；并能根据技术接口实现flash代码校验。 <br/><br/><br/>任职要求： <br/>1、3年以上Web前端开发工作经验；有游戏相关领域工作经验优先考虑 <br/>2、熟悉W3C规范，精通HTML、DOM、CSS、JavaScript，对表现与数据分离、前端设计、用户体验等具有深入的思考、实践和理解； <br/>3、熟悉各主流浏览器（IE8以上、Firefox、Chrome、Safari）间的差异性，能快速定位、解决开发中遇到的浏览器兼容性问题； <br/>4、对JavaScript代码封装、组织具有一定的经验；熟悉常用的JavaScript框架、类库，如jQuery、EXTJS、YUI等； <br/>5、熟悉常用的Web前端优化方法，并有相关的项目经验； <br/>6、具备良好的代码编程习惯及较强的文档编写能力。 <br/>7、熟练操作FLASH软件，精通AS3，会利用程序做动画效果和各种控制。 <br/>'
        }, {
            name: 'web前端',
            dept: '技术部',
            time: '2015-08-26',
            contentText: '岗位职责： <br/><br/>1、根据公司需要进行Web前端界面的开发工作； <br/>2、根据产品部产品设计（UI），与后台程序配合，高效率高质量地完成前端页面的实现工作； <br/>3、负责跨浏览器兼容； <br/>4、产品交互效果的实现，改善用户体验，以及各项性能的调优等； <br/>5、负责相关软件文档编写和技术支持； <br/><br/><br/>任职要求： <br/>1、至少有1年以上相关工作经验； <br/>2、熟练掌握HTML,CSS和Javascript；熟悉HTML5和CSS3前端实现； <br/>3、熟悉WebUI框架jQuery UI 、Extjs、Bootstrap中的一种或者几种； <br/>4、具有较强的学习能力和领悟力，能主动学习新知识、钻研新技术； <br/>5、能独立开发，具备一定的美学理念； <br/>6、具有良好的沟通能力、团队合作精神、能承担工作压力 <br/>7、对SEO有一定的了解 <br/>8、有电子商务网站开发经验的优先考虑 <br/>'
        }, {
            name: '后端',
            dept: '技术部',
            time: '2015-08-26',
            contentText: '岗位职责： <br/><br/>1、负责Web后端解决方案制定及技术选型； <br/>2、制定软件开发技术规范，推进跟进整个平台的软件开发、平台系统维护，参与关键组件代码编写及评审； <br/>3、保持一定的前瞻性, 随着业务复杂性的增加，负载的增加，运行管理复杂性的增加，持续的推动系统设计的重构； <br/>4、负责编写相关技术文档； <br/>5、负责预研新技术，不断吸收引进互联网、移动互联网的最新技术、平台、工具等； <br/><br/><br/>任职要求： <br/>1、五年以上WEB后端设计开发经验，二年以上中大型web应用系统开发经历，有主导核心业务系统架构设计经验； <br/>2、有较大访问量(日10万uv以上)的系统开发及后端优化案例，对负载均衡、高并发访问、群集计算、数据缓存、点击流数据仓 库、冗余容错等方面有较深入的研究； <br/>3、精通Http协议、Jsp/Servlet、Spring框架、MVC框架、ORM框架以及页面模板技术； <br/>4、熟练掌握Html、Css、JavaScript、jQuery等前端技术； <br/>5、熟练掌握Oracle、MySQL等主流数据库，熟悉数据库建模，具备深厚的SQL功底，了解Mongo DB，NOSQL的数据存储产品，熟悉不同类型和数据库的底层运行原理和优缺点； <br/>6、精通Tomcat、Apache、Nginx等多种服务器配置和使用； <br/>7、熟练使用JUnit、Maven、Git、STS，精通UML，熟悉selenium自动化测试以及Hudson的使用； <br/>8、精通Linux（CentOS），具备参数设置、性能调优、故障定位处理； <br/>'
        }, {
            name: 'ios开发',
            dept: '技术部',
            time: '2015-08-26',
            contentText: '岗位职责： <br/><br/>1. 负责iOS移动平台客户端软件的功能设计、开发、实现和优化；<br/> 2. 根据产品功能模块设计，编码实现各模块功能，并确保开发质量与进度；<br/> 3. 负责软件的编程、调试和模块测试工作。<br/> 4. 负责iOS产品的单元测试、自动化测试等. <br/><br/><br/>任职要求：<br/>1. 对Objective-C语言有深入的理解，至少1年以上iOS项目实际开发经验；<br/> 2. 有较强的架构能力，能独立负责产品的架构规划和架构演进；<br/> 3. 熟悉常用的Framework，对内存管理、对象生命周期有清晰的认识，具备较强的开发、调试、性能优化能力；<br/> 4. 对移动产品有较强的敏感度和热情，具备较强的沟通协调能力，良好的职业素质和团队合作精神，对工作认真负责； <br/>5. 有C/C++开发经验或大型iOS SDK项目开发经验优先。<br/>'
        }, {
            name: '测试',
            dept: '技术部',
            time: '2015-08-26',
            contentText: '职位描述： <br/><br/>(1) 负责软件的功能测试、系统测试、集成测试和界面测试及兼容性测试 <br/>(2) 负责测试用例设计和维护，及业务需求和测试需求相关评审 <br/>(3) 负责缺陷跟踪和软件质量分析等; <br/>(4) 探索和研究新的非功能测试能力 <br/><br/> <br/>任职要求：<br/>(1) 本科以上学历， 计算机类相关专业，1-3年以上软件测试工作经验 <br/>(2) 良好的英语读写能力，听说能力优秀优先考虑 <br/>(3) 态度积极、学习能力强，稳定性好，沟通表达能力好，有团队合作精神 <br/>(2) 有较强的逻辑思维能力和逆向思维能力，具有强烈的质量意识，善于分析和发现问题 <br/>(3) 熟悉软件工程，具备完整的测试理论知识，熟悉软件测试的方法和理论 <br/>(4) 熟悉软件开发、测试流程及规范，能够根据项目情况制定合适的测试方案 <br/>(5) 熟悉以下性能测试工具的一种 Loadrunner， Jmeter <br/>(6) 熟悉常用的需求缺陷管理工具(QC，Jira,Redmine),熟悉SVN代码管理工具； <br/>(7) 对Unix 和Linux 有一定的基础知识，能够独立的完成测试环境搭建和维护 <br/>(8) 至少熟悉一门开发语言，至少熟悉以下数据库的一种 Mysql，SqlServer， Oracle <br/>(9) 有较强的快速学习能力，勇于接受新的挑战 <br/>(10)了解传统研发测试流程及敏捷研发测试流程，具备良好的文档编写能力 <br/>(11) 熟悉Microsoft Excel、 Word和 Outlook； <br/>'
        }, {
            name: '安卓开发',
            dept: '技术部',
            time: '2015-08-26',
            contentText: '职位描述： <br/><br/>1.负责Android平台应用程序开发、定制与维护； <br/>2.根据研发规范和项目流程编写相关的技术文档； <br/>3.编写设计开发及实现文档，开发Android平台手机APP客户端； <br/>4.配合后台完成接口定义； <br/>5.根据测试部门的测试结果进行问题的修正； <br/>6.产品维护、迭代更新。 <br/><br/><br/>任职要求： <br/>1.本科以上学历，计算机相关专业； <br/>2.三年以上Android开发工作经验； <br/>3.熟悉安卓手机软件架构； <br/>4.熟悉安卓开发流程，可独立完成编码与测试； <br/>5.善于思考，良好的分析和独立解决问题的能力； <br/>6.责任心强，能合理安排自己的工作。 <br/>'

        }, {
            name: '运维工程师',
            dept: '技术部',
            time: '2015-08-26',
            contentText: '岗位职责：<br/><br/>1、全面管理运维工作，包括IDC/网络/硬件规划管理、系统运维、数据库运维、应用运维、运维平台与工具开发等； <br/>2、建立和完善规范化的运维体系，保障运维质量； <br/>3、不断研发与探索运维自动化及各类创新途径，缩短运维响应时间，减低运维成本； <br/>4、负责在线服务的 24*7 监控响应，解决运营中遇到的各种问题。 <br/><br/> <br/>任职要求：<br/>1、诚信、正直、强烈的责任感，良好的沟通能力与创新精神； <br/>2、具有大型互联网公司4年以上运维经验，2年以上运维团队管理经验，担任过运维经理等同职务，运维管理服务器数量达到500台以上； <br/>3、精通Linux系统管理，熟练使用shell、perl、python等至少一门脚本语言； <br/>4、熟练掌握Nginx、MySQL、MongoDB、LVS、iptables以及memcached等系统软件，熟练掌握常见监控软件zabbix、Ganglia、Nagios等监控软件的使用； <br/>5、具有分析大型应用系统架构并进行改进的能力，拥有快速排查系统瓶颈的能力； <br/>6、有较强的沟通及协调能力，学习能力强，做事沉稳细致、具有良好文档编写和文字表达能力； <br/>7、熟练掌握各类网络协议，熟悉各类网络产品（交换机、路由器、防火墙等）的配置和管理，有网络安全事件的处置经验，熟悉各类网络安全产品体系； <br/>8、具有海量级互联网业务运营经验，有千万级电信运营商项目运维背景者优先考虑。 <br/>'
        }, {
            name: '市场推广',
            dept: '市场部',
            time: '2015-08-26',
            contentText: '工作职责 <br/><br/>1.通过有效方法对所负责白领区域进行地面推广； <br/>2.建立和维护健康稳定的商家合作渠道关系； <br/>3.执行上级主管其他宣传任务与商家拓展任务； <br/>4.招募管理兼职，加强对应白领商圈的推广工作； <br/><br/><br/>职位要求 <br/>1.注重长远职业发展，学习能力强且勤奋努力； <br/>2.吃苦耐劳，执行性力强，有校园实践或创业经验者优先； <br/>3.有较强的进取心，渴望快速成长，应届毕业生优先； <br/>'
        }, {
            name: '销售',
            dept: '市场部',
            time: '2015-08-26',
            contentText: '职位描述：<br/><br/>1、依据公司经营计划，并配合公司总目标立定本单位的目标完成及工作计划； <br/>2、通过网络、电话等渠道收集整理客户信息，挖掘客户的需求，约见客户等业务； <br/>3、有效准确的向客户传达我们公司的业务范围，及时的整理信息反馈客户。 <br/><br/><br/>职位要求<br/>1、大专以上学历，有一年以上的直接销售经验； <br/>2、具备良好的销售意识，有一定的市场开拓能力； <br/>3、具有良好的分析洞察能力，善于把握客户的心理，表达沟通能力强； <br/>4、具有团队合作意识，脚踏实地，具备优秀的职业素养， <br/>5、工作积极，责任感强，具有一定的抗压能力。 <br/>'
        }, {
            name: '客服专员',
            dept: '市场部',
            time: '2015-08-26',
            contentText: '岗位职责: <br/><br/>1. 负责销售、售后客户回访，回答客户咨询； <br/>2. 客户数据库相关信息的整理、分析和报送。 <br/>3. 创新、完成以顾客为导向的企业文化建设，负责所有与客户有关的监控，管理，服务。 <br/>4. 对市场活动，市场促销活动的支持配合。 <br/>5. 建立客户数据库，客户档案管理。 <br/>6. 根据业务需求更新回访话术 <br/><br/><br/>任职条件 <br/>1. 声音甜美、性格开朗，良好的语言表达能力，自我学习能力较强； <br/>2. 熟练使用word、excel等办公软件进行相关数据统计、分析和汇总； <br/>3. 熟悉客户关系管理的业务流程与管理规范； <br/>4. 具有良好的服务意识，拥有汽车行业经验更佳； <br/>5. 有客服中心经验（call center）或电话营销工作经验，能够独立根据业务需求整理编辑回访话术； <br/>'
        }, {
            name: '文案策划',
            dept: '运营部',
            time: '2015-08-26',
            contentText: '岗位职责: <br/><br/>1) 负责项目相关市场调研及评估工作，及时了解行业政策、行业发展、行业企业机构动态。并对其进行科学的预测和分析，结合公司战略发展规划，为项目做前期定位； <br/>2) 负责组织推进项目的市场定位深化工作，完成项目产品建议书； <br/>3) 制定和实施项目前期销售、营销准备工作执行性计划； <br/>4) 在项目定位的基础上，制定和实施项目整体营销计划、营销费用计划； <br/>5) 制定和实施项目广告宣传计划及费用计划； <br/>6) 制定销售包装工作内容及时间进度； <br/>7) 对项目的销售及策划进度进行动态监控； <br/>8) 负责年度、季度营销报告的编写，阶段性营销思路和策略的制定，编制相应的营销推广方案，并负责实施与评估； <br/>9) 负责指导设计、文案开展工作； <br/>'
        }, {
            name: '新媒体运营',
            dept: '运营部',
            time: '2015-08-26',
            contentText: '岗位职责： <br/><br/>1、 运营在新浪微博及微信社会化媒体的宣传渠道； <br/>2、 微博内容文案及活动文案设计撰写，提升内容质量和传播度； <br/>3、 定期策划并执行微博营销线上活动； <br/>4、 参与推广文案的撰写； <br/>5、 协助配合网站、宣传资料的策划、编辑工作。 <br/>6、负责公司项目微博微信营销的日常推广和维护； <br/>7、利用微博微信平台推广公司的品牌、产品和活动； <br/>8、会使用PS等作图软件 <br/><br/><br/>任职要求： <br/>1、对新媒体市场营销有自己的见解和创新； <br/>2、有较强的洞察力和创新能力，具有一定的新闻敏感性，善于把握最佳的时机； <br/>3、熟悉微博微信各类应用知识和技巧，熟悉工具的传播规律； <br/>4、懂得微博微信等公众平台的运营，掌握吸收微信粉丝的方法； <br/>5、对交互营销特性有着深入了解任职条件 <br/>'
        }, {
            name: '网点服务专员',
            dept: '运营部',
            time: '2015-08-26',
            contentText: '岗位职责： <br/><br/>1、负责业务网点的联络、管理及服务支持、培训工作； <br/>2、在线业务营销推广、渠道拓展和客户维护； <br/>'
        }, {
            name: '人事经理',
            dept: '人事部',
            time: '2015-08-26',
            contentText: '岗位职责： <br/><br/>1. 制定、执行公司人力资源规划； <br/>2. 制定、执行、监督公司人事管理制度； <br/>3. 招聘：制定招聘计划、策划招聘程序、组织招聘工作；安排面试、复试、综合素质测试； <br/>4. 绩效考评：制定考评政策、统计考评结果、管理考评文件、做好考评后的沟通工作。 <br/>5. 激励与报酬：制定薪酬政策、晋升政策；组织提薪评审、晋升评审； <br/>6. 公司福利：制定公司福利政策、办理社会保障福利； <br/>7. 人事关系：办理员工各种人事关系的转移、劳动纠纷的处理； <br/>8 .教育培训；组织员工岗前培训，通过各种培训手段对员工的技能、工作态度进行培养训练，不断提高员工的素质，不断开发员工的潜在能力； <br/>9. 与员工进行积极沟通，了解员工工作、生活情况。 <br/><br/><br/>任职要求： <br/>1、要求有互联网公司或者软件公司工作经历。 <br/>2、熟悉程序开发及互联网从业人员技能标准。会开车优先 <br/>'
        }, {
            name: '人事专员',
            dept: '人事部',
            time: '2015-08-26',
            contentText: '岗位职责： <br/><br/>1、负责办公室的日常管理工作，收发传真、接听电话、各类文本资料制作、组织召开各种会议以及完成领导交办的其它工作；<br/> 2、负责人事、劳资管理等工作，人员招聘、劳动合同签订、建立完善员工人事档案、考勤登、社保手续办理、离职手续办理等；<br/> 3、较强的理解和洞察力，能正确领会、传达、执行领导的决定； <br/>4、具备极强的责任感、工作热情以及优秀的组织、沟通、协调能力和团队精神，能承受较大的工作压力； <br/>5、具备优秀的职业素养和职业操守，具有较强的保密意识； <br/>6、形象好、气质佳，大方得体；<br/> 6、熟练操作office等各种办公应用软件。<br/> 7、协助领导监督各部门工作。 <br/><br/><br/>任职要求：<br/> 1、统招专科及以上学历，一年左右工作经验，25-35岁；<br/> 2、熟练操作电脑；<br/> 3、具有很强的学习能力，接受新事物能力；<br/> 4、具有很强的沟通、协调能力；<br/> 5、具有认真、细致、负责任的做事态度； <br/>'
        }]
    });

    //$('#alert').click(function () {
    //    $.messager.alert("操作提示", "您确定要执行操作吗？");
    //});
    //$('#confirm').click(function () {
    //    $.messager.confirm("操作提示", "您确定要执行操作吗？", function (data) {
    //        if (data) {
    //            alert("确定");
    //        }
    //        else {
    //            alert("取消");
    //        }
    //    });
    //});


})
;
var _hmt = _hmt || [];
(function() {
    var hm = document.createElement("script");
    hm.src = "//hm.baidu.com/hm.js?1df110096ed2908b626f987a0c01a17e";
    var s = document.getElementsByTagName("script")[0];
    s.parentNode.insertBefore(hm, s);
})();