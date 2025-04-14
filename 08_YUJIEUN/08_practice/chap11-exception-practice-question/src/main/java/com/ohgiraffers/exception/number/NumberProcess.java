package com.ohgiraffers.exception.number;


public class NumberProcess {

    /*
    * - 임의의 정수 두개를 전달받아, 첫번째 수가 두번째수의 배수인지 확인.
    - 배수가 맞으면 true 를 리턴하고, 아니면 false를 리턴.
    - 단, 전달된 첫번째와 두번째 수가 1~100사이의 값이 아니면
    `NumberRangeException` 발생시킴
    - 에러메시지 : `"1부터 100사이의 값이 아닙니다."`
    * */



    // 메소드: checkDouble
    public boolean checkDouble(int a, int b) throws NumberRangeException {
        // 1부터 100 사이의 값인지 확인 (양쪽 모두)
        if (a < 1 || a > 100 || b < 1 || b > 100) {
            throw new NumberRangeException("1부터 100사이의 값이 아닙니다.");
        }

        // 첫번째 수가 두번째 수의 배수인지 확인
        return (a % b == 0);
    }
    }









