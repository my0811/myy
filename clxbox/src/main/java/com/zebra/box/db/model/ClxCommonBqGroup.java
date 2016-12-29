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
public class ClxCommonBqGroup {

    /**
     * 页面背景图片组id
     */
    private Integer bqGroupid;

    /**
     * 背景图片组标识码
     */
    private String bqGroupcode;

    /**
     * 背景图片组名
     */
    private String bqGroupname;

    /**
     * 图片背景库Id
     */
    private Integer bqImgdbId;

    /**
     * 背景图片属性码
     */
    private String propCode;

    /**
     * 背景图片属性值
     */
    private String propValue;

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
     * 页面背景图片组id
     * </pre>
     * 
     * @return the bqGroupid
     */
    public Integer getBqGroupid() {

        return bqGroupid;
    }

    /**
     * <pre>
     * 页面背景图片组id
     * </pre>
     * 
     * @param bqGroupid the bqGroupid to set
     */
    public void setBqGroupid(Integer bqGroupid) {

        this.bqGroupid = bqGroupid;
    }

    /**
     * <pre>
     * 背景图片组标识码
     * </pre>
     * 
     * @return the bqGroupcode
     */
    public String getBqGroupcode() {

        return bqGroupcode;
    }

    /**
     * <pre>
     * 背景图片组标识码
     * </pre>
     * 
     * @param bqGroupcode the bqGroupcode to set
     */
    public void setBqGroupcode(String bqGroupcode) {

        this.bqGroupcode = bqGroupcode;
    }

    /**
     * <pre>
     * 背景图片组名
     * </pre>
     * 
     * @return the bqGroupname
     */
    public String getBqGroupname() {

        return bqGroupname;
    }

    /**
     * <pre>
     * 背景图片组名
     * </pre>
     * 
     * @param bqGroupname the bqGroupname to set
     */
    public void setBqGroupname(String bqGroupname) {

        this.bqGroupname = bqGroupname;
    }

    /**
     * <pre>
     * 图片背景库Id
     * </pre>
     * 
     * @return the bqImgdbId
     */
    public Integer getBqImgdbId() {

        return bqImgdbId;
    }

    /**
     * <pre>
     * 图片背景库Id
     * </pre>
     * 
     * @param bqImgdbId the bqImgdbId to set
     */
    public void setBqImgdbId(Integer bqImgdbId) {

        this.bqImgdbId = bqImgdbId;
    }

    /**
     * <pre>
     * 背景图片属性码
     * </pre>
     * 
     * @return the propCode
     */
    public String getPropCode() {

        return propCode;
    }

    /**
     * <pre>
     * 背景图片属性码
     * </pre>
     * 
     * @param propCode the propCode to set
     */
    public void setPropCode(String propCode) {

        this.propCode = propCode;
    }

    /**
     * <pre>
     * 背景图片属性值
     * </pre>
     * 
     * @return the propValue
     */
    public String getPropValue() {

        return propValue;
    }

    /**
     * <pre>
     * 背景图片属性值
     * </pre>
     * 
     * @param propValue the propValue to set
     */
    public void setPropValue(String propValue) {

        this.propValue = propValue;
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
