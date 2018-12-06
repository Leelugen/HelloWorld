package com.llg.DesignPatterns.Builder.example01;

//导演类
public class Director {
    Builder mBuilder = null;

    public Director(Builder builder){
        mBuilder = builder;
    }

    public void construct(String board,String display) {
        mBuilder.buildBoard(board);
        mBuilder.buildDisPlay(display);
        mBuilder.buildOS();
    }
}