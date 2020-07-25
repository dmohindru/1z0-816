package dev.dmohindru.example;

public class FlavorsEnum {
    enum Flavors {
        VANILLA, CHOCOLATE, STRAWBERRY;
        static final Flavors DEFAULT = VANILLA;

    }

    public static void main(String[] args) {
        for (final var e : Flavors.values())
            System.out.print(e.ordinal() + " ");
    }
}

