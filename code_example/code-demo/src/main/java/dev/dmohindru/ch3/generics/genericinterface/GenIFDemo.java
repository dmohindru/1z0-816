package dev.dmohindru.ch3.generics.genericinterface;

public class GenIFDemo {
    public static void main(String[] args) {
        Integer[] inums = {3, 6, 8, 0};
        Character[] chs = {'a', 'z', 'b', 'd'};
        MyClass<Integer> iObj = new MyClass<>(inums);
        MyClass<Character> cObj = new MyClass<>(chs);

        System.out.println("max value in inums: " + iObj.max());
        System.out.println("min value in inums: " + iObj.min());

        System.out.println("max value in chs: " + cObj.max());
        System.out.println("min value in chs: " + cObj.min());

    }
}
