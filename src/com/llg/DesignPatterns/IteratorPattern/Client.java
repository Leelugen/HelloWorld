package com.llg.DesignPatterns.IteratorPattern;

public class Client {
    public static void main(String[] args) {
        ConcreteHandler1 concreteHandler1 = new ConcreteHandler1();
        ConcreteHandler2 concreteHandler2 = new ConcreteHandler2();

        concreteHandler1.successor = concreteHandler2;
        concreteHandler1.handleRequest("ConcreteHandler1");


    }
}
