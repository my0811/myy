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
public class ClxDistrictsettleImgLog {

    /**
     * 入驻小区图片Id
     */
    private Integer imgId;

    /**
     * 入驻小区图片uuid
     */
    private String imgUuid;

    /**
     * 入驻小区图片文件路径
     */
    private String imgOsspath;

    /**
     * 入驻小区图片文件夹名
     */
    private String imgOssfilename;

    /**
     * 入驻小区图片文件名
     */
    private String imgName;

    /**
     * 入驻小区图片类型
     */
    private String imgType;

    /**
     * 图片启用锁 已经启用为1 未启用为0
     */
    private String imgUsedlock;

    /**
     * 日志表操作标记 
     * 1 create 创建
     * 2 update 更新
     * 3 delete 删除
     */
    private String logOperationStatus;

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
     * 入驻小区图片Id
     * </pre>
     * 
     * @return the imgId
     */
    public Integer getImgId() {

        return imgId;
    }

    /**
     * <pre>
     * 入驻小区图片Id
     * </pre>
     * 
     * @param imgId the imgId to set
     */
    public void setImgId(Integer imgId) {

        this.imgId = imgId;
    }

    /**
     * <pre>
     * 入驻小区图片uuid
     * </pre>
     * 
     * @return the imgUuid
     */
    public String getImgUuid() {

        return imgUuid;
    }

    /**
     * <pre>
     * 入驻小区图片uuid
     * </pre>
     * 
     * @param imgUuid the imgUuid to set
     */
    public void setImgUuid(String imgUuid) {

        this.imgUuid = imgUuid;
    }

    /**
     * <pre>
     * 入驻小区图片文件路径
     * </pre>
     * 
     * @return the imgOsspath
     */
    public String getImgOsspath() {

        return imgOsspath;
    }

    /**
     * <pre>
     * 入驻小区图片文件路径
     * </pre>
     * 
     * @param imgOsspath the imgOsspath to set
     */
    public void setImgOsspath(String imgOsspath) {

        this.imgOsspath = imgOsspath;
    }

    /**
     * <pre>
     * 入驻小区图片文件夹名
     * </pre>
     * 
     * @return the imgOssfilename
     */
    public String getImgOssfilename() {

        return imgOssfilename;
    }

    /**
     * <pre>
     * 入驻小区图片文件夹名
     * </pre>
     * 
     * @param imgOssfilename the imgOssfilename to set
     */
    public void setImgOssfilename(String imgOssfilename) {

        this.imgOssfilename = imgOssfilename;
    }

    /**
     * <pre>
     * 入驻小区图片文件名
     * </pre>
     * 
     * @return the imgName
     */
    public String getImgName() {

        return imgName;
    }

    /**
     * <pre>
     * 入驻小区图片文件名
     * </pre>
     * 
     * @param imgName the imgName to set
     */
    public void setImgName(String imgName) {

        this.imgName = imgName;
    }

    /**
     * <pre>
     * 入驻小区图片类型
     * </pre>
     * 
     * @return the imgType
     */
    public String getImgType() {

        return imgType;
    }

    /**
     * <pre>
     * 入驻小区图片类型
     * </pre>
     * 
     * @param imgType the imgType to set
     */
    public void setImgType(String imgType) {

        this.imgType = imgType;
    }

    /**
     * <pre>
     * 图片启用锁 已经启用为1 未启用为0
     * </pre>
     * 
     * @return the imgUsedlock
     */
    public String getImgUsedlock() {

        return imgUsedlock;
    }

    /**
     * <pre>
     * 图片启用锁 已经启用为1 未启用为0
     * </pre>
     * 
     * @param imgUsedlock the imgUsedlock to set
     */
    public void setImgUsedlock(String imgUsedlock) {

        this.imgUsedlock = imgUsedlock;
    }

    /**
     * <pre>
     * 日志表操作标记 
     * 1 create 创建
     * 2 update 更新
     * 3 delete 删除
     * </pre>
     * 
     * @return the logOperationStatus
     */
    public String getLogOperationStatus() {

        return logOperationStatus;
    }

    /**
     * <pre>
     * 日志表操作标记 
     * 1 create 创建
     * 2 update 更新
     * 3 delete 删除
     * </pre>
     * 
     * @param logOperationStatus the logOperationStatus to set
     */
    public void setLogOperationStatus(String logOperationStatus) {

        this.logOperationStatus = logOperationStatus;
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
