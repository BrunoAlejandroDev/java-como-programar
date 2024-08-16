package com.bruno.javacomoprogramar.cap8.Bcasodeusotime;

public class TimeTest {
    public static void main(String[] args) {

        // criar um objeto da classe time
        Time time = new Time();

        // teste para verificar se o objeto foi corretamente chamado
        DisplayTime("After time object is created", time);
        System.out.println();

        // inserir valores para hora, minuto e segundo
        time.setTime(13, 27, 6);
        DisplayTime("After calling setTime", time);
        System.out.println();

        // inserir valores não aceitos no método
        try {
            time.setTime(99, 99, 99);
        }
        catch (IllegalArgumentException ex)
        {
            System.out.printf("Exception: %s%n%n", ex.getMessage());
        }

        // verificar valores após chamada com argumentos ilegais
        DisplayTime("Chamada após inserção de argumentos inválidos", time);

    }

    private static void DisplayTime(String header, Time time)
    {
        System.out.printf("%s%nUniversal time: %s%nStandard time: %s%n", header, time.toUniversalString(), time.toString());
    }
}
