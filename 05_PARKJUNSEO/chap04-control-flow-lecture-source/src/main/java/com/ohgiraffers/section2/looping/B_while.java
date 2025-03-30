package com.ohgiraffers.section2.looping;

import java.util.Scanner;

public class B_while {

    public void testSimpleWhileStatement() {

        //초기식
        int i = 1;
        while (i<10) {
            System.out.print(i);
            System.out.println();
            i++;
        }
    }

    public void testWhileExample() {
        Scanner sc = new Scanner(System.in);

        char answer = 'y';
        while(!(answer == 'Y' || answer == 'y')) {
            System.out.print("Y 또는 y 좀 눌러줄래?");
            answer = sc.next().charAt(0);
        }
        System.out.println("시키는대로 눌러줘서 감사합니다.");
    }
}
