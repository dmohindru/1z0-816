package dev.dmohindru.ch3.generics.bounded;

public class BoundsDemo {
    public static void main(String[] args) {
        Integer[] iNums = {1, 2, 3 ,4, 5};
        Stats<Integer> iObj = new Stats<>(iNums);
        double v = iObj.average();
        System.out.println("iObj average: " + v);

        Double[] dNumbs = {1.2, 3.4, 4.4, 5.5, 6.6};
        Stats<Double> dObj = new Stats<>(dNumbs);
        v = dObj.average();
        System.out.println("dObj average: " + v);

        // Below code block will not compile
        /*String[] strings = {"hello", "world"};
        Stats<String> sObj = new Stats<String>(strings);
        v = sObj.average();
        System.out.println("sObj average: " + v);*/
    }
}
