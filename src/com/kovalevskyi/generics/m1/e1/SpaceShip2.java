package com.kovalevskyi.generics.m1.e1;

public class SpaceShip2<T> {

    private final T lf;

    public SpaceShip2(T lf) {
        this.lf = lf;
    }

    public T getLF() {
        return lf;
    }

//    public void showLFName() {
//        System.out.println(lf.getName());
//    }

}
