package com.ohgiraffers.section02.stream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Application3 {

    public static void main(String[] args){

        /*
        * FileOutputStream
        * 프로그램의 데이터를 파일로 내보내기 위한 용도의 스트림이다.
        * 1바이트 단위로 데이터를 처리한다.
        *
        * */

        FileOutputStream fout = null;

        try {
            // OutputStream의 경우 대상 파일이 존재하지 않으면 파일을 자동으로 생성해준다.

            //두 번째 인자로 true를 전달하면 이어쓰기가 된다.
            // false는 이어쓰기가 덮어쓰기이며 기본은 false이다.
            fout = new FileOutputStream("src/main/java/com/ohgiraffers/section02/stream/testOutputStream.txt");

            fout.write(97);
            // 10 : 개행문자
            byte[] barr = new byte[]{98, 99, 100, 101, 102, 10, 103};
            fout.write(barr);

            fout.write(barr, 1, 3);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally{ // 외부의 것을 가져다가 사용을 했으면 finally로 닫아줘야 한다.
            try {
                if(fout != null){
                }
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }

    }
}
