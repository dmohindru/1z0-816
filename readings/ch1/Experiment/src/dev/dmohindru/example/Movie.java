package dev.dmohindru.example;

public class Movie {
    private int butter = 5;

    private Movie() {
    }

    protected class Popcorn {
        private Popcorn() {
        }

        public final static int butter = 10;

        public void startMovie() {
            System.out.println(butter);
        }
    }

    public static void main(String[] args) {
        var movie = new Movie();
        Popcorn in = new Movie().new Popcorn();
        in.startMovie();
    }
}
