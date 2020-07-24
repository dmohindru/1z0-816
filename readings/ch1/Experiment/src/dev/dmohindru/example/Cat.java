package dev.dmohindru.example;
interface Swim {
    private static void breathe(String type) {
        System.out.println("Inhale");
        System.out.println("Performing stroke: " + type);
        System.out.println("Exhale");
    }
    static void butterfly()        { breathe("butterfly");  }
    public static void freestyle() { breathe("freestyle");  }
    default void backstroke()      { breathe("backstroke"); }
    private void breaststroke()    { breathe("breaststroke"); }
}

interface Walk {
    //public default int getSpeed() { return 5; }
    static int getSpeed() { return 5; }
    default int mySpeed() {
        hello();
        return 100;
    }
    private void hello() {
        System.out.println("Hello");
    }
}

interface Run {
    //public default int getSpeed() { return 10; }
    static int getSpeed() { return 10; }
}

public class Cat implements Walk, Run {
//    public int getSpeed() {
//        return 1;
//    }

    public int getWalkSpeed() {
        return Walk.getSpeed();
    }

    public int getRunSpeed() {
        return Run.getSpeed();
    }

    public static void main(String[] args) {
        Cat cat = new Cat();
        //System.out.println(cat.getSpeed());
        System.out.println(cat.getWalkSpeed());
        System.out.println(cat.getRunSpeed());
        System.out.println(cat.mySpeed());
        //System.out.println(new Cat().getWalkSpeed());
        Swim swim = new Swim() {};
        swim.backstroke();
        Swim.butterfly();
        Swim.freestyle();

    }
}
