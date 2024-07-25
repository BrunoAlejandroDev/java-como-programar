package com.bruno.javacomoprogramar.cap7;

public class InitArray3 {
    public static void main(String[] args) {

        // declarei o array
        int[] array = new int[10];

        // preenchendo o array
        for (int counter = 0; counter < array.length; counter++) {
            array[counter] = 2 + 2 * counter;
        }

        // exibir o array
        System.out.printf("%s%8s%n", "Index", "Value");
        for (int counter = 0; counter < array.length; counter++) {
            System.out.printf("%5d%8d%n", counter, array[counter]);
        }

    }
}
