package com.bruno.javacomoprogramar.cap5;

/* (Programa de juros compostos modificado) Modifique o aplicativo de juros compostos da Figura 5.6 para repetir os passos para taxas de juros de 5%, 6%, 7%, 8%, 9% e 10%.
Utilize um loop for para variar a taxa de juros */

public class Exercicio14 {
    public static void main(String[] args) {

        double amount; // quantia em depósito ao fim de cada ano
        double principal = 1000.0; // quantidade inicial antes dos juros

        // exibe cabeçalhos
        System.out.printf("%s%20s %n", "Year", "Amount on deposit");

        // calcula quantidade de depósito para cada um dos dez anos com incremento automático na taxa de juros
        for (double rate = 0.05; rate <= 0.10; rate += 0.01) {

            System.out.printf("%nTaxa de juros: %.2f%%%n", rate * 100);

            for (int year = 1; year <= 10; ++year) {
                amount = principal * Math.pow(1.0 + rate, year); // calcula nova quantidade durante ano especificado
                System.out.printf("%4d%,20.2f%n", year, amount);// exibe o ano e a quantidade
            }
        }

    }
}
