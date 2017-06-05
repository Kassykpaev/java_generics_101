package com.kovalevskyi.generics.m2.e0;

import com.kovalevskyi.generics.m1.e4.Cat;
import com.kovalevskyi.generics.m1.e4.Dog;

public class Main {

    public static void main(String[] args) {
//        startConcert(new HumanSinger("Max"));
    }

    private static <T extends Human & ISinger> void startConcert(T maestro) {
        System.out.printf("On the stage is: ",
                          maestro.getName());
        maestro.sing();
    }

}
