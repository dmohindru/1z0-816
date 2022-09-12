package dev.dmohindru.ch3.generics.genericinterface;

public interface MinMax <T extends Comparable<T>>{
    T min();
    T max();
}
