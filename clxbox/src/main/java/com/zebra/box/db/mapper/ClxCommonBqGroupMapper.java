package com.zebra.box.db.mapper;

import java.util.List;

import com.zebra.box.db.model.ClxCommonBqGroup;

/**
 * <pre>
 * =============================================================================
 * 日期：yyyyMMdd  担当:
 * 内容:
 * =============================================================================
 * </pre>
 * 
 */
public interface ClxCommonBqGroupMapper {

    /**
     * 插入
     * 
     * @param clxCommonBqGroup
     * @return returnCode
     */
    int insert(ClxCommonBqGroup clxCommonBqGroup);

    /**
     * 删除通过主键
     * 
     * @param bqGroupid
     * @return returnCode
     */
    int deleteByPrimaryKey(Integer bqGroupid);

    /**
     * 单件更新通过主键(全更新)
     * 
     * @param clxCommonBqGroup
     * @return returnCode
     */
    int updateAllByPrimaryKey(ClxCommonBqGroup clxCommonBqGroup);

    /**
     * 单件更新通过主键(部分更新)
     * 
     * @param clxCommonBqGroup
     * @return returnCode
     */
    int updateByPrimaryKey(ClxCommonBqGroup clxCommonBqGroup);

    /**
     * 单件检索通过主键
     * 
     * @param bqGroupid
     * @return clxCommonBqGroup
     */
    ClxCommonBqGroup selectOneByPrimaryKey(Integer bqGroupid);

    /**
     * 检索列表
     * 
     * @param clxCommonBqGroup
     * @return clxCommonBqGroupList
     */
    List<ClxCommonBqGroup> selectList(ClxCommonBqGroup clxCommonBqGroup);

    /**
     * 检索件数
     * 
     * @param clxCommonBqGroup
     * @return count
     */
    int selectCount(ClxCommonBqGroup clxCommonBqGroup);
}
