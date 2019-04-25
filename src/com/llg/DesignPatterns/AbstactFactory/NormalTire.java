package com.llg.DesignPatterns.AbstactFactory;

public class NormalTire implements ITire {
    @Override
    public void tire() {
        System.out.println("普通轮胎");
    }
}
