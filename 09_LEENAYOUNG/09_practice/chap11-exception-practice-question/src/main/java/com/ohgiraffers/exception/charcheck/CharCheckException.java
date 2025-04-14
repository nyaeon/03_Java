package com.ohgiraffers.exception.charcheck;

public class CharCheckException extends Exception {

    public CharCheckException() {
    }

    public CharCheckException(String message) {
        System.out.println(message);
    }
}
