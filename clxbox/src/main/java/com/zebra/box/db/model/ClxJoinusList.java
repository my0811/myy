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
public class ClxJoinusList {

    /**
     * 职位列表Id
     */
    private Integer listId;

    /**
     * 职位名称
     */
    private String jobTitle;

    /**
     * 工作部门
     */
    private String depart;

    /**
     * 发布时间
     */
    private Date releaseTime;

    /**
     * 招聘信息Id
     */
    private Integer recruitmentmsgId;

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
     * 职位列表Id
     * </pre>
     * 
     * @return the listId
     */
    public Integer getListId() {

        return listId;
    }

    /**
     * <pre>
     * 职位列表Id
     * </pre>
     * 
     * @param listId the listId to set
     */
    public void setListId(Integer listId) {

        this.listId = listId;
    }

    /**
     * <pre>
     * 职位名称
     * </pre>
     * 
     * @return the jobTitle
     */
    public String getJobTitle() {

        return jobTitle;
    }

    /**
     * <pre>
     * 职位名称
     * </pre>
     * 
     * @param jobTitle the jobTitle to set
     */
    public void setJobTitle(String jobTitle) {

        this.jobTitle = jobTitle;
    }

    /**
     * <pre>
     * 工作部门
     * </pre>
     * 
     * @return the depart
     */
    public String getDepart() {

        return depart;
    }

    /**
     * <pre>
     * 工作部门
     * </pre>
     * 
     * @param depart the depart to set
     */
    public void setDepart(String depart) {

        this.depart = depart;
    }

    /**
     * <pre>
     * 发布时间
     * </pre>
     * 
     * @return the releaseTime
     */
    public Date getReleaseTime() {

        return releaseTime;
    }

    /**
     * <pre>
     * 发布时间
     * </pre>
     * 
     * @param releaseTime the releaseTime to set
     */
    public void setReleaseTime(Date releaseTime) {

        this.releaseTime = releaseTime;
    }

    /**
     * <pre>
     * 招聘信息Id
     * </pre>
     * 
     * @return the recruitmentmsgId
     */
    public Integer getRecruitmentmsgId() {

        return recruitmentmsgId;
    }

    /**
     * <pre>
     * 招聘信息Id
     * </pre>
     * 
     * @param recruitmentmsgId the recruitmentmsgId to set
     */
    public void setRecruitmentmsgId(Integer recruitmentmsgId) {

        this.recruitmentmsgId = recruitmentmsgId;
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
