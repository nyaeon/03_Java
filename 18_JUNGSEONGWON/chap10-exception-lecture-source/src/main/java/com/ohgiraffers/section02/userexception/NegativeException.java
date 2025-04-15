package com.ohgiraffers.section02.userexception;

public class NegativeException extends Exception{

    /*
    * 사용자 정의의 예외클래스를 만드릭 위해서는 Exception 클래스를 상속 받으면 된다.
    * 경우에 따라서는 더 상위 타입인 Throwable클래슨 ㅏ하위 타입의 클래스를 상속받기도 한다.
    * */

    public NegativeException(String message) {
        super(message);
    }
}
