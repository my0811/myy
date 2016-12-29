package com.zebra.box.db.mapper;

import java.util.List;

import com.zebra.box.db.model.ClxAgreement;

/**
 * <pre>
 * =============================================================================
 * 日期：yyyyMMdd  担当:
 * 内容:
 * =============================================================================
 * </pre>
 * 
 */
public interface ClxAgreementMapper {

    /**
     * 插入
     * 
     * @param clxAgreement
     * @return returnCode
     */
    int insert(ClxAgreement clxAgreement);

    /**
     * 删除通过主键
     * 
     * @param agreementId
     * @return returnCode
     */
    int deleteByPrimaryKey(Integer agreementId);

    /**
     * 单件更新通过主键(全更新)
     * 
     * @param clxAgreement
     * @return returnCode
     */
    int updateAllByPrimaryKey(ClxAgreement clxAgreement);

    /**
     * 单件更新通过主键(部分更新)
     * 
     * @param clxAgreement
     * @return returnCode
     */
    int updateByPrimaryKey(ClxAgreement clxAgreement);

    /**
     * 单件检索通过主键
     * 
     * @param agreementId
     * @return clxAgreement
     */
    ClxAgreement selectOneByPrimaryKey(Integer agreementId);

    /**
     * 检索列表
     * 
     * @param clxAgreement
     * @return clxAgreementList
     */
    List<ClxAgreement> selectList(ClxAgreement clxAgreement);

    /**
     * 检索件数
     * 
     * @param clxAgreement
     * @return count
     */
    int selectCount(ClxAgreement clxAgreement);
}
