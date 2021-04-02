package com.edhydev.pooherencia;

public class Person {
    private String name;
    private String surnames;
    private int age;
    private String email;

    public Person() {
        System.out.println("Person: initialising constructor");
    }

    public Person(String name, String surnames) {
        this.name = name;
        this.surnames = surnames;
    }

    public Person(String name, String surnames, int age) {
        this(name, surnames);
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurnames() {
        return surnames;
    }

    public void setSurnames(String surnames) {
        this.surnames = surnames;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String sayHello() {
        return "Hey! Whats up!";
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", surnames='" + surnames + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                ", sayHello='" + this.sayHello() + '\'';
    }
}
