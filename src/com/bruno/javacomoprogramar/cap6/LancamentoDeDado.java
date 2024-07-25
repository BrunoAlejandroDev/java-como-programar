package com.bruno.javacomoprogramar.cap6;

import java.security.SecureRandom;

public class LancamentoDeDado {
    public static void main(String[] args) {

        // criar um novo objeto para gerar numeros aleatorios
        SecureRandom randomNumbers = new SecureRandom();
        // Random randomNumbers2 = new Random(); // outra maneira de criar um objeto gerador de numeros aleatorios

        int contador1 = 0;
        int contador2 = 0;
        int contador3 = 0;
        int contador4 = 0;
        int contador5 = 0;
        int contador6 = 0;

        // loop para executar os 20 lançamentos
        for (int counter = 1; counter <= 20; counter++) {

            // criar a variável para gerar valores aleatorios entre 1 e 6
            int randomValue = 1 + randomNumbers.nextInt(6); // somar mais 1 para iniciar com 1 e não com 0 -> 1 <= randomValue <= 6
            System.out.printf("%d ", randomValue);

            switch (randomValue) {
                case 1:
                    ++contador1;
                    break;
                case 2:
                    ++contador2;
                    break;
                case 3:
                    ++contador3;
                    break;
                case 4:
                    ++contador4;
                    break;
                case 5:
                    ++contador5;
                    break;
                case 6:
                    ++contador6;
                    break;
            }

            // verificador para quebra de linha
            if (counter % 5 == 0) {
                System.out.println();
            }
        }
        System.out.println();
        System.out.println("===== Contador de aparições =====");
        System.out.printf("1:\t%d%n2:\t%d%n3:\t%d%n4:\t%d%n5:\t%d%n6:\t%d%n", contador1, contador2, contador3, contador4, contador5, contador6);

    }
}