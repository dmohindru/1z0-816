package dev.dmohindru.example;

public class PrintNumbers {
    private int length = 5;

    public void calculate() {
        final int width = 20;
        class MyLocalClass {
            public void multiply() {
                System.out.print(length * width);
            }
        }
        MyLocalClass local = new MyLocalClass();
        local.multiply();
    }
    public void processData() {
        final int length = 5;
        int width = 10;
        int height = 2;
        class VolumeCalculator {
            public int multiply() {
                return length * width * height; // DOES NOT COMPILE
            }
        }
     //   width = 2;
    }

    public static void main(String[] args) {
        PrintNumbers outer = new PrintNumbers();
        outer.calculate();
    }

}
