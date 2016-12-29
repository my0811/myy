package com.zebra.box.db.mapper;

import java.util.List;

import com.zebra.box.db.model.ClxDistrictsettleThumbGroup;

/**
 * <pre>
 * =============================================================================
 * 日期：yyyyMMdd  担当:
 * 内容:
 * =============================================================================
 * </pre>
 * 
 */
public interface ClxDistrictsettleThumbGroupMapper {

    /**
     * 插入
     * 
     * @param clxDistrictsettleThumbGroup
     * @return returnCode
     */
    int insert(ClxDistrictsettleThumbGroup clxDistrictsettleThumbGroup);

    /**
     * 删除通过主键
     * 
     * @param thumbId
     * @return returnCode
     */
    int deleteByPrimaryKey(Integer thumbId);

    /**
     * 单件更新通过主键(全更新)
     * 
     * @param clxDistrictsettleThumbGroup
     * @return returnCode
     */
    int updateAllByPrimaryKey(ClxDistrictsettleThumbGroup clxDistrictsettleThumbGroup);

    /**
     * 单件更新通过主键(部分更新)
     * 
     * @param clxDistrictsettleThumbGroup
     * @return returnCode
     */
    int updateByPrimaryKey(ClxDistrictsettleThumbGroup clxDistrictsettleThumbGroup);

    /**
     * 单件检索通过主键
     * 
     * @param thumbId
     * @return clxDistrictsettleThumbGroup
     */
    ClxDistrictsettleThumbGroup selectOneByPrimaryKey(Integer thumbId);

    /**
     * 检索列表
     * 
     * @param clxDistrictsettleThumbGroup
     * @return clxDistrictsettleThumbGroupList
     */
    List<ClxDistrictsettleThumbGroup> selectList(ClxDistrictsettleThumbGroup clxDistrictsettleThumbGroup);

    /**
     * 检索件数
     * 
     * @param clxDistrictsettleThumbGroup
     * @return count
     */
    int selectCount(ClxDistrictsettleThumbGroup clxDistrictsettleThumbGroup);
}
