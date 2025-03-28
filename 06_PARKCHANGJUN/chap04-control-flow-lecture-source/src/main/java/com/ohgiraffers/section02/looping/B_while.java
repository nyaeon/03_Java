package com.ohgiraffers.section02.looping;

import java.util.Scanner;

public class B_while {

    public void testSimpleWhileStatement() {

        // 초기식
        int i = 1;

        while(i <= 10) {
            System.out.println(i);
            i++;
        }
    }

    public void testWhileExample() {

        Scanner sc = new Scanner(System.in);

        char answer = '\0'; // 초기값 설정
        while(!(answer == 'Y' || answer == 'y')) {
            System.out.print("Y 또는 y 좀 눌러줄래?");
            answer = sc.next().charAt(0);
        }
    }
}
