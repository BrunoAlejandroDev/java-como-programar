package com.bruno.javacomoprogramar.cap7.exercicios;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite o número de vendedores: ");
        int quantVendedores = input.nextInt();

        int[] arrayContador = new int[9];

        for (int i = 0; i < quantVendedores; i++) {
            System.out.print("Digite o valor vendido para o vendedor " + (i+1) + ": ");
            int valorVendido = input.nextInt();
            int salario = calcularSalario(valorVendido); // calcular o salário recebido com base na quantidade vendida pelo vendedor
            contabilizarSalario(arrayContador, salario);
        }

        imprimirResultados(arrayContador);
    }

    public static int calcularSalario(int valorVendido) {
        return 200 + (int)(valorVendido * 0.09);
    }

    public static void contabilizarSalario(int[] contador, int valorVendido) {
        if (valorVendido >= 200 && valorVendido < 300) {
            contador[0]++;
        }
        else if (valorVendido < 400) {
            contador[1]++;
        }
        else if (valorVendido < 500) {
            contador[2]++;
        }
        else if (valorVendido < 600) {
            contador[3]++;
        }
        else if (valorVendido < 700) {
            contador[4]++;
        }
        else if (valorVendido < 800) {
            contador[5]++;
        }
        else if (valorVendido < 900) {
            contador[6]++;
        }
        else if (valorVendido < 1000) {
            contador[7]++;
        }
        else {
            contador[8]++;
        }
    }

    public static void imprimirResultados(int contador[]) {
        System.out.println("Faixa salarial\tNúmero de vendedores");
        System.out.println("200 - 299: " + contador[0]);
        System.out.println("300 - 399: " + contador[1]);
        System.out.println("400 - 499: " + contador[2]);
        System.out.println("500 - 599: " + contador[3]);
        System.out.println("600 - 699: " + contador[4]);
        System.out.println("700 - 799: " + contador[5]);
        System.out.println("800 - 899: " + contador[6]);
        System.out.println("900 - 999: " + contador[7]);
        System.out.println("1000 e acima: " + contador[8]);
    }
}