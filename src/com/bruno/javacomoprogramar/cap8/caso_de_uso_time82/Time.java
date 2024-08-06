package com.bruno.javacomoprogramar.cap8.caso_de_uso_time82;

public class Time {

    //ATRIBUTOS
    private int hour;
    private int minutes;
    private int seconds;

    // configurar um novo valor de tempo baseado no relógio mundial
    public void setTime(int hour, int minutes, int seconds)
    {
        // valida horas, minutos e segundos
        if (hour < 0 || hour >= 24 || minutes < 0 || minutes >= 60 || seconds < 0 || seconds >= 60)
        {
            throw new IllegalArgumentException("Hour, minute and/or second was out of range"); // exceção lançada em caso de valores inválidos
        }
        this.hour = hour;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    // converte em string o formato de hora
    public String toUniversalString()
    {
        return String.format("%02d:%02d:%02d", hour, minutes, seconds);
    }

    @Override
    public String toString()
    {
        return String.format("%d:%02d:%02d %s", (hour == 0 || hour == 12) ? 12 : hour % 12, minutes, seconds, (hour < 12) ? "AM" : "PM");
    }
}
