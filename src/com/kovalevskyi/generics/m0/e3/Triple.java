package com.kovalevskyi.generics.m0.e3;

public class Triple<T1, T2, T3> extends Tuple3<T1, T3> {

    private final T2 middle;

    public Triple(final T1 left, final T2 middle, final T3 right) {
        super(left, right);
        this.middle = middle;
    }

    public T2 getMiddle() {
        return middle;
    }

    public static void main(String[] args) {
        Triple<Long, String, Integer> tr = null;
        tr.getRight();

    }

    // Tuple3<Long, Integer>
    // Triple<Long, String, Integer>
}
