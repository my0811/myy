package com.zebra.box.db.mapper;

import java.util.List;

import com.zebra.box.db.model.ClxMapAddr;

/**
 * <pre>
 * =============================================================================
 * 日期：yyyyMMdd  担当:
 * 内容:
 * =============================================================================
 * </pre>
 * 
 */
public interface ClxMapAddrMapper {

    /**
     * 插入
     * 
     * @param clxMapAddr
     * @return returnCode
     */
    int insert(ClxMapAddr clxMapAddr);

    /**
     * 删除通过主键
     * 
     * @param addrId
     * @return returnCode
     */
    int deleteByPrimaryKey(Long addrId);

    /**
     * 单件更新通过主键(全更新)
     * 
     * @param clxMapAddr
     * @return returnCode
     */
    int updateAllByPrimaryKey(ClxMapAddr clxMapAddr);

    /**
     * 单件更新通过主键(部分更新)
     * 
     * @param clxMapAddr
     * @return returnCode
     */
    int updateByPrimaryKey(ClxMapAddr clxMapAddr);

    /**
     * 单件检索通过主键
     * 
     * @param addrId
     * @return clxMapAddr
     */
    ClxMapAddr selectOneByPrimaryKey(Long addrId);

    /**
     * 检索列表
     * 
     * @param clxMapAddr
     * @return clxMapAddrList
     */
    List<ClxMapAddr> selectList(ClxMapAddr clxMapAddr);

    /**
     * 检索件数
     * 
     * @param clxMapAddr
     * @return count
     */
    int selectCount(ClxMapAddr clxMapAddr);
}
