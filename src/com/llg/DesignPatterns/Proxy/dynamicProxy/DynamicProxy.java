package com.llg.DesignPatterns.Proxy.dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;


/**
 * 声明调用处理类
 *
 *  作用：
 *  1. 生成动态代理对象
 *  2. 指定代理对象运行目标对象方法时需要完成的具体任务
 *  需要实现InvocationHandler（调用处理类）接口
 */
public class DynamicProxy implements InvocationHandler {

    private Object proxyObject;

    /**
     *
     * @param proxyObject 目标对象
     * @return
     */
    public Object newProxyInstance(Object proxyObject){
        this.proxyObject = proxyObject;
        return Proxy.newProxyInstance(proxyObject.getClass().getClassLoader()
                ,proxyObject.getClass().getInterfaces(),this);

        //Proxy为代理类主类
        //Proxy.newProxyInstance() 作用：根据指定的类装载器、一组接口 & 调用处理器 生成动态代理类实例，并最终返回
    }

    //  动态代理对象调用目标对象的任何方法前，都会调用调用处理器类的invoke()
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("代购出门了>>>>>>>>");
        Object result = null;
        result = method.invoke(proxyObject,args);
        return result;
    }

}




