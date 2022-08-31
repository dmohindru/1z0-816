package dev.dmohindru.innerclass;

public class LocalClassDemo {
    private int length = 5;

    public void calculate() {
        int width = 20;
        class MyLocalClass {
            public void multiply() {
                System.out.print(length * width);
            }
        }

        MyLocalClass local = new MyLocalClass();

        local.multiply();
    }

    public static void main(String[] args) {
        LocalClassDemo outer = new LocalClassDemo();
        outer.calculate();
    }
}
