package com.llg.DesignPatterns.AbstactFactory;

public class Q5Factory extends CarFactory {
    @Override
    public ITire createTire() {
        return new SUVTire();
    }

    @Override
    public IEngine createEngine() {
        return new ImportEngine();
    }
}
