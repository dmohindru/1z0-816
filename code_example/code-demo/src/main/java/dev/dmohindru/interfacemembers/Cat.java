package dev.dmohindru.interfacemembers;

public class Cat implements Runable, Walkable {
    public static void main(String[] args) {
        System.out.println(Runable.name);
        System.out.println(walkableName);
        System.out.println(runnableName);
        Cat cat = new Cat();
        System.out.println(cat.getSpeed());
        System.out.println(cat.getAcceleration());
        System.out.println(Runable.getName());

    }

    @Override
    public int getSpeed() {
        //return Runable.super.getSpeed();
        return Walkable.super.getSpeed();
    }
}