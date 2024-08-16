package com.bruno.javacomoprogramar.cap8.Dreferenciarmembros;

public class ThisTest {
    public static void main(String[] args)
    {
        SimpleTime time = new SimpleTime(15, 30, 19);
        System.out.println(time.buildString());
    }
}

// classe para demonstrar o uso do this
class SimpleTime
{
    private int hour;
    private int minute;
    private int second;


    // se o construtor utilizar nomes de parâmetro idênticos a nomes de variáveis de instância a referência "this" será exigida para distinguir entre os nomes
    public SimpleTime(int hour, int minute, int second)
    {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    // uso do this implicito e explicito
    public String buildString()
    {
        return String.format("%24s: %s%n%24s: %s", "this.toUniversalString()", this.toUniversalString(), "toUniversalString()", toUniversalString());
    }

    public String toUniversalString()
    {
        return String.format("%02d:%02d:%02d", this.hour, this.minute, this.second);
    }
}