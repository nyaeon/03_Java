package com.ohgiraffers.section03.refences;

public class Account {
    private String ownerName;
    private int balance;

    public Account() {
    }

    public Account(String ownerName) {
        this.ownerName = ownerName;
    }

    @Override
    public String toString() {
        return "Account{" +
                "ownerName='" + ownerName + '\'' +
                ", balance=" + balance +
                '}';
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
}
