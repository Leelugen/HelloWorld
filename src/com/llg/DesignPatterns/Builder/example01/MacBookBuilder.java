package com.llg.DesignPatterns.Builder.example01;

public class MacBookBuilder extends Builder {
    private Computer mComputer = new MacBook();

    @Override
    public void buildBoard(String board) {
        mComputer.setBoard(board);
    }

    @Override
    public void buildDisPlay(String display) {
        mComputer.setDisPlay(display);
    }

    @Override
    public void buildOS() {
        mComputer.setOS();
    }

    @Override
    public Computer create() {
        return mComputer;
    }
}
