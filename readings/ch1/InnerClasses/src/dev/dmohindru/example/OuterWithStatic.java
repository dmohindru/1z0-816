package dev.dmohindru.example;

public class OuterWithStatic {
    private String greetings;
    private static int greetingNum;

    public OuterWithStatic(String greetings) {
        this.greetings = greetings;
    }

    static class PrinterService {
        private int count;
        private static int defaultCount = 10;
        private final static int myNum = 10;

        public PrinterService(int count) {
            this.count = count;
        }
        private void print() {
            for (var i = 0; i < count; i++) {
                System.out.println(new OuterWithStatic("Holla").greetings);
                System.out.println(greetingNum);
            }
        }
        static void staticPrint() {
            for (var i = 0; i < defaultCount; i++) {
                //System.out.println(greetings);
                System.out.println(greetingNum);
                System.out.println(new PrinterService(8).count);
            }
        }

    }

    public void doPrint(int count) {
        PrinterService printerService = new PrinterService(count);
        System.out.println("myNum: " + PrinterService.myNum);
        System.out.println("myNum from instance variable: " + printerService.myNum);
        System.out.println("Number of times printing: " + printerService.count);
        printerService.print();
        PrinterService.staticPrint();

    }

    public static void main(String[] args) {
        OuterWithStatic outer = new OuterWithStatic("Namaste");
        outer.doPrint(5);
        System.out.println("-------------------------");
        OuterWithStatic.PrinterService printerService = new OuterWithStatic.PrinterService(3);
        //printerService.print();
    }
}

