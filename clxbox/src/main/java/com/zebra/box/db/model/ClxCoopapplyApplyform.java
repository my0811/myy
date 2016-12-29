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
public class ClxCoopapplyApplyform {

    /**
     * 申请合作申请者id
     */
    private Integer applyformId;

    /**
     * clx_prop_code
     */
    private String propCode;

    /**
     * 入驻申请表单申请者身份属性值
     */
    private String propValue;

    /**
     * 申请者其选项的具体身份
     */
    private String applyerOtheridentity;

    /**
     * 申请者区域地址编码
     */
    private String applyerAddrcode;

    /**
     * 申请者详细地址
     */
    private String applyerDetailaddr;

    /**
     * 申请储留箱入驻的原因
     */
    private String applyReson;

    /**
     * 区域负责人
     */
    private String regionalManager;

    /**
     * 区域负责人电话
     */
    private String regionalManagertel;

    /**
     * 申请者姓名
     */
    private String applyerName;

    /**
     * 申请者电话
     */
    private String applyerTel;

    /**
     * 申请者邮箱
     */
    private String applyerMail;

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
     * <pre>
     * 申请合作申请者id
     * </pre>
     * 
     * @return the applyformId
     */
    public Integer getApplyformId() {

        return applyformId;
    }

    /**
     * <pre>
     * 申请合作申请者id
     * </pre>
     * 
     * @param applyformId the applyformId to set
     */
    public void setApplyformId(Integer applyformId) {

        this.applyformId = applyformId;
    }

    /**
     * <pre>
     * clx_prop_code
     * </pre>
     * 
     * @return the propCode
     */
    public String getPropCode() {

        return propCode;
    }

    /**
     * <pre>
     * clx_prop_code
     * </pre>
     * 
     * @param propCode the propCode to set
     */
    public void setPropCode(String propCode) {

        this.propCode = propCode;
    }

    /**
     * <pre>
     * 入驻申请表单申请者身份属性值
     * </pre>
     * 
     * @return the propValue
     */
    public String getPropValue() {

        return propValue;
    }

    /**
     * <pre>
     * 入驻申请表单申请者身份属性值
     * </pre>
     * 
     * @param propValue the propValue to set
     */
    public void setPropValue(String propValue) {

        this.propValue = propValue;
    }

    /**
     * <pre>
     * 申请者其选项的具体身份
     * </pre>
     * 
     * @return the applyerOtheridentity
     */
    public String getApplyerOtheridentity() {

        return applyerOtheridentity;
    }

    /**
     * <pre>
     * 申请者其选项的具体身份
     * </pre>
     * 
     * @param applyerOtheridentity the applyerOtheridentity to set
     */
    public void setApplyerOtheridentity(String applyerOtheridentity) {

        this.applyerOtheridentity = applyerOtheridentity;
    }

    /**
     * <pre>
     * 申请者区域地址编码
     * </pre>
     * 
     * @return the applyerAddrcode
     */
    public String getApplyerAddrcode() {

        return applyerAddrcode;
    }

    /**
     * <pre>
     * 申请者区域地址编码
     * </pre>
     * 
     * @param applyerAddrcode the applyerAddrcode to set
     */
    public void setApplyerAddrcode(String applyerAddrcode) {

        this.applyerAddrcode = applyerAddrcode;
    }

    /**
     * <pre>
     * 申请者详细地址
     * </pre>
     * 
     * @return the applyerDetailaddr
     */
    public String getApplyerDetailaddr() {

        return applyerDetailaddr;
    }

    /**
     * <pre>
     * 申请者详细地址
     * </pre>
     * 
     * @param applyerDetailaddr the applyerDetailaddr to set
     */
    public void setApplyerDetailaddr(String applyerDetailaddr) {

        this.applyerDetailaddr = applyerDetailaddr;
    }

    /**
     * <pre>
     * 申请储留箱入驻的原因
     * </pre>
     * 
     * @return the applyReson
     */
    public String getApplyReson() {

        return applyReson;
    }

    /**
     * <pre>
     * 申请储留箱入驻的原因
     * </pre>
     * 
     * @param applyReson the applyReson to set
     */
    public void setApplyReson(String applyReson) {

        this.applyReson = applyReson;
    }

    /**
     * <pre>
     * 区域负责人
     * </pre>
     * 
     * @return the regionalManager
     */
    public String getRegionalManager() {

        return regionalManager;
    }

    /**
     * <pre>
     * 区域负责人
     * </pre>
     * 
     * @param regionalManager the regionalManager to set
     */
    public void setRegionalManager(String regionalManager) {

        this.regionalManager = regionalManager;
    }

    /**
     * <pre>
     * 区域负责人电话
     * </pre>
     * 
     * @return the regionalManagertel
     */
    public String getRegionalManagertel() {

        return regionalManagertel;
    }

    /**
     * <pre>
     * 区域负责人电话
     * </pre>
     * 
     * @param regionalManagertel the regionalManagertel to set
     */
    public void setRegionalManagertel(String regionalManagertel) {

        this.regionalManagertel = regionalManagertel;
    }

    /**
     * <pre>
     * 申请者姓名
     * </pre>
     * 
     * @return the applyerName
     */
    public String getApplyerName() {

        return applyerName;
    }

    /**
     * <pre>
     * 申请者姓名
     * </pre>
     * 
     * @param applyerName the applyerName to set
     */
    public void setApplyerName(String applyerName) {

        this.applyerName = applyerName;
    }

    /**
     * <pre>
     * 申请者电话
     * </pre>
     * 
     * @return the applyerTel
     */
    public String getApplyerTel() {

        return applyerTel;
    }

    /**
     * <pre>
     * 申请者电话
     * </pre>
     * 
     * @param applyerTel the applyerTel to set
     */
    public void setApplyerTel(String applyerTel) {

        this.applyerTel = applyerTel;
    }

    /**
     * <pre>
     * 申请者邮箱
     * </pre>
     * 
     * @return the applyerMail
     */
    public String getApplyerMail() {

        return applyerMail;
    }

    /**
     * <pre>
     * 申请者邮箱
     * </pre>
     * 
     * @param applyerMail the applyerMail to set
     */
    public void setApplyerMail(String applyerMail) {

        this.applyerMail = applyerMail;
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
}
