package com.kovalevskyi.generics.m1.e1;

public class SpaceShip3<T extends LifeForm> {

    private final T lf;

    public SpaceShip3(T lf) {
        this.lf = lf;
    }

    public T getLF() {
        return lf;
    }

    public void showLFName() {
        System.out.println(lf.getName());
    }

}
