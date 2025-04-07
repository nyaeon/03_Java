package com.ohgiraffers.section03.uses;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Application1 {

    public static void main(String[] args) {

        BufferedReader in = null;
        // 버퍼 : 임시 저장의 공간

        // 앞에 file이 붙어있으면 어떤 대상에 대한 것을 읽어 올거냐라는 거라고 이해하면 됨
        try {
            in = new BufferedReader(new FileReader("test.dat"));

            String s;

            while((s = in.readLine()) != null) {
                System.out.println(s);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {

            try {
                if (in != null) {
                    in.close(); // null이면 close할 필요 없기 때문
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
