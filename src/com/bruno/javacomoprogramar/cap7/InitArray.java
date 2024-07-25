package com.bruno.javacomoprogramar.cap7;

public class InitArray {
    public static void main(String[] args) {

        int [] array = new int [10]; // declaração do array

        System.out.printf("%s%8s%n", "Index", "Value"); // títulos para as colunas

        for (int counter = 0; counter < array.length; counter++) {
            System.out.printf("%5d%8d%n", counter, array[counter]);
        }


    }
}
