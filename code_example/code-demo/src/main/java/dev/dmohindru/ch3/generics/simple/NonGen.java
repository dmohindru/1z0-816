package dev.dmohindru.ch3.generics.simple;

public class NonGen {
    Object obj; // Declare object of type T

    NonGen(Object o) {
        obj = o;
    }

    Object getObj() {
        return obj;
    }

    // Show type of T
    void showObj() {
        System.out.println("Type of T is " + obj.getClass().getName());
    }
}
