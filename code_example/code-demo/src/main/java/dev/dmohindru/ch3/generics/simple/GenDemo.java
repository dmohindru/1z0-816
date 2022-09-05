package dev.dmohindru.ch3.generics.simple;

public class GenDemo {
    public static void main(String[] args) {


        // Create a Gen<Integer> object
        Gen<Integer> iObj = new Gen<>(101);

        // Show type of data used by iOb
        iObj.showObj();

        // Get the value of iObj
        Integer val = iObj.getObj();
        System.out.println("val: " + val);

        System.out.println();

        // Create a Gen<String> object
        Gen<String> strObj = new Gen<> ("Generics Test");

        // Show type of data used by strObj
        strObj.showObj();

        // Get the value of strObj
        String strVal = strObj.getObj();
        System.out.println("strVal: " + strVal);

    }
}
