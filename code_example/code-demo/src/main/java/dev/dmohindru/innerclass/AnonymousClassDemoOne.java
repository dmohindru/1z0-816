package dev.dmohindru.innerclass;

public class AnonymousClassDemoOne {
    abstract class SaleTodayOnly {
        abstract int dollarsOff();
    }

    public int admission(int basePrice) {
        int i = 10;
        SaleTodayOnly sale = new SaleTodayOnly() {
            int dollarsOff() {

                return 3 - i;
            }
        };  // Don't forget the semicolon!

        return basePrice - sale.dollarsOff();
    }
}
