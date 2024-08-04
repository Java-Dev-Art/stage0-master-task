package com.epam.langSyntax;

public class DigitsSumCalculator {

    public void calculateSum(int number) {
        String num = String.valueOf(number);
        char[] chars = num.toCharArray();
        int sum = 0;
        for (char c: chars){
            String value = String.valueOf(c);
            sum += Integer.valueOf(value);
        }
        System.out.println(sum);
    }
}
