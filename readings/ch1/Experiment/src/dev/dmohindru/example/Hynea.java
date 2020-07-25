package dev.dmohindru.example;

import java.util.function.Predicate;

public class Hynea {
    private int age = 1;

    public static void main(String[] args) {
        var p = new Hynea();
        double height = 10;
        int age = 1;
        testLaugh(p, h -> h.age < 5);
        age = 2;
    }

    static void testLaugh(Hynea panda, Predicate<Hynea> joke) {
        var r = joke.test(panda) ? "hahaha" : "silence";
        System.out.print(r);
    }
}
