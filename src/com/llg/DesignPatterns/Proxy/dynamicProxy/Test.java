package com.llg.DesignPatterns.Proxy.dynamicProxy;

public class Test {
    public static void main(String[] args) {

        //1. 创建调用处理器类
        DynamicProxy dynamicProxy = new DynamicProxy();

        //2. 创建目标对象类
        Buyer1 buyer1 = new Buyer1();

        //3. 创建动态代理类对象
        Subject buyer1_dynamicProxy = (Subject) dynamicProxy.newProxyInstance(buyer1);

        //4. 通过调用动态代理对象方法从而调用目标对象的方法
        //实际上是调用了invoke() ，再通过invoke() 里的反射机制调用目标对象的方法
        buyer1_dynamicProxy.buy();


        Buyer2 mBuyer2 = new Buyer2();
        Subject Buyer2_DynamicProxy = (Subject) dynamicProxy.newProxyInstance(mBuyer2);
        Buyer2_DynamicProxy.buy();
    }
}
