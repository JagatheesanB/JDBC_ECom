package com.jagadeesh.views;

import com.jagadeesh.utils.StringUtil;

import static com.jagadeesh.utils.AppOutput.println;

public class AdminPage {
    public void welcomeMsg() {
        println(StringUtil.ADMIN_WELCOME);
    }

    public void adminMenu() {
        println(StringUtil.ADMIN_CHOICE);
    }
}
