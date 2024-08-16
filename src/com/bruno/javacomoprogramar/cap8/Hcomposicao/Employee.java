package com.bruno.javacomoprogramar.cap8.Hcomposicao;

public class Employee {

    // Atributos
    private String firstName;
    private String lastName;
    private Date birthDate; // composição
    private Date hireDate; // composição

    // Construtor
    public Employee(String firstName, String lastName, Date birthDate, Date hireDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.hireDate = hireDate;
    }

    public String toString()
    {
        return String.format("%s | %s | Hired: %s | Birthday: %s", lastName, firstName, hireDate, birthDate);
    }

}