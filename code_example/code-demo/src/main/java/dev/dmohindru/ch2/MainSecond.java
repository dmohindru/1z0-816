package dev.dmohindru.ch2;

public class MainSecond {
}

@TypeAnnotation
class ExampleOne{
    int i;
    int j;

    @ConstructorAnnotation
    ExampleOne() {}

    @ConstructorAnnotation
    ExampleOne(int i, int j) {this.i = i; this.j = j;}
}

@InheritedAnnotation
class ParentExample{}

class ChildExample extends ParentExample{}



