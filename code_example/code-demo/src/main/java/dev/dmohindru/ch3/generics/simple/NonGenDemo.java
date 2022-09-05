package dev.dmohindru.ch3.generics.simple;

public class NonGenDemo {
    public static void main(String[] args) {
        // Create a Gen<Integer> object
        NonGen iObj = new NonGen(101);

        // Show type of data used by iOb
        iObj.showObj();

        // Get the value of iObj
        Integer val = (Integer) iObj.getObj();
        System.out.println("val: " + val);

        System.out.println();

        // Create a Gen<String> object
        NonGen strObj = new NonGen ("Generics Test");

        // Show type of data used by strObj
        strObj.showObj();

        // Get the value of strObj
        String strVal = (String) strObj.getObj();
        System.out.println("strVal: " + strVal);
    }
}
