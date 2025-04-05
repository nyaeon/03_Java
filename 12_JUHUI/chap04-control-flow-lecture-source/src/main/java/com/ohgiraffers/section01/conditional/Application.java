package com.ohgiraffers.section01.conditional;

public class Application {
    public static void main(String[] args) {

        A_if a = new A_if();
        a.testSimpleIfStatement();

        B_ifElse b = new B_ifElse();
        b.testSimpleIfElseStatement();

        C_ifElseIf c = new C_ifElseIf();
        c.testSimpleIfStatement();

        D_switch.testSimpleSwitchStatement();
    }
}
