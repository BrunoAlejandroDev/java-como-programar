package com.bruno.javacomoprogramar.cap8.Econstrutoressobrecarregados;

public class Time2 {

    // ATRIBUTOS
    private int hour;
    private int minute;
    private int second;

    // CONSTRUTOR 1 - SEM ARGUMENTOS
    public Time2()
    {
        this(0, 0, 0); // invoca o construtor de três argumentos
    }

    // CONSTRUTOR 2 - UM ARGUMENTO
    public Time2(int hour)
    {
        this(hour, 0, 0); // invoca o construtor de três argumentos
    }

    public Time2 (int hour, int minute)
    {
        this(hour, minute, 0); // invoca o construtor de três argumentos
    }

    public Time2 (Time2 time) // invoca o construtor de três argumentos utilizando um objeto Time2
    {
        this(time.getHour(), time.getMinute(), time.getSecond());
    }

    // CONSTRUTOR PADRÃO
    public Time2(int hour, int minute, int second)
    {
        if (hour < 0 || hour >= 24)
        {
            throw new IllegalArgumentException("Hour must be 0 - 23");
        }
        if (minute < 0 || minute >= 60)
        {
            throw new IllegalArgumentException("minute must be 0 - 59");
        }
        if (second < 0 || second > 60)
        {
            throw new IllegalArgumentException("second must be 0 - 59");
        }

        this.hour = hour;
        this.minute = minute;
        this.second = second;

    }

    // METODOS SET
    // validar entrada de dados
    public void setTime (int hour, int minute, int second)
    {
        if (hour < 0 || hour >= 24)
        {
            throw new IllegalArgumentException("Hour must be 0 - 23");
        }
        if (minute < 0 || minute >= 60)
        {
            throw new IllegalArgumentException("minute must be 0 - 59");
        }
        if (second < 0 || second > 60)
        {
            throw new IllegalArgumentException("second must be 0 - 59");
        }

        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    // valida e configura a hora
    public void setHour(int hour) {
        if (hour < 0 || hour >= 24)
        {
            throw new IllegalArgumentException("hour must be 0 - 23");
        }
        this.hour = hour;
    }

    // valida e configura os minutos
    public void setMinute(int minute) {
        if (minute < 0 || minute >= 60)
        {
            throw new IllegalArgumentException("minutes must be 0 - 59");
        }
        this.minute = minute;
    }

    // valida e configura os segundos
    public void setSecond(int second) {
        if (second < 0 || second >= 60)
        {
            throw new IllegalArgumentException("seconds must be 0 - 59");
        }
        this.second = second;
    }

    // METODOS GET
    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    // METODOS PUBLICOS
    // converter String em formato de data/hora universal
    public String toUniversalString ()
    {
        return String.format("%02d:%02d:%02d", getHour(), getMinute(), getSecond());
    }

    public String toString ()
    {
        return String.format("%d:%02d:%02d %s", (getHour() == 0 || getHour() == 12) ? 12 : getHour() % 12,
                getMinute(),
                getSecond(),
                (getHour() < 12 ? "AM" : "PM"));
    }
}