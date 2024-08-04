package com.epam.conditions;

public class DaysInMonth {

    public void printDays(int year, int month) {
        if (year < 0 || month > 12 || month < 0){
            System.out.println("invalid date");
        }
        String leapYear = (year % 400 == 0) ? "leap":
                (year % 100 == 0)? "not leap":
                        (year % 4 == 0)? "leap" : "not leap";
        switch (month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println(31);
                break;
            case 2:
                switch (leapYear){
                    case "leap":
                        System.out.println(29);
                        break;
                    default:
                        System.out.println(28);
                        break;
                }
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println(30);
                break;
        }
    }
}
