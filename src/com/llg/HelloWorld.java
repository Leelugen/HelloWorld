package com.llg;


import com.llg.DesignPatterns.Builder.example01.Builder;
import com.llg.DesignPatterns.Builder.example01.Director;
import com.llg.DesignPatterns.Builder.example01.MacBookBuilder;

public class HelloWorld {
    public static void main(String[] args) {
//        Contain contain = new Contain();
//        Boolean ret = contain.searchBorStr("ABC","BAA");
//        System.out.println("a contain B ????"+ret);
        Builder builder = new MacBookBuilder();
        Director pcDirector = new Director(builder);
        pcDirector.construct("Intel 8700K","SumSung");
        System.out.println("Computer　Info===="+ builder.create().toString());
    }
}
