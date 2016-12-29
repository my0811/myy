package com.zebra.box.db.mapper;

import java.util.List;

import com.zebra.box.db.model.ClxMapRegion;

/**
 * <pre>
 * =============================================================================
 * 日期：yyyyMMdd  担当:
 * 内容:
 * =============================================================================
 * </pre>
 * 
 */
public interface ClxMapRegionMapper {

    /**
     * 插入
     * 
     * @param clxMapRegion
     * @return returnCode
     */
    int insert(ClxMapRegion clxMapRegion);

    /**
     * 删除通过主键
     * 
     * @param regionId
     * @return returnCode
     */
    int deleteByPrimaryKey(Integer regionId);

    /**
     * 单件更新通过主键(全更新)
     * 
     * @param clxMapRegion
     * @return returnCode
     */
    int updateAllByPrimaryKey(ClxMapRegion clxMapRegion);

    /**
     * 单件更新通过主键(部分更新)
     * 
     * @param clxMapRegion
     * @return returnCode
     */
    int updateByPrimaryKey(ClxMapRegion clxMapRegion);

    /**
     * 单件检索通过主键
     * 
     * @param regionId
     * @return clxMapRegion
     */
    ClxMapRegion selectOneByPrimaryKey(Integer regionId);

    /**
     * 检索列表
     * 
     * @param clxMapRegion
     * @return clxMapRegionList
     */
    List<ClxMapRegion> selectList(ClxMapRegion clxMapRegion);

    /**
     * 检索件数
     * 
     * @param clxMapRegion
     * @return count
     */
    int selectCount(ClxMapRegion clxMapRegion);
}
