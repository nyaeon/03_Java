package com.ogiraffers.section02.userException;

public class negativeException extends Exception {

    /*
    * 사용자 정의의 예외 클래스를 만들기 위해서는  Exception 클래스를 상속받으면 된다.
    * 경우에 따라서는 더 상위 타입인 Throwable 클래스나 하위 타입의 클래스를 상속받기도 한다.    *
    * */

    public negativeException(String message) {
        super(message);
    }
}
