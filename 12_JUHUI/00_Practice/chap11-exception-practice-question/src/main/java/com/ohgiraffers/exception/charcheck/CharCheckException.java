package com.ohgiraffers.exception.charcheck;
//RuntimeExcepion을 써도 괜찮다고하심.
public class CharCheckException extends Exception { // 사용자 정의 예외클래스
    public CharCheckException(String message) {
        super(message);
    }

}
