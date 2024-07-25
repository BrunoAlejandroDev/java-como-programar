package com.bruno.javacomoprogramar.cap7;

import java.security.SecureRandom;

public class RollDie {
    public static void main(String[] args) {

        SecureRandom randomNumbers = new SecureRandom();
        int [] frequency = new int[7];

        // lançar o dado 6.000.000 de vezes e usar o valor do índice de frequency para determinar qual face incrementar
        for (int roll = 1; roll < 6000000; roll++) {
            ++frequency[1 + randomNumbers.nextInt(6)]; // incrementa cada face a partir do valor de índice sorteado
        }

        System.out.printf("%s%10s%n", "Face", "Frequency");

        for (int counter = 1; counter < frequency.length; counter++) {
            System.out.printf("%4d%10d%n", counter, frequency[counter]);
        }

    }
}
