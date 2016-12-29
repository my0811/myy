package com.zebra.box.db.mapper;

import java.util.List;

import com.zebra.box.db.model.ClxHelpFeedback;

/**
 * <pre>
 * =============================================================================
 * 日期：yyyyMMdd  担当:
 * 内容:
 * =============================================================================
 * </pre>
 * 
 */
public interface ClxHelpFeedbackMapper {

    /**
     * 插入
     * 
     * @param clxHelpFeedback
     * @return returnCode
     */
    int insert(ClxHelpFeedback clxHelpFeedback);

    /**
     * 删除通过主键
     * 
     * @param feedbackId
     * @return returnCode
     */
    int deleteByPrimaryKey(Long feedbackId);

    /**
     * 单件更新通过主键(全更新)
     * 
     * @param clxHelpFeedback
     * @return returnCode
     */
    int updateAllByPrimaryKey(ClxHelpFeedback clxHelpFeedback);

    /**
     * 单件更新通过主键(部分更新)
     * 
     * @param clxHelpFeedback
     * @return returnCode
     */
    int updateByPrimaryKey(ClxHelpFeedback clxHelpFeedback);

    /**
     * 单件检索通过主键
     * 
     * @param feedbackId
     * @return clxHelpFeedback
     */
    ClxHelpFeedback selectOneByPrimaryKey(Long feedbackId);

    /**
     * 检索列表
     * 
     * @param clxHelpFeedback
     * @return clxHelpFeedbackList
     */
    List<ClxHelpFeedback> selectList(ClxHelpFeedback clxHelpFeedback);

    /**
     * 检索件数
     * 
     * @param clxHelpFeedback
     * @return count
     */
    int selectCount(ClxHelpFeedback clxHelpFeedback);
}
