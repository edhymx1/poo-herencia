package com.edhydev.pooherencia;

public class StedentInternational extends Student{
    private String country;
    private double scoreLanguage;

    public StedentInternational() {
        System.out.println("StedentInternational: initialising constructor");
    }

    public StedentInternational(String name, String surnames) {
        super(name, surnames);
    }

    public StedentInternational(String name, String surnames, String country) {
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

}
