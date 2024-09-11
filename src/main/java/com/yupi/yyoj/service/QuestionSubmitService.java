package com.yupi.yyoj.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.yupi.yyoj.model.dto.question.QuestionQueryRequest;
import com.yupi.yyoj.model.dto.questionsubmit.QuestionSubmitAddRequest;
import com.yupi.yyoj.model.dto.questionsubmit.QuestionSubmitQueryRequest;
import com.yupi.yyoj.model.entity.Question;
import com.yupi.yyoj.model.entity.QuestionSubmit;
import com.baomidou.mybatisplus.extension.service.IService;
import com.yupi.yyoj.model.entity.User;
import com.yupi.yyoj.model.vo.QuestionSubmitVO;
import com.yupi.yyoj.model.vo.QuestionVO;

import javax.servlet.http.HttpServletRequest;

/**
* @author 14478
* @description 针对表【question_submit(题目提交)】的数据库操作Service
* @createDate 2024-07-26 14:59:47
*/
public interface QuestionSubmitService extends IService<QuestionSubmit> {
    /**
     * 题目提交
     *
     * @param questionSubmitAddRequest 题目提交信息
     * @param loginUser
     * @return
     */
    long doQuestionSubmit(QuestionSubmitAddRequest questionSubmitAddRequest, User loginUser);

    /**
     * 获取查询条件
     *
     * @param questionSubmitQueryRequest
     * @return
     */
    QueryWrapper<QuestionSubmit> getQueryWrapper(QuestionSubmitQueryRequest questionSubmitQueryRequest);

    /**
     * 获取题目封装
     *
     * @param questionSubmit
     * @param loginUser
     * @return
     */
    QuestionSubmitVO getQuestionSubmitVO(QuestionSubmit questionSubmit, User loginUser);

    /**
     * 分页获取题目封装
     *
     * @param questionSubmitPage
     * @param loginUser
     * @return
     */
    Page<QuestionSubmitVO> getQuestionSubmitVOPage(Page<QuestionSubmit> questionSubmitPage, User loginUser);
}
