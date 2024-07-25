package com.bruno.javacomoprogramar.cap5;

import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // entrada de dados para definir quantos numeros serao lidos
        System.out.print("Digite a quantidade de números a serem inseridos: ");
        int quantNumeros = input.nextInt(); // variável que armazena a quantidade de números a serem digitados pelo usuário

        if (quantNumeros > 0) {
            System.out.print("Digite o primeiro numero: ");
            int menorValor = input.nextInt(); // variável para armazenar o menor valor

            // loop para inserir os números restantes
            for (int i = 1; i < quantNumeros; i++) {
                System.out.print("Insira o numero #" + (i+1) + ": ");
                int numero = input.nextInt();

                if (numero < menorValor) {
                    menorValor = numero;
                }
            }
            System.out.println("O menor valor digitado foi: " + menorValor);
        }
        else {
            System.out.println("A quantidade de números digitados precisa ser maior que zero");
            System.out.print("Digite a quantidade de números a serem inseridos: ");
            quantNumeros = input.nextInt();
        }
    }
}