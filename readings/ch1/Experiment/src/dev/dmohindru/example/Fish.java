package dev.dmohindru.example;

interface IsWarmBlooded {
    boolean hasScales();
    default double getTemperature() {
        return 10.0;
    }
}

interface AnotherInterface {
    default double getTemperature() {
        return 10.0;
    }
}
public class Fish implements IsWarmBlooded, AnotherInterface {
    @Override
    public boolean hasScales() {
        return false;
    }

    @Override
    public double getTemperature() {
        return 0;
    }


    public static void main(String[] args) {
        Fish fish = new Fish();
        System.out.println(fish.hasScales());
        System.out.println(fish.getTemperature());

    }

}
