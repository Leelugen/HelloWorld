package com.llg.DesignPatterns.Status;

public class TvController implements PowerController {
    TvState tvState = new PowerOffState();

    private void setTvState(TvState tvState) {
        this.tvState = tvState;
    }

    @Override
    public void powerOn() {
        setTvState(new PowerOnState());
        System.out.println("power On");
    }

    @Override
    public void powerOff() {
        setTvState(new PowerOffState());
        System.out.println("power off");
    }

    public void nextChannel(){
        tvState.nextChannel();
    }

    public void preChannel(){
        tvState.prevChannel();
    }

    public void turnUp(){
        tvState.turnUp();
    }

    public void turnDown(){
        tvState.turnDown();
    }

}
