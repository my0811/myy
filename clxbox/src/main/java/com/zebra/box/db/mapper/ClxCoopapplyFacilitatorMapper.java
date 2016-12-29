package com.zebra.box.db.mapper;

import java.util.List;

import com.zebra.box.db.model.ClxCoopapplyFacilitator;

/**
 * <pre>
 * =============================================================================
 * 日期：yyyyMMdd  担当:
 * 内容:
 * =============================================================================
 * </pre>
 * 
 */
public interface ClxCoopapplyFacilitatorMapper {

    /**
     * 插入
     * 
     * @param clxCoopapplyFacilitator
     * @return returnCode
     */
    int insert(ClxCoopapplyFacilitator clxCoopapplyFacilitator);

    /**
     * 删除通过主键
     * 
     * @param facilitatorId
     * @return returnCode
     */
    int deleteByPrimaryKey(Integer facilitatorId);

    /**
     * 单件更新通过主键(全更新)
     * 
     * @param clxCoopapplyFacilitator
     * @return returnCode
     */
    int updateAllByPrimaryKey(ClxCoopapplyFacilitator clxCoopapplyFacilitator);

    /**
     * 单件更新通过主键(部分更新)
     * 
     * @param clxCoopapplyFacilitator
     * @return returnCode
     */
    int updateByPrimaryKey(ClxCoopapplyFacilitator clxCoopapplyFacilitator);

    /**
     * 单件检索通过主键
     * 
     * @param facilitatorId
     * @return clxCoopapplyFacilitator
     */
    ClxCoopapplyFacilitator selectOneByPrimaryKey(Integer facilitatorId);

    /**
     * 检索列表
     * 
     * @param clxCoopapplyFacilitator
     * @return clxCoopapplyFacilitatorList
     */
    List<ClxCoopapplyFacilitator> selectList(ClxCoopapplyFacilitator clxCoopapplyFacilitator);

    /**
     * 检索件数
     * 
     * @param clxCoopapplyFacilitator
     * @return count
     */
    int selectCount(ClxCoopapplyFacilitator clxCoopapplyFacilitator);
}
