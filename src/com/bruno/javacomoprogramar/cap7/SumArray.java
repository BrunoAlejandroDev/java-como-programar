package com.bruno.javacomoprogramar.cap7;

public class SumArray {
    public static void main(String[] args) {

        int [] array = {12, 534, 1, 54, 67, 75, 0, 24, 9, 41, 8};
        int total = 0;

        for (int counter = 0; counter < array.length; counter++) {
            total += array[counter];
        }

        // exibir o array
        System.out.printf("Total of array elements: %d%n", total);
    }
}