package dev.dmohindru.innerclass;

public class InstanceInnerClassDemo {
    final int instanceVariableOne;
    final static int staticVariableOne;

    static {
        staticVariableOne = 0;
    }

    {
        instanceVariableOne = 0;
    }
    class InnerClassExampleOne {
        final static int innerClassStaticVar = 0;
        final int innerClassInstanceVar = 10;

        // Method to access outer class instance variable
        int getOuterClassInstance() {
            return instanceVariableOne;
        }

        // Method to access outer class static variable
        int getOuterClassStaticVariable() {
            return staticVariableOne;
        }

        // Method to get inner class static var
        int getInnerClassStaticVar() {
            return innerClassStaticVar;
        }

        int getInnerClassInstanceVar() {
            return innerClassInstanceVar;
        }

    }

    public static void main(String[] args) {
        // create an instance of inner class
        InstanceInnerClassDemo outerClassExampleOne = new InstanceInnerClassDemo();
        InnerClassExampleOne innerClassExampleOne = outerClassExampleOne.new InnerClassExampleOne();
        System.out.println(innerClassExampleOne.getInnerClassInstanceVar());
        System.out.println(innerClassExampleOne.getInnerClassStaticVar());
        System.out.println(innerClassExampleOne.getOuterClassInstance());
        System.out.println(innerClassExampleOne.getOuterClassStaticVariable());
    }
}
