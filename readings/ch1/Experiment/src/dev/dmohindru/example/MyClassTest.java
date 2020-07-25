package dev.dmohindru.example;

import org.w3c.dom.ls.LSOutput;

class Parent {
    public static void static_info() {
        System.out.println("Static info method");
    }

    public void info() {
        System.out.println("Hi I am parent");
    }
}

public class MyClassTest {
    public static void main(String[] args) {
        var a = new Parent() {
            @Override
            public void info() {
                System.out.println("Hi I am child");
            }
            public void child_info() {
                System.out.println("This is a child info method");
                static_info();
            }


        };
        a.info();
        a.child_info();
    }

}
