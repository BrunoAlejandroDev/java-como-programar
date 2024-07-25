package com.bruno.javacomoprogramar.cap7.card;

import java.security.SecureRandom;

public class DeckOfCards {

    // ATRIBUTOS
    private Card[] deck; // array de objetos Card
    private int currentCard; // indice da proxima Card a ser distribuida
    private static final int NUMBER_OF_CARDS = 52;
    private static final SecureRandom randomNumbers = new SecureRandom(); // gerar numeros aleatorios

    // CONSTRUTOR
    public DeckOfCards() {
        String[] faces = {"Ace", "Deuce", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"};
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        deck = new Card[NUMBER_OF_CARDS]; // inicializa o array de objetos Card
        currentCard = 0; // a primeira Card ditruibuida no deck sera deck[0]

        for (int count = 0; count < deck.length; count++) {
            deck[count] = new Card(faces[count % 13], suits[count / 13]);
        }
    }

    // METODOS
    public void shuffle() { // embaralhar as cartas
        currentCard = 0;

        for (int first = 0; first < deck.length; first++) { // para cada card, seleciona um Card aleatório (0-51) e compara
            int second = randomNumbers.nextInt(NUMBER_OF_CARDS); // seleciona um numero aleatorio entre 0 e 51

            Card temp = deck[first]; // armazenar a carta que está na posição first
            deck[first] = deck[second]; // a carta na posição first é substituida pela carta na posição second
            deck[second] = temp; // a carta que first é movida para a posição second
        }
    }

    public Card dealCard() { // distribui uma carta
        if (currentCard < deck.length) {
            return deck[currentCard++];
        }
        else {
            return null;
        }
    }

}