package codewars.level6;

// https://www.codewars.com/kata/52fb87703c1351ebd200081f

public class WhatCentury {

    public static String whatCentury(int year) {
        int century = (year - 1) / 100 + 1;
        String suffix;

        if (century % 10 == 1 && century % 100 != 11) {
            suffix = "st";
        } else if (century % 10 == 2 && century % 100 != 12) {
            suffix = "nd";
        } else if (century % 10 == 3 && century % 100 != 13) {
            suffix = "rd";
        } else {
            suffix = "th";
        }

        return century + suffix;
    }

}
