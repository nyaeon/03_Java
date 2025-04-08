package com.ohgiraffers.section02.stream;

import javax.imageio.IIOException;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Application3 {
    public static void main(String[] args) {
        /***
         * fileoutputstream
         * 프로그램의 데이터를 파일로 내보내기 위한 용도의 스트림이다
         * 1바이트 단위로 데이터를 처리함
         */
        FileOutputStream fout = null;
        try {
            //ouotputstream 일경우 대상 파일이 존재하지 않으면 파일을 자동으로 생성해 줌
            //두번째 인자로 true를 사용하면 이어쓰기가 됨
            //false는 이어쓰기가 아닌 덮어쓰기가 기본값은 false
            fout =new FileOutputStream("src/main/java/com/ohgiraffers/section02/stream/testOutputstream.txt",true);
            fout.write(97);
            //10: 개행 문자
            byte[] barr = new byte[] {98,99,100,101,102,10,103};
            fout.write(barr);

            fout.write(barr,1,3);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }catch(IOException e){
            throw new RuntimeException(e);
        } finally {
            if (fout != null) {
                try {
                    fout.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
