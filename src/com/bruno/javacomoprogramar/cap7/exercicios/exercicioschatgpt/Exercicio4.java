package com.bruno.javacomoprogramar.cap7.exercicios.exercicioschatgpt;

// Reverter os elementos de um array

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // criar um input para definir o numero de elementos
        System.out.print("Digite o número de elementos: ");
        int tamanho = input.nextInt();

        // criar o array original
        int[] arrayOriginal = new int[tamanho];

        // percorrer o array e inserir os valores
        for (int i = 0; i < arrayOriginal.length; i++) {
            System.out.print("Digite o valor para a posição " + (i+1) + ": ");
            arrayOriginal[i] = input.nextInt();
        }

        // criar o array inverso e chamar a função
        int[] arrayInverso = inverterArray(arrayOriginal);

        // imprimir o array original e o inverso
        System.out.println("Array original: ");
        for (int i = 0; i < arrayOriginal.length; i++) {
            System.out.print(arrayOriginal[i] + " ");
        }
        5
        System.out.println();
        System.out.println("Array inverso: ");
        for (int i = 0; i < arrayInverso.length; i++) {
            System.out.print(arrayInverso[i] + " ");
        }
    }

    // metodo para inverter o array original
    public static int[] inverterArray(int[] arrayOriginal)
    {
        // criar o array inverso com o mesmo tamanho do array original
        int[] arrayInverso = new int[arrayOriginal.length];

        // percorrer o array original e inverter seus elementos
        for (int i = 0; i < arrayOriginal.length; i++) {
            arrayInverso[i] = arrayOriginal[arrayOriginal.length - 1 - i];
        }
        return arrayInverso;
    }
}