package com.zebra.box.db.mapper;

import java.util.List;

import com.zebra.box.db.model.ClxHelpPropertymgt;

/**
 * <pre>
 * =============================================================================
 * 日期：yyyyMMdd  担当:
 * 内容:
 * =============================================================================
 * </pre>
 * 
 */
public interface ClxHelpPropertymgtMapper {

    /**
     * 插入
     * 
     * @param clxHelpPropertymgt
     * @return returnCode
     */
    int insert(ClxHelpPropertymgt clxHelpPropertymgt);

    /**
     * 删除通过主键
     * 
     * @param propertymgtId
     * @return returnCode
     */
    int deleteByPrimaryKey(Integer propertymgtId);

    /**
     * 单件更新通过主键(全更新)
     * 
     * @param clxHelpPropertymgt
     * @return returnCode
     */
    int updateAllByPrimaryKey(ClxHelpPropertymgt clxHelpPropertymgt);

    /**
     * 单件更新通过主键(部分更新)
     * 
     * @param clxHelpPropertymgt
     * @return returnCode
     */
    int updateByPrimaryKey(ClxHelpPropertymgt clxHelpPropertymgt);

    /**
     * 单件检索通过主键
     * 
     * @param propertymgtId
     * @return clxHelpPropertymgt
     */
    ClxHelpPropertymgt selectOneByPrimaryKey(Integer propertymgtId);

    /**
     * 检索列表
     * 
     * @param clxHelpPropertymgt
     * @return clxHelpPropertymgtList
     */
    List<ClxHelpPropertymgt> selectList(ClxHelpPropertymgt clxHelpPropertymgt);

    /**
     * 检索件数
     * 
     * @param clxHelpPropertymgt
     * @return count
     */
    int selectCount(ClxHelpPropertymgt clxHelpPropertymgt);
}
