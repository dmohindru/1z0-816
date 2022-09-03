package dev.dmohindru.ch3.collections;

import java.util.HashMap;
import java.util.Map;

public class MapMergeTest {
    public static void main(String[] args) {
        Map<String, String> capitalMap = new HashMap<>();

        capitalMap.put("India", "New Delhi");
        capitalMap.put("Australia", "Canberra");
        capitalMap.put("USA", "Washington DC");
        capitalMap.put("UK", "London");
        capitalMap.put("Canada", null);
        // Old value linked to UK key will be replaced
        capitalMap.put("UK", "London1");
        System.out.println("Contents of Map: " + capitalMap);
        // map merge test
        capitalMap.merge("UK", "London", (oldVal, newVal) -> {
            System.out.println("mapping function called");
            System.out.println("oldVal: " + oldVal);
            System.out.println("newVal: " + newVal);
            return newVal;
        });

        capitalMap.merge("Canada", "Toronto", (oldVal, newVal) -> {
            System.out.println("mapping function called");
            System.out.println("oldVal: " + oldVal);
            System.out.println("newVal: " + newVal);
            return newVal;
        });

        capitalMap.merge("Mexico", "Mexico City", (oldVal, newVal) -> {
            System.out.println("mapping function called");
            System.out.println("oldVal: " + oldVal);
            System.out.println("newVal: " + newVal);
            return newVal;
        });


        System.out.println("Contents of Map: " + capitalMap);





    }
}
