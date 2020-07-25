package dev.dmohindru.example;

/**
 * Inner classes project to experiment with following topics
 * 1. Effect of access modifiers on non-static inner class private, package-private, protected, public --done--
 * 2. Inner interfaces -- done--
 * 3. Effect of access modifiers on inner interfaces --done--
 * 4. Inner classes inheritance and implementing multiple interfaces --done--
 * 5. Creating local classes --done--
 * 6. Local class extending super class or implementing a interface (anonymous class) --done--
 * 7. Using static inner classes --done--
 * 8. static members of inner classes -- done --
 * 9. using inner classes from static and non-static methods of outer class --done--
 *
 */

public class Outer {
    private String greetings;

    public Outer(String greetings) {
        this.greetings = greetings;
    }

    private class PrinterService {
        private int count;
        private final static int myNum = 10;

        public PrinterService(int count) {
            this.count = count;
        }
        public void print() {
            for (var i = 0; i < count; i++) {
                System.out.println(greetings);
            }
        }

    }

    public void doPrint(int count) {
        PrinterService printerService = new PrinterService(count);
        System.out.println("myNum: " + PrinterService.myNum);
        System.out.println("myNum from instance variable: " + printerService.myNum);
        System.out.println("Number of times printing: " + printerService.count);
        printerService.print();

    }

    public static void main(String[] args) {
        Outer outer = new Outer("Namaste");
        outer.doPrint(5);
        System.out.println("-------------------------");
        PrinterService printerService = outer.new PrinterService(7);
        printerService.print();
    }
}
