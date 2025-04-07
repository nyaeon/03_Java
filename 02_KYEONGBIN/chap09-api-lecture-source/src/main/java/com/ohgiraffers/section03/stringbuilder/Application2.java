package com.ohgiraffers.section03.stringbuilder;

public class Application2 {

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("h");

        System.out.println(sb.capacity());

        // capacity() : 현재 내부 버퍼의 용량을 반환한다.
        // 기본 용량은 "문자열 길이 + 16"이다. (즉, "h"는 1글자이므로 기본 용량은 17)

        /*
         * append() 메서드란?
         * - 괄호 안에 넣은 값을 문자열로 바꿔서, 기존 문자열 뒤에 붙여주는 기능이에요.
         *   예시:
         *     StringBuilder sb = new StringBuilder("Hello");
         *     sb.append(" World"); // → "Hello World"가 됨
         *
         * - 문자열을 계속 붙이면 용량(capacity)이 부족할 수 있는데,
         *   그럴 경우 (기존 문자열 길이 + 1) × 2로 자동으로 용량을 늘려줘요.
         *
         * - 성능도 좋고 문자열 변경이 자주 일어날 때 유리해요.
         */
        for (int i = 0; i < 50; i++) {
            sb.append(i); // 숫자를 문자열로 바꿔서 sb 뒤에 계속 붙임
            System.out.println(i); // 현재 숫자 출력
            System.out.println("sb : " + sb); // 현재까지의 문자열 출력
            System.out.println("capacity: " + sb.capacity()); // 현재 용량 출력
            System.out.println("hashCode: " + sb.hashCode()); // sb 객체의 해시코드 출력
        }

        StringBuilder sb2 = new StringBuilder("javamysql");

        /*
         * delete(start, end) : 시작 인덱스부터 끝 인덱스 전까지의 문자를 제거함
         * deleteCharAt(index) : 지정한 인덱스의 문자 하나를 제거함
         * 둘 다 원본 문자열에 영향을 줘요 (즉, 원래 문자열이 바뀜)
         */
        System.out.println("delete() : " + sb2.delete(2, 5)); // index 2~4 제거
        System.out.println("deletecharAt() : " + sb2.deleteCharAt(2)); // index 2 문자 하나 제거
        System.out.println("sb2: " + sb2); // 현재 sb2 출력

        /*
         * insert(index, value) : 특정 위치(index)에 값을 문자열로 바꿔서 끼워 넣는 기능
         * 원본 문자열을 바꿈
         */
        System.out.println("insert() : " + sb2.insert(2, "va")); // index 2에 "va" 추가
        System.out.println("insert() : " + sb2.insert(0, "happy ")); // 맨 앞에 "happy " 추가
        System.out.println("insert() : " + sb2.insert(sb2.length(), "  World!!❤️")); // 마지막에 추가
        System.out.println("sb2: " + sb2); // 최종 결과 출력

        /*
         * reverse() : 문자열 순서를 뒤집는 기능
         * 원본 문자열이 바뀜
         */
        System.out.println("reverse() : " + sb2.reverse());
        System.out.println("Sb2 : " + sb2); // 뒤집힌 문자열 출력

    }

}