package com.llg;


import com.llg.Algorithm.Sort;
import com.llg.Algorithm.String.Contain;
import com.llg.Algorithm.String.Parse;

import java.util.Arrays;

public class HelloWorld {
    public static void main(String[] args) {

       /** ag string contain**/
//        Contain contain = new Contain();
//        Boolean ret = Contain.searchBorStr("AB","BAA");
//        System.out.println("a contain B ????"+ret);

 //       System.out.println(Parse.parseInt("3455554")+"======");


        int[] data =new int[]{4,7,8,9,1,2,1,43,111111111,112,112,32,32,232133,43,31,-1};

        Sort.insertSort(data);

        System.out.println(Arrays.toString(data));
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
