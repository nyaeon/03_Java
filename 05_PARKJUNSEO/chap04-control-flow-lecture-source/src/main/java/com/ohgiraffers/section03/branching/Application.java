package com.ohgiraffers.section03.branching;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        A_break b = new A_break();
        b.testSimpleBreakStatement();

        B_continue c = new B_continue();
        c.testJumpContinue();
        c.testSimpleContinueStatement();
    }
}
