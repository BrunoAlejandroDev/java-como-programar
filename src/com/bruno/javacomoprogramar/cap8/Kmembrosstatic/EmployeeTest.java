package com.bruno.javacomoprogramar.cap8.Kmembrosstatic;

public class EmployeeTest {
    public static void main(String[] args) {

        // chamar a variavel static via nome da classe
        System.out.printf("Employees before instantiation: %d%n", Employee.getCount());

        // instanciando dois novos objetos Employee
        Employee employee1 = new Employee("Bruno", "Alejandro");
        Employee employee2 = new Employee("Juan M", "Lucero");

        System.out.printf("Employees after instantiation: %n");
        System.out.printf("via employee1.getCount(): %d%n", employee1.getCount());
        System.out.printf("via employee2.getCount(): %d%n", employee2.getCount());
        System.out.printf("via Employee.getCount(): %d%n", Employee.getCount());

    }
}