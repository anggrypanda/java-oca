package com.selectedClassesFromJavaAPI.exPag274;

public class BankAccount {
    String accNumber;
    int accType;

    public boolean equals(Object anObj) {
        if (anObj instanceof BankAccount) {
            BankAccount b = (BankAccount) anObj;
            return (accNumber.equals(b.accNumber) && accType == b.accType);
        }
        else
            return false;
    }
}
