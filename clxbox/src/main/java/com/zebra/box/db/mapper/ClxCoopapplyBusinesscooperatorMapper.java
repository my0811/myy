package com.zebra.box.db.mapper;

import java.util.List;

import com.zebra.box.db.model.ClxCoopapplyBusinesscooperator;

/**
 * <pre>
 * =============================================================================
 * 日期：yyyyMMdd  担当:
 * 内容:
 * =============================================================================
 * </pre>
 * 
 */
public interface ClxCoopapplyBusinesscooperatorMapper {

    /**
     * 插入
     * 
     * @param clxCoopapplyBusinesscooperator
     * @return returnCode
     */
    int insert(ClxCoopapplyBusinesscooperator clxCoopapplyBusinesscooperator);

    /**
     * 删除通过主键
     * 
     * @param businesscooperId
     * @return returnCode
     */
    int deleteByPrimaryKey(Integer businesscooperId);

    /**
     * 单件更新通过主键(全更新)
     * 
     * @param clxCoopapplyBusinesscooperator
     * @return returnCode
     */
    int updateAllByPrimaryKey(ClxCoopapplyBusinesscooperator clxCoopapplyBusinesscooperator);

    /**
     * 单件更新通过主键(部分更新)
     * 
     * @param clxCoopapplyBusinesscooperator
     * @return returnCode
     */
    int updateByPrimaryKey(ClxCoopapplyBusinesscooperator clxCoopapplyBusinesscooperator);

    /**
     * 单件检索通过主键
     * 
     * @param businesscooperId
     * @return clxCoopapplyBusinesscooperator
     */
    ClxCoopapplyBusinesscooperator selectOneByPrimaryKey(Integer businesscooperId);

    /**
     * 检索列表
     * 
     * @param clxCoopapplyBusinesscooperator
     * @return clxCoopapplyBusinesscooperatorList
     */
    List<ClxCoopapplyBusinesscooperator> selectList(ClxCoopapplyBusinesscooperator clxCoopapplyBusinesscooperator);

    /**
     * 检索件数
     * 
     * @param clxCoopapplyBusinesscooperator
     * @return count
     */
    int selectCount(ClxCoopapplyBusinesscooperator clxCoopapplyBusinesscooperator);
}
