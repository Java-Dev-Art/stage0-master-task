package com.epam.loops;

public class Power {

    public void printPower(int numberToPrint, int power) {
        if (power < 4){
            int result = (int)(Math.pow(numberToPrint, power));
            System.out.println(result);
            return;
        }
        int valueABS = Math.abs(numberToPrint);
        int result = (int)(Math.pow(valueABS, power));
        System.out.println(result);
    }

    public static void main(String[] args) {
        new Power().printPower(10, 3);
    }

}
