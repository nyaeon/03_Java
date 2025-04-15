package com.ohgiraffers.section03.references;

public class Account {
    private String ownername;
    private int balance;

    public Account() {
    }

    public Account(String ownername) {
        this.ownername = ownername;
    }

    public String getOwnername() {
        return ownername;
    }

    public void setOwnername(String ownername) {
        this.ownername = ownername;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "ownername='" + ownername + '\'' +
                ", balance=" + balance +
                '}';
    }
}
