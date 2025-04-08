package com.ohgiraffers.section02.Stream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Application2 {

    public static void main(String[] args) {

        /*
         * 📘 FileReader란?
         *
         * - 텍스트 파일을 '글자(char)' 단위로 읽는 클래스이다.
         * - 'FileInputStream'처럼 파일을 읽지만, byte(1바이트) 단위가 아닌,
         *   character(문자, 2바이트) 단위로 읽는 점이 다르다.
         *
         * 🔍 한글 처리에 강한 이유?
         * - 한글은 보통 2~3바이트로 표현된다.
         * - FileInputStream은 1바이트씩 읽기 때문에 한글이 깨질 수 있음.
         * - FileReader는 글자(char) 단위로 읽기 때문에 한글을 정확히 읽을 수 있다.
         *
         * ✅ 요약
         * - 텍스트 파일(영문, 한글 등)을 읽을 때는 FileReader를 사용하면 좋다!
         * - 이미지나 영상 등 이진 파일은 FileInputStream을 사용해야 한다.
         */

        FileReader fr = null;

        try {
            fr = new FileReader("src/main/java/com/ohgiraffers/section02/Stream/testReader.txt");

            int value;

            while ((value = fr.read()) != -1) {
                System.out.print((char) value);
            }

            int size = (int) new File("src/main/java/com/ohgiraffers/section02/Stream/testReader.txt").length();

            System.out.println();
            System.out.println("size: " + size);

            char[] carr = new char[size];
            fr.read(carr);

            for(int i = 0; i < carr.length; i++){
                System.out.println("char[i]" + carr[i]);
            }

        } catch (FileNotFoundException e) {
            System.out.println("지정한 파일을 찾을 수 없습니다.");
        } catch (IOException e) {
            System.out.println("파일 읽기 중 오류 발생!");
        } finally {
            if (fr != null) {
                try {
                    fr.close();
                    System.out.println("\n파일을 성공적으로 닫았습니다.");
                } catch (IOException e) {
                    System.out.println("파일 닫는 중 오류 발생!");
                }
            }
        }
    }
}