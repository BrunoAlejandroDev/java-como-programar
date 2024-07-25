package com.bruno.javacomoprogramar.cap6;

import java.util.Locale;

public class MethodOverload {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        int intValue = 7;
        double doubleValue = 7.5;
        System.out.printf("Square of integer %d is %d%n", intValue, square(intValue));
        System.out.printf("Square of double %.2f is %.2f%n", doubleValue, square(doubleValue));

    }

    public static int square(int intValue)
    {
        System.out.printf("Called square with int argument: %d%n", intValue);
        return intValue * intValue;
    }

    public static double square(double doubleValue)
    {
        System.out.printf("Called square with double argument: %.2f%n", doubleValue);
        return doubleValue * doubleValue;
    }
}