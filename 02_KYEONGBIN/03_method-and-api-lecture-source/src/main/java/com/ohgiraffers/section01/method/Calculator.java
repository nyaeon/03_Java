package com.ohgiraffers.section01.method;

public class Calculator {

    // 두 숫자의 합을 반환하는 메서드
    public int plusTwoNumbers(int first, int second) {
        return first + second; // first와 second를 더한 값을 반환
    }

    // 두 숫자의 차이를 반환하는 메서드
    public int subTwoNumbers(int first, int second) {
        return first - second; // first에서 second를 뺀 값을 반환
    }

    // 두 숫자 중 더 작은 값을 반환하는 메서드
    public int minTwoNumbers(int first, int second) {
        // first가 second보다 크면 second를 반환, 그렇지 않으면 first를 반환
        return (first > second) ? second : first;
    }

    // 두 숫자 중 더 큰 값을 반환하는 static 메서드
    public static int maxNumberOF(int first, int second) {
        // first가 second보다 크면 first를 반환, 그렇지 않으면 second를 반환
        return (first > second) ? first : second;
    }
}
