SET SESSION FOREIGN_KEY_CHECKS=0;

/* Drop Tables */

DROP TABLE IF EXISTS clx_about_mgt;
DROP TABLE IF EXISTS clx_about_selectusadr_record;
DROP TABLE IF EXISTS clx_agreement;
DROP TABLE IF EXISTS clx_common_bq_group;
DROP TABLE IF EXISTS clx_common_bq_imgdb;
DROP TABLE IF EXISTS clx_common_bq_imgdb_log;
DROP TABLE IF EXISTS clx_common_contactway;
DROP TABLE IF EXISTS clx_common_msgcenter;
DROP TABLE IF EXISTS clx_common_msgcenter_log;
DROP TABLE IF EXISTS clx_coopapply_applyform;
DROP TABLE IF EXISTS clx_coopapply_businesscooperator;
DROP TABLE IF EXISTS clx_coopapply_facilitator;
DROP TABLE IF EXISTS clx_districtsettle_img;
DROP TABLE IF EXISTS clx_districtsettle_img_log;
DROP TABLE IF EXISTS clx_districtsettle_list_group;
DROP TABLE IF EXISTS clx_districtsettle_thumb_group;
DROP TABLE IF EXISTS clx_express_msg_log;
DROP TABLE IF EXISTS clx_formimg_group;
DROP TABLE IF EXISTS clx_form_imgdb;
DROP TABLE IF EXISTS clx_form_imgdb_log;
DROP TABLE IF EXISTS clx_friend_href;
DROP TABLE IF EXISTS clx_help_courierregist;
DROP TABLE IF EXISTS clx_help_faq;
DROP TABLE IF EXISTS clx_help_feedback;
DROP TABLE IF EXISTS clx_help_propertymgt;
DROP TABLE IF EXISTS clx_help_propertymgt_enterway_group;
DROP TABLE IF EXISTS clx_hr_msg;
DROP TABLE IF EXISTS clx_joinus_list;
DROP TABLE IF EXISTS clx_joinus_recruitmentmsg;
DROP TABLE IF EXISTS clx_map_addr;
DROP TABLE IF EXISTS clx_map_city;
DROP TABLE IF EXISTS clx_map_province;
DROP TABLE IF EXISTS clx_map_region;
DROP TABLE IF EXISTS clx_prop;
DROP TABLE IF EXISTS clx_reception_servercenter_msg;




/* Create Tables */

CREATE TABLE clx_about_mgt
(
	-- 关于我们管理表Id
	mgt_id int NOT NULL AUTO_INCREMENT COMMENT '关于我们管理表Id',
	-- 关于我们公司简介
	mgt_companydescribe blob NOT NULL COMMENT '关于我们公司简介',
	-- 我们公司地址位置
	mgt_companyaddr varchar(255) NOT NULL COMMENT '我们公司地址位置',
	-- 数据创建的创建时间
	create_time datetime COMMENT '数据创建的创建时间',
	-- 创建人的账号
	create_user varchar(100) COMMENT '创建人的账号',
	-- 数据重新编辑后的更新时间
	update_time datetime COMMENT '数据重新编辑后的更新时间',
	-- 更新数据的更新人账号名
	update_user varchar(100) COMMENT '更新数据的更新人账号名',
	-- 是否删除,值0/1,0代表未删除1代表已删除
	delete_flag tinyint COMMENT '是否删除,值0/1,0代表未删除1代表已删除',
	PRIMARY KEY (mgt_id)
) ENGINE = InnoDB DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci;


CREATE TABLE clx_about_selectusadr_record
(
	-- 关于我们页面查询记录表id
	selectusaddr_id int NOT NULL AUTO_INCREMENT COMMENT '关于我们页面查询记录表id',
	-- 查询者输入地址
	selecter_addr varchar(255) NOT NULL COMMENT '查询者输入地址',
	-- 数据创建的创建时间
	create_time datetime COMMENT '数据创建的创建时间',
	-- 创建人的账号
	create_user varchar(100) COMMENT '创建人的账号',
	-- 数据重新编辑后的更新时间
	update_time datetime COMMENT '数据重新编辑后的更新时间',
	-- 更新数据的更新人账号名
	update_user varchar(100) COMMENT '更新数据的更新人账号名',
	-- 是否删除,值0/1,0代表未删除1代表已删除
	delete_flag tinyint COMMENT '是否删除,值0/1,0代表未删除1代表已删除',
	PRIMARY KEY (selectusaddr_id)
) ENGINE = InnoDB DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci;


CREATE TABLE clx_agreement
(
	-- 协议Id
	agreement_id int NOT NULL AUTO_INCREMENT COMMENT '协议Id',
	-- 协议总则
	general_rules blob NOT NULL COMMENT '协议总则',
	-- 协议使用规则
	service_regulations blob NOT NULL COMMENT '协议使用规则',
	-- 协议隐私政策
	privacy_policy blob NOT NULL COMMENT '协议隐私政策',
	-- 协议政策更新
	policy_update blob NOT NULL COMMENT '协议政策更新',
	-- 数据创建的创建时间
	create_time datetime COMMENT '数据创建的创建时间',
	-- 创建人的账号
	create_user varchar(100) COMMENT '创建人的账号',
	-- 数据重新编辑后的更新时间
	update_time datetime COMMENT '数据重新编辑后的更新时间',
	-- 更新数据的更新人账号名
	update_user varchar(100) COMMENT '更新数据的更新人账号名',
	-- 是否删除,值0/1,0代表未删除1代表已删除
	delete_flag tinyint COMMENT '是否删除,值0/1,0代表未删除1代表已删除',
	PRIMARY KEY (agreement_id)
) ENGINE = InnoDB DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci;


CREATE TABLE clx_common_bq_group
(
	-- 页面背景图片组id
	bq_groupid int NOT NULL AUTO_INCREMENT COMMENT '页面背景图片组id',
	-- 背景图片组标识码
	bq_groupcode varchar(255) NOT NULL COMMENT '背景图片组标识码',
	-- 背景图片组名
	bq_groupname varchar(100) NOT NULL COMMENT '背景图片组名',
	-- 图片背景库Id
	bq_imgdb_id int NOT NULL COMMENT '图片背景库Id',
	-- 背景图片属性码
	prop_code varchar(20) NOT NULL COMMENT '背景图片属性码',
	-- 背景图片属性值
	prop_value varchar(20) NOT NULL COMMENT '背景图片属性值',
	-- 数据创建的创建时间
	create_time datetime COMMENT '数据创建的创建时间',
	-- 创建人的账号
	create_user varchar(100) COMMENT '创建人的账号',
	-- 数据重新编辑后的更新时间
	update_time datetime COMMENT '数据重新编辑后的更新时间',
	-- 更新数据的更新人账号名
	update_user varchar(100) COMMENT '更新数据的更新人账号名',
	-- 是否删除,值0/1,0代表未删除1代表已删除
	delete_flag tinyint COMMENT '是否删除,值0/1,0代表未删除1代表已删除',
	-- 组编辑锁 1为正在被编辑 0 为未被编辑
	group_usedlock tinyint DEFAULT 0 NOT NULL COMMENT '组编辑锁 1为正在被编辑 0 为未被编辑',
	-- 组启用标识 启用为1 未启用0
	group_enabled tinyint DEFAULT 0 NOT NULL COMMENT '组启用标识 启用为1 未启用0',
	PRIMARY KEY (bq_groupid)
) ENGINE = InnoDB DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci;


CREATE TABLE clx_common_bq_imgdb
(
	-- 背景图片库id
	bq_imgdb_id int NOT NULL AUTO_INCREMENT COMMENT '背景图片库id',
	-- 图片uuid
	bq_imgdb_uuid varchar(255) NOT NULL COMMENT '图片uuid',
	-- 图片地址
	bq_imgdb_address varchar(255) NOT NULL COMMENT '图片地址',
	-- 图片名
	bq_imgdb_name varchar(255) NOT NULL COMMENT '图片名',
	-- oss文件夹名
	bq_imgdb_ossfilename varchar(100) NOT NULL COMMENT 'oss文件夹名',
	-- 图片类型jpg,png等
	bq_imgdb_filetype varchar(10) NOT NULL COMMENT '图片类型jpg,png等',
	-- 图片启用锁 已经被使用为1 未被使用为0
	bq_imgdb_usedlock tinyint DEFAULT 0 NOT NULL COMMENT '图片启用锁 已经被使用为1 未被使用为0',
	-- 数据创建的创建时间
	create_time datetime COMMENT '数据创建的创建时间',
	-- 创建人的账号
	create_user varchar(100) COMMENT '创建人的账号',
	-- 数据重新编辑后的更新时间
	update_time datetime COMMENT '数据重新编辑后的更新时间',
	-- 更新数据的更新人账号名
	update_user varchar(100) COMMENT '更新数据的更新人账号名',
	-- 是否删除,值0/1,0代表未删除1代表已删除
	delete_flag tinyint COMMENT '是否删除,值0/1,0代表未删除1代表已删除',
	PRIMARY KEY (bq_imgdb_id),
	UNIQUE (bq_imgdb_uuid)
) ENGINE = InnoDB DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci;


CREATE TABLE clx_common_bq_imgdb_log
(
	-- 背景图片库id
	bq_imgdb_id int NOT NULL AUTO_INCREMENT COMMENT '背景图片库id',
	-- 图片uuid
	bq_imgdb_uuid varchar(255) NOT NULL COMMENT '图片uuid',
	-- 图片地址
	bq_imgdb_address varchar(255) NOT NULL COMMENT '图片地址',
	-- 图片名
	bq_imgdb_name varchar(255) NOT NULL COMMENT '图片名',
	-- oss文件夹名
	bq_imgdb_ossfilename varchar(100) NOT NULL COMMENT 'oss文件夹名',
	-- 图片类型jpg,png等
	bq_imgdb_filetype varchar(10) NOT NULL COMMENT '图片类型jpg,png等',
	-- 图片启用锁 已经被使用为1 未被使用为0
	bq_imgdb_usedlock tinyint DEFAULT 0 NOT NULL COMMENT '图片启用锁 已经被使用为1 未被使用为0',
	-- 日志表操作标记 
	-- 1 create 创建
	-- 2 update 更新
	-- 3 delete 删除
	log_operation_status varchar(20) NOT NULL COMMENT '日志表操作标记 
1 create 创建
2 update 更新
3 delete 删除',
	-- 数据创建的创建时间
	create_time datetime COMMENT '数据创建的创建时间',
	-- 创建人的账号
	create_user varchar(100) COMMENT '创建人的账号',
	-- 数据重新编辑后的更新时间
	update_time datetime COMMENT '数据重新编辑后的更新时间',
	-- 更新数据的更新人账号名
	update_user varchar(100) COMMENT '更新数据的更新人账号名',
	-- 是否删除,值0/1,0代表未删除1代表已删除
	delete_flag tinyint COMMENT '是否删除,值0/1,0代表未删除1代表已删除',
	PRIMARY KEY (bq_imgdb_id)
) ENGINE = InnoDB DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci;


CREATE TABLE clx_common_contactway
(
	-- 公司联系方式表主键
	contact_id int NOT NULL AUTO_INCREMENT COMMENT '公司联系方式表主键',
	-- 联系方式组标识
	contact_groupcode varchar(255) NOT NULL COMMENT '联系方式组标识',
	-- 联系方式组名称
	contact_groupname varchar(20) NOT NULL COMMENT '联系方式组名称',
	-- 储留箱公司邮箱
	company_mail varchar(100) NOT NULL COMMENT '储留箱公司邮箱',
	-- 公司的客服电话
	company_phone varchar(20) NOT NULL COMMENT '公司的客服电话',
	-- 公司地址
	company_address varchar(255) NOT NULL COMMENT '公司地址',
	-- 公司二维码连接地址
	company_qrcodeHref varchar(255) NOT NULL COMMENT '公司二维码连接地址',
	-- 公司二维码文件名
	company_qrcodename varchar(20) NOT NULL COMMENT '公司二维码文件名',
	-- 公司二维码oss文件夹
	company_qrcodeossfilename varchar(100) NOT NULL COMMENT '公司二维码oss文件夹',
	-- 二维码图片uuid
	qrcodeimg_uuid varchar(255) NOT NULL COMMENT '二维码图片uuid',
	-- 身份证oss文件夹名
	idcard_ossfilename varchar(100) NOT NULL COMMENT '身份证oss文件夹名',
	-- 身份证正面照要求
	idcard_demand blob NOT NULL COMMENT '身份证正面照要求',
	-- 身份证正面照uuid
	idcard_frontimguuid varchar(255) NOT NULL COMMENT '身份证正面照uuid',
	-- 身份证正面照片样例
	idcard_frontimgpath varchar(255) NOT NULL COMMENT '身份证正面照片样例',
	-- 身份证正面照片样例图片名
	idcard_frontimgname varchar(255) NOT NULL COMMENT '身份证正面照片样例图片名',
	-- 身份证背面照uuid
	idcard_backimg_uuid varchar(255) NOT NULL COMMENT '身份证背面照uuid',
	-- 身份证背面样例图片路径
	idcard_backimgpath varchar(255) NOT NULL COMMENT '身份证背面样例图片路径',
	-- 身份证背面样例图片名
	idcard_backimgname varchar(255) NOT NULL COMMENT '身份证背面样例图片名',
	-- 带工作证照片uuid
	employeecard_uuid varchar(255) NOT NULL COMMENT '带工作证照片uuid',
	-- 带工作卡的本人照片样例路径
	employeecard_imgosspath varchar(255) NOT NULL COMMENT '带工作卡的本人照片样例路径',
	-- 带工作卡的图片名称
	employeecard_name varchar(255) NOT NULL COMMENT '带工作卡的图片名称',
	-- 数据创建的创建时间
	create_time datetime COMMENT '数据创建的创建时间',
	-- 创建人的账号
	create_user varchar(100) COMMENT '创建人的账号',
	-- 数据重新编辑后的更新时间
	update_time datetime COMMENT '数据重新编辑后的更新时间',
	-- 更新数据的更新人账号名
	update_user varchar(100) COMMENT '更新数据的更新人账号名',
	-- 是否删除,值0/1,0代表未删除1代表已删除
	delete_flag tinyint COMMENT '是否删除,值0/1,0代表未删除1代表已删除',
	-- 组编辑锁 1为正在被编辑 0 为未被编辑
	group_usedlock tinyint DEFAULT 0 NOT NULL COMMENT '组编辑锁 1为正在被编辑 0 为未被编辑',
	-- 组启用标识 启用为1 未启用0
	group_enabled tinyint DEFAULT 0 NOT NULL COMMENT '组启用标识 启用为1 未启用0',
	PRIMARY KEY (contact_id),
	UNIQUE (contact_groupcode),
	UNIQUE (idcard_frontimguuid),
	UNIQUE (idcard_backimg_uuid),
	UNIQUE (employeecard_uuid)
) ENGINE = InnoDB DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci;


CREATE TABLE clx_common_msgcenter
(
	-- 信息中心id
	msgcenter_id int NOT NULL AUTO_INCREMENT COMMENT '信息中心id',
	-- 联系方式组识别码
	contact_groupcode varchar(255) NOT NULL COMMENT '联系方式组识别码',
	-- 背景图片组识别码
	bq_groupcode varchar(255) NOT NULL COMMENT '背景图片组识别码',
	-- 表单内图片组识别码
	formimg_groupcode varchar(255) NOT NULL COMMENT '表单内图片组识别码',
	-- 入驻小区缩略图识别码
	thumb_groupcode varchar(255) NOT NULL COMMENT '入驻小区缩略图识别码',
	-- 入驻小区列表信息组识别码
	list_groupcode varchar(255) NOT NULL COMMENT '入驻小区列表信息组识别码',
	-- 使用帮助入驻方式组标识码
	enterway_groupcode varchar(255) NOT NULL COMMENT '使用帮助入驻方式组标识码',
	-- 数据创建的创建时间
	create_time datetime COMMENT '数据创建的创建时间',
	-- 创建人的账号
	create_user varchar(100) COMMENT '创建人的账号',
	-- 数据重新编辑后的更新时间
	update_time datetime COMMENT '数据重新编辑后的更新时间',
	-- 更新数据的更新人账号名
	update_user varchar(100) COMMENT '更新数据的更新人账号名',
	-- 是否删除,值0/1,0代表未删除1代表已删除
	delete_flag tinyint COMMENT '是否删除,值0/1,0代表未删除1代表已删除',
	PRIMARY KEY (msgcenter_id)
) ENGINE = InnoDB DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci;


CREATE TABLE clx_common_msgcenter_log
(
	-- 信息中心id
	msgcenter_id int NOT NULL AUTO_INCREMENT COMMENT '信息中心id',
	-- 联系方式组识别码
	contact_groupcode varchar(255) NOT NULL COMMENT '联系方式组识别码',
	-- 背景图片组识别码
	bq_groupcode varchar(255) NOT NULL COMMENT '背景图片组识别码',
	-- 表单内图片组识别码
	formimg_groupcode varchar(255) NOT NULL COMMENT '表单内图片组识别码',
	-- 入驻小区缩略图识别码
	thumb_groupcode varchar(255) NOT NULL COMMENT '入驻小区缩略图识别码',
	-- 入驻小区列表信息组识别码
	list_groupcode varchar(255) NOT NULL COMMENT '入驻小区列表信息组识别码',
	-- 使用帮助入驻方式组标识码
	enterway_groupcode varchar(255) NOT NULL COMMENT '使用帮助入驻方式组标识码',
	-- 日志表操作标记 
	-- 1 create 创建
	-- 2 update 更新
	-- 3 delete 删除
	log_operation_status varchar(20) NOT NULL COMMENT '日志表操作标记 
1 create 创建
2 update 更新
3 delete 删除',
	-- 数据创建的创建时间
	create_time datetime COMMENT '数据创建的创建时间',
	-- 创建人的账号
	create_user varchar(100) COMMENT '创建人的账号',
	-- 数据重新编辑后的更新时间
	update_time datetime COMMENT '数据重新编辑后的更新时间',
	-- 更新数据的更新人账号名
	update_user varchar(100) COMMENT '更新数据的更新人账号名',
	-- 是否删除,值0/1,0代表未删除1代表已删除
	delete_flag tinyint COMMENT '是否删除,值0/1,0代表未删除1代表已删除',
	PRIMARY KEY (msgcenter_id)
) ENGINE = InnoDB DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci;


CREATE TABLE clx_coopapply_applyform
(
	-- 申请合作申请者id
	applyform_id int NOT NULL AUTO_INCREMENT COMMENT '申请合作申请者id',
	-- clx_prop_code
	prop_code varchar(20) NOT NULL COMMENT 'clx_prop_code',
	-- 入驻申请表单申请者身份属性值
	prop_value varchar(20) NOT NULL COMMENT '入驻申请表单申请者身份属性值',
	-- 申请者其选项的具体身份
	applyer_otheridentity varchar(255) COMMENT '申请者其选项的具体身份',
	-- 申请者区域地址编码
	applyer_addrcode varchar(255) NOT NULL COMMENT '申请者区域地址编码',
	-- 申请者详细地址
	applyer_detailaddr varchar(255) NOT NULL COMMENT '申请者详细地址',
	-- 申请储留箱入驻的原因
	apply_reson varchar(255) NOT NULL COMMENT '申请储留箱入驻的原因',
	-- 区域负责人
	regional_manager varchar(10) COMMENT '区域负责人',
	-- 区域负责人电话
	regional_managertel varchar(20) COMMENT '区域负责人电话',
	-- 申请者姓名
	applyer_name varchar(10) COMMENT '申请者姓名',
	-- 申请者电话
	applyer_tel varchar(20) COMMENT '申请者电话',
	-- 申请者邮箱
	applyer_mail varchar(255) COMMENT '申请者邮箱',
	-- 数据创建的创建时间
	create_time datetime COMMENT '数据创建的创建时间',
	-- 创建人的账号
	create_user varchar(100) COMMENT '创建人的账号',
	-- 数据重新编辑后的更新时间
	update_time datetime COMMENT '数据重新编辑后的更新时间',
	-- 更新数据的更新人账号名
	update_user varchar(100) COMMENT '更新数据的更新人账号名',
	-- 是否删除,值0/1,0代表未删除1代表已删除
	delete_flag tinyint COMMENT '是否删除,值0/1,0代表未删除1代表已删除',
	PRIMARY KEY (applyform_id)
) ENGINE = InnoDB DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci;


CREATE TABLE clx_coopapply_businesscooperator
(
	-- 商业合作id
	businesscooper_id int NOT NULL AUTO_INCREMENT COMMENT '商业合作id',
	-- 分类属性码
	prop_code varchar(20) NOT NULL COMMENT '分类属性码',
	-- 分类属性值
	prop_value varchar(20) NOT NULL COMMENT '分类属性值',
	-- 商户分类其他填写内容
	business_othertype varchar(255) COMMENT '商户分类其他填写内容',
	-- 商户名称
	business_name varchar(255) NOT NULL COMMENT '商户名称',
	-- 经营范围
	business_scope varchar(255) NOT NULL COMMENT '经营范围',
	-- 商户区域地址编码
	business_addrcode varchar(255) NOT NULL COMMENT '商户区域地址编码',
	-- 商户详细地址
	business_detailaddr varchar(255) NOT NULL COMMENT '商户详细地址',
	-- 申请内容
	business_text varchar(255) NOT NULL COMMENT '申请内容',
	-- 商户座机
	business_tel varchar(20) NOT NULL COMMENT '商户座机',
	-- 商户联系人
	business_linkman varchar(10) NOT NULL COMMENT '商户联系人',
	-- 联系人电话
	business_linkmantel varchar(20) NOT NULL COMMENT '联系人电话',
	-- 数据创建的创建时间
	create_time datetime COMMENT '数据创建的创建时间',
	-- 创建人的账号
	create_user varchar(100) COMMENT '创建人的账号',
	-- 数据重新编辑后的更新时间
	update_time datetime COMMENT '数据重新编辑后的更新时间',
	-- 更新数据的更新人账号名
	update_user varchar(100) COMMENT '更新数据的更新人账号名',
	-- 是否删除,值0/1,0代表未删除1代表已删除
	delete_flag tinyint COMMENT '是否删除,值0/1,0代表未删除1代表已删除',
	PRIMARY KEY (businesscooper_id)
) ENGINE = InnoDB DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci;


CREATE TABLE clx_coopapply_facilitator
(
	-- 入驻申请表单id
	facilitator_id int NOT NULL AUTO_INCREMENT COMMENT '入驻申请表单id',
	-- 服务商区域地址编码
	facilitator_addrcode varchar(255) NOT NULL COMMENT '服务商区域地址编码',
	-- 服务商企业名称
	facilitator_name varchar(255) NOT NULL COMMENT '服务商企业名称',
	-- 企业简介
	facilitator_introduction blob NOT NULL COMMENT '企业简介',
	-- 服务商联系人
	facilitator_linkman varchar(10) NOT NULL COMMENT '服务商联系人',
	-- 服务商联系人电话
	facilitator_linkmantel varchar(20) NOT NULL COMMENT '服务商联系人电话',
	-- 服务商联企业邮箱
	facilitator_linkmanmail varchar(255) NOT NULL COMMENT '服务商联企业邮箱',
	-- 服务商留言
	facilitator_leaveword blob NOT NULL COMMENT '服务商留言',
	-- 数据创建的创建时间
	create_time datetime COMMENT '数据创建的创建时间',
	-- 创建人的账号
	create_user varchar(100) COMMENT '创建人的账号',
	-- 数据重新编辑后的更新时间
	update_time datetime COMMENT '数据重新编辑后的更新时间',
	-- 更新数据的更新人账号名
	update_user varchar(100) COMMENT '更新数据的更新人账号名',
	-- 是否删除,值0/1,0代表未删除1代表已删除
	delete_flag tinyint COMMENT '是否删除,值0/1,0代表未删除1代表已删除',
	PRIMARY KEY (facilitator_id)
) ENGINE = InnoDB DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci;


CREATE TABLE clx_districtsettle_img
(
	-- 入驻小区图片Id
	img_id int NOT NULL AUTO_INCREMENT COMMENT '入驻小区图片Id',
	-- 入驻小区图片uuid
	img_uuid varchar(255) NOT NULL COMMENT '入驻小区图片uuid',
	-- 入驻小区图片文件路径
	img_osspath varchar(255) NOT NULL COMMENT '入驻小区图片文件路径',
	-- 入驻小区图片文件夹名
	img_ossfilename varchar(100) NOT NULL COMMENT '入驻小区图片文件夹名',
	-- 入驻小区图片文件名
	img_name varchar(255) NOT NULL COMMENT '入驻小区图片文件名',
	-- 入驻小区图片类型
	img_type varchar(10) NOT NULL COMMENT '入驻小区图片类型',
	-- 图片启用锁 已经启用为1 未启用为0
	img_usedlock tinyint DEFAULT 0 NOT NULL COMMENT '图片启用锁 已经启用为1 未启用为0',
	-- 数据创建的创建时间
	create_time datetime COMMENT '数据创建的创建时间',
	-- 创建人的账号
	create_user varchar(100) COMMENT '创建人的账号',
	-- 数据重新编辑后的更新时间
	update_time datetime COMMENT '数据重新编辑后的更新时间',
	-- 更新数据的更新人账号名
	update_user varchar(100) COMMENT '更新数据的更新人账号名',
	-- 是否删除,值0/1,0代表未删除1代表已删除
	delete_flag tinyint COMMENT '是否删除,值0/1,0代表未删除1代表已删除',
	PRIMARY KEY (img_id),
	UNIQUE (img_uuid)
) ENGINE = InnoDB DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci;


CREATE TABLE clx_districtsettle_img_log
(
	-- 入驻小区图片Id
	img_id int NOT NULL AUTO_INCREMENT COMMENT '入驻小区图片Id',
	-- 入驻小区图片uuid
	img_uuid varchar(255) NOT NULL COMMENT '入驻小区图片uuid',
	-- 入驻小区图片文件路径
	img_osspath varchar(255) NOT NULL COMMENT '入驻小区图片文件路径',
	-- 入驻小区图片文件夹名
	img_ossfilename varchar(100) NOT NULL COMMENT '入驻小区图片文件夹名',
	-- 入驻小区图片文件名
	img_name varchar(255) NOT NULL COMMENT '入驻小区图片文件名',
	-- 入驻小区图片类型
	img_type varchar(10) NOT NULL COMMENT '入驻小区图片类型',
	-- 图片启用锁 已经启用为1 未启用为0
	img_usedlock tinyint DEFAULT 0 NOT NULL COMMENT '图片启用锁 已经启用为1 未启用为0',
	-- 日志表操作标记 
	-- 1 create 创建
	-- 2 update 更新
	-- 3 delete 删除
	log_operation_status varchar(20) NOT NULL COMMENT '日志表操作标记 
1 create 创建
2 update 更新
3 delete 删除',
	-- 数据创建的创建时间
	create_time datetime COMMENT '数据创建的创建时间',
	-- 创建人的账号
	create_user varchar(100) COMMENT '创建人的账号',
	-- 数据重新编辑后的更新时间
	update_time datetime COMMENT '数据重新编辑后的更新时间',
	-- 更新数据的更新人账号名
	update_user varchar(100) COMMENT '更新数据的更新人账号名',
	-- 是否删除,值0/1,0代表未删除1代表已删除
	delete_flag tinyint COMMENT '是否删除,值0/1,0代表未删除1代表已删除',
	PRIMARY KEY (img_id)
) ENGINE = InnoDB DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci;


CREATE TABLE clx_districtsettle_list_group
(
	-- 入驻小区列表信息组Id
	list_group_id int NOT NULL AUTO_INCREMENT COMMENT '入驻小区列表信息组Id',
	-- 入驻小区列表组识别码
	list_groupcode varchar(255) NOT NULL COMMENT '入驻小区列表组识别码',
	-- 入驻小区列表组名称
	list_groupname varchar(255) NOT NULL COMMENT '入驻小区列表组名称',
	-- 入驻小区图片库照片uuid
	img_uuid varchar(255) NOT NULL COMMENT '入驻小区图片库照片uuid',
	-- 小区名
	scell_name varchar(24) NOT NULL COMMENT '小区名',
	-- 小区物业
	scell_property varchar(24) NOT NULL COMMENT '小区物业',
	-- 小区地址
	scell_addr varchar(24) NOT NULL COMMENT '小区地址',
	-- 小区地区
	scell_region varchar(24) NOT NULL COMMENT '小区地区',
	-- 入驻时间
	settle_time varchar(24) NOT NULL COMMENT '入驻时间',
	-- 入驻小区列表属码
	prop_code varchar(20) NOT NULL COMMENT '入驻小区列表属码',
	-- 入驻小区属性值
	prop_value varchar(20) NOT NULL COMMENT '入驻小区属性值',
	-- 数据创建的创建时间
	create_time datetime COMMENT '数据创建的创建时间',
	-- 创建人的账号
	create_user varchar(100) COMMENT '创建人的账号',
	-- 数据重新编辑后的更新时间
	update_time datetime COMMENT '数据重新编辑后的更新时间',
	-- 更新数据的更新人账号名
	update_user varchar(100) COMMENT '更新数据的更新人账号名',
	-- 是否删除,值0/1,0代表未删除1代表已删除
	delete_flag tinyint COMMENT '是否删除,值0/1,0代表未删除1代表已删除',
	-- 组编辑锁 1为正在被编辑 0 为未被编辑
	group_usedlock tinyint DEFAULT 0 NOT NULL COMMENT '组编辑锁 1为正在被编辑 0 为未被编辑',
	-- 组启用标识 启用为1 未启用0
	group_enabled tinyint DEFAULT 0 NOT NULL COMMENT '组启用标识 启用为1 未启用0',
	PRIMARY KEY (list_group_id),
	UNIQUE (list_groupcode)
) ENGINE = InnoDB DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci;


CREATE TABLE clx_districtsettle_thumb_group
(
	-- 入驻小区缩略图Id
	thumb_id int NOT NULL AUTO_INCREMENT COMMENT '入驻小区缩略图Id',
	-- 入驻小区组识别码
	thumb_groupcode varchar(255) NOT NULL COMMENT '入驻小区组识别码',
	thumb_groupname varchar(255) DEFAULT '入驻小区缩略图组名' NOT NULL,
	-- 入驻小区缩略图内容说明
	thumb_text varchar(20) NOT NULL COMMENT '入驻小区缩略图内容说明',
	-- 入驻小区图片库中图片uuid
	img_uuid varchar(255) NOT NULL COMMENT '入驻小区图片库中图片uuid',
	-- 入驻小区缩略图属性码
	prop_code varchar(20) NOT NULL COMMENT '入驻小区缩略图属性码',
	-- 入驻小区缩略图属性值
	prop_value varchar(20) NOT NULL COMMENT '入驻小区缩略图属性值',
	-- 数据创建的创建时间
	create_time datetime COMMENT '数据创建的创建时间',
	-- 创建人的账号
	create_user varchar(100) COMMENT '创建人的账号',
	-- 数据重新编辑后的更新时间
	update_time datetime COMMENT '数据重新编辑后的更新时间',
	-- 更新数据的更新人账号名
	update_user varchar(100) COMMENT '更新数据的更新人账号名',
	-- 是否删除,值0/1,0代表未删除1代表已删除
	delete_flag tinyint COMMENT '是否删除,值0/1,0代表未删除1代表已删除',
	-- 组编辑锁 1为正在被编辑 0 为未被编辑
	group_usedlock tinyint DEFAULT 0 NOT NULL COMMENT '组编辑锁 1为正在被编辑 0 为未被编辑',
	-- 组启用标识 启用为1 未启用0
	group_enabled tinyint DEFAULT 0 NOT NULL COMMENT '组启用标识 启用为1 未启用0',
	PRIMARY KEY (thumb_id)
) ENGINE = InnoDB DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci;


CREATE TABLE clx_express_msg_log
(
	-- 快递号信息日志Id
	log_id int NOT NULL AUTO_INCREMENT COMMENT '快递号信息日志Id',
	-- 快递取件出发地
	express_depart varchar(255) COMMENT '快递取件出发地',
	-- 快递送达目的地
	express_arrive varchar(255) NOT NULL COMMENT '快递送达目的地',
	-- 属性码
	prop_code varchar(20) NOT NULL COMMENT '属性码',
	-- 查询快递类型code 如 圆通/顺丰等等编号
	prop_value varchar(20) NOT NULL COMMENT '查询快递类型code 如 圆通/顺丰等等编号',
	-- 数据创建的创建时间
	create_time datetime COMMENT '数据创建的创建时间',
	-- 创建人的账号
	create_user varchar(100) COMMENT '创建人的账号',
	-- 数据重新编辑后的更新时间
	update_time datetime COMMENT '数据重新编辑后的更新时间',
	-- 更新数据的更新人账号名
	update_user varchar(100) COMMENT '更新数据的更新人账号名',
	-- 是否删除,值0/1,0代表未删除1代表已删除
	delete_flag tinyint COMMENT '是否删除,值0/1,0代表未删除1代表已删除',
	PRIMARY KEY (log_id)
) ENGINE = InnoDB DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci;


CREATE TABLE clx_formimg_group
(
	-- 表单内图片组id
	formimg_groupid int NOT NULL AUTO_INCREMENT COMMENT '表单内图片组id',
	-- 背景图片组标识码
	formimg_groupcode varchar(255) NOT NULL COMMENT '背景图片组标识码',
	-- 表单内图片组名
	formimg_groupname varchar(100) NOT NULL COMMENT '表单内图片组名',
	-- 表单内图片库Id
	form_imgdb_id int NOT NULL COMMENT '表单内图片库Id',
	-- 表单内图片属性码
	prop_code varchar(20) NOT NULL COMMENT '表单内图片属性码',
	-- 表单内图片属性值
	prop_value varchar(20) NOT NULL COMMENT '表单内图片属性值',
	-- 数据创建的创建时间
	create_time datetime COMMENT '数据创建的创建时间',
	-- 创建人的账号
	create_user varchar(100) COMMENT '创建人的账号',
	-- 数据重新编辑后的更新时间
	update_time datetime COMMENT '数据重新编辑后的更新时间',
	-- 更新数据的更新人账号名
	update_user varchar(100) COMMENT '更新数据的更新人账号名',
	-- 是否删除,值0/1,0代表未删除1代表已删除
	delete_flag tinyint COMMENT '是否删除,值0/1,0代表未删除1代表已删除',
	-- 组编辑锁 1为正在被编辑 0 为未被编辑
	group_usedlock tinyint DEFAULT 0 NOT NULL COMMENT '组编辑锁 1为正在被编辑 0 为未被编辑',
	-- 组启用标识 启用为1 未启用0
	group_enabled tinyint DEFAULT 0 NOT NULL COMMENT '组启用标识 启用为1 未启用0',
	PRIMARY KEY (formimg_groupid)
) ENGINE = InnoDB DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci;


CREATE TABLE clx_form_imgdb
(
	-- 表单内图片库id
	imgdb_id int NOT NULL AUTO_INCREMENT COMMENT '表单内图片库id',
	-- 图片uuid
	imgdb_uuid varchar(255) NOT NULL COMMENT '图片uuid',
	-- 图片地址
	imgdb_addr varchar(255) NOT NULL COMMENT '图片地址',
	-- 图片名
	imgdb_name varchar(255) NOT NULL COMMENT '图片名',
	-- oss文件夹名
	imgdb_ossfilename varchar(100) NOT NULL COMMENT 'oss文件夹名',
	-- 图片类型jpg,png等
	imgdb_filetype varchar(10) NOT NULL COMMENT '图片类型jpg,png等',
	-- 图片启用锁 已经被使用为1 未被使用为0
	imgdb_usedlock tinyint DEFAULT 0 NOT NULL COMMENT '图片启用锁 已经被使用为1 未被使用为0',
	-- 数据创建的创建时间
	create_time datetime COMMENT '数据创建的创建时间',
	-- 创建人的账号
	create_user varchar(100) COMMENT '创建人的账号',
	-- 数据重新编辑后的更新时间
	update_time datetime COMMENT '数据重新编辑后的更新时间',
	-- 更新数据的更新人账号名
	update_user varchar(100) COMMENT '更新数据的更新人账号名',
	-- 是否删除,值0/1,0代表未删除1代表已删除
	delete_flag tinyint COMMENT '是否删除,值0/1,0代表未删除1代表已删除',
	PRIMARY KEY (imgdb_id),
	UNIQUE (imgdb_uuid)
) ENGINE = InnoDB DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci;


CREATE TABLE clx_form_imgdb_log
(
	-- 表单内图片库id
	clx_form_imgdb_id int NOT NULL AUTO_INCREMENT COMMENT '表单内图片库id',
	-- 图片uuid
	imgdb_uuid varchar(255) NOT NULL COMMENT '图片uuid',
	-- 图片地址
	imgdb_addr varchar(255) NOT NULL COMMENT '图片地址',
	-- 图片名
	imgdb_name varchar(255) NOT NULL COMMENT '图片名',
	-- oss文件夹名
	imgdb_ossfilename varchar(100) NOT NULL COMMENT 'oss文件夹名',
	-- 图片类型jpg,png等
	imgdb_filetype varchar(10) NOT NULL COMMENT '图片类型jpg,png等',
	-- 图片启用锁 已经被使用为1 未被使用为0
	imgdb_usedlock tinyint DEFAULT 0 NOT NULL COMMENT '图片启用锁 已经被使用为1 未被使用为0',
	-- 日志表操作标记 
	-- 1 create 创建
	-- 2 update 更新
	-- 3 delete 删除
	log_operation_status varchar(20) NOT NULL COMMENT '日志表操作标记 
1 create 创建
2 update 更新
3 delete 删除',
	-- 数据创建的创建时间
	create_time datetime COMMENT '数据创建的创建时间',
	-- 创建人的账号
	create_user varchar(100) COMMENT '创建人的账号',
	-- 数据重新编辑后的更新时间
	update_time datetime COMMENT '数据重新编辑后的更新时间',
	-- 更新数据的更新人账号名
	update_user varchar(100) COMMENT '更新数据的更新人账号名',
	-- 是否删除,值0/1,0代表未删除1代表已删除
	delete_flag tinyint COMMENT '是否删除,值0/1,0代表未删除1代表已删除',
	PRIMARY KEY (clx_form_imgdb_id)
) ENGINE = InnoDB DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci;


CREATE TABLE clx_friend_href
(
	-- 友情链接id
	friendhref_id int NOT NULL AUTO_INCREMENT COMMENT '友情链接id',
	-- 友情链接网站名
	friendhref_Name varchar(10) NOT NULL COMMENT '友情链接网站名',
	-- 友情链接网站地址
	friendhref_addr varchar(255) NOT NULL COMMENT '友情链接网站地址',
	-- 数据创建的创建时间
	create_time datetime COMMENT '数据创建的创建时间',
	-- 创建人的账号
	create_user varchar(100) COMMENT '创建人的账号',
	-- 数据重新编辑后的更新时间
	update_time datetime COMMENT '数据重新编辑后的更新时间',
	-- 更新数据的更新人账号名
	update_user varchar(100) COMMENT '更新数据的更新人账号名',
	-- 是否删除,值0/1,0代表未删除1代表已删除
	delete_flag tinyint COMMENT '是否删除,值0/1,0代表未删除1代表已删除',
	PRIMARY KEY (friendhref_id)
) ENGINE = InnoDB DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci;


CREATE TABLE clx_help_courierregist
(
	-- 快递员注册信息表_id
	courier_regist_id bigint NOT NULL AUTO_INCREMENT COMMENT '快递员注册信息表_id',
	-- 注册快递员编号
	courier_serialcode varchar(255) NOT NULL COMMENT '注册快递员编号',
	-- 快递员姓名
	courier_name varchar(10) NOT NULL COMMENT '快递员姓名',
	-- 快递员身份证
	courier_idcard varchar(255) NOT NULL COMMENT '快递员身份证',
	-- 快递员手机号
	courier_phone varchar(20) NOT NULL COMMENT '快递员手机号',
	-- 快递公司属性码
	prop_code varchar(20) NOT NULL COMMENT '快递公司属性码',
	-- 快递公司具体属性值
	prop_value varchar(20) NOT NULL COMMENT '快递公司具体属性值',
	-- 快递员派送区域编码
	courier_region_code varchar(255) NOT NULL COMMENT '快递员派送区域编码',
	-- 上传验证照片文件夹名
	idcard_filename varchar(255) NOT NULL COMMENT '上传验证照片文件夹名',
	-- 身份证正面照片uuid
	frontimg_uuid varchar(255) NOT NULL COMMENT '身份证正面照片uuid',
	-- 身份证正面照oss路径
	frontimg_osspath varchar(255) NOT NULL COMMENT '身份证正面照oss路径',
	-- 正面身份证照片名
	frontimg_name varchar(255) NOT NULL COMMENT '正面身份证照片名',
	-- 身份证背面照片uuid
	backimg_uuid varchar(255) NOT NULL COMMENT '身份证背面照片uuid',
	-- 身份证背面照片oss路径
	backimg_osspath varchar(255) NOT NULL COMMENT '身份证背面照片oss路径',
	-- 身份证背面照片名
	backimg_name varchar(255) NOT NULL COMMENT '身份证背面照片名',
	-- 带工作证照片uuid
	employeecard_uuid varchar(255) NOT NULL COMMENT '带工作证照片uuid',
	employeecard_osspath varchar(255) NOT NULL,
	-- 带工作证照片名
	employeecard_name varchar(255) NOT NULL COMMENT '带工作证照片名',
	-- 是否同意协议
	courier_regist_isagreement tinyint NOT NULL COMMENT '是否同意协议',
	-- 是否加入到储留箱系统中 1为已经加入 0为未加入
	courier_isregist tinyint COMMENT '是否加入到储留箱系统中 1为已经加入 0为未加入',
	-- 数据创建的创建时间
	create_time datetime COMMENT '数据创建的创建时间',
	-- 创建人的账号
	create_user varchar(100) COMMENT '创建人的账号',
	-- 数据重新编辑后的更新时间
	update_time datetime COMMENT '数据重新编辑后的更新时间',
	-- 更新数据的更新人账号名
	update_user varchar(100) COMMENT '更新数据的更新人账号名',
	-- 是否删除,值0/1,0代表未删除1代表已删除
	delete_flag tinyint COMMENT '是否删除,值0/1,0代表未删除1代表已删除',
	PRIMARY KEY (courier_regist_id),
	UNIQUE (courier_serialcode),
	UNIQUE (courier_idcard),
	UNIQUE (frontimg_uuid),
	UNIQUE (backimg_uuid),
	UNIQUE (employeecard_uuid)
) ENGINE = InnoDB DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci;


CREATE TABLE clx_help_faq
(
	-- 使用帮助常见问题id
	faq_id int NOT NULL AUTO_INCREMENT COMMENT '使用帮助常见问题id',
	-- 常见问题内容
	faq_text blob NOT NULL COMMENT '常见问题内容',
	-- 数据创建的创建时间
	create_time datetime COMMENT '数据创建的创建时间',
	-- 创建人的账号
	create_user varchar(100) COMMENT '创建人的账号',
	-- 数据重新编辑后的更新时间
	update_time datetime COMMENT '数据重新编辑后的更新时间',
	-- 更新数据的更新人账号名
	update_user varchar(100) COMMENT '更新数据的更新人账号名',
	-- 是否删除,值0/1,0代表未删除1代表已删除
	delete_flag tinyint COMMENT '是否删除,值0/1,0代表未删除1代表已删除',
	PRIMARY KEY (faq_id)
) ENGINE = InnoDB DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci;


CREATE TABLE clx_help_feedback
(
	-- 反馈表单Id
	feedback_id bigint NOT NULL AUTO_INCREMENT COMMENT '反馈表单Id',
	-- 反馈身份属性码
	feedback_prop_code varchar(255) NOT NULL COMMENT '反馈身份属性码',
	-- 反馈身份属性值
	feedback_prop_value varchar(255) NOT NULL COMMENT '反馈身份属性值',
	-- 反馈身份属性分类其他的内容
	feedback_othertext varchar(20) NOT NULL COMMENT '反馈身份属性分类其他的内容',
	-- 反馈人地址编码
	feedback_addrcode varchar(255) NOT NULL COMMENT '反馈人地址编码',
	-- 反馈人详细地址
	feedback_detailaddr varchar(255) NOT NULL COMMENT '反馈人详细地址',
	-- 是否使用过其他终端 0未使用过 1使用过
	isother_terminal tinyint COMMENT '是否使用过其他终端 0未使用过 1使用过',
	-- 反馈表单建议和意见
	feedback_suggest blob NOT NULL COMMENT '反馈表单建议和意见',
	-- 想要反馈的问题
	feedback_question blob NOT NULL COMMENT '想要反馈的问题',
	-- 反馈区域负责人
	feedback_regionalmanager varchar(10) COMMENT '反馈区域负责人',
	-- 反馈区域负责人电话
	feedback_regionalmanagertel varchar(20) COMMENT '反馈区域负责人电话',
	-- 反馈人姓名
	feedback_askername varchar(10) NOT NULL COMMENT '反馈人姓名',
	-- 反馈人电话
	feedback_askertel varchar(20) NOT NULL COMMENT '反馈人电话',
	-- 反馈人邮箱
	feedback_askermail varchar(255) NOT NULL COMMENT '反馈人邮箱',
	-- 数据创建的创建时间
	create_time datetime COMMENT '数据创建的创建时间',
	-- 创建人的账号
	create_user varchar(100) COMMENT '创建人的账号',
	-- 数据重新编辑后的更新时间
	update_time datetime COMMENT '数据重新编辑后的更新时间',
	-- 更新数据的更新人账号名
	update_user varchar(100) COMMENT '更新数据的更新人账号名',
	-- 是否删除,值0/1,0代表未删除1代表已删除
	delete_flag tinyint COMMENT '是否删除,值0/1,0代表未删除1代表已删除',
	PRIMARY KEY (feedback_id)
) ENGINE = InnoDB DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci;


CREATE TABLE clx_help_propertymgt
(
	-- 物业管理Id
	propertymgt_id int NOT NULL AUTO_INCREMENT COMMENT '物业管理Id',
	-- 使用帮助物业入住方式组标识
	enterway_groupcode varchar(255) NOT NULL COMMENT '使用帮助物业入住方式组标识',
	-- 物业管理使用须知
	propertymgt_notice blob NOT NULL COMMENT '物业管理使用须知',
	-- 合作物业管理
	propertymgt_cooperation blob NOT NULL COMMENT '合作物业管理',
	-- 数据创建的创建时间
	create_time datetime COMMENT '数据创建的创建时间',
	-- 创建人的账号
	create_user varchar(100) COMMENT '创建人的账号',
	-- 数据重新编辑后的更新时间
	update_time datetime COMMENT '数据重新编辑后的更新时间',
	-- 更新数据的更新人账号名
	update_user varchar(100) COMMENT '更新数据的更新人账号名',
	-- 是否删除,值0/1,0代表未删除1代表已删除
	delete_flag tinyint COMMENT '是否删除,值0/1,0代表未删除1代表已删除',
	PRIMARY KEY (propertymgt_id)
) ENGINE = InnoDB DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci;


CREATE TABLE clx_help_propertymgt_enterway_group
(
	-- 入驻方式组id
	enterway_groupid int NOT NULL AUTO_INCREMENT COMMENT '入驻方式组id',
	-- 入驻方式组标识
	enterway_groupcode varchar(255) NOT NULL COMMENT '入驻方式组标识',
	-- 入住方式组名称
	enterway_groupname varchar(255) NOT NULL COMMENT '入住方式组名称',
	-- 入驻方式步骤内容
	propertymgt_text varchar(255) NOT NULL COMMENT '入驻方式步骤内容',
	-- 入驻方式顺序
	enterway_textsort int NOT NULL COMMENT '入驻方式顺序',
	-- 数据创建的创建时间
	create_time datetime COMMENT '数据创建的创建时间',
	-- 创建人的账号
	create_user varchar(100) COMMENT '创建人的账号',
	-- 数据重新编辑后的更新时间
	update_time datetime COMMENT '数据重新编辑后的更新时间',
	-- 更新数据的更新人账号名
	update_user varchar(100) COMMENT '更新数据的更新人账号名',
	-- 是否删除,值0/1,0代表未删除1代表已删除
	delete_flag tinyint COMMENT '是否删除,值0/1,0代表未删除1代表已删除',
	-- 组编辑锁 1为正在被编辑 0 为未被编辑
	group_usedlock tinyint DEFAULT 0 NOT NULL COMMENT '组编辑锁 1为正在被编辑 0 为未被编辑',
	-- 组启用标识 启用为1 未启用0
	group_enabled tinyint DEFAULT 0 NOT NULL COMMENT '组启用标识 启用为1 未启用0',
	PRIMARY KEY (enterway_groupid),
	UNIQUE (enterway_groupcode)
) ENGINE = InnoDB DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci;


CREATE TABLE clx_hr_msg
(
	-- 人事信息表Id
	msg_id int NOT NULL AUTO_INCREMENT COMMENT '人事信息表Id',
	-- 储留箱人事邮箱地址
	mail_addr varchar(255) NOT NULL COMMENT '储留箱人事邮箱地址',
	-- 数据创建的创建时间
	create_time datetime COMMENT '数据创建的创建时间',
	-- 创建人的账号
	create_user varchar(100) COMMENT '创建人的账号',
	-- 数据重新编辑后的更新时间
	update_time datetime COMMENT '数据重新编辑后的更新时间',
	-- 更新数据的更新人账号名
	update_user varchar(100) COMMENT '更新数据的更新人账号名',
	-- 是否删除,值0/1,0代表未删除1代表已删除
	delete_flag tinyint COMMENT '是否删除,值0/1,0代表未删除1代表已删除',
	PRIMARY KEY (msg_id)
) ENGINE = InnoDB DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci;


CREATE TABLE clx_joinus_list
(
	-- 职位列表Id
	list_id int NOT NULL AUTO_INCREMENT COMMENT '职位列表Id',
	-- 职位名称
	job_title varchar(6) NOT NULL COMMENT '职位名称',
	-- 工作部门
	depart varchar(6) NOT NULL COMMENT '工作部门',
	-- 发布时间
	release_time datetime NOT NULL COMMENT '发布时间',
	-- 招聘信息Id
	recruitmentmsg_id int NOT NULL COMMENT '招聘信息Id',
	-- 数据创建的创建时间
	create_time datetime COMMENT '数据创建的创建时间',
	-- 创建人的账号
	create_user varchar(100) COMMENT '创建人的账号',
	-- 数据重新编辑后的更新时间
	update_time datetime COMMENT '数据重新编辑后的更新时间',
	-- 更新数据的更新人账号名
	update_user varchar(100) COMMENT '更新数据的更新人账号名',
	-- 是否删除,值0/1,0代表未删除1代表已删除
	delete_flag tinyint COMMENT '是否删除,值0/1,0代表未删除1代表已删除',
	PRIMARY KEY (list_id)
) ENGINE = InnoDB DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci;


CREATE TABLE clx_joinus_recruitmentmsg
(
	-- 招聘信息id
	recruitmentmsg_id int NOT NULL AUTO_INCREMENT COMMENT '招聘信息id',
	-- 招聘信息内容1500字以内
	recruitmentmsg_text blob NOT NULL COMMENT '招聘信息内容1500字以内',
	-- 招聘信息标识
	recruitment_code varchar(255) NOT NULL COMMENT '招聘信息标识',
	-- 数据创建的创建时间
	create_time datetime COMMENT '数据创建的创建时间',
	-- 创建人的账号
	create_user varchar(100) COMMENT '创建人的账号',
	-- 数据重新编辑后的更新时间
	update_time datetime COMMENT '数据重新编辑后的更新时间',
	-- 更新数据的更新人账号名
	update_user varchar(100) COMMENT '更新数据的更新人账号名',
	-- 是否删除,值0/1,0代表未删除1代表已删除
	delete_flag tinyint COMMENT '是否删除,值0/1,0代表未删除1代表已删除',
	PRIMARY KEY (recruitmentmsg_id),
	UNIQUE (recruitment_code)
) ENGINE = InnoDB DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci;


CREATE TABLE clx_map_addr
(
	-- 所在区域位置表Id
	addr_id bigint NOT NULL AUTO_INCREMENT COMMENT '所在区域位置表Id',
	-- 所在区域位置编码
	addr_code varchar(255) NOT NULL COMMENT '所在区域位置编码',
	-- 地图省份编码
	province_code varchar(255) COMMENT '地图省份编码',
	-- 城市编码
	city_code varchar(255) COMMENT '城市编码',
	-- 区域编码
	region_code varchar(255) COMMENT '区域编码',
	-- 数据创建的创建时间
	create_time datetime COMMENT '数据创建的创建时间',
	-- 创建人的账号
	create_user varchar(100) COMMENT '创建人的账号',
	-- 数据重新编辑后的更新时间
	update_time datetime COMMENT '数据重新编辑后的更新时间',
	-- 更新数据的更新人账号名
	update_user varchar(100) COMMENT '更新数据的更新人账号名',
	-- 是否删除,值0/1,0代表未删除1代表已删除
	delete_flag tinyint COMMENT '是否删除,值0/1,0代表未删除1代表已删除',
	PRIMARY KEY (addr_id),
	UNIQUE (addr_code)
) ENGINE = InnoDB DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci;


CREATE TABLE clx_map_city
(
	-- 城市id
	city_id int NOT NULL AUTO_INCREMENT COMMENT '城市id',
	-- 城市编码
	city_code varchar(255) NOT NULL COMMENT '城市编码',
	-- 城市名称
	city_name varchar(255) NOT NULL COMMENT '城市名称',
	-- 数据创建的创建时间
	create_time datetime COMMENT '数据创建的创建时间',
	-- 创建人的账号
	create_user varchar(100) COMMENT '创建人的账号',
	-- 数据重新编辑后的更新时间
	update_time datetime COMMENT '数据重新编辑后的更新时间',
	-- 更新数据的更新人账号名
	update_user varchar(100) COMMENT '更新数据的更新人账号名',
	-- 是否删除,值0/1,0代表未删除1代表已删除
	delete_flag tinyint COMMENT '是否删除,值0/1,0代表未删除1代表已删除',
	PRIMARY KEY (city_id),
	UNIQUE (city_code)
) ENGINE = InnoDB DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci;


CREATE TABLE clx_map_province
(
	-- 地图省份表Id
	province_id int NOT NULL AUTO_INCREMENT COMMENT '地图省份表Id',
	-- 地图省份编码
	province_code varchar(255) NOT NULL COMMENT '地图省份编码',
	-- 地图省份名称
	province_name varchar(255) NOT NULL COMMENT '地图省份名称',
	-- 地图城市编码
	city_code varchar(255) NOT NULL COMMENT '地图城市编码',
	-- 数据创建的创建时间
	create_time datetime COMMENT '数据创建的创建时间',
	-- 创建人的账号
	create_user varchar(100) COMMENT '创建人的账号',
	-- 数据重新编辑后的更新时间
	update_time datetime COMMENT '数据重新编辑后的更新时间',
	-- 更新数据的更新人账号名
	update_user varchar(100) COMMENT '更新数据的更新人账号名',
	-- 是否删除,值0/1,0代表未删除1代表已删除
	delete_flag tinyint COMMENT '是否删除,值0/1,0代表未删除1代表已删除',
	PRIMARY KEY (province_id),
	UNIQUE (province_code)
) ENGINE = InnoDB DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci;


CREATE TABLE clx_map_region
(
	-- 地图表区域Id
	region_id int NOT NULL AUTO_INCREMENT COMMENT '地图表区域Id',
	-- 地图区域编码
	region_code varchar(255) NOT NULL COMMENT '地图区域编码',
	-- 地图区域名称
	region_name varchar(255) NOT NULL COMMENT '地图区域名称',
	-- 所属城市编码
	city_code varchar(255) NOT NULL COMMENT '所属城市编码',
	-- 数据创建的创建时间
	create_time datetime COMMENT '数据创建的创建时间',
	-- 创建人的账号
	create_user varchar(100) COMMENT '创建人的账号',
	-- 数据重新编辑后的更新时间
	update_time datetime COMMENT '数据重新编辑后的更新时间',
	-- 更新数据的更新人账号名
	update_user varchar(100) COMMENT '更新数据的更新人账号名',
	-- 是否删除,值0/1,0代表未删除1代表已删除
	delete_flag tinyint COMMENT '是否删除,值0/1,0代表未删除1代表已删除',
	PRIMARY KEY (region_id),
	UNIQUE (region_code)
) ENGINE = InnoDB DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci;


CREATE TABLE clx_prop
(
	-- 信息中心id
	prop_id int NOT NULL AUTO_INCREMENT COMMENT '信息中心id',
	-- 属性码
	prop_code varchar(20) NOT NULL COMMENT '属性码',
	-- 属性类名
	prop_classname varchar(20) NOT NULL COMMENT '属性类名',
	-- 属性值
	prop_value varchar(20) NOT NULL COMMENT '属性值',
	prop_showname varchar(20) NOT NULL,
	-- 数据创建的创建时间
	create_time datetime COMMENT '数据创建的创建时间',
	-- 创建人的账号
	create_user varchar(100) COMMENT '创建人的账号',
	-- 数据重新编辑后的更新时间
	update_time datetime COMMENT '数据重新编辑后的更新时间',
	-- 更新数据的更新人账号名
	update_user varchar(100) COMMENT '更新数据的更新人账号名',
	-- 是否删除,值0/1,0代表未删除1代表已删除
	delete_flag tinyint COMMENT '是否删除,值0/1,0代表未删除1代表已删除',
	PRIMARY KEY (prop_id)
) ENGINE = InnoDB DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci;


CREATE TABLE clx_reception_servercenter_msg
(
	-- 服务中心信息Id
	msg_id int NOT NULL AUTO_INCREMENT COMMENT '服务中心信息Id',
	-- 服务中心模块文本标题
	msg_title varchar(100) NOT NULL COMMENT '服务中心模块文本标题',
	-- 服务中心模块文本内容
	msg_text blob NOT NULL COMMENT '服务中心模块文本内容',
	-- 数据创建的创建时间
	create_time datetime COMMENT '数据创建的创建时间',
	-- 创建人的账号
	create_user varchar(100) COMMENT '创建人的账号',
	-- 数据重新编辑后的更新时间
	update_time datetime COMMENT '数据重新编辑后的更新时间',
	-- 更新数据的更新人账号名
	update_user varchar(100) COMMENT '更新数据的更新人账号名',
	-- 是否删除,值0/1,0代表未删除1代表已删除
	delete_flag tinyint COMMENT '是否删除,值0/1,0代表未删除1代表已删除',
	PRIMARY KEY (msg_id)
) ENGINE = InnoDB DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci;



