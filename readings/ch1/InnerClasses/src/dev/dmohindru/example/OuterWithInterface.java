package dev.dmohindru.example;

import java.time.LocalDate;
abstract class MoreLocalClass {

}

public class OuterWithInterface {
    interface Greeting {
        void methodHello();
        void methodBye();
    }
    interface Message {
        void messagePrinter1();
        void messagePrinter2();
    }

    interface CombinedInterface extends Greeting, Message {

    }

    private class Inner implements Greeting, Message {

        @Override
        public void methodHello() {
            System.out.println("Hello in methodHello()");
        }

        @Override
        public void methodBye() {
            System.out.println("Bye in methodBye()");
        }

        @Override
        public void messagePrinter1() {
            System.out.println("messagePrinter1() executed");

        }

        @Override
        public void messagePrinter2() {
            System.out.println("messagePrinter2() executed");
        }
    }

    class InnerChild implements CombinedInterface {

        @Override
        public void methodHello() {

        }

        @Override
        public void methodBye() {

        }

        @Override
        public void messagePrinter1() {

        }

        @Override
        public void messagePrinter2() {

        }
    }

    public static void main(String[] args) {
        //Inner inner = new OuterWithInterface().new Inner();
        Inner inner = new OuterWithInterface().new Inner() {
            @Override
            public void methodHello() {
                System.out.println("Hello from local class");
            }

            @Override
            public void methodBye() {
                System.out.println("Bye from local class");
            }

            @Override
            public void messagePrinter1() {
                System.out.println("messagePrinter1 from local class");
            }

            @Override
            public void messagePrinter2() {
                System.out.println("messagePrinter2 from local class");
            }
        };
        inner.messagePrinter1();
        inner.messagePrinter2();
        inner.methodHello();
        inner.methodBye();

        Greeting greeting = new Greeting() {
            @Override
            public void methodHello() {
                System.out.println("Hello from local class implementation of greeting interface");
            }

            @Override
            public void methodBye() {
                System.out.println("Bye from local class implementation of greeting interface");
            }
        };
        greeting.methodBye();
        greeting.methodHello();

        class LocalClass {
            void printHello() {
                System.out.println("Hello from local declared class");
            }
        }

        LocalClass localClass = new LocalClass();
        localClass.printHello();

        MoreLocalClass moreLocalClass = new MoreLocalClass() {
        };
        System.out.println(moreLocalClass);

    }
}
