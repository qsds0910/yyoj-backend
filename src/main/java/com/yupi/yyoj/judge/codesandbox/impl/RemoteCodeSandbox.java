package com.yupi.yyoj.judge.codesandbox.impl;

import com.yupi.yyoj.judge.codesandbox.CodeSandbox;
import com.yupi.yyoj.judge.codesandbox.model.ExecuteCodeRequest;
import com.yupi.yyoj.judge.codesandbox.model.ExecuteCodeResponse;

/**
 * 远程代码沙箱（实际调用代码的沙箱）
 */
public class RemoteCodeSandbox implements CodeSandbox {
    @Override
    public ExecuteCodeResponse executeCode(ExecuteCodeRequest executeCodeRequest) {
        System.out.println("remoteSandbox");
        return null;
    }
}
