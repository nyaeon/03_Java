package com.ogiraffers.section02.userException;

public class notEnoughMoneyException extends Exception {

    public notEnoughMoneyException() {}

    public notEnoughMoneyException(String message) {
        super(message);
    }
}
