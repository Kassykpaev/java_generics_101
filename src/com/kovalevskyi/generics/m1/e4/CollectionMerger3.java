package com.kovalevskyi.generics.m1.e4;

import java.util.ArrayList;
import java.util.List;

public class CollectionMerger3 {

    public static <T> List<T> merge(final List<? extends T> left,
                                    final List<? extends T> right) {
        final List<T> result = new ArrayList<>();
        result.addAll(left);
        result.addAll(right);
        return result;
    }

    public static void main(String[] args) {
        List<Dog> dogs = new ArrayList<>();
        List<Cat> cats = new ArrayList<>();
        List<Animal> animals = CollectionMerger3.<Animal>merge(dogs, cats);
    }

}
