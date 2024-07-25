package com.bruno.javacomoprogramar.cap5;

// (Calculando o produto de números inteiros ímpares) Escreva um aplicativo que calcula o produto dos números inteiros ímpares de 1 a 15.

public class Exercicio12 {
    public static void main(String[] args) {
        int total = 1; // variavel para armazenar o produto dos numeros inteiros

        for (int i = 1; i <= 15; i++) {
            if (i % 2 != 0) {
                total *= i;
            }
        }

        System.out.println(total);
    }
}
