package com.ohgiraffers.section03.reference;

public class Account {

    private String ownerName;
    private int balance;

    // 기본 생성자
    public Account() {
    }

    // 이 부분이 중요. 매개변수가 있는 생성자인데 오너네임만 가지고 있음.
    public Account(String ownerName) {
        this.ownerName = ownerName;
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

    @Override
    public String toString() {
        return "Account{" +
                "ownerName='" + ownerName + '\'' +
                ", balance=" + balance +
                '}';
    }
}
