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
public class ClxMapRegion {

    /**
     * 地图表区域Id
     */
    private Integer regionId;

    /**
     * 地图区域编码
     */
    private String regionCode;

    /**
     * 地图区域名称
     */
    private String regionName;

    /**
     * 所属城市编码
     */
    private String cityCode;

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
     * 地图表区域Id
     * </pre>
     * 
     * @return the regionId
     */
    public Integer getRegionId() {

        return regionId;
    }

    /**
     * <pre>
     * 地图表区域Id
     * </pre>
     * 
     * @param regionId the regionId to set
     */
    public void setRegionId(Integer regionId) {

        this.regionId = regionId;
    }

    /**
     * <pre>
     * 地图区域编码
     * </pre>
     * 
     * @return the regionCode
     */
    public String getRegionCode() {

        return regionCode;
    }

    /**
     * <pre>
     * 地图区域编码
     * </pre>
     * 
     * @param regionCode the regionCode to set
     */
    public void setRegionCode(String regionCode) {

        this.regionCode = regionCode;
    }

    /**
     * <pre>
     * 地图区域名称
     * </pre>
     * 
     * @return the regionName
     */
    public String getRegionName() {

        return regionName;
    }

    /**
     * <pre>
     * 地图区域名称
     * </pre>
     * 
     * @param regionName the regionName to set
     */
    public void setRegionName(String regionName) {

        this.regionName = regionName;
    }

    /**
     * <pre>
     * 所属城市编码
     * </pre>
     * 
     * @return the cityCode
     */
    public String getCityCode() {

        return cityCode;
    }

    /**
     * <pre>
     * 所属城市编码
     * </pre>
     * 
     * @param cityCode the cityCode to set
     */
    public void setCityCode(String cityCode) {

        this.cityCode = cityCode;
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
