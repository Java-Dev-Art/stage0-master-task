package com.epam.langSyntax;

public class NumberReverter {

    public void revert(int number) {
        StringBuilder result = new StringBuilder();
        result.append(number);
        result.reverse();
        System.out.println(result);
    }
}
