package com.llg.DesignPatterns.FactoryMethod;

public class AudiQ7 extends AudiCar {
    @Override
    public void drive() {
        System.out.println("Audi Q7 driving");
    }

    @Override
    public void selfNavigation() {
        System.out.println("Audi Q7 self navigation");
    }
}
