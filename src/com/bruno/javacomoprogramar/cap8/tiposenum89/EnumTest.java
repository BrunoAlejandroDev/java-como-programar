package com.bruno.javacomoprogramar.cap8.tiposenum89;

import java.util.EnumSet;

public class EnumTest {
    public static void main(String[] args) {

        System.out.println("Todos os livros: ");

        // for aprimorado para percorrer a lista de constantes ENUM
        for (Book book : Book.values())
        {
            System.out.printf("%-10s%-45s%s%n", book, book.getTitle(), book.getCopyrightYear());
        }

        // imprimir os 4 primeiros livros
        System.out.println();
        for (Book book : EnumSet.range(Book.JHTP, Book.CPPHTP))
        {
            System.out.printf("%-10s%-45s%s%n", book, book.getTitle(), book.getCopyrightYear());
        }
    }
}