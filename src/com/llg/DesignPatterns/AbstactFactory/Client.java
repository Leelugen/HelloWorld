package com.llg.DesignPatterns.AbstactFactory;

public class Client {
    public static void main(String[] args) {
        CarFactory factoryQ3 = new Q3Factory();
        factoryQ3.createEngine().engine();
        factoryQ3.createTire().tire();

        CarFactory factoryQ5 = new Q5Factory();
        factoryQ5.createTire().tire();
        factoryQ5.createEngine().engine();
    }
}
