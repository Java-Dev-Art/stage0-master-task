package com.epam.conditions;

public class TriangleSidesValidator {

    public void validate(double firstSide, double secondSide, double thirdSide) {
        String valid = (firstSide + secondSide > thirdSide && secondSide + thirdSide > firstSide && firstSide + thirdSide > secondSide)?
                "this is a valid triangle" : "it's not a triangle";
        System.out.println(valid);
    }
}
