package com.zebra.box.db.mapper;

import java.util.List;

import com.zebra.box.db.model.ClxAboutSelectusadrRecord;

/**
 * <pre>
 * =============================================================================
 * 日期：yyyyMMdd  担当:
 * 内容:
 * =============================================================================
 * </pre>
 * 
 */
public interface ClxAboutSelectusadrRecordMapper {

    /**
     * 插入
     * 
     * @param clxAboutSelectusadrRecord
     * @return returnCode
     */
    int insert(ClxAboutSelectusadrRecord clxAboutSelectusadrRecord);

    /**
     * 删除通过主键
     * 
     * @param selectusaddrId
     * @return returnCode
     */
    int deleteByPrimaryKey(Integer selectusaddrId);

    /**
     * 单件更新通过主键(全更新)
     * 
     * @param clxAboutSelectusadrRecord
     * @return returnCode
     */
    int updateAllByPrimaryKey(ClxAboutSelectusadrRecord clxAboutSelectusadrRecord);

    /**
     * 单件更新通过主键(部分更新)
     * 
     * @param clxAboutSelectusadrRecord
     * @return returnCode
     */
    int updateByPrimaryKey(ClxAboutSelectusadrRecord clxAboutSelectusadrRecord);

    /**
     * 单件检索通过主键
     * 
     * @param selectusaddrId
     * @return clxAboutSelectusadrRecord
     */
    ClxAboutSelectusadrRecord selectOneByPrimaryKey(Integer selectusaddrId);

    /**
     * 检索列表
     * 
     * @param clxAboutSelectusadrRecord
     * @return clxAboutSelectusadrRecordList
     */
    List<ClxAboutSelectusadrRecord> selectList(ClxAboutSelectusadrRecord clxAboutSelectusadrRecord);

    /**
     * 检索件数
     * 
     * @param clxAboutSelectusadrRecord
     * @return count
     */
    int selectCount(ClxAboutSelectusadrRecord clxAboutSelectusadrRecord);
}
