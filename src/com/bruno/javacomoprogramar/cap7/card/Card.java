package com.bruno.javacomoprogramar.cap7.card;

public class Card {

    // ATRIBUTOS
    private final String FACE; // face da carta
    private final String SUIT; // naipe da carta

    // CONSTRUTOR PARA INICIALIZAR A FACE E O NAIPE DA CARTA
    public Card(String FACE, String SUIT) {
        this.FACE = FACE;
        this.SUIT = SUIT;
    }

    // METODOS
    @Override
    public String toString() {
        return FACE + " of " + SUIT;
    }

}