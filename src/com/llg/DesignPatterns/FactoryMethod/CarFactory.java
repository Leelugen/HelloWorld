package com.llg.DesignPatterns.FactoryMethod;

/**
 * 抽象工厂
 */
public abstract  class CarFactory {

    /**
     * 工厂方法
     */
    public abstract <T extends AudiCar> T createAudiCar(Class<T> clz);
}
