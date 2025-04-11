package com.ohgiraffers.section03.refences;

public class Account {

    private String ownerName; // 필드값
    private int balance;

    public Account() {
    } //기본생성자

    public Account(String ownerName) {
        this.ownerName = ownerName;
    } // 매개변수 생성자

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

    @Override
    public String toString() {
        return "Account{" +
                "ownerName='" + ownerName + '\'' +
                ", balance=" + balance +
                '}';
    }
}
