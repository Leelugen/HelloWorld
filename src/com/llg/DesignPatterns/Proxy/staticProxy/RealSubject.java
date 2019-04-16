package com.llg.DesignPatterns.Proxy.staticProxy;

/**
 * 真实对象类
 */
public class RealSubject implements Subject {


    @Override
    public void buyMac() {
        System.out.println("buy a mac");
    }
}
