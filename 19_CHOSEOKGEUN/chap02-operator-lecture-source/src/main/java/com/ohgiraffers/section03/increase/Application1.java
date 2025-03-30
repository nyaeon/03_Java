package com.ohgiraffers.section03.increase;

public class Application1 {
    public static void main(String[] args) {
        int a = 3;
        int b = 5;
        int c = -1;
        int d = a + --b;    // a = 3, b = 4(4), c = -1, d = 7
        b = 2 * (-c + a++) - d; // a = 3 , b = 1 , c = -1, d =7
        c *= 2;             // a = 4, b = 1, c = -2, d =7
        a = b++ + c;   //  a = -1  b = 1(2)  c = -2  d= 7
        System.out.println("a =" + a);
        System.out.println("b =" + b);
        System.out.println("c =" + c);
        System.out.println("d =" + d);
    }
}
