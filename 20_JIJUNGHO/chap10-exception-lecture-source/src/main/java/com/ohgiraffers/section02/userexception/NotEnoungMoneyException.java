package com.ohgiraffers.section02.userexception;

public class NotEnoungMoneyException extends Exception {

    public NotEnoungMoneyException() {
    }

    public NotEnoungMoneyException(String message) {
        super(message);
    }
}
