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
public class ClxHelpPropertymgt {

    /**
     * 物业管理Id
     */
    private Integer propertymgtId;

    /**
     * 使用帮助物业入住方式组标识
     */
    private String enterwayGroupcode;

    /**
     * 物业管理使用须知
     */
    private String propertymgtNotice;

    /**
     * 合作物业管理
     */
    private String propertymgtCooperation;

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
     * 物业管理Id
     * </pre>
     * 
     * @return the propertymgtId
     */
    public Integer getPropertymgtId() {

        return propertymgtId;
    }

    /**
     * <pre>
     * 物业管理Id
     * </pre>
     * 
     * @param propertymgtId the propertymgtId to set
     */
    public void setPropertymgtId(Integer propertymgtId) {

        this.propertymgtId = propertymgtId;
    }

    /**
     * <pre>
     * 使用帮助物业入住方式组标识
     * </pre>
     * 
     * @return the enterwayGroupcode
     */
    public String getEnterwayGroupcode() {

        return enterwayGroupcode;
    }

    /**
     * <pre>
     * 使用帮助物业入住方式组标识
     * </pre>
     * 
     * @param enterwayGroupcode the enterwayGroupcode to set
     */
    public void setEnterwayGroupcode(String enterwayGroupcode) {

        this.enterwayGroupcode = enterwayGroupcode;
    }

    /**
     * <pre>
     * 物业管理使用须知
     * </pre>
     * 
     * @return the propertymgtNotice
     */
    public String getPropertymgtNotice() {

        return propertymgtNotice;
    }

    /**
     * <pre>
     * 物业管理使用须知
     * </pre>
     * 
     * @param propertymgtNotice the propertymgtNotice to set
     */
    public void setPropertymgtNotice(String propertymgtNotice) {

        this.propertymgtNotice = propertymgtNotice;
    }

    /**
     * <pre>
     * 合作物业管理
     * </pre>
     * 
     * @return the propertymgtCooperation
     */
    public String getPropertymgtCooperation() {

        return propertymgtCooperation;
    }

    /**
     * <pre>
     * 合作物业管理
     * </pre>
     * 
     * @param propertymgtCooperation the propertymgtCooperation to set
     */
    public void setPropertymgtCooperation(String propertymgtCooperation) {

        this.propertymgtCooperation = propertymgtCooperation;
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
