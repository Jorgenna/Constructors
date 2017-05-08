package com.jorgennabenitez;

public class Main {

    public static void main(String[] args) {
    BankAccount jorgie = new BankAccount();
//    jorgie.setAccountNumber(11);
//    jorgie.setBalance(100.00);
//    jorgie.setCustomerName("Jorgenna Benitez");
//    jorgie.setEmail("jorgie@mush.com");
//    jorgie.setPhoneNumber("(123)-456-7890");

        System.out.println(jorgie.getAccountNumber());
        System.out.println(jorgie.getBalance());
        jorgie.withdrawl(10.00);
        jorgie.deposit(20.00);

        BankAccount jorgiesAccount = new BankAccount ("Jorgie", "jorgie@mush.com", "123456");
        System.out.println(jorgiesAccount.getBalance());
    }
}
