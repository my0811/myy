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
public class ClxCommonMsgcenter {

    /**
     * 信息中心id
     */
    private Integer msgcenterId;

    /**
     * 联系方式组识别码
     */
    private String contactGroupcode;

    /**
     * 背景图片组识别码
     */
    private String bqGroupcode;

    /**
     * 表单内图片组识别码
     */
    private String formimgGroupcode;

    /**
     * 入驻小区缩略图识别码
     */
    private String thumbGroupcode;

    /**
     * 入驻小区列表信息组识别码
     */
    private String listGroupcode;

    /**
     * 使用帮助入驻方式组标识码
     */
    private String enterwayGroupcode;

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
     * 信息中心id
     * </pre>
     * 
     * @return the msgcenterId
     */
    public Integer getMsgcenterId() {

        return msgcenterId;
    }

    /**
     * <pre>
     * 信息中心id
     * </pre>
     * 
     * @param msgcenterId the msgcenterId to set
     */
    public void setMsgcenterId(Integer msgcenterId) {

        this.msgcenterId = msgcenterId;
    }

    /**
     * <pre>
     * 联系方式组识别码
     * </pre>
     * 
     * @return the contactGroupcode
     */
    public String getContactGroupcode() {

        return contactGroupcode;
    }

    /**
     * <pre>
     * 联系方式组识别码
     * </pre>
     * 
     * @param contactGroupcode the contactGroupcode to set
     */
    public void setContactGroupcode(String contactGroupcode) {

        this.contactGroupcode = contactGroupcode;
    }

    /**
     * <pre>
     * 背景图片组识别码
     * </pre>
     * 
     * @return the bqGroupcode
     */
    public String getBqGroupcode() {

        return bqGroupcode;
    }

    /**
     * <pre>
     * 背景图片组识别码
     * </pre>
     * 
     * @param bqGroupcode the bqGroupcode to set
     */
    public void setBqGroupcode(String bqGroupcode) {

        this.bqGroupcode = bqGroupcode;
    }

    /**
     * <pre>
     * 表单内图片组识别码
     * </pre>
     * 
     * @return the formimgGroupcode
     */
    public String getFormimgGroupcode() {

        return formimgGroupcode;
    }

    /**
     * <pre>
     * 表单内图片组识别码
     * </pre>
     * 
     * @param formimgGroupcode the formimgGroupcode to set
     */
    public void setFormimgGroupcode(String formimgGroupcode) {

        this.formimgGroupcode = formimgGroupcode;
    }

    /**
     * <pre>
     * 入驻小区缩略图识别码
     * </pre>
     * 
     * @return the thumbGroupcode
     */
    public String getThumbGroupcode() {

        return thumbGroupcode;
    }

    /**
     * <pre>
     * 入驻小区缩略图识别码
     * </pre>
     * 
     * @param thumbGroupcode the thumbGroupcode to set
     */
    public void setThumbGroupcode(String thumbGroupcode) {

        this.thumbGroupcode = thumbGroupcode;
    }

    /**
     * <pre>
     * 入驻小区列表信息组识别码
     * </pre>
     * 
     * @return the listGroupcode
     */
    public String getListGroupcode() {

        return listGroupcode;
    }

    /**
     * <pre>
     * 入驻小区列表信息组识别码
     * </pre>
     * 
     * @param listGroupcode the listGroupcode to set
     */
    public void setListGroupcode(String listGroupcode) {

        this.listGroupcode = listGroupcode;
    }

    /**
     * <pre>
     * 使用帮助入驻方式组标识码
     * </pre>
     * 
     * @return the enterwayGroupcode
     */
    public String getEnterwayGroupcode() {

        return enterwayGroupcode;
    }

    /**
     * <pre>
     * 使用帮助入驻方式组标识码
     * </pre>
     * 
     * @param enterwayGroupcode the enterwayGroupcode to set
     */
    public void setEnterwayGroupcode(String enterwayGroupcode) {

        this.enterwayGroupcode = enterwayGroupcode;
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
