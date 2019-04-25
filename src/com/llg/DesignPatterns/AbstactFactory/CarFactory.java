package com.llg.DesignPatterns.AbstactFactory;


//抽象工厂类
public abstract class CarFactory {

    //一系列的工厂方法

    public abstract ITire createTire();


    public abstract IEngine createEngine();

}
