package com.ohgiraffers.section03.filterstream;

import java.io.*;

public class Application2 {

    public static void main(String[] args) {

        /*
         📌 [1] BufferedReader + InputStreamReader + System.in

         - System.in : 바이트 기반 입력 스트림 (키보드 입력)
         - InputStreamReader : 바이트 → 문자 변환
         - BufferedReader : 문자 스트림을 한 줄 단위로 읽음 (readLine())

         👉 한 줄 입력 받아 출력하기
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.println("Enter string");
            String value = br.readLine();  // 한 줄 입력

            System.out.println("value = " + value); // 입력한 문자열 출력
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            if (br != null) {
                try {
                    br.close();  // 스트림 닫기
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }
        }

        System.out.println("-------------------------------------------------------------");

        /*
         📌 [2] BufferedWriter + OutputStreamWriter + System.out

         - System.out : 바이트 기반 출력 스트림 (콘솔 출력)
         - OutputStreamWriter : 문자 → 바이트 변환
         - BufferedWriter : 문자 스트림을 버퍼에 담아 출력

         👉 문자열을 콘솔에 출력
         */
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        try {
            bw.write("java mysql jdbc hahahahahahhaha? comback home");
            bw.flush();  // 버퍼 비워서 출력
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if (bw != null) {
                try {
                    bw.close();  // flush 포함한 자원 해제
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
