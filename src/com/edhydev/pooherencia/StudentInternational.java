package com.edhydev.pooherencia;

public class StudentInternational extends Student{
    private String country;
    private double scoreLanguage;

    public StudentInternational() {
        System.out.println("StedentInternational: initialising constructor");
    }

    public StudentInternational(String name, String surnames) {
        super(name, surnames);
    }

    public StudentInternational(String name, String surnames, String country) {
        this(name, surnames);
        this.country = country;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public double getScoreLanguage() {
        return scoreLanguage;
    }

    public void setScoreLanguage(double scoreLanguage) {
        this.scoreLanguage = scoreLanguage;
    }

    @Override
    public double getAverage() {
        return ((super.getAverage() * 3) + this.scoreLanguage) / 4;
    }

    @Override
    public String sayHello() {
        return super.sayHello() + " and I'm foreign student!";
    }

    @Override
    public String toString() {
        return super.toString() + "\ncountry='" + country + '\'' +
                ", scoreLanguage=" + scoreLanguage;
    }
}
