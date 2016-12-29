package com.zebra.box.db.mapper;

import java.util.List;

import com.zebra.box.db.model.ClxExpressMsgLog;

/**
 * <pre>
 * =============================================================================
 * 日期：yyyyMMdd  担当:
 * 内容:
 * =============================================================================
 * </pre>
 * 
 */
public interface ClxExpressMsgLogMapper {

    /**
     * 插入
     * 
     * @param clxExpressMsgLog
     * @return returnCode
     */
    int insert(ClxExpressMsgLog clxExpressMsgLog);

    /**
     * 删除通过主键
     * 
     * @param logId
     * @return returnCode
     */
    int deleteByPrimaryKey(Integer logId);

    /**
     * 单件更新通过主键(全更新)
     * 
     * @param clxExpressMsgLog
     * @return returnCode
     */
    int updateAllByPrimaryKey(ClxExpressMsgLog clxExpressMsgLog);

    /**
     * 单件更新通过主键(部分更新)
     * 
     * @param clxExpressMsgLog
     * @return returnCode
     */
    int updateByPrimaryKey(ClxExpressMsgLog clxExpressMsgLog);

    /**
     * 单件检索通过主键
     * 
     * @param logId
     * @return clxExpressMsgLog
     */
    ClxExpressMsgLog selectOneByPrimaryKey(Integer logId);

    /**
     * 检索列表
     * 
     * @param clxExpressMsgLog
     * @return clxExpressMsgLogList
     */
    List<ClxExpressMsgLog> selectList(ClxExpressMsgLog clxExpressMsgLog);

    /**
     * 检索件数
     * 
     * @param clxExpressMsgLog
     * @return count
     */
    int selectCount(ClxExpressMsgLog clxExpressMsgLog);
}
