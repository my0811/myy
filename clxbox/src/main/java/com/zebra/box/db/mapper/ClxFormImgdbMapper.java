package com.zebra.box.db.mapper;

import java.util.List;

import com.zebra.box.db.model.ClxFormImgdb;

/**
 * <pre>
 * =============================================================================
 * 日期：yyyyMMdd  担当:
 * 内容:
 * =============================================================================
 * </pre>
 * 
 */
public interface ClxFormImgdbMapper {

    /**
     * 插入
     * 
     * @param clxFormImgdb
     * @return returnCode
     */
    int insert(ClxFormImgdb clxFormImgdb);

    /**
     * 删除通过主键
     * 
     * @param imgdbId
     * @return returnCode
     */
    int deleteByPrimaryKey(Integer imgdbId);

    /**
     * 单件更新通过主键(全更新)
     * 
     * @param clxFormImgdb
     * @return returnCode
     */
    int updateAllByPrimaryKey(ClxFormImgdb clxFormImgdb);

    /**
     * 单件更新通过主键(部分更新)
     * 
     * @param clxFormImgdb
     * @return returnCode
     */
    int updateByPrimaryKey(ClxFormImgdb clxFormImgdb);

    /**
     * 单件检索通过主键
     * 
     * @param imgdbId
     * @return clxFormImgdb
     */
    ClxFormImgdb selectOneByPrimaryKey(Integer imgdbId);

    /**
     * 检索列表
     * 
     * @param clxFormImgdb
     * @return clxFormImgdbList
     */
    List<ClxFormImgdb> selectList(ClxFormImgdb clxFormImgdb);

    /**
     * 检索件数
     * 
     * @param clxFormImgdb
     * @return count
     */
    int selectCount(ClxFormImgdb clxFormImgdb);
}
