package com.bruno.javacomoprogramar.cap8.Kmembrosstatic;

public class Employee {

    // Variaveis de instancia
    private static int count = 0; // variável static para contar o numero de employees criados
    private String firstName;
    private String lastName;

    public Employee(String firstName, String lastName)
    {
        this.firstName = firstName;
        this.lastName = lastName;

        ++count; // toda vez que um objeto employee é criado, a variavel static é incrementada
        System.out.printf("Employee constructor: %s %s | count: %d%n", firstName, lastName, count);
    }

    public String getFirstName()
    {
        return firstName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public static int getCount()
    {
        return count;
    }

}