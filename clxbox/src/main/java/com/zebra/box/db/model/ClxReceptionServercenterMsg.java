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
public class ClxReceptionServercenterMsg {

    /**
     * 服务中心信息Id
     */
    private Integer msgId;

    /**
     * 服务中心模块文本标题
     */
    private String msgTitle;

    /**
     * 服务中心模块文本内容
     */
    private String msgText;

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
     * 服务中心信息Id
     * </pre>
     * 
     * @return the msgId
     */
    public Integer getMsgId() {

        return msgId;
    }

    /**
     * <pre>
     * 服务中心信息Id
     * </pre>
     * 
     * @param msgId the msgId to set
     */
    public void setMsgId(Integer msgId) {

        this.msgId = msgId;
    }

    /**
     * <pre>
     * 服务中心模块文本标题
     * </pre>
     * 
     * @return the msgTitle
     */
    public String getMsgTitle() {

        return msgTitle;
    }

    /**
     * <pre>
     * 服务中心模块文本标题
     * </pre>
     * 
     * @param msgTitle the msgTitle to set
     */
    public void setMsgTitle(String msgTitle) {

        this.msgTitle = msgTitle;
    }

    /**
     * <pre>
     * 服务中心模块文本内容
     * </pre>
     * 
     * @return the msgText
     */
    public String getMsgText() {

        return msgText;
    }

    /**
     * <pre>
     * 服务中心模块文本内容
     * </pre>
     * 
     * @param msgText the msgText to set
     */
    public void setMsgText(String msgText) {

        this.msgText = msgText;
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
