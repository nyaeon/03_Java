package com.ohgiraffers.section02.Stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Application1 {

    public static void main(String[] args) {

        /*
         * 📚 [스트림(Stream) 입출력 개요]
         *
         * 1. 스트림(Stream)이란?
         *    - 자바 프로그램과 외부 데이터(파일, 네트워크 등)를 연결하는 통로
         *    - 데이터를 읽거나(Input), 쓰는(Output) 데 사용됨
         *    - 단방향 통신 방식 (읽기/쓰기 각각 따로 처리)
         *
         * 2. 입력 스트림 / 출력 스트림 종류
         *    ┌────────────────────────────┬────────────────────────────┐
         *    │        바이트 단위(1byte)    │       문자 단위(2~3byte)     │
         *    ├────────────────────────────┼────────────────────────────┤
         *    │ 입력:   InputStream         │ 입력:   Reader              │
         *    │ 출력:   OutputStream        │ 출력:   Writer              │
         *    └────────────────────────────┴────────────────────────────┘
         *    - 바이트 단위: 이미지, 영상, 이진 데이터 처리
         *    - 문자 단위: 텍스트, 한글 등 문자 데이터 처리
         *
         * 3. 클래스 이름에서 외부 데이터의 종류를 유추할 수 있음
         *    - 예: FileInputStream → 파일에서 입력받는 스트림
         *    - 예: BufferedWriter  → 버퍼를 사용한 문자 출력 스트림
         *
         * 4. 인코딩 참고사항
         *    - MS949 : 한글 1글자 = 2바이트
         *    - UTF-8 : 한글 1글자 = 3바이트
         *    → 문자 스트림은 인코딩에 따라 처리 크기 달라짐
         */

        FileInputStream fis = null;

        try {
            // 파일에서 바이트 단위로 입력받기 위한 스트림 생성
            fis = new FileInputStream("src/main/java/com/ohgiraffers/section02/Stream/testInputStream.txt");

            int value;
//            // read() : 파일에서 1바이트씩 읽고, 더 이상 읽을 게 없으면 -1 반환
//            while ((value = fis.read()) != -1) {
//                System.out.println("Read: " + value + " (" + (char) value + ")");
//            }

            // 파일 길이 출력
            File file = new File("src/main/java/com/ohgiraffers/section02/Stream/testInputStream.txt");
            System.out.println("Length of the file: " + file.length() + " bytes");
            int size = (int) new File("src/main/java/com/ohgiraffers/section02/Stream/testInputStream.txt").length();

            byte[] bytes = new byte[size];
            fis.read(bytes);

            for(int i = 0; i <bytes.length; i++){
                System.out.println((char)bytes[i]);
            }

        } catch (FileNotFoundException e) {
            System.out.println("해당 파일을 찾을 수 없습니다.");
        } catch (IOException e) {
            System.out.println("파일 읽기 중 오류 발생!");
        } finally {
            // 자원 반환 (파일 닫기)
            if (fis != null) {
                try {
                    fis.close();
                    System.out.println("파일 스트림을 성공적으로 닫았습니다.");
                } catch (IOException e) {
                    System.out.println("스트림 닫기 중 오류 발생!");
                }
            }
        }

    }
}
