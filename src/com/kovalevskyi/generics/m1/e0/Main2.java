package com.kovalevskyi.generics.m1.e0;

public class Main2 {

    public static void main(String[] args) {
        Box myBox = new Box(1);
        Integer i = (Integer)myBox.getItem();
    }

}
