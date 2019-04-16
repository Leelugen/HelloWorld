package com.llg.DesignPatterns.Proxy.dynamicProxy;

public class Buyer2 implements Subject {
    @Override
    public void buy() {
        System.out.println("buy an iphone");
    }
}
