package com.ohgiraffers.section03.branching;

public class Application {

    public static void main(String[] args) {

        A_break b = new A_break();
        //b.testSimpleBreakStatement();
        //b.testJumpBreak();
        //b.testReturnStatement();

        B_continue c = new B_continue();
        c.testSimpleContinueStatement();
        c.testJumpContinue();
    }
}
