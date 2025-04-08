package com.ohgiraffers.section02.userexception;

public class NotEnoughMoneyException extends Exception {

    public NotEnoughMoneyException() {}

    public NotEnoughMoneyException(String message) {
        super (message);
    }
}
