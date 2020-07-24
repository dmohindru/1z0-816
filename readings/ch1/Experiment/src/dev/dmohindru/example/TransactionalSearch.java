package dev.dmohindru.example;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class TransactionalSearch {
    public static void main(String[] args) {

        // list of animals
        var animals = new ArrayList<MyAnimal>();
        animals.add(new MyAnimal("fish", false, true));
        animals.add(new MyAnimal("kangaroo", true, true));
        animals.add(new MyAnimal("rabbit", true, false));
        animals.add(new MyAnimal("turtle", false, true));

        // Pass lambda that does check
        print(animals, (MyAnimal a) -> {return !a.canSwim();});
    }

    private static void print(List<MyAnimal> animals,
                              Predicate<MyAnimal> checker) {
        for (MyAnimal animal : animals) {
            if (checker.test(animal))
                System.out.print(animal + " ");
        }
    }
}
