package com.llg.Concurrent;

public class Client {
    public static void main(String[] args) {
//        Chou chou = new Chou();
//        Thread thread1 = new Thread(chou,"1号抽奖池");
//        Thread thread2 = new Thread(chou,"2号抽奖池");
//        thread1.start();
//        thread2.start();


        TakeNumber takeNumber = new TakeNumber();
        Thread threadA = new Thread(takeNumber,"前门");
        Thread threadB = new Thread(takeNumber,"后门");
        threadA.start();
        threadB.start();
    }
}
