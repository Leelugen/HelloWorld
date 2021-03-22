package com.llg.DesignPatterns.FactoryMethod;

public class AudiCarFactory extends CarFactory {

    @Override
    public <T extends AudiCar> T createAudiCar(Class<T> clz) {
        AudiCar car = null;
        try {
            car = (AudiCar) Class.forName(clz.getName()).newInstance();
        } catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return (T) car;
    }
}
