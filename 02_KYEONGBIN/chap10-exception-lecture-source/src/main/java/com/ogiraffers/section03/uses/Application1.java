package com.ogiraffers.section03.uses;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Application1 {

    public static void main(String[] args) {

        BufferedReader in = null;
        // BufferedReader: 파일에서 데이터를 한 줄씩 읽기 위해 사용
        // 데이터를 임시 저장(buffering)해서 효율적으로 읽을 수 있게 해줌
        // 만약 BufferedReader in을 try 안에서 선언하면, finally에서는 그 변수를 알아보지 못해요.
        // finally는 try-catch 바깥이기 때문에 바깥에 선언된 변수만 접근 가능합니다.

        try {
            // "test.dat"라는 파일을 FileReader로 읽고, BufferedReader로 감싸서 한 줄씩 읽을 수 있도록 함
            in = new BufferedReader(new FileReader("test.dat")); // filenotfound exception 무조건 발생

            String s;

            // readLine(): 한 줄씩 읽는다. null이 반환되면 더 이상 읽을 줄이 없다는 뜻
            while ((s = in.readLine()) != null) {
                System.out.println(s);  // 읽은 한 줄 출력
            }

        } catch (FileNotFoundException e) {
            // 파일이 존재하지 않을 경우 발생하는 예외
            throw new RuntimeException("파일이 존재하지 않습니다.", e);

        } catch (IOException e) {
            // 파일을 읽는 도중 문제가 생긴 경우 발생
            throw new RuntimeException("파일을 읽는 중 오류가 발생했습니다.", e);

        } finally {
            // 예외 발생 여부와 관계없이 반드시 실행됨 (자원 정리 목적)
            try {
                if (in != null) {
                    in.close(); // BufferedReader를 닫아줌 (메모리 누수 방지)
                }
            } catch (IOException e) {
                // close() 도중 발생할 수 있는 예외 처리
                throw new RuntimeException("파일을 닫는 중 오류가 발생했습니다.", e);
            }
        }

        /*
         ✅ 개념 요약
         - FileReader: 파일을 문자 단위로 읽는 클래스
         - BufferedReader: readLine() 메서드 제공, 한 줄씩 읽을 수 있게 해줌
         - try-catch-finally 구조로 예외를 안전하게 처리하고, 마지막에 자원을 정리함
         - close()도 예외가 발생할 수 있기 때문에 finally 안에서 다시 try-catch로 감쌈
        */
    }
}
