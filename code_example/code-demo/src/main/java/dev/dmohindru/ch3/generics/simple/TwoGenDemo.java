package dev.dmohindru.ch3.generics.simple;

public class TwoGenDemo {
    public static void main(String[] args) {
        // Create TwoGen object
        TwoGen<Integer, String> twoGen = new TwoGen<>(100, "Generic String");

        // Show types
        twoGen.showTypes();

        // Obtain and show values
        int intVal = twoGen.getObj1();
        System.out.println("intVal: " + intVal);

        String strVal = twoGen.getObj2();
        System.out.println("strVal: " + strVal);

        // Create TwoGen another Object
        TwoGen<Double, Double> twoGenDouble = new TwoGen<>(100.00, 101.11);

        // Show types
        twoGenDouble.showTypes();

        // Obtain and show values
        double doubleVal = twoGenDouble.getObj1();
        System.out.println("doubleVal: " + doubleVal);

        double doubleVal1 = twoGenDouble.getObj2();
        System.out.println("doubleVal1: " + doubleVal1);


    }
}
