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
public class ClxDistrictsettleThumbGroup {

    /**
     * 入驻小区缩略图Id
     */
    private Integer thumbId;

    /**
     * 入驻小区组识别码
     */
    private String thumbGroupcode;

    /**
     */
    private String thumbGroupname;

    /**
     * 入驻小区缩略图内容说明
     */
    private String thumbText;

    /**
     * 入驻小区图片库中图片uuid
     */
    private String imgUuid;

    /**
     * 入驻小区缩略图属性码
     */
    private String propCode;

    /**
     * 入驻小区缩略图属性值
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
     * 入驻小区缩略图Id
     * </pre>
     * 
     * @return the thumbId
     */
    public Integer getThumbId() {

        return thumbId;
    }

    /**
     * <pre>
     * 入驻小区缩略图Id
     * </pre>
     * 
     * @param thumbId the thumbId to set
     */
    public void setThumbId(Integer thumbId) {

        this.thumbId = thumbId;
    }

    /**
     * <pre>
     * 入驻小区组识别码
     * </pre>
     * 
     * @return the thumbGroupcode
     */
    public String getThumbGroupcode() {

        return thumbGroupcode;
    }

    /**
     * <pre>
     * 入驻小区组识别码
     * </pre>
     * 
     * @param thumbGroupcode the thumbGroupcode to set
     */
    public void setThumbGroupcode(String thumbGroupcode) {

        this.thumbGroupcode = thumbGroupcode;
    }

    /**
     * <pre>
     * </pre>
     * 
     * @return the thumbGroupname
     */
    public String getThumbGroupname() {

        return thumbGroupname;
    }

    /**
     * <pre>
     * </pre>
     * 
     * @param thumbGroupname the thumbGroupname to set
     */
    public void setThumbGroupname(String thumbGroupname) {

        this.thumbGroupname = thumbGroupname;
    }

    /**
     * <pre>
     * 入驻小区缩略图内容说明
     * </pre>
     * 
     * @return the thumbText
     */
    public String getThumbText() {

        return thumbText;
    }

    /**
     * <pre>
     * 入驻小区缩略图内容说明
     * </pre>
     * 
     * @param thumbText the thumbText to set
     */
    public void setThumbText(String thumbText) {

        this.thumbText = thumbText;
    }

    /**
     * <pre>
     * 入驻小区图片库中图片uuid
     * </pre>
     * 
     * @return the imgUuid
     */
    public String getImgUuid() {

        return imgUuid;
    }

    /**
     * <pre>
     * 入驻小区图片库中图片uuid
     * </pre>
     * 
     * @param imgUuid the imgUuid to set
     */
    public void setImgUuid(String imgUuid) {

        this.imgUuid = imgUuid;
    }

    /**
     * <pre>
     * 入驻小区缩略图属性码
     * </pre>
     * 
     * @return the propCode
     */
    public String getPropCode() {

        return propCode;
    }

    /**
     * <pre>
     * 入驻小区缩略图属性码
     * </pre>
     * 
     * @param propCode the propCode to set
     */
    public void setPropCode(String propCode) {

        this.propCode = propCode;
    }

    /**
     * <pre>
     * 入驻小区缩略图属性值
     * </pre>
     * 
     * @return the propValue
     */
    public String getPropValue() {

        return propValue;
    }

    /**
     * <pre>
     * 入驻小区缩略图属性值
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
