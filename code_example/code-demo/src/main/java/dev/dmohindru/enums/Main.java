package dev.dmohindru.enums;

public class Main {
    public static void main(String[] args) {

        for(var e: Seasons.values()) {
            System.out.println(e.name() + ": " + e.ordinal());
        }

        Seasons s = Seasons.FALL;
        System.out.println("---------------");
        System.out.println("s.getRange(): " + s.getRange());
        System.out.println("s.getExpectedVisitors(): " + s.getExpectedVisitors());
        System.out.println("s.getData(): " + s.getData());
        System.out.println("---------------");

    }
}
