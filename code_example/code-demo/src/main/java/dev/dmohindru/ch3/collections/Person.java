package dev.dmohindru.ch3.collections;

public class Person implements Comparable {
    String firstName;
    String lastName;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public int compareTo(Object o) {
        Person p = (Person) o;
        return this.firstName.compareTo(p.firstName);
    }

    @Override
    public String toString() {
        return String.format("[FirstName: %s, LastName: %s]", firstName, lastName);
    }
}
