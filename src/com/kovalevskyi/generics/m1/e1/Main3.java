package com.kovalevskyi.generics.m1.e1;

public class Main3 {

    public static void main(String[] args) {
        Human h = new Human();
        SpaceShip3<Human> ss = new SpaceShip3<>(h);
        ss.showLFName();
        Human h2 = ss.getLF();
    }

}
