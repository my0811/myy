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
public class ClxFriendHref {

    /**
     * 友情链接id
     */
    private Integer friendhrefId;

    /**
     * 友情链接网站名
     */
    private String friendhrefName;

    /**
     * 友情链接网站地址
     */
    private String friendhrefAddr;

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
     * 友情链接id
     * </pre>
     * 
     * @return the friendhrefId
     */
    public Integer getFriendhrefId() {

        return friendhrefId;
    }

    /**
     * <pre>
     * 友情链接id
     * </pre>
     * 
     * @param friendhrefId the friendhrefId to set
     */
    public void setFriendhrefId(Integer friendhrefId) {

        this.friendhrefId = friendhrefId;
    }

    /**
     * <pre>
     * 友情链接网站名
     * </pre>
     * 
     * @return the friendhrefName
     */
    public String getFriendhrefName() {

        return friendhrefName;
    }

    /**
     * <pre>
     * 友情链接网站名
     * </pre>
     * 
     * @param friendhrefName the friendhrefName to set
     */
    public void setFriendhrefName(String friendhrefName) {

        this.friendhrefName = friendhrefName;
    }

    /**
     * <pre>
     * 友情链接网站地址
     * </pre>
     * 
     * @return the friendhrefAddr
     */
    public String getFriendhrefAddr() {

        return friendhrefAddr;
    }

    /**
     * <pre>
     * 友情链接网站地址
     * </pre>
     * 
     * @param friendhrefAddr the friendhrefAddr to set
     */
    public void setFriendhrefAddr(String friendhrefAddr) {

        this.friendhrefAddr = friendhrefAddr;
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
