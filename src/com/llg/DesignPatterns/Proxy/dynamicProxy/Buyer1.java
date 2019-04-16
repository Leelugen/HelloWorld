package com.llg.DesignPatterns.Proxy.dynamicProxy;

public class Buyer1 implements Subject {
    @Override
    public void buy() {
        System.out.println("buy a mac");
    }
}
