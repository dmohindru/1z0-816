package dev.dmohindru.ch3.generics.simple;

public class TwoGen <T, V>{
    T obj1;
    V obj2;

    TwoGen(T t, V v) {
        obj1 = t;
        obj2 = v;
    }

    void showTypes() {
        System.out.println("Type of T is " + obj1.getClass().getName());
        System.out.println("Type of V is " + obj2.getClass().getName());
    }

    T getObj1() {
        return obj1;
    }

    V getObj2() {
        return obj2;
    }
}
