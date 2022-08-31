package dev.dmohindru.ch1.finalmodifier;

public class FinalMethodExample {
    final public void hello() {
        System.out.println("Hello");
    }

    public static void main(String[] args) {
        new FinalMethodExample().hello();
    }
}

class ChildFinalMethodClass extends FinalMethodExample {
//    @Override
//    public void hello() {
//        System.out.println("Hello from child");
//    }

    public static void main(String[] args) {
        new ChildFinalMethodClass().hello();
    }
}
