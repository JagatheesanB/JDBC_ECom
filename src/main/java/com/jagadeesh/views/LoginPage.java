package com.jagadeesh.views;

import com.jagadeesh.utils.StringUtil;

import static com.jagadeesh.utils.AppOutput.println;

public class LoginPage {
    public void printInvalidCredentials() {
        println(StringUtil.INVALID_CREDENTIALS);
    }

    public void loginSuccess() {
        println(StringUtil.LOGIN_SUCCESS);
    }
}
