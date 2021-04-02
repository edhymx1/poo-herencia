package com.edhydev.pooherencia;

public class Student extends Person {
    private String school;
    private double scoreMath;
    private double scoreSpanish;
    private double scoreHistory;

    public Student() {
        super(); //always is the fisrt line at the contructor
        System.out.println("Student: initialising constructor");
    }

    public Student(String name, String surnames) {
        super(name, surnames);
    }

    public Student(String name, String surnames, int age) {
        super(name, surnames, age);
    }

    public Student(String name, String surnames, int age, String school) {
        this(name, surnames, age);
        this.school = school;
    }

    public Student(String name, String surnames, int age, String school, double scoreHistory, double scoreMath, double scoreSpanish) {
        this(name, surnames, age, school);
        this.scoreHistory = scoreHistory;
        this.scoreMath = scoreMath;
        this.scoreSpanish = scoreSpanish;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public double getScoreMath() {
        return scoreMath;
    }

    public void setScoreMath(double scoreMath) {
        this.scoreMath = scoreMath;
    }

    public double getScoreSpanish() {
        return scoreSpanish;
    }

    public void setScoreSpanish(double scoreSpanish) {
        this.scoreSpanish = scoreSpanish;
    }

    public double getScoreHistory() {
        return scoreHistory;
    }

    public void setScoreHistory(double scoreHistory) {
        this.scoreHistory = scoreHistory;
    }


    public double getAverage() {
        return (this.scoreHistory + this.scoreMath + this.scoreSpanish) / 3;
    }

    @Override
    public String sayHello() {
        String message = super.sayHello();
        return message + " I'm student my name is " + this.getName();
    }

    @Override
    public String toString() {
        return super.toString() + "\nschool='" + school + '\'' +
                ", scoreMath=" + scoreMath +
                ", scoreSpanish=" + scoreSpanish +
                ", scoreHistory=" + scoreHistory +
                ", average=" + this.getAverage();
    }
}
