package dev.dmohindru.ch1.interfacemembers;

public interface Runable {
    // Different examples of declaring static variables in an interface
    static String name = "Runable Interface";
    String runnableName = "runnableName";
    static int speed = 1;
    static int staticSpeed = 1;
    public default int getSpeed() { return calculateSpeed(); }

    default double getAcceleration() { return 1.5; }

    static String getName() {return name + calculateStaticSpeed();}


    private int calculateSpeed() {
        return speed * 10;
    }

    private static int calculateStaticSpeed() {
        return staticSpeed * 4;
    }
}
