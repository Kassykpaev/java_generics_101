package com.kovalevskyi.generics.m1.e3;

import java.util.ArrayList;
import java.util.List;

public class CollectionHelper2 {

    public static<T> int findIndex(final List<T> list, final T target) {
        for (int i = 0; i < list.size(); i++) {
            final Object element = list.get(i);
            if (element.equals(target)) {
                return i;
            }
        }
        return -1;
    }

}
