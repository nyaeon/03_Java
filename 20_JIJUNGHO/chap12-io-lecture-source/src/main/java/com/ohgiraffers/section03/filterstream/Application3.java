package com.ohgiraffers.section03.filterstream;

import java.io.*;

public class Application3 {

    public static void main(String[] args) {
        /*
         * 외부 데이터로부터 읽어오는 데이터를 바이트형 정수, 문자, 문자열로만 읽어오면
         * 여러 데이터 타입을 취급하는 경우 별도로 처리를 해줘야 한다.
         * 예) 정수 입력받아 처리하려면 parsing을 해줘야한다.
         * "1" ==================> 1 : parsing
         * */

        /*
         * 데이터 자료형 별로 처리하는 기능을 추가한 보조스트림을 제공
         * DataInputStream / DataOutputStream
         * */

        DataOutputStream dOut = null;

        try {
            dOut = new DataOutputStream(new FileOutputStream("src/main/java/com/ohgiraffers/section03/filterstream/score.txt"));

            // writeUTF() : 문자열
            dOut.writeUTF("지정호");
            dOut.writeInt(95);
            dOut.writeChar('A');

            dOut.writeUTF("홍길동");
            dOut.writeInt(85);
            dOut.writeChar('B');

            dOut.writeUTF("김관복");
            dOut.writeInt(77);
            dOut.writeChar('C');

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if (dOut != null) {
                try {
                    dOut.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }

        System.out.println("================================================================");

        // DataInputStream으로 정수 및 문자 parsing
        DataInputStream dIn = null;
        try {
            dIn = new DataInputStream(new FileInputStream("src/main/java/com/ohgiraffers/section03/filterstream/score.txt"));

            // while문을 무한 반복하면 EOFException 예외 발생
            // EOFException을 해결하기 위해 catch문을 추가하여 예외 발생 시 처리하게끔 한다.
            while (true) {
                // 파일에 기록한 순서대로 읽어들여야 한다. 순서가 변경되면 정상적으로 출력되지 않음
                 System.out.println(dIn.readUTF() + ", " + dIn.readInt() + ", " + dIn.readChar());
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (EOFException e) {
            System.out.println("파일 읽기 완료");
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if (dIn != null) {
                try {
                    dIn.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }


    }

}
