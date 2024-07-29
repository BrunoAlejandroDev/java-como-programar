package com.bruno.javacomoprogramar.cap7.exercicios;

public class Exercicio8 {
    public static void main(String[] args) {

        // item A: Exiba o valor do elemento 6 do array f.
        int[] f = new int[6];
        for (int i = 0; i < f.length; i++) {
            f[i] = i * 2;
        }
        itemA(f);

        // item B: Inicialize cada um dos cinco elementos de array de inteiros unidimensional g como 8.
        itemB();

        // item C: Some os 100 elementos do array de ponto flutuante c
        System.out.println(itemC());

        // item D: Copie o array a de 11 elementos para a primeira parte de array b, que contém 34 elementos.
        itemD();

    }

    public static void itemA(int[] array)
    {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        System.out.println("Elemento 6: " + array[2]);
    }

    public static void itemB()
    {
        int[] array = new int[5];
        for (int i = 0; i < array.length; i++) {
            array[i] = 8;
        }

        for (int i = 0; i < array.length; i++) {
            System.out.printf("%d ", array[i]);
        }
        System.out.println();
    }

    public static int itemC()
    {
        int total = 0;

        int[] array = new int[100];
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
            total += array[i];
        }
        return total;
    }

    public static void itemD()
    {
        int[] a = new int[11];
        int[] b = new int[34];

        for (int i = 0; i < a.length; i++) {
            a[i] = i + 1;
        }

        for (int i = 0; i < a.length; i++) {
            b[i] = a[i];
        }

        System.out.println("Array B:");
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + " ");
        }
    }
}
