package com.bruno.javacomoprogramar.cap6;

import java.security.SecureRandom;

public class GerarNumerosAleatorios {
    public static void main(String[] args) {

        SecureRandom randomNumbers = new SecureRandom(); // novo objeto gerador seguro de numeros aleatorios
        int randomValue = randomNumbers.nextInt(); // gerar um novo valor aleatório do tipo int
        System.out.println(randomValue);

        randomValue = randomNumbers.nextInt(2); // gerar um valor aleatorio partindo de 0 até o valor anterior ao valor de parâmetro
        System.out.println(randomValue);

    }
}
