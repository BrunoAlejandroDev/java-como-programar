package com.bruno.javacomoprogramar.cap9.Drelacionamentoheranca;

import java.util.Arrays;

public class CommissionEmployeeTest {
    public static void main(String[] args)
    {

        // instanciar o objeto CommissionEmployee
        CommissionEmployee employee = new CommissionEmployee("Bruno", "Alejandro", "222-22-2222", 10000.00, .06);

        // imprimir dados
        System.out.println("Employee information obtained by get methods: ");
        System.out.printf("%n%s %s%n", "First name:", employee.getFirstName());
        System.out.printf("%s %s%n", "Last name:", employee.getLastName());
        System.out.printf("%s %s%n", "Social security number:", employee.getSocialSecurityNumber());
        System.out.printf("%s %.2f%n", "Gross sale:", employee.getGrossSale());
        System.out.printf("%s %.2f%n", "Commission rate:", employee.getCommissionRate());

        System.out.printf("%n%s: %n%n%s%n", "Update employee information obtained by toString", employee);

    }
}
