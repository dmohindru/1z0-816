package dev.dmohindru.finalmodifier;

import java.util.ArrayList;
import java.util.List;

public class FinalVariableExample {
    public static void main(String[] args) {
        // Final variable example
        final int i;
        i = 10;
        // Local variable example
        int j;
        j = 20;
        // final variable pointing to an object example
        final List<String> name = new ArrayList<>();
        name.add("Daksh");
        name.add("Parth");
        System.out.println("Value of i: " + i);
        System.out.println("Value of j: " + j);
        System.out.println("Initial List: " + name);
        name.add("Poonam");
        name.add("Dhruv");
        System.out.println("Final List: " + name);
    }
}
