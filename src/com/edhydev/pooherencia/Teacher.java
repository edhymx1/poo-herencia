package com.edhydev.pooherencia;

public class Teacher extends Person {
    private String course;

    public Teacher() {
        System.out.println("Teacher: initialising constructor");
    }

    public Teacher(String name, String surnames) {
        super(name, surnames);
    }

    public Teacher(String name, String surnames, String course) {
        this(name, surnames);
        this.course = course;
    }


    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    @Override
    public String sayHello() {
        return "Hello, I'm teacher";
    }

    @Override
    public String toString() {
        return super.toString() +  "\ncourse='" + course + '\'';
    }
}
