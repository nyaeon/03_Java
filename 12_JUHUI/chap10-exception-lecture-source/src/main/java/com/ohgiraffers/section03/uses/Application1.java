package com.ohgiraffers.section03.uses;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Application1 {

    public static void main(String[] args) {

        BufferedReader in = null; // 어느 특정한 위치를 읽어들일 때 사용. 해당 내용이 다들어올 때까지 저장. in을 전역변수로 사용하기 위해 밖으로 빼줌.

        // FileReader()는 어떤 대상을 읽을거냐,()의 내용은 경로를 넣어줌.
        try {
            in = new BufferedReader(new FileReader("test.dat")); // 지금 이 파일이 없어서 in의 값은 null.

            String s;

            while ((s = in.readLine()) != null) { // readLine() : 라인단위로 읽어서 가져오겠다.
                System.out.println(s);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {

            try {
                if(in != null) {
                    in.close(); // 확인안하면 nullpointException 발생하기 때문에
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
