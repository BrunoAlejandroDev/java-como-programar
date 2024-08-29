package com.bruno.javacomoprogramar.cap9.Drelacionamentoheranca;

public class CommissionEmployee {

    // Atributos
    private final String firstName;
    private final String lastName;
    private final String socialSecurityNumber;
    private double grossSale;
    private double commissionRate;

    // Construtor
    public CommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSale, double commissionRate)
    {
        // verificar se grossSale é maior que zero
        if (grossSale <= 0.0)
        {
            throw new IllegalArgumentException("Gross Sale must be >= 0.0");
        }

        // verificar se a taxa de comissao está dentro do intervalo
        if (commissionRate <= 0.0 || commissionRate >= 1.0)
        {
            throw new IllegalArgumentException("Commission rate must be > 0.0 and < 1.0");
        }

        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
        this.grossSale = grossSale;
        this.commissionRate = commissionRate;
    }

    // Metodos publicos
    public double earnings()
    {
        return commissionRate * grossSale;
    }

    @Override
    public String toString() {
        return String.format("%s: %s %s%n%s: %s%n%s: %.2f%n%s: %.2f",
                "CommissionEmployee", firstName, lastName,
                "Social security number", socialSecurityNumber,
                "GrossSale", grossSale,
                "CommissionRate", commissionRate
        );
    }

    // Setters e Getters
    public String getFirstName()
    {
        return firstName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public String getSocialSecurityNumber()
    {
        return socialSecurityNumber;
    }

    public void setGrossSale(double grossSale)
    {
        if (grossSale < 0.0)
        {
            throw new IllegalArgumentException("Gross sale must be > 0.0");
        }
        this.grossSale = grossSale;
    }

    public double getGrossSale()
    {
        return grossSale;
    }

    public void setCommissionRate(double commissionRate)
    {
        if (commissionRate <= 0.0 || commissionRate >= 1.0)
        {
            throw new IllegalArgumentException("Commission rate must be > 0.0 and < 1.0");
        }
        this.commissionRate = commissionRate;
    }

    public double getCommissionRate()
    {
        return commissionRate;
    }
}
