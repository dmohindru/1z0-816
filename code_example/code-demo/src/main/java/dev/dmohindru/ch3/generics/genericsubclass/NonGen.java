package dev.dmohindru.ch3.generics.genericsubclass;

public class NonGen {
    int num;

    NonGen(int i) {
        num = i;
    }

    int getnum() {
        return num;
    }
}

class Gen<T> extends NonGen {
    T obj;
    Gen(T o, int i) {
        super(i);
        obj = o;
    }

    // Return obj;
    T getObj() {
        return obj;
    }
}

// Class hierarchy demo
class HierDemo2 {
    public static void main(String[] args) {
        // Create a Gen object for String
        Gen<String> w = new Gen<String>("Hello", 47);

        System.out.println(w.getObj());
        System.out.println(w.getnum());
    }
}
