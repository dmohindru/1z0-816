package dev.dmohindru.example;

public class Ostrich {
    static private int count;

    interface Wild {
    }

    static class OstrichWrangler implements Wild {
        public int stampede() {
            return count;
        }
    }
}
