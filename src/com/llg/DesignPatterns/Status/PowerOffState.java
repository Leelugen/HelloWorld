package com.llg.DesignPatterns.Status;

//具体状态
public class PowerOffState implements TvState {


    /**
     * 关机状态任何操作无效
     */
    @Override
    public void nextChannel() {

    }

    @Override
    public void prevChannel() {

    }

    @Override
    public void turnUp() {

    }

    @Override
    public void turnDown() {

    }
}
