package dev.dmohindru.functionalinterfaces;

public class FunctionUsageDemo {
    public static void main(String[] args) {
        ExampleOne exampleOne = (a, b, c) -> {
            System.out.println(b + (a + c));
        };

        ExampleOne exampleTwo = (int a, String b, long c) -> {
            System.out.println(b + (a - c));
        };

        ExampleOne exampleThree = (var a, var b, var c) -> {
            System.out.println(b + (a * c));
        };

        useExampleOne(exampleOne);
        useExampleOne(exampleTwo);
        useExampleOne(exampleThree);


    }

    public static void useExampleOne(ExampleOne example) {
        example.methodOne(2, "Hello", 3);
    }
}
