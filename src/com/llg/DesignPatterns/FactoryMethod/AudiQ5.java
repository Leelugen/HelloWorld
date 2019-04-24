package com.llg.DesignPatterns.FactoryMethod;

public class AudiQ5 extends AudiCar {
    @Override
    public void drive() {
        System.out.println("audi q5 启动了");
    }

    @Override
    public void selfNavigation() {
        System.out.println("audi q5 自动巡航、、、、");
    }
}
