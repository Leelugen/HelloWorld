package com.llg;


import com.llg.Algorithm.String.Contain;
import com.llg.Algorithm.String.Parse;

public class HelloWorld {
    public static void main(String[] args) {

       /** ag string contain**/
//        Contain contain = new Contain();
//        Boolean ret = Contain.searchBorStr("AB","BAA");
//        System.out.println("a contain B ????"+ret);

        System.out.println(Parse.parseInt("3455554")+"======");


       /** dp builder **/
//        Builder builder = new MacBookBuilder();
//        Director pcDirector = new Director(builder);
//        pcDirector.construct("Intel 8700K","SumSung");
//        System.out.println("Computer　Info===="+ builder.create().toString());

       /** dp prototype**/
//        LoginImpl login = new LoginImpl();
//        login.login();
//        User curUser = LoginSession.getLoginSession().getLoginedUser();
//        //curUser.address = new Address("city","district","street");
//        curUser.address.street = "fixed";
//        System.out.println(LoginSession.getLoginSession().getLoginedUser());
//        System.out.println(curUser);

//        try {
//            testException();
//        }catch (Exception e){
//            System.out.println("Error!!!");
//        }
    }

    public static void testException(){
        throw new NullPointerException();
    }
}
