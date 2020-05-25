package com.ccbTest.multipleCheck;

public class CheckMultiple {

    public String checkNumber(int number) {
        if (number == 0) throw new IllegalArgumentException("Number cannot be 0");

        if (isMultipleOf(number, 3) && isMultipleOf(number, 5)) return "is multiple of 3 and 5";
        if (isMultipleOf(number, 3)) return "is multiple of 3";
        if (isMultipleOf(number, 5)) return "is multiple of 5";
        return String.valueOf(number);
    }

    private boolean isMultipleOf(int number, int i) {
        return number % i == 0;
    }
}
