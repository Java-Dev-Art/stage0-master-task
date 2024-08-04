package com.epam.OOP;

public class Animal {
    private String color;
    private int numberOfPaws;
    private boolean hasFur;

    public Animal(String color, int numberOfPaws, boolean hasFur) {
        this.color = color;
        this.numberOfPaws = numberOfPaws;
        this.hasFur = hasFur;
    }

    public String getColor() {
        return color;
    }

    public int getNumberOfPaws() {
        return numberOfPaws;
    }

    public boolean isHasFur() {
        return hasFur;
    }
    public String getDescription(){
        String isF = (isHasFur()) ? "a" : "no";
        String paw = (getNumberOfPaws() > 1) ? " paws ": " paw ";

        return  "This animal is mostly " + getColor() + ". It has " + getNumberOfPaws()
                + paw +"and " + isF +" fur.";
    }
}
