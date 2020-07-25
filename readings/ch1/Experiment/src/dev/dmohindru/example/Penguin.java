package dev.dmohindru.example;

interface Swim1 {
    default void perform() {
        System.out.print("Swim!");
    }
}

interface Dance {
    default void perform() {
        System.out.print("Dance!");
    }
}

public class Penguin implements Swim1, Dance {
    public void perform() {
        System.out.print("Smile!");
    }

    private void doShow() {
        //____________________
        Dance.super.perform();
    }

    public static void main(String[] eggs) {
        new Penguin().doShow();
    }
}

