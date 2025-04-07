package com.ohgiraffers.section02.stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Application1 {

    public static void main(String[] args) {
        /*
         *  입출력 스트림 개요
         *  우리는 프로그래밍을 할 때 많은 종류의 데이터를 다루어야 한다.
         *  하지만 데이터는 프로그램 내부에 있을 수 도 있지만, 프로그램 외부의 데이터를 가져와서 사용해야 할 수도 있다.
         *  또한 프로그램에서 생성한 데이터를 외부로 출력할 수 도 있다.
         *
         *  외부 데이터란 프로그램 외부에 존재하는 모든 데이터를 의미한다.
         *  외부 데이터는 하드디스크 상의 파일이 될 수도 있고, 네트워크 상에 존재하는 자원이 될 수 도 있다.
         *  외부 데이터를 대상으로 작업할 때 가장 먼저 해야 할 일은 자바 프로그램과 외부 데이터를 연결하는 것이다.
         *  프로그램과 외부 데이터가 연결된 길을 스트림(stream)이라고 한다.
         *  스트림은 단방향이기 때문에 데이터를 읽어오기 위한 길은 입력스트림, 데이터를 출력하기 위한 길은 출력스트림 이라고 부른다.
         *
         *  입출력과 관련된 API는 java.io 패키지에서 제공하고 있다.
         *  API 문서에서 목록을 확인해보면 대부분 InputStream/OutputStream, Reader/Writer 로 끝난다.
         *  이러한 클래스 모두가 외부 데이터를 읽어오는 기능을 가진 스트림이다.
         *
         *  그 중 InputStream과 Reader는 데이터를 읽어오는 입력스트림이고
         *  OutputStream과 Writer는 데이터를 내보내는 출력스트림이다.
         *  또한 InputStream과 OutputStream은 데이터를 1바이트 단위로 입/출력을 하고
         *  Reader와 Writer계열은 글자(2바이트 혹은 3바이트) 단위로 작업을 한다.
         *  참고로 MS949 인코딩에서는 한글 한 글자를 2바이트로 취급하지만 UTF-8에서는 한글 한 글자를 3바이트로 취급한다.
         *
         *  자바 프로그램과 연결되는 외부 데이터의 타입이 무엇인지는 클래스의 이름을 보고 유추가 가능하다.
         *  InputStream/OuputStream/Reader/Writer를 빼고 남은 단어가 바로 외부 데이터의 타입이다.
         *  예) FileInputStream은 InputStream을 제거하고 남은 단어가 File이므로 외부 데이터는 File임을 알 수 있다.
         * */
        FileInputStream fin = null;

        try {
            fin = new FileInputStream("src/main/java/com/ohgiraffers/section02/stream/testInputStream.txt");

            int value;
            // read() : 파일에 기록된 값을 순차적으로 읽어오고 더 이상 읽어올 데이터가 없는 경우 -1을 반환
//            while((value = fin.read()) != -1){
//                System.out.println((char) value);
//            }
            System.out.println("파일의 길이 : " + new File("src/main/java/com/ohgiraffers/section02/stream/testInputStream.txt").length());



        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if (fin != null) {
                try {
                    fin.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

}
