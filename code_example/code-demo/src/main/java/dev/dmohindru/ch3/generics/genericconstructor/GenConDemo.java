package dev.dmohindru.ch3.generics.genericconstructor;

public class GenConDemo {
    public static void main(String[] args) {
        GenCons test = new GenCons(100L);
        GenCons test1 = new GenCons(100.2);
        test.showval();
        test1.showval();
    }
}
