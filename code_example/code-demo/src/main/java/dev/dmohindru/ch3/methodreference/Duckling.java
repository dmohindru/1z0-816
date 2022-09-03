package dev.dmohindru.ch3.methodreference;

public class Duckling {
    public static void makeSound(String sound) {
        LearnToSpeak learnerOne = s -> System.out.println(s);
        LearnToSpeak learnerTwo = System.out::println;
        LearnToSpeak learner = s -> {
            System.out.println(s);
            System.out.println(s);
        };
        DuckHelper.teacher(sound, learner);
        System.out.println("Printing interface implementations");
        System.out.println(learnerOne);
        System.out.println(learnerTwo);
        System.out.println(learner);
        System.out.println(new Object());
    }

    public static void main(String[] args) {
        makeSound("Hello");
    }
}

class DuckHelper {
    public static void teacher(String name, LearnToSpeak trainer) {

        // exercise patience

        trainer.speak(name);
    }
}
