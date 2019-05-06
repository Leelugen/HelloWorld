package com.llg.DesignPatterns.Status;

public class Client {
    public static void main(String[] args) {
        TvController controller = new TvController();
        controller.powerOn();
        controller.nextChannel();
        controller.preChannel();
        controller.powerOff();
        controller.turnDown();
        controller.turnUp();
    }
}
