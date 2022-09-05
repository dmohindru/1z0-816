package dev.dmohindru.ch3.generics.bounded;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Stats <T extends Number>{
    T[] nums;

    // Pass the constructor a reference to any array of type T
    Stats(T[] o) {
        nums = o;
    }

    // Return type double in all cases
    double average() {
        return Arrays.stream(nums).collect(Collectors.averagingDouble(Number::doubleValue));
    }

    // Determine if two averages are the same
    boolean sameAvg(Stats<?> ob) {
        return average() == ob.average();
    }
}
