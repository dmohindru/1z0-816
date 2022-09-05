package dev.dmohindru.ch3.generics.bounded;

public class WildcardDemo {
    public static void main(String[] args) {
        Integer[] iNums = {1, 2, 3, 4, 5};
        Stats<Integer> iObj = new Stats<>(iNums);
        double v = iObj.average();
        System.out.println("iObj average: " + v);

        Double[] dNums = {1.1, 2.2, 3.3, 4.4, 5.5};
        Stats<Double> dObj = new Stats<>(dNums);
        double w = dObj.average();
        System.out.println("dObj average: " + w);

        Float[] fNums = {1.0F, 2.0F, 3.0F, 4.0F, 5.0F};
        Stats<Float> fObj = new Stats<>(fNums);
        double x = fObj.average();
        System.out.println("fObj average: " + x);

        // See which array have same average
        System.out.print("Averages of iObj and dObj " );
        if (iObj.sameAvg(dObj))
            System.out.println("are the same.");
        else
            System.out.println("differ.");

        System.out.print("Average of iObj and fObj ");
        if (iObj.sameAvg(fObj))
            System.out.println("are the same.");
        else
            System.out.println("differ.");
    }
}
