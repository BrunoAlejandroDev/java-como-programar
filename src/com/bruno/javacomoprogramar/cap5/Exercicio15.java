package com.bruno.javacomoprogramar.cap5;

/* (Calculando vendas) Um varejista on-line vende cinco produtos cujos preços no varejo são como a seguir: produto 1, US$ 2,98; produto  2, US$ 4,50; produto 3, US$ 9,98;
produto 4, US$ 4,49 e produto 5, US$ 6,87. Escreva um aplicativo que leia uma série de pares de números como segue:
a) número de produto
b) quantidade vendida
Seu programa deve utilizar uma instrução switch para determinar o preço de varejo de cada produto. Você deve calcular e exibir o valor de varejo total de todos os produtos
vendidos. Utilize um loop controlado por sentinela para determinar quando o programa deve parar o loop e exibir os resultados finais.
*/

import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int quantProduto1 = 0;
        int quantProduto2 = 0;
        int quantProduto3 = 0;
        int quantProduto4 = 0;
        int quantProduto5 = 0;

        double valorTotalP1 = 0;
        double valorTotalP2 = 0;
        double valorTotalP3 = 0;
        double valorTotalP4 = 0;
        double valorTotalP5 = 0;

        System.out.print("Você deseja inserir um produto? (s/n) ");
        char verificador = input.next().charAt(0);
        System.out.println();

        while (verificador == 's') {

            System.out.print("Digite o numero do produto (1/2/3/4/5): ");
            int numeroProduto = input.nextInt();

            System.out.print("Digite a quantidade de produtos " + numeroProduto + " vendidos: ");
            int quantidadeProdutos = input.nextInt();

            switch (numeroProduto) {
                case 1:
                    quantProduto1 += quantidadeProdutos;
                    valorTotalP1 = 3.0 * quantProduto1;
                    break;

                case 2:
                    quantProduto2 += quantidadeProdutos;
                    valorTotalP2 = 4.50 * quantProduto2;
                    break;

                case 3:
                    quantProduto3 += quantidadeProdutos;
                    valorTotalP3 = 10.0 * quantProduto3;
                    break;

                case 4:
                    quantProduto4 += quantidadeProdutos;
                    valorTotalP4 = 4.50 * quantProduto4;
                    break;

                case 5:
                    quantProduto5 += quantidadeProdutos;
                    valorTotalP5 = 6.80 * quantProduto5;
                    break;

                default:
                    System.out.println("Número de produto inválido.");
                    break;
            }

            System.out.println();
            System.out.print("Você deseja inserir um produto? (s/n) ");
            verificador = input.next().charAt(0);
        }

        System.out.println();
        System.out.println("====== DETALHES DAS VENDAS ======");
        System.out.printf("Quantidade de produtos 1 vendidos: %d\n", quantProduto1);
        System.out.printf("Valor total de venda dos produtos do tipo 1: $%.2f\n", valorTotalP1);

        System.out.printf("Quantidade de produtos 2 vendidos: %d\n", quantProduto2);
        System.out.printf("Valor total de venda dos produtos do tipo 2: $%.2f\n", valorTotalP2);

        System.out.printf("Quantidade de produtos 3 vendidos: %d\n", quantProduto3);
        System.out.printf("Valor total de venda dos produtos do tipo 3: $%.2f\n", valorTotalP3);

        System.out.printf("Quantidade de produtos 4 vendidos: %d\n", quantProduto4);
        System.out.printf("Valor total de venda dos produtos do tipo 4: $%.2f\n", valorTotalP4);

        System.out.printf("Quantidade de produtos 5 vendidos: %d\n", quantProduto5);
        System.out.printf("Valor total de venda dos produtos do tipo 5: $%.2f\n", valorTotalP5);

    }
}
