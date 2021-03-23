package com.example.interfaceprograms;

public class BankAccount implements Measurable{
    private double balance; //obj.getBalance()
    private int accouttNumber; //obj.getAccountNumber()
    private static int lastAssignedNumber=1000; //BankAccount.lastAssignedNumber

    public BankAccount(double balance) {
        this.balance = balance;
        lastAssignedNumber++;
        accouttNumber=lastAssignedNumber;
    }

    public double getMeasure() {
        return balance;
    }

}
