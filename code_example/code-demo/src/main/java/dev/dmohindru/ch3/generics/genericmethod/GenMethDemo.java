package dev.dmohindru.ch3.generics.genericmethod;

import java.util.Arrays;

public class GenMethDemo {
    static <T extends Comparable<T>, V extends T> boolean isIn(T x, V[] y) {
        T foundItem = Arrays.stream(y).filter(x::equals).findAny().orElse(null);
        return foundItem != null;
    }

    public static void main(String[] args) {
        // Use isIn() on Integers
        Integer[] nums = {1, 2, 3, 4, 5};
        if (GenMethDemo.<Integer, Integer>isIn(2, nums))
            System.out.println("2 is in nums");

        if (!GenMethDemo.<Integer, Integer>isIn(7, nums))
            System.out.println("7 is not in nums");

        System.out.println();

        // Use isIn on String
        String[] strs = {"one", "two", "three", "four", "five"};
        if (isIn("two", strs))
            System.out.println("two is in strs");

        if (!isIn("seven", strs))
            System.out.println("seven is not in strs");

         Object[] objs = {new Object(), new Object(), new Object()};

        // this code will not compile
//        if (isIn("two", nums))
//            System.out.println("two is in strs");

//        if (isIn(objs, new Object()))
//            System.out.println("Will not compile");
    }
}
