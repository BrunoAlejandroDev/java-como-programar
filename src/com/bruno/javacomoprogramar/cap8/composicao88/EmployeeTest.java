package com.bruno.javacomoprogramar.cap8.composicao88;

public class EmployeeTest {
    public static void main(String[] args) {

        Date birthDate = new Date(3, 2, 2001);
        Date hireDate = new Date(9, 2, 2024);

        Employee employee = new Employee("Alejandro", "Bruno", birthDate, hireDate);
        System.out.println(employee); // chamada implicita do método toString da classe Employee

    }
}