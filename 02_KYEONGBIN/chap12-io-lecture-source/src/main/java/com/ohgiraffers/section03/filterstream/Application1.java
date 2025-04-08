package com.ohgiraffers.section03.filterstream;

import java.io.*;

public class Application1 {

    public static void main(String[] args) {

        // 1. 파일 쓰기 (BufferedWriter 사용)
        BufferedWriter bw = null;
        try {
            // 기본 스트림인 FileWriter에 필터 스트림 BufferedWriter를 연결
            bw = new BufferedWriter(
                    new FileWriter("src/main/java/com/ohgiraffers/section03/filterstream/testBuffered.txt"));

            // 버퍼에 문자열을 쓰기
            bw.write("Hi");
            bw.write("\nNice to meet you");

            // flush 생략 가능 (close 시 자동 flush)

        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if (bw != null) {
                try {
                    bw.close();  // 버퍼 내용 비우고 스트림 닫기
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }

        System.out.println("==========================================================================================");

        // 2. 파일 읽기 (BufferedReader 사용)
        BufferedReader br = null;

        try {
            // 기본 스트림인 FileReader에 필터 스트림 BufferedReader를 연결
            br = new BufferedReader(
                    new FileReader("src/main/java/com/ohgiraffers/section03/filterstream/testBuffered.txt"));

            String temp;
            while ((temp = br.readLine()) != null) {
                System.out.println(temp);  // 한 줄씩 출력
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                br.close();  // 자원 해제
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
