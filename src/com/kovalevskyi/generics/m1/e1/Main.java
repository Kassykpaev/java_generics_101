package com.kovalevskyi.generics.m1.e1;

public class Main {

    public static void main(String[] args) {
        Human h = new Human();
        SpaceShip ss = new SpaceShip(h);
        ss.showLFName();
//        Human h2 = ss.getLF();
        LifeForm lf = ss.getLF();
    }

}
