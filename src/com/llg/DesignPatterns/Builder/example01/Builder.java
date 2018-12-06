package com.llg.DesignPatterns.Builder.example01;

public abstract class Builder {
    //设置主机
    public abstract void buildBoard(String board);
    //设置显示器
    public abstract void buildDisPlay(String display);
    //设置操作系统
    public abstract void buildOS();
    //创建computer
    public abstract Computer create();
}
