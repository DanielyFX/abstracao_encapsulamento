package org.example;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Alice", 12);
        System.out.println(person.toString());
        var newPerson = new Person("Bob", 34);
    }
}