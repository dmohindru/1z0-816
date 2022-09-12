package dev.dmohindru.ch3.generics.genericinterface;

import java.util.Arrays;

public class MyClass <T extends Comparable<T>> implements MinMax<T> {
    T[] val;

    MyClass(T[] o) {
        val = o;
    }

    @Override
    public T min() {
        return Arrays.stream(val).min(Comparable::compareTo).orElse(null);
    }

    @Override
    public T max() {
        return Arrays.stream(val).max(Comparable::compareTo).orElse(null);
    }
}
