package com.zebra.box.db.mapper;

import java.util.List;

import com.zebra.box.db.model.ClxMapProvince;

/**
 * <pre>
 * =============================================================================
 * 日期：yyyyMMdd  担当:
 * 内容:
 * =============================================================================
 * </pre>
 * 
 */
public interface ClxMapProvinceMapper {

    /**
     * 插入
     * 
     * @param clxMapProvince
     * @return returnCode
     */
    int insert(ClxMapProvince clxMapProvince);

    /**
     * 删除通过主键
     * 
     * @param provinceId
     * @return returnCode
     */
    int deleteByPrimaryKey(Integer provinceId);

    /**
     * 单件更新通过主键(全更新)
     * 
     * @param clxMapProvince
     * @return returnCode
     */
    int updateAllByPrimaryKey(ClxMapProvince clxMapProvince);

    /**
     * 单件更新通过主键(部分更新)
     * 
     * @param clxMapProvince
     * @return returnCode
     */
    int updateByPrimaryKey(ClxMapProvince clxMapProvince);

    /**
     * 单件检索通过主键
     * 
     * @param provinceId
     * @return clxMapProvince
     */
    ClxMapProvince selectOneByPrimaryKey(Integer provinceId);

    /**
     * 检索列表
     * 
     * @param clxMapProvince
     * @return clxMapProvinceList
     */
    List<ClxMapProvince> selectList(ClxMapProvince clxMapProvince);

    /**
     * 检索件数
     * 
     * @param clxMapProvince
     * @return count
     */
    int selectCount(ClxMapProvince clxMapProvince);
}
