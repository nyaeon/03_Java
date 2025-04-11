package com.ohgiraffers.section02.stream;

import java.io.FileWriter;
import java.io.IOException;

public class Application4 {
    public static void main(String[] args) {

        /*
        * FileWriter
        * 프로그램의 데이터를 파일로 내보내기 위한 용도의 스트림
        * 1글자 단위로 데이터를 처리
        * */
        FileWriter fw = null;

        try {
            fw = new FileWriter("src/main/java/com/ohgiraffers/section02/stream/testWriter.txt");

            fw.write(97);
            fw.write('A');
            fw.write(new char[]{'A', 'P', 'P', 'L', 'E'});
            fw.write("독도는 우리땅");
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
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
