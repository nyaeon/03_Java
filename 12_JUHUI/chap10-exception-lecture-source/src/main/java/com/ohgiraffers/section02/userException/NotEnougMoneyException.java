package com.ohgiraffers.section02.userException;

public class NotEnougMoneyException extends Exception {

    public NotEnougMoneyException() {
    }

    public NotEnougMoneyException(String message) {
        super(message);
    }
}
