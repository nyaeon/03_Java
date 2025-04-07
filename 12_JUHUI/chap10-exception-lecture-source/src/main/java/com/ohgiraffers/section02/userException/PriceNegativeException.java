package com.ohgiraffers.section02.userException;

public class PriceNegativeException extends NegativeException {

    public PriceNegativeException(String message) {
        super(message);
    }
}
