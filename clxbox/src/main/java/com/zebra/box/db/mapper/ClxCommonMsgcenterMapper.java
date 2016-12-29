package com.zebra.box.db.mapper;

import java.util.List;

import com.zebra.box.db.model.ClxCommonMsgcenter;

/**
 * <pre>
 * =============================================================================
 * 日期：yyyyMMdd  担当:
 * 内容:
 * =============================================================================
 * </pre>
 * 
 */
public interface ClxCommonMsgcenterMapper {

    /**
     * 插入
     * 
     * @param clxCommonMsgcenter
     * @return returnCode
     */
    int insert(ClxCommonMsgcenter clxCommonMsgcenter);

    /**
     * 删除通过主键
     * 
     * @param msgcenterId
     * @return returnCode
     */
    int deleteByPrimaryKey(Integer msgcenterId);

    /**
     * 单件更新通过主键(全更新)
     * 
     * @param clxCommonMsgcenter
     * @return returnCode
     */
    int updateAllByPrimaryKey(ClxCommonMsgcenter clxCommonMsgcenter);

    /**
     * 单件更新通过主键(部分更新)
     * 
     * @param clxCommonMsgcenter
     * @return returnCode
     */
    int updateByPrimaryKey(ClxCommonMsgcenter clxCommonMsgcenter);

    /**
     * 单件检索通过主键
     * 
     * @param msgcenterId
     * @return clxCommonMsgcenter
     */
    ClxCommonMsgcenter selectOneByPrimaryKey(Integer msgcenterId);

    /**
     * 检索列表
     * 
     * @param clxCommonMsgcenter
     * @return clxCommonMsgcenterList
     */
    List<ClxCommonMsgcenter> selectList(ClxCommonMsgcenter clxCommonMsgcenter);

    /**
     * 检索件数
     * 
     * @param clxCommonMsgcenter
     * @return count
     */
    int selectCount(ClxCommonMsgcenter clxCommonMsgcenter);
}
