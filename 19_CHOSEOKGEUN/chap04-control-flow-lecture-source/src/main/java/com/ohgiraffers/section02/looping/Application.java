package com.ohgiraffers.section02.looping;

import com.ohgiraffers.section01.conditional.D_switch;

public class Application {

    public static void main(String[] args) {
        A_for a = new A_for();
//        a.testSimpleForStatement();

        A_nestedFor b = new A_nestedFor();
//        b.printGugudanFromTowToNine();

//        b.printStarInputRowTimes();

//        b.printTriangleStars();

        B_while b_while = new B_while();
//        b_while.testSimpleWhileStatement();
//        b_while.testWhileExample();

        D_doWhile d_doWhile = new D_doWhile();
//        d_doWhile.testSimpleDoWhileStatement();
        d_doWhile.testDoWhile();


    }
}
