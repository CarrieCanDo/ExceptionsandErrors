package org.example;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        if (name == null || name.isEmpty() || name.length() > 40) {
            throw new IllegalArgumentException("Invalid name.");
        }
        if (age < 0 || age > 120) {
            throw new IllegalArgumentException("Invalid age.");
        }
        this.name = name;
        this.age = age;
    }


}
