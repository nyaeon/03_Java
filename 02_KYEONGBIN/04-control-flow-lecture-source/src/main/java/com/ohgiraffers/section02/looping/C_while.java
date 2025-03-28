package com.ohgiraffers.section02.looping;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class C_while {

    public void testSimpleWhileStatement () {

        // 초기식
        int i = 1;
        while (i <= 10) {
            System.out.println("| " + i + " |");
            System.out.println("------");
            i++;
        }

    }

    public void testWhileExample() {

        Scanner sc = new Scanner(System.in);

        char answer = '\0';
        while (!(answer == 'Y' || answer == 'y')) {
            System.out.print("Y 또는 y좀 눌러줄래?");
            answer = sc.next().charAt(0);
        }

        System.out.println("시키는 대로 해주셔서 감사합니다.");
    }


}
