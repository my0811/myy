package com.zebra.box.db.mapper;

import java.util.List;

import com.zebra.box.db.model.ClxHelpPropertymgtEnterwayGroup;

/**
 * <pre>
 * =============================================================================
 * 日期：yyyyMMdd  担当:
 * 内容:
 * =============================================================================
 * </pre>
 * 
 */
public interface ClxHelpPropertymgtEnterwayGroupMapper {

    /**
     * 插入
     * 
     * @param clxHelpPropertymgtEnterwayGroup
     * @return returnCode
     */
    int insert(ClxHelpPropertymgtEnterwayGroup clxHelpPropertymgtEnterwayGroup);

    /**
     * 删除通过主键
     * 
     * @param enterwayGroupid
     * @return returnCode
     */
    int deleteByPrimaryKey(Integer enterwayGroupid);

    /**
     * 单件更新通过主键(全更新)
     * 
     * @param clxHelpPropertymgtEnterwayGroup
     * @return returnCode
     */
    int updateAllByPrimaryKey(ClxHelpPropertymgtEnterwayGroup clxHelpPropertymgtEnterwayGroup);

    /**
     * 单件更新通过主键(部分更新)
     * 
     * @param clxHelpPropertymgtEnterwayGroup
     * @return returnCode
     */
    int updateByPrimaryKey(ClxHelpPropertymgtEnterwayGroup clxHelpPropertymgtEnterwayGroup);

    /**
     * 单件检索通过主键
     * 
     * @param enterwayGroupid
     * @return clxHelpPropertymgtEnterwayGroup
     */
    ClxHelpPropertymgtEnterwayGroup selectOneByPrimaryKey(Integer enterwayGroupid);

    /**
     * 检索列表
     * 
     * @param clxHelpPropertymgtEnterwayGroup
     * @return clxHelpPropertymgtEnterwayGroupList
     */
    List<ClxHelpPropertymgtEnterwayGroup> selectList(ClxHelpPropertymgtEnterwayGroup clxHelpPropertymgtEnterwayGroup);

    /**
     * 检索件数
     * 
     * @param clxHelpPropertymgtEnterwayGroup
     * @return count
     */
    int selectCount(ClxHelpPropertymgtEnterwayGroup clxHelpPropertymgtEnterwayGroup);
}
