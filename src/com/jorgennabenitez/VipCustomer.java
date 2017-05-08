package com.jorgennabenitez;

/**
 * Created by jorgennabenitez on 5/7/17.
 */
public class VipCustomer {
    private String name;
    private double creditLimit;
    private String emailAddress;

    public VipCustomer() {
        this("jorgie", 150.00, "jorgie@mush.com");
    }

    public VipCustomer(String name, double creditLimit) {
        this(name, creditLimit, "Default");
    }

    public VipCustomer(String name, double creditLimit, String emailAddress) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
}


