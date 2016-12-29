package com.zebra.box.db.mapper;

import java.util.List;

import com.zebra.box.db.model.ClxAboutMgt;

/**
 * <pre>
 * =============================================================================
 * 日期：yyyyMMdd  担当:
 * 内容:
 * =============================================================================
 * </pre>
 * 
 */
public interface ClxAboutMgtMapper {

    /**
     * 插入
     * 
     * @param clxAboutMgt
     * @return returnCode
     */
    int insert(ClxAboutMgt clxAboutMgt);

    /**
     * 删除通过主键
     * 
     * @param mgtId
     * @return returnCode
     */
    int deleteByPrimaryKey(Integer mgtId);

    /**
     * 单件更新通过主键(全更新)
     * 
     * @param clxAboutMgt
     * @return returnCode
     */
    int updateAllByPrimaryKey(ClxAboutMgt clxAboutMgt);

    /**
     * 单件更新通过主键(部分更新)
     * 
     * @param clxAboutMgt
     * @return returnCode
     */
    int updateByPrimaryKey(ClxAboutMgt clxAboutMgt);

    /**
     * 单件检索通过主键
     * 
     * @param mgtId
     * @return clxAboutMgt
     */
    ClxAboutMgt selectOneByPrimaryKey(Integer mgtId);

    /**
     * 检索列表
     * 
     * @param clxAboutMgt
     * @return clxAboutMgtList
     */
    List<ClxAboutMgt> selectList(ClxAboutMgt clxAboutMgt);

    /**
     * 检索件数
     * 
     * @param clxAboutMgt
     * @return count
     */
    int selectCount(ClxAboutMgt clxAboutMgt);
}
