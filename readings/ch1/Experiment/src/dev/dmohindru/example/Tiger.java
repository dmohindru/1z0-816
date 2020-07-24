package dev.dmohindru.example;

@FunctionalInterface
interface Sprint {
    public void sprint(int speed);
    String toString();
    boolean equals(Object o);
    int hashCode();
}
@FunctionalInterface
interface Dash extends Sprint {}

//@FunctionalInterface
interface Skip extends Sprint {
    void skip();
}

//@FunctionalInterface
interface Sleep {
    private void snore() {}
    default int getZzz() { return 1; }
}

@FunctionalInterface
interface Climb {
    void reach();
    default void fall() {}
    static int getBackUp() { return 100; }
    private static boolean checkHeight() { return true; }
}

public class Tiger implements Sprint {
    public void sprint(int speed) {
        System.out.println("Animal is sprinting fast! " + speed);
    }
}
