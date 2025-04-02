package com.ojgiraffers.section03.branching;

public class Application {
    public static void main(String[] args) {
        A_break a =new A_break();
//        a.testSimpleBreakStatement();
//        a.testJumpBreak();
        B_continue b = new B_continue();
//        b.testSimpleContinueStatement();
//        b.testJumpContinue();
        a.testReturnStatement();
    }
}
