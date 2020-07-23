package dev.dmohindru.example;

public class ZooGiftShop {
    interface SaleTodayOnly {
        int dollarsOff();
    }

    public int pay() {
        return admission(5, new SaleTodayOnly() {
            public int dollarsOff() {
                return 3;
            }
        });
    }

    public int admission(int basePrice, SaleTodayOnly sale) {
        return basePrice - sale.dollarsOff();
    }
}

class Gorilla {
    interface Climb {}
    Climb climbing = new Climb() {};
}
