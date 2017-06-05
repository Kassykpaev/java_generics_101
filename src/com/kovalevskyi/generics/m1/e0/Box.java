package com.kovalevskyi.generics.m1.e0;

public class Box<T> {

    private T item;

    public Box(final T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }
}
