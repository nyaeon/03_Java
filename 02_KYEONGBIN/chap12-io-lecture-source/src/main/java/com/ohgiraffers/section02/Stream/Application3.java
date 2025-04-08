package com.ohgiraffers.section02.Stream;

import java.io.*;

public class Application3 {
    public static void main(String[] args) {

        FileOutputStream fout = null;
        FileInputStream fin = null; // 읽기용 스트림 추가

        String filePath = "src/main/java/com/ohgiraffers/section02/Stream/testOutputStream.txt";

        try {
            fout = new FileOutputStream(filePath, true); // 이어쓰기 모드

            // 파일에 데이터 쓰기
            fout.write(97); // 'a'
            byte[] barr = new byte[] {98, 99, 100, 101, 102, 10, 103}; // b~g
            fout.write(barr);
            fout.write(barr, 1, 3); // c, d, e

            System.out.println("파일 쓰기 완료!");

        } catch (IOException e) {
            System.out.println("파일 쓰기 중 오류 발생!");
        } finally {
            try {
                if (fout != null) fout.close();
            } catch (IOException e) {
                System.out.println("스트림 닫기 오류");
            }
        }

        // 🔽 쓰고 나서 다시 읽기
        try {
            fin = new FileInputStream(filePath);
            int value;
            System.out.print("📄 파일 내용: ");
            while ((value = fin.read()) != -1) {
                System.out.print((char) value);
            }
            System.out.println(); // 줄 바꿈

        } catch (IOException e) {
            System.out.println("파일 읽기 오류 발생!");
        } finally {
            try {
                if (fin != null) fin.close();
            } catch (IOException e) {
                System.out.println("읽기 스트림 닫기 오류");
            }
        }
    }
}
