package dev.dmohindru.ch2;

public @interface Music {
    public String[] genere() default {"Pop", "Bollywood"};
}
