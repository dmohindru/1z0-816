package dev.dmohindru.example;

public class Fox {
    private class Den {}
    public void goHome() {
        new Den();
    }
    public static void visitFriend() {
        Fox fox = new Fox();
        Den den = fox.new Den();
        //new Den();  // DOES NOT COMPILE
    }
}

class Squirrel {
    public void visitFox() {
      //  new Den();  // DOES NOT COMPILE
    }
}

