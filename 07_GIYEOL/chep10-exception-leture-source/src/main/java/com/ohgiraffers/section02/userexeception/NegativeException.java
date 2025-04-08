package com.ohgiraffers.section02.userexeception;

public class NegativeException extends Exception {
    /***
     * 사용자 정의 예외 클래스를 만들기 위해서는 EXcepation 클래스를 상속 받으면 됨
     * 경우에 따라 더 상위 타입인 Throwable 클래스나 하위 타입의 클래스를 상속 받기도 함
     */
    public NegativeException(String message) {
        super(message);

    }
}
