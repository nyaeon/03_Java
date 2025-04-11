package com.ohgiraffers.exception.charcheck;

public class CharCheckException extends Exception {
    public CharCheckException(String s) {
        System.out.println("체크할 문자열 안에 공백을 포함할 수 없습니다.");
    }
}
