package com.kovalevskyi.generics.m1.e0;

public class Main {

    public static void main(String[] args) {
        Box<Integer> myBox = new Box<>(1);
        Integer i = myBox.getItem();
        System.out.println(i);
    }

}
