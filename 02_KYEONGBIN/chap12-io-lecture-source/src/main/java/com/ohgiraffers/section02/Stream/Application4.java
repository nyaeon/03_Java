package com.ohgiraffers.section02.Stream;

import java.io.FileWriter;
import java.io.IOException;

public class Application4 {

    public static void main(String[] args) {

        // FileWriter: 파일에 문자 단위로 데이터를 출력하는 클래스
        FileWriter fw = null;

        try {
            // 파일 출력 스트림 생성
            // 지정된 파일이 없으면 자동으로 생성됨
            fw = new FileWriter("src/main/java/com/ohgiraffers/section02/Stream/testWriter.txt");

            fw.write(97);                         // 정수 97을 문자로 변환하여 출력 → 'a'
            fw.write('A');                        // 문자 'A' 출력
            fw.write(new char[] {'A','p','p','l','E'});  // 문자 배열 출력 → "ApplE"
            fw.write("우리나라 대한민국!");        // 문자열 출력 → 한글도 문제없이 출력됨

        } catch (IOException e) {
            // 파일 출력 도중 오류가 발생한 경우
            throw new RuntimeException(e);
        } finally {
            // 스트림 자원 정리 (파일 닫기)
            if (fw != null) {
                try {
                    fw.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }

    }
}
