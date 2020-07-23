package dev.dmohindru.example;

public class PolarBear {
    final int age = 10;
    final int fishEaten;
    final String name;
    final static int totalNum;
    final static int weight = 100;

    static { totalNum = 4;}
    { fishEaten = 10; }

    public PolarBear() {
        name = "Robert";
    }
    public PolarBear(int height) {

        this();

    }
}
