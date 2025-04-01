package com.ohgiraffers.section03.brancng;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        A_break b = new A_break();
//        b.testSimpleBreakStatement();
//        b.testJumpBreak();

        B_continue c = new B_continue();
//        c.testSimpleContinueStatement();
        c.testJumpContinue();


    }

}
