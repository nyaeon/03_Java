package com.ohgiraffers.excepation.charcheck;

import java.util.Scanner;

public class CharcterProcess {
    public CharcterProcess() {
    }

    /***
     * 문자열 s중에서 알파벳 수를 리턴하는 메소드
     * @param s
     * @throws Exception
     */
    public void countAlpha(String s) throws Exception {
        Scanner scanner = new Scanner(s);

        System.out.print("문자열 입력: ");
        s = scanner.nextLine();

        if (s.length() == 1) {
            System.out.println(s);
        } else {
            System.out.println("공백이 있음");
            throw new Exception(s);
        }


    }
}
