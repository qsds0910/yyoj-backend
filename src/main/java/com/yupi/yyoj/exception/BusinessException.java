package com.yupi.yyoj.exception;

import com.yupi.yyoj.common.ErrorCode;

/**
 * 自定义异常类
 *
 * @author <a href="https://github.com/qsds0910">qsds</a>
 * @from <a href="https://yyoj.fun">喋喋不休</a>
 */
public class BusinessException extends RuntimeException {

    /**
     * 错误码
     */
    private final int code;

    public BusinessException(int code, String message) {
        super(message);
        this.code = code;
    }

    public BusinessException(ErrorCode errorCode) {
        super(errorCode.getMessage());
        this.code = errorCode.getCode();
    }

    public BusinessException(ErrorCode errorCode, String message) {
        super(message);
        this.code = errorCode.getCode();
    }

    public int getCode() {
        return code;
    }
}
