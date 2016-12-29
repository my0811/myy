package com.zebra.box.db.mapper;

import java.util.List;

import com.zebra.box.db.model.ClxProp;

/**
 * <pre>
 * =============================================================================
 * 日期：yyyyMMdd  担当:
 * 内容:
 * =============================================================================
 * </pre>
 * 
 */
public interface ClxPropMapper {

    /**
     * 插入
     * 
     * @param clxProp
     * @return returnCode
     */
    int insert(ClxProp clxProp);

    /**
     * 删除通过主键
     * 
     * @param propId
     * @return returnCode
     */
    int deleteByPrimaryKey(Integer propId);

    /**
     * 单件更新通过主键(全更新)
     * 
     * @param clxProp
     * @return returnCode
     */
    int updateAllByPrimaryKey(ClxProp clxProp);

    /**
     * 单件更新通过主键(部分更新)
     * 
     * @param clxProp
     * @return returnCode
     */
    int updateByPrimaryKey(ClxProp clxProp);

    /**
     * 单件检索通过主键
     * 
     * @param propId
     * @return clxProp
     */
    ClxProp selectOneByPrimaryKey(Integer propId);

    /**
     * 检索列表
     * 
     * @param clxProp
     * @return clxPropList
     */
    List<ClxProp> selectList(ClxProp clxProp);

    /**
     * 检索件数
     * 
     * @param clxProp
     * @return count
     */
    int selectCount(ClxProp clxProp);
}
