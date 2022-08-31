package dev.dmohindru.ch2;

public @interface Hazard {
    // Required element
    int danger();
    // Optional element
    public String description() default "Fire";
    // Constant variable
    public static final int UNKNOWN = -1;

}
