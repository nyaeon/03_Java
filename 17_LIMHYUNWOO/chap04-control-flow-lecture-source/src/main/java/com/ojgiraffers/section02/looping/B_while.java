package com.ojgiraffers.section02.looping;

import java.util.Scanner;

public class B_while { // while문은 특정 조건일때 끝나면 사용
    public void testSimpleWhileStatement(){
        // 초기식
        int i = 1;

        while(i <= 10){
            System.out.println("i = " + i);
            i++;
        }
    }
    public void testWhileExample(){
        Scanner sc = new Scanner(System.in);

        char answer = '\0';
        while(!(answer == 'Y' || answer == 'y')){
            System.out.println("Y 또는 y 좀 눌러줄래?");
            answer = sc.next().charAt(0);
        }
        System.out.println("시키는 데로 눌러줘서 감사합니다.");
    }
}
