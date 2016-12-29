package com.zebra.box.db.mapper;

import java.util.List;

import com.zebra.box.db.model.ClxDistrictsettleListGroup;

/**
 * <pre>
 * =============================================================================
 * 日期：yyyyMMdd  担当:
 * 内容:
 * =============================================================================
 * </pre>
 * 
 */
public interface ClxDistrictsettleListGroupMapper {

    /**
     * 插入
     * 
     * @param clxDistrictsettleListGroup
     * @return returnCode
     */
    int insert(ClxDistrictsettleListGroup clxDistrictsettleListGroup);

    /**
     * 删除通过主键
     * 
     * @param listGroupId
     * @return returnCode
     */
    int deleteByPrimaryKey(Integer listGroupId);

    /**
     * 单件更新通过主键(全更新)
     * 
     * @param clxDistrictsettleListGroup
     * @return returnCode
     */
    int updateAllByPrimaryKey(ClxDistrictsettleListGroup clxDistrictsettleListGroup);

    /**
     * 单件更新通过主键(部分更新)
     * 
     * @param clxDistrictsettleListGroup
     * @return returnCode
     */
    int updateByPrimaryKey(ClxDistrictsettleListGroup clxDistrictsettleListGroup);

    /**
     * 单件检索通过主键
     * 
     * @param listGroupId
     * @return clxDistrictsettleListGroup
     */
    ClxDistrictsettleListGroup selectOneByPrimaryKey(Integer listGroupId);

    /**
     * 检索列表
     * 
     * @param clxDistrictsettleListGroup
     * @return clxDistrictsettleListGroupList
     */
    List<ClxDistrictsettleListGroup> selectList(ClxDistrictsettleListGroup clxDistrictsettleListGroup);

    /**
     * 检索件数
     * 
     * @param clxDistrictsettleListGroup
     * @return count
     */
    int selectCount(ClxDistrictsettleListGroup clxDistrictsettleListGroup);
}
