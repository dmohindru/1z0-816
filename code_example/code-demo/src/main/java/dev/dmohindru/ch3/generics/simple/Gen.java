package dev.dmohindru.ch3.generics.simple;

public class Gen<T> {
    T obj; // Declare object of type T

    Gen(T o) {
        obj = o;
    }

    T getObj() {
        return obj;
    }

    // Show type of T
    void showObj() {
        System.out.println("Type of T is " + obj.getClass().getName());
    }
}
