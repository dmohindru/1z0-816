package dev.dmohindru.ch3.collections;

import java.util.*;

public class SortTest {
    public static void main(String[] args) {

        List<Person> people = new ArrayList<>();
        people.add(new Person("Dhruv", "Mohindru"));
        people.add(new Person("Amanda", "Evans"));
        people.add(new Person("Rahul", "Arora"));
        people.add(new Person("Leah", "Greystanes"));

        System.out.println("Unsorted List: " + people);
        //Collections.sort(people);
        Collections.sort(people, (s1, s2) -> s1.lastName.compareTo(s2.lastName));

        System.out.println("Natural Sorted List: " + people);

    }
}
