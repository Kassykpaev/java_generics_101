package com.kovalevskyi.generics.m0.e3;

public class StringTriple extends Tuple3<String, String> {

    private final String middle;

    public StringTriple(final String left, final String middle, final String right) {
        super(left, right);
        this.middle = middle;
    }

    public String getMiddle() {
        return middle;
    }

    public static void main(String[] args) {
        StringTriple a;
    }

}
