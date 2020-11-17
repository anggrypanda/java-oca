package com.selectedClassesFromJavaAPI.exPag274;

public class BankTest {
    public static void main(String[] args) {
        BankAccount b1 = new BankAccount();
        b1.accNumber = "00921";
        b1.accType = 4;
        BankAccount b2 = new BankAccount();
        b2.accNumber = "103332";
        b2.accType = 3;
        BankAccount b3 = new BankAccount();
        b3.accNumber = "00921";
        b3.accType = 4;
        BankAccount b4 = new BankAccount();
        b4.accNumber = "22222222";
        b4.accType = 3;

        System.out.println(b1.equals(b2));
        System.out.println(b2.equals(b3));
        System.out.println(b1.equals(b3));
        System.out.println(b4.equals(new String("abc")));
    }
}
