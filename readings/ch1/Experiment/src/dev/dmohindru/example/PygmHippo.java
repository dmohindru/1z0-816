package dev.dmohindru.example;

abstract class Animal {
    abstract void chew();
}

class Hippo extends Animal {
    final void chew() {}
}

class PygmyHippo extends Hippo {
    //void chew() {}  // DOES NOT COMPILE
}

//final class Reptile {}
//
//class Snake extends Reptile {}  // DOES NOT COMPILE

final class Eagle {}  // DOES NOT COMPILE

interface Hawk {}        // DOES NOT COMPILE
