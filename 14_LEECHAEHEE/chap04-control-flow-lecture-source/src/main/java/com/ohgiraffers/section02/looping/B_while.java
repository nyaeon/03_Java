package com.ohgiraffers.section02.looping;

import java.util.Scanner;

public class B_while {
    public void testSimpleWhileStatement() {
        int i = 1;
        while(i <= 10) {
            System.out.println(i);
            i++;
        }
    }

    public void testWhileExample() {
        Scanner sc = new Scanner(System.in);
        char answer = '\0';
        while (!(answer == 'Y' || answer == 'y')) {
            System.out.print("y나 Y좀 눌러줄래?");
            answer = sc.next().charAt(0);
        }
        System.out.println("눌러줘서 고맙다.");
    }
}
