package com.ohgiraffers.section03.branching;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        A_break a = new A_break();
        //a.testSimpleBreakStatement();
       // a.testJumpBreeak();
        a.testReturnStatement();

        B_continue b = new B_continue();
       // b.testSimpleContinueStatement();
        // b.testJumpContinue();
    }
}
