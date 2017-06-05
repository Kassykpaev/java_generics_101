package com.kovalevskyi.generics.m0.e0;

public class Main {

    public static void main(String[] args) {
        // GENERICS M0E0
        final Tuple student1 = new Tuple(1, "Slava");
        final String name = (String) student1.getLeft();
        System.out.println(name);
    }

    // simple
    // safe (static-typing)
    // size

}
