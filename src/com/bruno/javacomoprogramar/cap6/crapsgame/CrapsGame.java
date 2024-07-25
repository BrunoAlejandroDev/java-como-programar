package com.bruno.javacomoprogramar.cap6.crapsgame;

import java.security.SecureRandom;

public class CrapsGame {

    // criar um gerador de numeros aleatorios
    private static final SecureRandom randomNumbers = new SecureRandom();

    // variáveis para representacao de valores comuns dentro do jogo
    private static final int SNAKE_EYES = 2;
    private static final int TREY = 3;
    private static final int SEVEN = 7;
    private static final int YO_LEVEN = 11;
    private static final int BOX_CARS = 12;

    public void play() {

        int myPoint = 0; // variavel de pontuacao para derrota ou pontuacao a ser batida
        GameStatus gameStatus;
        int sumOfDice = rollDice(); // variavel com o valor da soma dos dados

        switch (sumOfDice) {
            case SEVEN: // ganhou com soma 7 no primeiro lancamento
            case YO_LEVEN: // ganhou com soma 11 no primeiro lancamento
                gameStatus = GameStatus.WON;
                break;

            case SNAKE_EYES: // perdeu com soma 2 no primeiro lancamento
            case TREY: // perdeu com soma 3 no primeiro lancamento
            case BOX_CARS: // perdeu com soma 12 no primeiro lancamento
                gameStatus = GameStatus.LOST;
                break;

            default:
                gameStatus = GameStatus.CONTINUE; // conseguiu uma pontuacao neutra
                myPoint = sumOfDice; // soma dos dados registrada como pontuacao do jogador
                System.out.printf("Point is %d%n%n", myPoint);
        }

        while (gameStatus == GameStatus.CONTINUE) {

            sumOfDice = rollDice(); // chama a funcao para lancar novamente os dados

            if (sumOfDice == myPoint) { // atingiu a mesma pontuacao do primeiro lançamento
                gameStatus = GameStatus.WON;
            }
            else if (sumOfDice == SEVEN) { // a soma dos dados resultou em 7
                gameStatus = GameStatus.LOST;
            }
        }

        if (gameStatus == GameStatus.WON) {
            System.out.println("Players wins.");
        }
        else {
            System.out.println("Player loses.");
        }

    }

    public static int rollDice() {

        int dice1 = 1 + randomNumbers.nextInt(6); // lançamento 1
        int dice2 = 1 + randomNumbers.nextInt(6); // lançamento 2

        int sum = dice1 + dice2; // soma dos valores das face de cada lançamento

        System.out.printf("Player rolled %d + %d = %d%n", dice1, dice2, sum);
        return sum; // retornar valor da soma dos dados

    }
}
