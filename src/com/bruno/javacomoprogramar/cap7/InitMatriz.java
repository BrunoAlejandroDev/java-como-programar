package com.bruno.javacomoprogramar.cap7;

public class InitMatriz {
    public static void main(String[] args) {

        int[][] array1 = { {1, 2, 3}, {4, 5, 6} };
        int[][] array2 = { {1, 2}, {3}, {4, 5, 6} };

        System.out.println("Valores do array 1");
        outputArray(array1);
        System.out.printf("%nValores do array 2%n");
        outputArray(array2);

        System.out.printf("%nValor total do array 1: %d", calcularArray(array1));

    }

    public static void outputArray(int[][] array)
    {
        for (int row = 0; row < array.length; row++) {

            for (int column = 0; column < array[row].length; column++) {
                System.out.printf("%d  ", array[row][column]);
            }
            System.out.println();
        }
    }

    public static int calcularArray(int[][] array)
    {
        int total = 0;

        for (int row = 0; row < array.length; row++) {

            for (int column = 0; column < array[row].length; column++) {
                total += array[row][column];
            }
        }
        return total;
    }
}