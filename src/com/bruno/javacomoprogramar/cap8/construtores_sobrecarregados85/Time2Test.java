package com.bruno.javacomoprogramar.cap8.construtores_sobrecarregados85;

public class Time2Test {
    public static void main(String[] args) {

        Time2 t1 = new Time2();
        Time2 t2 = new Time2(2);
        Time2 t3 = new Time2(21, 34);
        Time2 t4 = new Time2(12, 25, 42);
        Time2 t5 = new Time2(t4);

        System.out.println("Construtor usado: ");
        displayTime("t1: nenhum argumento passado", t1);
        displayTime("t2: apenas a hora foi passada", t2);
        displayTime("t3: hora e minuto passados", t3);
        displayTime("t4; hora, minuto e segundo fornecidos", t4);
        displayTime("t5: passando um objeto especifico", t5);

        try
        {
            Time2 t6 = new Time2(27, 74, 99);
        }
        catch (IllegalArgumentException e)
        {
            System.out.println("Exceção na inicialização de t6: " + e.getMessage());
        }

    }

    private static void displayTime(String header, Time2 t)
    {
        System.out.printf("%s%n   %s%n   %s%n", header, t.toUniversalString(), t.toString());
    }
}