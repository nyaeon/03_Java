package com.ohgiraffers.exception.number;

import com.ohgiraffers.exception.charcheck.CharCheckException;

public class NumberCheck {
    // 기본 생성자
    public NumberCheck() {}

    // 배수 확인 메소드
    public boolean checkDouble(int a, int b) throws NumberRangeException { // throws 사용은 강제로 예외 발생시키는 방법이라 빨간색 글씨로 나타남.
        // 1~100 사이의 값인지 확인
        if(a < 1 || a > 100 || b < 1 || b > 100) { // 에러 메세지
            throw new NumberRangeException("1부터 100사이의 값이 아닙니다.");
        }

        // 첫 번째 수인 a가 두 번째 수인 b의 배수인지 확인
        return a % b == 0;
    }
}
