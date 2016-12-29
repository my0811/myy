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
public class ClxAboutSelectusadrRecord {

    /**
     * 关于我们页面查询记录表id
     */
    private Integer selectusaddrId;

    /**
     * 查询者输入地址
     */
    private String selecterAddr;

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
     * 关于我们页面查询记录表id
     * </pre>
     * 
     * @return the selectusaddrId
     */
    public Integer getSelectusaddrId() {

        return selectusaddrId;
    }

    /**
     * <pre>
     * 关于我们页面查询记录表id
     * </pre>
     * 
     * @param selectusaddrId the selectusaddrId to set
     */
    public void setSelectusaddrId(Integer selectusaddrId) {

        this.selectusaddrId = selectusaddrId;
    }

    /**
     * <pre>
     * 查询者输入地址
     * </pre>
     * 
     * @return the selecterAddr
     */
    public String getSelecterAddr() {

        return selecterAddr;
    }

    /**
     * <pre>
     * 查询者输入地址
     * </pre>
     * 
     * @param selecterAddr the selecterAddr to set
     */
    public void setSelecterAddr(String selecterAddr) {

        this.selecterAddr = selecterAddr;
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
