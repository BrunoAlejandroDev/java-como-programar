package com.bruno.javacomoprogramar.cap7.card;

public class DeckOfCardTest {
    public static void main(String[] args) {

        DeckOfCards myDeckOfCards = new DeckOfCards();
        myDeckOfCards.shuffle(); // Coloca as cartas em ordem aleatoria

        for (int i = 1; i <= 52; i++) { // imprime as 52 cartas
            System.out.printf("%-19s", myDeckOfCards.dealCard());

            if (i % 4 == 0) {
                System.out.println();
            }
        }

    }
}
