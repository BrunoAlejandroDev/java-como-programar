package com.bruno.javacomoprogramar.cap7;

public class InitArray2 {
    public static void main(String[] args) {

        int [] array = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};

        System.out.printf("%s%8s%n", "Index", "Value");

        for(int counter = 0; counter < array.length; counter++) {
            System.out.printf("%5d%8d%n", counter, array[counter]);
        }

    }
}
