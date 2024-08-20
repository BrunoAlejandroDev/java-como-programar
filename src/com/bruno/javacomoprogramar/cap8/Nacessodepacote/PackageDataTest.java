package com.bruno.javacomoprogramar.cap8.Nacessodepacote;

public class PackageDataTest {
    public static void main(String[] args)
    {

        // instanciar um obj da classe PackageData
        PackageData packageData = new PackageData();

        // gerar saida em string para packageData
        System.out.printf("Antes da mudança de valores: %n%s%n", packageData);

        // mudar os valores da variaveis de PackagaData
        packageData.number = 77;
        packageData.string = "Goodbye";

        // gerar saida em string para packageData
        System.out.printf("Depois da mudança de valores: %n%s%n", packageData);

    }
}

class PackageData
{
    int number; // variavel sem modificador de acesso -> acesso de pacote
    String string; // variavel sem modificador de acesso -> acesso de pacote

    public PackageData()
    {
        number = 0;
        string = "Hello";
    }

    public String toString()
    {
        return String.format("number: %d | string: %s", number, string);
    }
}