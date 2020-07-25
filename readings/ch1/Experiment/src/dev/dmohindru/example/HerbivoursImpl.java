package dev.dmohindru.example;

interface Herbivore {
    int amount = 10;
    static boolean gather = true;

    static void eatGrass() {
    }

    default int findMore() {
        return 2;
    }

    default float rest() {
        return 2;
    }

    default int chew() {
        return 13;
    }

    private static void eatLeaves() {
    }
}

public class HerbivoursImpl implements Herbivore {
    public HerbivoursImpl() {
        //amount = 100;
    }
}
