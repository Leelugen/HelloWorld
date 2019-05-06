package com.llg.DesignPatterns.Status;

public class PowerOnState implements TvState {
    @Override
    public void nextChannel() {
        System.out.println("next channel");
    }

    @Override
    public void prevChannel() {
        System.out.println("pre channel");
    }

    @Override
    public void turnUp() {
        System.out.println("turn up");
    }

    @Override
    public void turnDown() {
        System.out.println("turn down");
    }
}
