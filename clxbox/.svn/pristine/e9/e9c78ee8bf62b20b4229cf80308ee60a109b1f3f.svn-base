package com.zebra.box.db.mapper;

import java.util.List;

import com.zebra.box.db.model.ClxJoinusList;

/**
 * <pre>
 * =============================================================================
 * 日期：yyyyMMdd  担当:
 * 内容:
 * =============================================================================
 * </pre>
 * 
 */
public interface ClxJoinusListMapper {

    /**
     * 插入
     * 
     * @param clxJoinusList
     * @return returnCode
     */
    int insert(ClxJoinusList clxJoinusList);

    /**
     * 删除通过主键
     * 
     * @param listId
     * @return returnCode
     */
    int deleteByPrimaryKey(Integer listId);

    /**
     * 单件更新通过主键(全更新)
     * 
     * @param clxJoinusList
     * @return returnCode
     */
    int updateAllByPrimaryKey(ClxJoinusList clxJoinusList);

    /**
     * 单件更新通过主键(部分更新)
     * 
     * @param clxJoinusList
     * @return returnCode
     */
    int updateByPrimaryKey(ClxJoinusList clxJoinusList);

    /**
     * 单件检索通过主键
     * 
     * @param listId
     * @return clxJoinusList
     */
    ClxJoinusList selectOneByPrimaryKey(Integer listId);

    /**
     * 检索列表
     * 
     * @param clxJoinusList
     * @return clxJoinusListList
     */
    List<ClxJoinusList> selectList(ClxJoinusList clxJoinusList);

    /**
     * 检索件数
     * 
     * @param clxJoinusList
     * @return count
     */
    int selectCount(ClxJoinusList clxJoinusList);
}
