package com.zebra.box.db.mapper;

import java.util.List;

import com.zebra.box.db.model.ClxDistrictsettleImgLog;

/**
 * <pre>
 * =============================================================================
 * 日期：yyyyMMdd  担当:
 * 内容:
 * =============================================================================
 * </pre>
 * 
 */
public interface ClxDistrictsettleImgLogMapper {

    /**
     * 插入
     * 
     * @param clxDistrictsettleImgLog
     * @return returnCode
     */
    int insert(ClxDistrictsettleImgLog clxDistrictsettleImgLog);

    /**
     * 删除通过主键
     * 
     * @param imgId
     * @return returnCode
     */
    int deleteByPrimaryKey(Integer imgId);

    /**
     * 单件更新通过主键(全更新)
     * 
     * @param clxDistrictsettleImgLog
     * @return returnCode
     */
    int updateAllByPrimaryKey(ClxDistrictsettleImgLog clxDistrictsettleImgLog);

    /**
     * 单件更新通过主键(部分更新)
     * 
     * @param clxDistrictsettleImgLog
     * @return returnCode
     */
    int updateByPrimaryKey(ClxDistrictsettleImgLog clxDistrictsettleImgLog);

    /**
     * 单件检索通过主键
     * 
     * @param imgId
     * @return clxDistrictsettleImgLog
     */
    ClxDistrictsettleImgLog selectOneByPrimaryKey(Integer imgId);

    /**
     * 检索列表
     * 
     * @param clxDistrictsettleImgLog
     * @return clxDistrictsettleImgLogList
     */
    List<ClxDistrictsettleImgLog> selectList(ClxDistrictsettleImgLog clxDistrictsettleImgLog);

    /**
     * 检索件数
     * 
     * @param clxDistrictsettleImgLog
     * @return count
     */
    int selectCount(ClxDistrictsettleImgLog clxDistrictsettleImgLog);
}
