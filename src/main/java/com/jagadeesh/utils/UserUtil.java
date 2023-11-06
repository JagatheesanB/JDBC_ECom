package com.jagadeesh.utils;

import com.jagadeesh.models.User;

public class UserUtil {


    private static User userData;
    public static void setLoggedInUser(User user) {
        userData = user;
    }
    public static void removeLoggedInUser()
    {
        userData = null;
    }

    public static User getLoggedInUser()
    {
        return userData;
    }
}
