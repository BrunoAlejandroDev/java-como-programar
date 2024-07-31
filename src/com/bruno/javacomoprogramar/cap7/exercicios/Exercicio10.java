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
        }
    }

    public static int calcularSalario(int valorVendido) {
        return 200 + (int)(valorVendido * 0.09);
    }

    public static void contabilizarSalario(int[] contador, int valorVendido) {

    }
}
