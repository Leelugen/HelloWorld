package com.llg.DesignPatterns.Status;

//状态接口
public interface TvState {
    void nextChannel();
    void prevChannel();
    void turnUp();
    void turnDown();
}

