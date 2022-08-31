package dev.dmohindru.ch1.finalmodifier;

public class FinalClassVariablesExample {
    final int instanceVariable;
    final int anotherInstanceVariable;

    final static int staticVariable;

    {
        anotherInstanceVariable = 100;
    }

    static {
        staticVariable = 10;
    }

    public FinalClassVariablesExample(int i) {
        this.instanceVariable = i;
    }

    public static void main(String[] args) {
        System.out.println("staticVariable: " + FinalClassVariablesExample.staticVariable);
        System.out.println("instanceVariable: " + new FinalClassVariablesExample(11).instanceVariable);

    }
}
