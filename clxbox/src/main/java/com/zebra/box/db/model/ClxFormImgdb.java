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
public class ClxFormImgdb {

    /**
     * 表单内图片库id
     */
    private Integer imgdbId;

    /**
     * 图片uuid
     */
    private String imgdbUuid;

    /**
     * 图片地址
     */
    private String imgdbAddr;

    /**
     * 图片名
     */
    private String imgdbName;

    /**
     * oss文件夹名
     */
    private String imgdbOssfilename;

    /**
     * 图片类型jpg,png等
     */
    private String imgdbFiletype;

    /**
     * 图片启用锁 已经被使用为1 未被使用为0
     */
    private String imgdbUsedlock;

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
     * 表单内图片库id
     * </pre>
     * 
     * @return the imgdbId
     */
    public Integer getImgdbId() {

        return imgdbId;
    }

    /**
     * <pre>
     * 表单内图片库id
     * </pre>
     * 
     * @param imgdbId the imgdbId to set
     */
    public void setImgdbId(Integer imgdbId) {

        this.imgdbId = imgdbId;
    }

    /**
     * <pre>
     * 图片uuid
     * </pre>
     * 
     * @return the imgdbUuid
     */
    public String getImgdbUuid() {

        return imgdbUuid;
    }

    /**
     * <pre>
     * 图片uuid
     * </pre>
     * 
     * @param imgdbUuid the imgdbUuid to set
     */
    public void setImgdbUuid(String imgdbUuid) {

        this.imgdbUuid = imgdbUuid;
    }

    /**
     * <pre>
     * 图片地址
     * </pre>
     * 
     * @return the imgdbAddr
     */
    public String getImgdbAddr() {

        return imgdbAddr;
    }

    /**
     * <pre>
     * 图片地址
     * </pre>
     * 
     * @param imgdbAddr the imgdbAddr to set
     */
    public void setImgdbAddr(String imgdbAddr) {

        this.imgdbAddr = imgdbAddr;
    }

    /**
     * <pre>
     * 图片名
     * </pre>
     * 
     * @return the imgdbName
     */
    public String getImgdbName() {

        return imgdbName;
    }

    /**
     * <pre>
     * 图片名
     * </pre>
     * 
     * @param imgdbName the imgdbName to set
     */
    public void setImgdbName(String imgdbName) {

        this.imgdbName = imgdbName;
    }

    /**
     * <pre>
     * oss文件夹名
     * </pre>
     * 
     * @return the imgdbOssfilename
     */
    public String getImgdbOssfilename() {

        return imgdbOssfilename;
    }

    /**
     * <pre>
     * oss文件夹名
     * </pre>
     * 
     * @param imgdbOssfilename the imgdbOssfilename to set
     */
    public void setImgdbOssfilename(String imgdbOssfilename) {

        this.imgdbOssfilename = imgdbOssfilename;
    }

    /**
     * <pre>
     * 图片类型jpg,png等
     * </pre>
     * 
     * @return the imgdbFiletype
     */
    public String getImgdbFiletype() {

        return imgdbFiletype;
    }

    /**
     * <pre>
     * 图片类型jpg,png等
     * </pre>
     * 
     * @param imgdbFiletype the imgdbFiletype to set
     */
    public void setImgdbFiletype(String imgdbFiletype) {

        this.imgdbFiletype = imgdbFiletype;
    }

    /**
     * <pre>
     * 图片启用锁 已经被使用为1 未被使用为0
     * </pre>
     * 
     * @return the imgdbUsedlock
     */
    public String getImgdbUsedlock() {

        return imgdbUsedlock;
    }

    /**
     * <pre>
     * 图片启用锁 已经被使用为1 未被使用为0
     * </pre>
     * 
     * @param imgdbUsedlock the imgdbUsedlock to set
     */
    public void setImgdbUsedlock(String imgdbUsedlock) {

        this.imgdbUsedlock = imgdbUsedlock;
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
