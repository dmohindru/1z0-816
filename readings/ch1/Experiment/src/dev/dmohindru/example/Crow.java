package dev.dmohindru.example;

import java.util.function.Predicate;

public class Crow {
    private String color;

    public Crow(String color) {
        this.color = color;
    }

    public void caw(String name) {
        String volume = "loudly";
        color = "allowed";
        //name = "not allowed";
        //volume = "not allowed";
        Predicate<String> p =
                s -> (name + volume + color).length() == 9; // DOES NOT COMPILE
    }
}
