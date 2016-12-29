package com.zebra.box.db.mapper;

import java.util.List;

import com.zebra.box.db.model.ClxMapCity;

/**
 * <pre>
 * =============================================================================
 * 日期：yyyyMMdd  担当:
 * 内容:
 * =============================================================================
 * </pre>
 * 
 */
public interface ClxMapCityMapper {

    /**
     * 插入
     * 
     * @param clxMapCity
     * @return returnCode
     */
    int insert(ClxMapCity clxMapCity);

    /**
     * 删除通过主键
     * 
     * @param cityId
     * @return returnCode
     */
    int deleteByPrimaryKey(Integer cityId);

    /**
     * 单件更新通过主键(全更新)
     * 
     * @param clxMapCity
     * @return returnCode
     */
    int updateAllByPrimaryKey(ClxMapCity clxMapCity);

    /**
     * 单件更新通过主键(部分更新)
     * 
     * @param clxMapCity
     * @return returnCode
     */
    int updateByPrimaryKey(ClxMapCity clxMapCity);

    /**
     * 单件检索通过主键
     * 
     * @param cityId
     * @return clxMapCity
     */
    ClxMapCity selectOneByPrimaryKey(Integer cityId);

    /**
     * 检索列表
     * 
     * @param clxMapCity
     * @return clxMapCityList
     */
    List<ClxMapCity> selectList(ClxMapCity clxMapCity);

    /**
     * 检索件数
     * 
     * @param clxMapCity
     * @return count
     */
    int selectCount(ClxMapCity clxMapCity);
}
