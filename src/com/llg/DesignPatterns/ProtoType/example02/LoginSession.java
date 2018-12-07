package com.llg.DesignPatterns.ProtoType.example02;

public class LoginSession {
    static LoginSession sLoginSession =null;
    //已登录的用户
    private User loginedUser;

    private LoginSession(){

    }

    public static LoginSession getLoginSession(){
        if (sLoginSession == null){
            sLoginSession = new LoginSession();
        }
        return sLoginSession;
    }

    //不对外修改
    void setLoginedUser(User user){
        loginedUser = user;
    }

    public User getLoginedUser() {
        return loginedUser.clone();
    }
}
