package dev.dmohindru.ch1.functionalinterfaces;

@FunctionalInterface
public interface ExampleOne {
    // Single abstract method
    public void methodOne(int a, String b, long c);
    // a default method
    public default  void methodTwo(){}
    // abstract method having same signature of Object class
    public boolean equals(Object obj);
    // abstract method having same signature of Object class
    String toString();
    // private method
    private void methodThree() {}
    // static method
    static void methodFour(){}
    // private static method
    private static void methodFive(){}
}
