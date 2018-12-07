package com.llg;


import com.llg.DesignPatterns.Builder.example01.Builder;
import com.llg.DesignPatterns.Builder.example01.Director;
import com.llg.DesignPatterns.Builder.example01.MacBookBuilder;
import com.llg.DesignPatterns.ProtoType.example02.Address;
import com.llg.DesignPatterns.ProtoType.example02.LoginImpl;
import com.llg.DesignPatterns.ProtoType.example02.LoginSession;
import com.llg.DesignPatterns.ProtoType.example02.User;

public class HelloWorld {
    public static void main(String[] args) {

       /** ag string contain**/
//        Contain contain = new Contain();
//        Boolean ret = contain.searchBorStr("ABC","BAA");
//        System.out.println("a contain B ????"+ret);


       /** dp builder **/
//        Builder builder = new MacBookBuilder();
//        Director pcDirector = new Director(builder);
//        pcDirector.construct("Intel 8700K","SumSung");
//        System.out.println("Computer　Info===="+ builder.create().toString());

       /** dp prototype**/
        LoginImpl login = new LoginImpl();
        login.login();
        User curUser = LoginSession.getLoginSession().getLoginedUser();
        //curUser.address = new Address("city","district","street");
        curUser.address.street = "fixed";
        System.out.println(LoginSession.getLoginSession().getLoginedUser());
        System.out.println(curUser);
    }
}
