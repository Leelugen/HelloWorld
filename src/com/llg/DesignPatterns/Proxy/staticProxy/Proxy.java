package com.llg.DesignPatterns.Proxy.staticProxy;

public class Proxy implements Subject {


    @Override
    public void buyMac() {
        //引用并创建真实对象实例
        RealSubject realSubject = new RealSubject();

        //调用真实对象的方法
        realSubject.buyMac();

        //代理对象额外做的操作
        this.WrapMac();
    }

    private void WrapMac() {
        System.out.println("Packing mac with a box");
    }
}
