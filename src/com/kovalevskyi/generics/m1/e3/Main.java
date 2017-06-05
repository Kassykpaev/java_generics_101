package com.kovalevskyi.generics.m1.e3;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        final List<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        int result = CollectionHelper.<String>findIndex(list, "1");
        System.out.println(result);
    }

}
