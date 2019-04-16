package com.llg.DesignPatterns.Proxy.staticProxy;

/**
 * 静态代理设计模式
 */
public class ProxyPattern {
    public static void main(String[] args) {
        Subject proxy = new Proxy();
        proxy.buyMac();
    }
}

