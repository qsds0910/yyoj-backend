package com.yupi.yyoj.judge;

import com.yupi.yyoj.judge.strategy.DefaultJudgeStrategy;
import com.yupi.yyoj.judge.strategy.JavaLanguageStrategy;
import com.yupi.yyoj.judge.strategy.JudgeContext;
import com.yupi.yyoj.judge.strategy.JudgeStrategy;
import com.yupi.yyoj.judge.codesandbox.model.JudgeInfo;
import com.yupi.yyoj.model.entity.QuestionSubmit;
import org.springframework.stereotype.Service;

/**
 * 判题管理
 */
@Service
//加service可以直接引用
public class JudgeManager {
    /**
     * 执行判题
     *
     * @param judgeContext
     * @return
     */
    JudgeInfo doJudge(JudgeContext judgeContext) {
        QuestionSubmit questionSubmit = judgeContext.getQuestionSubmit();
        String language = questionSubmit.getLanguage();
        JudgeStrategy judgeStrategy = new DefaultJudgeStrategy();
        if ("java".equals(language)){
            judgeStrategy = new JavaLanguageStrategy();
        }
        return judgeStrategy.doJudge(judgeContext);
    }
}
