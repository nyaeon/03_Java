package com.ohgiraffers.lambda.test;

import java.text.SimpleDateFormat;
import java.util.Date;

//App 클래스 정의 - 여기서 test1 ~ 5까지 메소드 구현
public class App {
    @FunctionalInterface
    interface CurrentTimeFormatter {
        void printCurrentTime();
    }

    // 현재시각 HH:mm:ss.SSS을 출력하는 람다식을 작성
    public void test1() {
        CurrentTimeFormatter formatter = () -> {
            SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss.SSS");
            System.out.println("현재 시각 :" + sdf.format(new Date()));
        };
    }

    // 로또를 생성하는 람다식을 작성하세요.
    public void test2() {
        /* 구현 */
    }
    public void test3() {
        /* 구현 */
    }
    public void test4() {
        /* 구현 */
    }
    public void test5() {
        /* 구현 */
    }
}
