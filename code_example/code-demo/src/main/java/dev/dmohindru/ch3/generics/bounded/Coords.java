package dev.dmohindru.ch3.generics.bounded;

import java.util.Arrays;

public class Coords <T extends TwoD> {
    T[] coords;

    Coords(T[] o) {
        coords = o;
    }

    static void showXY(Coords<?> c) {
        System.out.println("X Y Coordinates: ");
        Arrays.stream(c.coords).forEach(coord -> {
            System.out.println(coord.x + " " + coord.y);
        });
    }

    static void showXYZ(Coords<? extends ThreeD> c) {
        System.out.println("X Y Z Coordinates");
        Arrays.stream(c.coords).forEach(coord -> {
            System.out.println(coord.x + " " + coord.y + " " + coord.z);
        });
    }

    static void showAll(Coords<? extends FourD> c) {
        System.out.println("X Y Z T Coordinates");
        Arrays.stream(c.coords).forEach(coord -> {
            System.out.println(coord.x + " " + coord.y + " " + coord.z + " " + coord.t);
        });
    }

    public static void main(String[] args) {
        TwoD[] td = {
                new TwoD(0, 0),
                new TwoD(7, 9),
                new TwoD(4, 5)
        };

        FourD[] fd = {
                new FourD(0, 1, 2, 3),
                new FourD(4, 5, 6, 7),
                new FourD(8, 9, 10, 11)
        };

        Coords<TwoD> tdLocs = new Coords<>(td);
        Coords<FourD> fdLocs = new Coords<>(fd);

        System.out.println("Contents of tdLocs");
        showXY(tdLocs);
        //showXYZ(tdLocs);
        //showAll(tdLocs);

        System.out.println("Contents of fdLocs");
        showXY(fdLocs);
        showXYZ(fdLocs);
        showAll(fdLocs);
    }

}
