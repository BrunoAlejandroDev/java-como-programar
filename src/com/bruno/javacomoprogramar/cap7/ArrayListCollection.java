package com.bruno.javacomoprogramar.cap7;

import java.util.ArrayList;

public class ArrayListCollection {
    public static void main(String[] args) {

        // criar novo ArrayList do tipo String com capacidade padrão
        ArrayList<String> arrayList = new ArrayList<>();

        // Adicionar dois elementos
        arrayList.add("vermelho");
        arrayList.add(0, "azul"); // especifica a posição do novo índice que será adicionado

        // Exibir os primeiros itens adicionados
        System.out.print("Array com dois itens adicionados: ");
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.printf("%s ", arrayList.get(i));
        }

        // exibir os itens por meio do método display
        display(arrayList, "Lista com dois elementos via método: ");

        // adicionar dois novos itens
        arrayList.add("branco");
        arrayList.add("azul");

        // exibir lista com os dois novos itens
        display(arrayList, "Lista com a adição de mais dois novos itens: ");

        // remover a primeira aparição da cor azul
        arrayList.remove("azul");
        display(arrayList, "Remover a primeira aparição do azul: ");

        // revover o item no índice 1
        arrayList.remove(1);
        display(arrayList, "Remoção do item no índice 1: ");

        // verificar se a cor vermelho está na lista
        System.out.printf("\n\"branco\"%s está na lista%n", arrayList.contains("branco") ? "" : " não");

        System.out.printf("Size: %s%n", arrayList.size());

    }

    public static void display(ArrayList<String> list, String header)
    {
        System.out.println();
        System.out.printf(header);
        for (String item : list) {
            System.out.printf("%s ", item);
        }
    }
}