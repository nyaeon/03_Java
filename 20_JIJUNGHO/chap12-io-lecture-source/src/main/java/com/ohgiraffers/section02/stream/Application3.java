package com.ohgiraffers.section02.stream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Application3 {
    public static void main(String[] args) {

        /*
         * 파일 외부로 내보내기
         * FileOutputStream
         * 프로그램의 데이터를 파일로 내보내기 위한 용도의 스트림이다.
         * 1바이트 단위로 데이터를 처리한다.
         *
         * */

        FileOutputStream fout = null;

        try {
            // OutputStream의 경우 대상 파일이 존재하지 않으면, 파일을 자동으로 생성해준다.

            // 두번째 인자로 true를 전달하면 이어쓰기가 된다.
            // false는 이어쓰기가 아닌 덮어쓰기이며, 기본값은 false이다.
            fout = new FileOutputStream("src/main/java/com/ohgiraffers/section02/stream/testOutputStream.txt");

            // 1개씩 넣기
            fout.write(97);

            // 10 :  개행문자
            byte[] bArr = new byte[]{98, 99, 100, 101, 102, 10, 103, 104};
            // 배열로 넣기
            fout.write(bArr);

            // 1 ~ 3 인덱스까지 넣기
            fout.write(bArr, 1, 3);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
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
