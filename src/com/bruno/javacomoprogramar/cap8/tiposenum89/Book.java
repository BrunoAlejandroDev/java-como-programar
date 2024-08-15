package com.bruno.javacomoprogramar.cap8.tiposenum89;

public enum Book {

    // Tipos enum
    JHTP("Java How to Program", "2015"),
    CHTP("C How to Program", "2013"),
    IW3HTP("Internet & World Wide Web How to Program", "2012"),
    CPPHTP("C++ How to Program", "2014"),
    VBHTP("Visual Basic How to Program", "2014"),
    CSHARPHTP("Visual C# How to Program", "2014");

    // Variaveis de instância
    private final String title;
    private final String copyrightYear;

    // Construtor
    Book(String title, String copyrightYear)
    {
        this.title = title;
        this.copyrightYear = copyrightYear;
    }

    public String getTitle()
    {
        return title;
    }

    public String getCopyrightYear()
    {
        return copyrightYear;
    }
}