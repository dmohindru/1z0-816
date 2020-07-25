package dev.dmohindru.example;


public class Test {
    protected int i = 10;

    public static void main(String[] args) {
        Test t = new Test();
        System.out.println(t.i);
    }
}

class New_Test {
    void myFunc() {
        Test t = new Test();
        System.out.println(t.i);
    }
}
