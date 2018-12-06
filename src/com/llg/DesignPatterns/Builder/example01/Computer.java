package com.llg.DesignPatterns.Builder.example01;

public abstract class Computer {
    protected String mBoard;
    protected String mOS;
    protected String mDisPlay;

    protected Computer(){

    }

    public void setBoard(String mBoard) {
        this.mBoard = mBoard;
    }

    public void setDisPlay(String mDisPlay) {
        this.mDisPlay = mDisPlay;
    }

    public abstract void setOS();

    @Override
    public String toString() {
        return "Computer{" +
                "mBoard='" + mBoard + '\'' +
                ", mOS='" + mOS + '\'' +
                ", mDisPlay='" + mDisPlay + '\'' +
                '}';
    }
}
