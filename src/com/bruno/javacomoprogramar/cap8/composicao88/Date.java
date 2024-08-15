package com.bruno.javacomoprogramar.cap8.composicao88;

public class Date {

    // Atributos
    private int day;
    private int month;
    private int year;

    private static final int[] daysPerMonth = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    // Construtor
    public Date(int month, int day, int year)
    {

        // validação do mês
        if (month <= 0 || month > 12)
        {
            throw new IllegalArgumentException("Month (" + month + ") must be 1-12");
        }

        // validação do dia
        if (day <= 0 || day > daysPerMonth[month] && !(month == 2 && day == 29))
        {
            throw new IllegalArgumentException("Day (" + day + ") out-of-range for the especified month and year");
        }

        // verificar se o ano é bissexto, se o mes é fevereiro e o dia é 29
        if (month == 2 && day == 29 && (year % 400 == 0 || year % 4 == 0 && year % 100 != 0))
        {
            throw new IllegalArgumentException("Day (\" + day + \") out-of-range for the especified month and year");
        }

        this.month = month;
        this.day = day;
        this.year = year;

        System.out.printf("Date object constructor for date %s%n", this);

    }

    public String toString()
    {
        return String.format("%d/%d/%d", month, day, year);
    }
}