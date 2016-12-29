package com.zebra.box.db.model;

import java.util.Date;

/**
 * <pre>
 * =============================================================================
 * 日期：yyyyMMdd  担当:
 * 内容:
 * =============================================================================
 * </pre>
 * 
 */
public class ClxCommonContactway {

    /**
     * 公司联系方式表主键
     */
    private Integer contactId;

    /**
     * 联系方式组标识
     */
    private String contactGroupcode;

    /**
     * 联系方式组名称
     */
    private String contactGroupname;

    /**
     * 储留箱公司邮箱
     */
    private String companyMail;

    /**
     * 公司的客服电话
     */
    private String companyPhone;

    /**
     * 公司地址
     */
    private String companyAddress;

    /**
     * 公司二维码连接地址
     */
    private String companyQrcodehref;

    /**
     * 公司二维码文件名
     */
    private String companyQrcodename;

    /**
     * 公司二维码oss文件夹
     */
    private String companyQrcodeossfilename;

    /**
     * 二维码图片uuid
     */
    private String qrcodeimgUuid;

    /**
     * 身份证oss文件夹名
     */
    private String idcardOssfilename;

    /**
     * 身份证正面照要求
     */
    private String idcardDemand;

    /**
     * 身份证正面照uuid
     */
    private String idcardFrontimguuid;

    /**
     * 身份证正面照片样例
     */
    private String idcardFrontimgpath;

    /**
     * 身份证正面照片样例图片名
     */
    private String idcardFrontimgname;

    /**
     * 身份证背面照uuid
     */
    private String idcardBackimgUuid;

    /**
     * 身份证背面样例图片路径
     */
    private String idcardBackimgpath;

    /**
     * 身份证背面样例图片名
     */
    private String idcardBackimgname;

    /**
     * 带工作证照片uuid
     */
    private String employeecardUuid;

    /**
     * 带工作卡的本人照片样例路径
     */
    private String employeecardImgosspath;

    /**
     * 带工作卡的图片名称
     */
    private String employeecardName;

    /**
     * 数据创建的创建时间
     */
    private Date createTime;

    /**
     * 创建人的账号
     */
    private String createUser;

    /**
     * 数据重新编辑后的更新时间
     */
    private Date updateTime;

    /**
     * 更新数据的更新人账号名
     */
    private String updateUser;

    /**
     * 是否删除,值0/1,0代表未删除1代表已删除
     */
    private String deleteFlag;

    /**
     * 组编辑锁 1为正在被编辑 0 为未被编辑
     */
    private String groupUsedlock;

    /**
     * 组启用标识 启用为1 未启用0
     */
    private String groupEnabled;

    /**
     * <pre>
     * 公司联系方式表主键
     * </pre>
     * 
     * @return the contactId
     */
    public Integer getContactId() {

        return contactId;
    }

    /**
     * <pre>
     * 公司联系方式表主键
     * </pre>
     * 
     * @param contactId the contactId to set
     */
    public void setContactId(Integer contactId) {

        this.contactId = contactId;
    }

    /**
     * <pre>
     * 联系方式组标识
     * </pre>
     * 
     * @return the contactGroupcode
     */
    public String getContactGroupcode() {

        return contactGroupcode;
    }

    /**
     * <pre>
     * 联系方式组标识
     * </pre>
     * 
     * @param contactGroupcode the contactGroupcode to set
     */
    public void setContactGroupcode(String contactGroupcode) {

        this.contactGroupcode = contactGroupcode;
    }

    /**
     * <pre>
     * 联系方式组名称
     * </pre>
     * 
     * @return the contactGroupname
     */
    public String getContactGroupname() {

        return contactGroupname;
    }

    /**
     * <pre>
     * 联系方式组名称
     * </pre>
     * 
     * @param contactGroupname the contactGroupname to set
     */
    public void setContactGroupname(String contactGroupname) {

        this.contactGroupname = contactGroupname;
    }

    /**
     * <pre>
     * 储留箱公司邮箱
     * </pre>
     * 
     * @return the companyMail
     */
    public String getCompanyMail() {

        return companyMail;
    }

    /**
     * <pre>
     * 储留箱公司邮箱
     * </pre>
     * 
     * @param companyMail the companyMail to set
     */
    public void setCompanyMail(String companyMail) {

        this.companyMail = companyMail;
    }

    /**
     * <pre>
     * 公司的客服电话
     * </pre>
     * 
     * @return the companyPhone
     */
    public String getCompanyPhone() {

        return companyPhone;
    }

    /**
     * <pre>
     * 公司的客服电话
     * </pre>
     * 
     * @param companyPhone the companyPhone to set
     */
    public void setCompanyPhone(String companyPhone) {

        this.companyPhone = companyPhone;
    }

    /**
     * <pre>
     * 公司地址
     * </pre>
     * 
     * @return the companyAddress
     */
    public String getCompanyAddress() {

        return companyAddress;
    }

    /**
     * <pre>
     * 公司地址
     * </pre>
     * 
     * @param companyAddress the companyAddress to set
     */
    public void setCompanyAddress(String companyAddress) {

        this.companyAddress = companyAddress;
    }

    /**
     * <pre>
     * 公司二维码连接地址
     * </pre>
     * 
     * @return the companyQrcodehref
     */
    public String getCompanyQrcodehref() {

        return companyQrcodehref;
    }

    /**
     * <pre>
     * 公司二维码连接地址
     * </pre>
     * 
     * @param companyQrcodehref the companyQrcodehref to set
     */
    public void setCompanyQrcodehref(String companyQrcodehref) {

        this.companyQrcodehref = companyQrcodehref;
    }

    /**
     * <pre>
     * 公司二维码文件名
     * </pre>
     * 
     * @return the companyQrcodename
     */
    public String getCompanyQrcodename() {

        return companyQrcodename;
    }

    /**
     * <pre>
     * 公司二维码文件名
     * </pre>
     * 
     * @param companyQrcodename the companyQrcodename to set
     */
    public void setCompanyQrcodename(String companyQrcodename) {

        this.companyQrcodename = companyQrcodename;
    }

    /**
     * <pre>
     * 公司二维码oss文件夹
     * </pre>
     * 
     * @return the companyQrcodeossfilename
     */
    public String getCompanyQrcodeossfilename() {

        return companyQrcodeossfilename;
    }

    /**
     * <pre>
     * 公司二维码oss文件夹
     * </pre>
     * 
     * @param companyQrcodeossfilename the companyQrcodeossfilename to set
     */
    public void setCompanyQrcodeossfilename(String companyQrcodeossfilename) {

        this.companyQrcodeossfilename = companyQrcodeossfilename;
    }

    /**
     * <pre>
     * 二维码图片uuid
     * </pre>
     * 
     * @return the qrcodeimgUuid
     */
    public String getQrcodeimgUuid() {

        return qrcodeimgUuid;
    }

    /**
     * <pre>
     * 二维码图片uuid
     * </pre>
     * 
     * @param qrcodeimgUuid the qrcodeimgUuid to set
     */
    public void setQrcodeimgUuid(String qrcodeimgUuid) {

        this.qrcodeimgUuid = qrcodeimgUuid;
    }

    /**
     * <pre>
     * 身份证oss文件夹名
     * </pre>
     * 
     * @return the idcardOssfilename
     */
    public String getIdcardOssfilename() {

        return idcardOssfilename;
    }

    /**
     * <pre>
     * 身份证oss文件夹名
     * </pre>
     * 
     * @param idcardOssfilename the idcardOssfilename to set
     */
    public void setIdcardOssfilename(String idcardOssfilename) {

        this.idcardOssfilename = idcardOssfilename;
    }

    /**
     * <pre>
     * 身份证正面照要求
     * </pre>
     * 
     * @return the idcardDemand
     */
    public String getIdcardDemand() {

        return idcardDemand;
    }

    /**
     * <pre>
     * 身份证正面照要求
     * </pre>
     * 
     * @param idcardDemand the idcardDemand to set
     */
    public void setIdcardDemand(String idcardDemand) {

        this.idcardDemand = idcardDemand;
    }

    /**
     * <pre>
     * 身份证正面照uuid
     * </pre>
     * 
     * @return the idcardFrontimguuid
     */
    public String getIdcardFrontimguuid() {

        return idcardFrontimguuid;
    }

    /**
     * <pre>
     * 身份证正面照uuid
     * </pre>
     * 
     * @param idcardFrontimguuid the idcardFrontimguuid to set
     */
    public void setIdcardFrontimguuid(String idcardFrontimguuid) {

        this.idcardFrontimguuid = idcardFrontimguuid;
    }

    /**
     * <pre>
     * 身份证正面照片样例
     * </pre>
     * 
     * @return the idcardFrontimgpath
     */
    public String getIdcardFrontimgpath() {

        return idcardFrontimgpath;
    }

    /**
     * <pre>
     * 身份证正面照片样例
     * </pre>
     * 
     * @param idcardFrontimgpath the idcardFrontimgpath to set
     */
    public void setIdcardFrontimgpath(String idcardFrontimgpath) {

        this.idcardFrontimgpath = idcardFrontimgpath;
    }

    /**
     * <pre>
     * 身份证正面照片样例图片名
     * </pre>
     * 
     * @return the idcardFrontimgname
     */
    public String getIdcardFrontimgname() {

        return idcardFrontimgname;
    }

    /**
     * <pre>
     * 身份证正面照片样例图片名
     * </pre>
     * 
     * @param idcardFrontimgname the idcardFrontimgname to set
     */
    public void setIdcardFrontimgname(String idcardFrontimgname) {

        this.idcardFrontimgname = idcardFrontimgname;
    }

    /**
     * <pre>
     * 身份证背面照uuid
     * </pre>
     * 
     * @return the idcardBackimgUuid
     */
    public String getIdcardBackimgUuid() {

        return idcardBackimgUuid;
    }

    /**
     * <pre>
     * 身份证背面照uuid
     * </pre>
     * 
     * @param idcardBackimgUuid the idcardBackimgUuid to set
     */
    public void setIdcardBackimgUuid(String idcardBackimgUuid) {

        this.idcardBackimgUuid = idcardBackimgUuid;
    }

    /**
     * <pre>
     * 身份证背面样例图片路径
     * </pre>
     * 
     * @return the idcardBackimgpath
     */
    public String getIdcardBackimgpath() {

        return idcardBackimgpath;
    }

    /**
     * <pre>
     * 身份证背面样例图片路径
     * </pre>
     * 
     * @param idcardBackimgpath the idcardBackimgpath to set
     */
    public void setIdcardBackimgpath(String idcardBackimgpath) {

        this.idcardBackimgpath = idcardBackimgpath;
    }

    /**
     * <pre>
     * 身份证背面样例图片名
     * </pre>
     * 
     * @return the idcardBackimgname
     */
    public String getIdcardBackimgname() {

        return idcardBackimgname;
    }

    /**
     * <pre>
     * 身份证背面样例图片名
     * </pre>
     * 
     * @param idcardBackimgname the idcardBackimgname to set
     */
    public void setIdcardBackimgname(String idcardBackimgname) {

        this.idcardBackimgname = idcardBackimgname;
    }

    /**
     * <pre>
     * 带工作证照片uuid
     * </pre>
     * 
     * @return the employeecardUuid
     */
    public String getEmployeecardUuid() {

        return employeecardUuid;
    }

    /**
     * <pre>
     * 带工作证照片uuid
     * </pre>
     * 
     * @param employeecardUuid the employeecardUuid to set
     */
    public void setEmployeecardUuid(String employeecardUuid) {

        this.employeecardUuid = employeecardUuid;
    }

    /**
     * <pre>
     * 带工作卡的本人照片样例路径
     * </pre>
     * 
     * @return the employeecardImgosspath
     */
    public String getEmployeecardImgosspath() {

        return employeecardImgosspath;
    }

    /**
     * <pre>
     * 带工作卡的本人照片样例路径
     * </pre>
     * 
     * @param employeecardImgosspath the employeecardImgosspath to set
     */
    public void setEmployeecardImgosspath(String employeecardImgosspath) {

        this.employeecardImgosspath = employeecardImgosspath;
    }

    /**
     * <pre>
     * 带工作卡的图片名称
     * </pre>
     * 
     * @return the employeecardName
     */
    public String getEmployeecardName() {

        return employeecardName;
    }

    /**
     * <pre>
     * 带工作卡的图片名称
     * </pre>
     * 
     * @param employeecardName the employeecardName to set
     */
    public void setEmployeecardName(String employeecardName) {

        this.employeecardName = employeecardName;
    }

    /**
     * <pre>
     * 数据创建的创建时间
     * </pre>
     * 
     * @return the createTime
     */
    public Date getCreateTime() {

        return createTime;
    }

    /**
     * <pre>
     * 数据创建的创建时间
     * </pre>
     * 
     * @param createTime the createTime to set
     */
    public void setCreateTime(Date createTime) {

        this.createTime = createTime;
    }

    /**
     * <pre>
     * 创建人的账号
     * </pre>
     * 
     * @return the createUser
     */
    public String getCreateUser() {

        return createUser;
    }

    /**
     * <pre>
     * 创建人的账号
     * </pre>
     * 
     * @param createUser the createUser to set
     */
    public void setCreateUser(String createUser) {

        this.createUser = createUser;
    }

    /**
     * <pre>
     * 数据重新编辑后的更新时间
     * </pre>
     * 
     * @return the updateTime
     */
    public Date getUpdateTime() {

        return updateTime;
    }

    /**
     * <pre>
     * 数据重新编辑后的更新时间
     * </pre>
     * 
     * @param updateTime the updateTime to set
     */
    public void setUpdateTime(Date updateTime) {

        this.updateTime = updateTime;
    }

    /**
     * <pre>
     * 更新数据的更新人账号名
     * </pre>
     * 
     * @return the updateUser
     */
    public String getUpdateUser() {

        return updateUser;
    }

    /**
     * <pre>
     * 更新数据的更新人账号名
     * </pre>
     * 
     * @param updateUser the updateUser to set
     */
    public void setUpdateUser(String updateUser) {

        this.updateUser = updateUser;
    }

    /**
     * <pre>
     * 是否删除,值0/1,0代表未删除1代表已删除
     * </pre>
     * 
     * @return the deleteFlag
     */
    public String getDeleteFlag() {

        return deleteFlag;
    }

    /**
     * <pre>
     * 是否删除,值0/1,0代表未删除1代表已删除
     * </pre>
     * 
     * @param deleteFlag the deleteFlag to set
     */
    public void setDeleteFlag(String deleteFlag) {

        this.deleteFlag = deleteFlag;
    }

    /**
     * <pre>
     * 组编辑锁 1为正在被编辑 0 为未被编辑
     * </pre>
     * 
     * @return the groupUsedlock
     */
    public String getGroupUsedlock() {

        return groupUsedlock;
    }

    /**
     * <pre>
     * 组编辑锁 1为正在被编辑 0 为未被编辑
     * </pre>
     * 
     * @param groupUsedlock the groupUsedlock to set
     */
    public void setGroupUsedlock(String groupUsedlock) {

        this.groupUsedlock = groupUsedlock;
    }

    /**
     * <pre>
     * 组启用标识 启用为1 未启用0
     * </pre>
     * 
     * @return the groupEnabled
     */
    public String getGroupEnabled() {

        return groupEnabled;
    }

    /**
     * <pre>
     * 组启用标识 启用为1 未启用0
     * </pre>
     * 
     * @param groupEnabled the groupEnabled to set
     */
    public void setGroupEnabled(String groupEnabled) {

        this.groupEnabled = groupEnabled;
    }
}
