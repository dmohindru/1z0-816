package dev.dmohindru.ch1.innerclass;

public class AnonymousClassDemoTwo {
    interface SaleTodayOnly {
        int dollarsOff();
    }

    public int admission(int basePrice) {
        int i = 10;
        SaleTodayOnly sale = new SaleTodayOnly() {
            public int dollarsOff() {
                return 3 - i;
            }
        };
        return basePrice - sale.dollarsOff();
    }
}
