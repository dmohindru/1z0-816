package dev.dmohindru.ch3.generics.genericsubclass;

import org.w3c.dom.ls.LSOutput;

import java.util.HashMap;
import java.util.TreeMap;

public class GenParent <T> {
    T obj;

    GenParent(T o) {
        obj = o;
    }

    // Return ob
    T getObj() {
        return obj;
    }
}

class GenChild<T> extends GenParent<T> {
    GenChild(T o) {
        super(o);
    }
}

class HierDemo3 {

    public static void main(String[] args) {
        // Create GenParent object
        GenParent<Integer> iObj = new GenParent<>(88);

        // Create GenChild object
        GenChild<Integer> iObj2 = new GenChild<>(99);

        // Create GenChild object of type String
        GenChild<String> strObj2 = new GenChild<>("Generic Test");

        // See if iObj2 is some form of GenChild
        if (iObj2 instanceof GenChild<?>)
            System.out.println("iObj2 is instance of GenChild");

        // See if iObj is some form of GenParent
        if (iObj instanceof GenParent<?>)
            System.out.println("iObj is instance of GenParent");

        // See if iObj is an instance of GenChild which is not
        if (iObj instanceof GenChild<?>)
            System.out.println("iObj is instance of GenChild");

        // See if strObj2 is an instance of GenChild which is
        if (strObj2 instanceof GenChild<?>)
            System.out.println("strObj2 is instance of GenChild");


    }


}
