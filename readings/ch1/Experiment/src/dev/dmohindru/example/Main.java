package dev.dmohindru.example;

public class Main {

    public static void main(String[] args) {


        System.out.println(Season.WINTER.getHours());
        System.out.println(Season.FALL.getHours());
        System.out.println("Winter Visitors " + Season.WINTER.getNumOfVisitors());
    }
    private void printZooInfo(boolean isWeekend) {
        final int giraffe = 5;
        final long lemur;
        if(isWeekend) lemur = 5;
        else lemur = 10;
        //lemur = 200;
        System.out.println(giraffe+" "+lemur);
    }
}
