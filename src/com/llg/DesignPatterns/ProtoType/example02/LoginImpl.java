package com.llg.DesignPatterns.ProtoType.example02;

public class LoginImpl implements Login {
    @Override
    public void login() {
        User loginedUser = new User();
        loginedUser.age = 22;
        loginedUser.name = "fifi";
        loginedUser.phoneNum = "123234343";
        loginedUser.address = new Address("北京市", "XX区", "da街");
        LoginSession.getLoginSession().setLoginedUser(loginedUser);
    }
}
