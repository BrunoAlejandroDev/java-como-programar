package com.bruno.javacomoprogramar.cap7.exercicios;

/*
    (Eliminação de duplicatas) Utilize um array unidimensional para resolver o seguinte problema: escreva um aplicativo que insere cinco
    números, cada um entre 10 e 100, inclusive. Enquanto cada número é lido, exiba-o somente se ele não tiver uma duplicata de um número
    já lido. Cuide de tratar o “pior caso”, em que todos os cinco números são diferentes. Utilize o menor array possível para resolver esse pro
    blema. Exiba o conjunto completo de valores únicos inseridos depois que o usuário inserir cada valor novo.
*/

import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // criar o array
        int[] array = new int[5];

        // contador de valores únicos
        int contador = 0;

        // percorrer o array
        for (int i = 0; i < array.length; i++)
        {
            System.out.print("Digite o valor para a posição " + (i+1) + ": ");
            int valor = input.nextInt();

            // verificar se o numero está no escopo de valores aceitos
            while (valor < 10 || valor > 100)
            {
                System.out.println("Digite apenas valores entre 10 e 100");
                System.out.print("Digite o valor para a posição " + (i+1) + ": ");
                valor = input.nextInt();
            }

            // verificar se o número digitado já está presente no array
            boolean valorPresente = false;
            for (int j = 0; j < contador; j++)
            {
                if (array[j] == valor) {
                    valorPresente = true;
                    break;
                }
            }

            // inserir valor no array
            if (!valorPresente)
            {
                array[contador] = valor;
                contador++; // atualizar o contador para a verificação anterior percorrer todos os elementos inseridos

                // imprimir valores únicos
                for (int j = 0; j < contador; j++)
                {
                    System.out.print(array[j] + " ");
                }
                System.out.println();
            }
            else
            {
                System.out.println("Numero duplicado.");
                i--; // decrementa o contador para repetir a leitura quando o número digitado é repetido
            }
        }
    }
}