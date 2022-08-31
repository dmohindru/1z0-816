package dev.dmohindru.interfacemembers;

public interface Walkable {
    static String name = "Walkable Interface";
    String walkableName = "walkableName";
    public default int getSpeed() { return 5; }
    static String getName() {return name;}
}
