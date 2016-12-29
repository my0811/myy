package com.zebra.box.db.mapper;

import java.util.List;

import com.zebra.box.db.model.ClxHrMsg;

/**
 * <pre>
 * =============================================================================
 * 日期：yyyyMMdd  担当:
 * 内容:
 * =============================================================================
 * </pre>
 * 
 */
public interface ClxHrMsgMapper {

    /**
     * 插入
     * 
     * @param clxHrMsg
     * @return returnCode
     */
    int insert(ClxHrMsg clxHrMsg);

    /**
     * 删除通过主键
     * 
     * @param msgId
     * @return returnCode
     */
    int deleteByPrimaryKey(Integer msgId);

    /**
     * 单件更新通过主键(全更新)
     * 
     * @param clxHrMsg
     * @return returnCode
     */
    int updateAllByPrimaryKey(ClxHrMsg clxHrMsg);

    /**
     * 单件更新通过主键(部分更新)
     * 
     * @param clxHrMsg
     * @return returnCode
     */
    int updateByPrimaryKey(ClxHrMsg clxHrMsg);

    /**
     * 单件检索通过主键
     * 
     * @param msgId
     * @return clxHrMsg
     */
    ClxHrMsg selectOneByPrimaryKey(Integer msgId);

    /**
     * 检索列表
     * 
     * @param clxHrMsg
     * @return clxHrMsgList
     */
    List<ClxHrMsg> selectList(ClxHrMsg clxHrMsg);

    /**
     * 检索件数
     * 
     * @param clxHrMsg
     * @return count
     */
    int selectCount(ClxHrMsg clxHrMsg);
}
